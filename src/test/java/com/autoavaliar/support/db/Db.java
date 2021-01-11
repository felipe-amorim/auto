package com.autoavaliar.support.db;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.autoavaliar.intern.Instances;
import org.bson.Document;
import org.json.JSONObject;
//import org.postgresql.util.PSQLException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.*;

public class Db {
    private static Connection connection = null;

    private static void setConnectionMySql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" +
                            Instances.getDbadress() + ":" +
                            Instances.getDbport() + "/" +
                            Instances.getDbname() + "?useTimezone=true&serverTimezone=UTC",
                    Instances.getDbuser(),
                    Instances.getDbpassword());
        } catch (ClassNotFoundException | SQLException e) {
            Instances.getReportClassInstance().stepFatal(e);
            e.printStackTrace();
        }
    }

    private static void setConnectioSqlServer() {
        try {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String url = "jdbc:sqlserver://"+
                    Instances.getDbadress()+ ":" +
                    Instances.getDbport()+ ";" +
                    "database="+Instances.getDbname()+ ";" +
                    "user="+Instances.getDbuser()+ ";" +
                    "password="+Instances.getDbpassword() + ";";
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            Instances.getReportClassInstance().stepFatal(e);
            e.printStackTrace();
        }
    }

    private static void setConnectioPostgres() {
        try {
            String url = "jdbc:postgresql://"+
                    Instances.getDbadress()+ ":" +
                    Instances.getDbport()+ "/" +
                    Instances.getDbname()+
                    "?user="+Instances.getDbuser()+
                    "&password="+Instances.getDbpassword();
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            Instances.getReportClassInstance().stepFatal(e);
            e.printStackTrace();
        }
    }

    private static void setConnectionOracle() {
        System.setProperty("oracle.net.tns_admin", Instances.getDbtnsnames());
        String dbURL = "jdbc:oracle:thin:@" + Instances.getDbname();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(dbURL, Instances.getDbuser(), Instances.getDbpassword());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void setConnectionReportInfo() {
        List<String[]> dadosBanco = new ArrayList<>();
        if (!Instances.getDbtype().equals("oracle")) {
            dadosBanco.add(new String[]{"Endereço: ", Instances.getDbadress()});
            dadosBanco.add(new String[]{"Porta: ", Instances.getDbport()});
        }
        dadosBanco.add(new String[]{"Nome: ", Instances.getDbname()});
        dadosBanco.add(new String[]{"Usuário: ", Instances.getDbuser()});
        dadosBanco.add(new String[]{"Senha: ", Instances.getDbpassword()});
        //ExtentReport.getExtentTest().log(Status.INFO, "Conexão em banco MySql estabelecida em: "); //todo alterar para novo relatorio
        //ExtentReport.getExtentTest().log(Status.INFO, MarkupHelper.createTable(dadosBanco.stream().toArray(String[][]::new))); //todo alterar para novo relatorio
    }


    public void executeOnNewThread(String localizador, Object variableToReceiveValue){
        executeOnNewThread(localizador, null, variableToReceiveValue);
    }

    public void executeOnNewThread(String localizador, LinkedHashMap<String, String> parametros, Object variableToReceiveValue){
        //todo variableToReceiveValue -> thread
        new Thread().start();
    }

    public List<List<String>> executeDate(String localizador){
        return execute(localizador, null, true);
    }

    public List<List<String>> executeDate(String localizador, LinkedHashMap<String, String> parametros){
        return execute(localizador, parametros, true);
    }

    public List<List<String>> execute(String localizador){
        return execute(localizador, null, false);
    }

    public List<List<String>> execute(String localizador, LinkedHashMap<String, String> parametros){
        return execute(localizador, parametros, false);
    }

    public List<List<String>> execute(String localizador, LinkedHashMap<String, String> parametros, boolean date) {
        switch (Instances.getDbtype()) {
            case "oracle":
                setConnectionOracle();
                break;
            case "mysql":
                setConnectionMySql();
                break;
            case "sqlserver":
                setConnectioSqlServer();
                break;
            default:
                setConnectioPostgres();
                break;
        }
        setConnectionReportInfo();
        List<List<String>> resultado = new ArrayList<>();
        try {
            String query = "";
            BufferedReader br = null;
            //try {
            if (localizador.endsWith(".sql")) {
                br = new BufferedReader(new FileReader(localizador));
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line).append("\n");
                    line = br.readLine();
                }
                query = sb.toString();
            } else {
                query = localizador;
            }
            //}catch (FileNotFoundException e){
            //    query = localizador;
            //}
            if (parametros != null) {
                for (Map.Entry<String, String> entry : parametros.entrySet()) {
                    query = query.replaceAll(entry.getKey().replace("=", ""), entry.getValue());
                }
            }
            query = query.replaceAll(";", "");
            String[] localizadorPartes = localizador.split("/");
            System.out.println("variavel   querye " + query);
            System.out.println("localizadorPartes[localizadorPartes.length - 1]  "+localizadorPartes[localizadorPartes.length - 1]);
            if (!localizadorPartes[localizadorPartes.length - 1].startsWith("get")) {
                resultado = getDataProgram(query);
            } else {
                resultado = getData(query, date);
            }
            if (br != null) {
                br.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            Instances.getErrorClassInstance().Fail();
        }
        return resultado;
    }

    private static List<List<String>> getDataProgram(String sql) throws SQLException {
        List<List<String>> resultado = new ArrayList<>();
        Statement stmt = connection.createStatement();
        System.out.println(sql);
        stmt.execute(sql);
        stmt.close();
        connection.close();
        return resultado;
    }

    private static List<List<String>> getData(String sql, boolean date) throws SQLException {
        List<List<String>> resultado = new ArrayList<>();
        Statement stmt = connection.createStatement();
        Calendar gmt = Calendar.getInstance(TimeZone.getTimeZone("GMT-3"));
        System.out.println(sql);
        ResultSet st = stmt.executeQuery(sql);
        int columnCount = st.getMetaData().getColumnCount();
        while (st.next()) {
            List<String> linha = new ArrayList<>();
            for (int i = 1; i <= columnCount; i++) {
                if(!date) {
                    linha.add(String.valueOf(st.getObject(i)));
                }else {
                    linha.add(String.valueOf(st.getDate(i, gmt)));
                }
            }
            resultado.add(linha);
        }
        connection.close();
        return resultado;
    }

    public SetDb set() {
        return Instances.getSetDbClassInstance();
    }

    private static MongoCollection<Document> getColletion(String colletion){
        return getDatabase().getCollection(colletion);
    }

    public static List<JSONObject> getDocuments(String colletion){
        FindIterable<Document> docs = getColletion(colletion).find();
        List<JSONObject> result = new ArrayList<>();
        for (Document doc : docs) {
            result.add(new JSONObject(doc.toJson()));
        }
        return result;
    }

    private static MongoDatabase getDatabase(){
        MongoClient mongoClient = new MongoClient(Instances.getDbadress(), Instances.getConverterClassInstance().toInt(Instances.getDbport()));
        return mongoClient.getDatabase(Instances.getDbname());
    }
}
