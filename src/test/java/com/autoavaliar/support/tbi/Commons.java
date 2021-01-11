package com.autoavaliar.support.tbi;

import org.apache.commons.io.FileUtils;

import java.io.*;

public class Commons {

    public static String getProjectFolder(){
        return System.getProperty("user.dir")+"/";
    }

    public static String getUsersFolder(){
        return System.getProperty("user.home")+"/";
    }

    public static String getDownloadsFolder(){
        return getUsersFolder()+"Downloads/";
    }

    public static String getProjectDownloadsFolder(){
        return System.getProperty("user.dir") + "/src/test/resources/downloads/";
    }

    public static void resetDownloadsFolder(){
        File path = new File(Commons.getProjectDownloadsFolder());

        try {
            FileUtils.deleteDirectory(path);
        } catch (IOException ignored) {

        }

        if(path.mkdirs()){
            System.out.println("criou downloads");
        }else {
            System.out.println("xabu ao criar downloads");
        }
    }

    public static String readFile(String filePath){
        String retorno = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
            retorno = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
