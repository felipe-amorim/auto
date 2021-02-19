package com.autoavaliar.intern;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.json.JSONObject;

public class Report {
    private String getScreenShotLocation(){
        if(Instances.getScreenShotLocation()!=null&&Instances.getScreenShotLocation().length()>0){
            return " <a data-featherlight='image' style='float: right;padding: 0px;' href='"+ Instances.getScreenShotLocation()+"'><i class='material-icons'>panorama</i></a>";
        }
        return "";
    }

    public void createBDD(String bdd){
        if(!Instances.tevePasso&&Instances.getExtent()!=null&&Instances.getBddSection()!=null){
            Instances.getBddSection().skip("Bdd sem execução");
        }
        Instances.createBddSection(bdd);
        Instances.tevePasso = false;

    }

    private void printAction(String step, long executionTime){
        System.out.println("Action: " + Instances.logBlue(step));
        System.out.println("Time taken: " + executionTime + " ms");
        System.out.println(Instances.logBlue("---------------------------------------------------------------------------------------"));
    }

    //todo alterar de getScenarioSection() para getBddSection() para blocos com os bdds
    public void stepPass(String step){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(step);
        }else {
            Instances.getBddSection().pass(step + getScreenShotLocation());
            long executionTime = Instances.getExecutionActionTimer();
            printAction(step, executionTime);
            Instances.mongoActualStep = new JSONObject()
                    .put("acao", step)
                    .put("status", "pass")
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("pass");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }

    public void stepMarkUp(Markup step){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(step);
        }else {
            Instances.getBddSection().info(step);
            long executionTime = Instances.getExecutionActionTimer();
            printAction(String.valueOf(step), executionTime);

            Instances.mongoActualStep = new JSONObject()
                    .put("acao", step)
                    .put("status", "info")
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("pass");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }

    public void stepInfo(String step){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(step);
        }else {
            Instances.getBddSection().info(step);
            long executionTime = Instances.getExecutionActionTimer();
            printAction(step, executionTime);

            Instances.mongoActualStep = new JSONObject()
                    .put("acao", step)
                    .put("status", "info")
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("pass");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }

    public void stepBlock(String step){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(step);
        }else {
            Markup m = MarkupHelper.createCodeBlock(step);

            Instances.getBddSection().info(m);
            long executionTime = Instances.getExecutionActionTimer();
            printAction(step, executionTime);

            Instances.mongoActualStep = new JSONObject()
                    .put("acao", step)
                    .put("status", "info")
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("pass");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }

    public void stepInfoThrowable(Markup throwable){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(throwable);
        }else {
            Instances.getBddSection().info(throwable);
            long executionTime = Instances.getExecutionActionTimer();
            printAction(String.valueOf(throwable), executionTime);

            Instances.mongoActualStep = new JSONObject()
                    .put("acao", throwable)
                    .put("status", "info")
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("pass");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }

    public void stepFail(Throwable fail){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(fail);
        }else {
            Instances.getScreenshotClassInstance().print();
            long executionTime = Instances.getExecutionActionTimer();
            Instances.getBddSection().fail("[FAIL] " + getScreenShotLocation());
            Instances.getBddSection().fail(fail);
            Instances.mongoActualStep = new JSONObject()
                    .put("status", "fail")
                    .put("mensagemDoErro", fail.getMessage())
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("fail");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
            Instances.setTestsKilled(true);
        }
        throw new NullPointerException(fail.getMessage());
    }

    public void stepWarning(String step){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(step);
        }else {
            Instances.getScreenshotClassInstance().print();
            long executionTime = Instances.getExecutionActionTimer();
            Instances.getBddSection().warning("[ALERT] " + step + getScreenShotLocation());
            printAction(step, executionTime);
            Instances.mongoActualStep = new JSONObject()
                    .put("acao", step)
                    .put("status", "warning")
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("warning");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }

    public void stepFatal(Throwable fatal){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(fatal);
        }else {
            long executionTime = Instances.getExecutionActionTimer();
            Instances.getBddSection().fatal("[ENVIRONMENT] " + getScreenShotLocation());
            Instances.getBddSection().fatal(fatal);
            Instances.setTestsKilled(true);
            Instances.mongoActualStep = new JSONObject()
                    .put("status", "fatal")
                    .put("mensagemDoErro", fatal.getMessage())
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("fatal");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
        throw new NullPointerException(fatal.getMessage());
    }

    public void stepError(Throwable error){
        Instances.tevePasso = true;
        if(Instances.getBddSection()==null){
            System.out.println(Instances.logYellow("There is no test report instance.."));
            System.out.println(error);
        }else {
            long executionTime = Instances.getExecutionActionTimer();
            Instances.getBddSection().error("[ERROR] " + getScreenShotLocation());
            Instances.getBddSection().error(error);
            Instances.setTestsKilled(true);
            Instances.mongoActualStep = new JSONObject()
                    .put("status", "error")
                    .put("mensagemDoErro", error.getMessage())
                    .put("tempoDecorrido", executionTime);
            Instances.mongoStep("error");
            Instances.flushReportAndMongo();
            Instances.setScreenShotLocation("");
        }
    }
}
