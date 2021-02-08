package com.autoavaliar.intern.plugin;

import cucumber.api.PickleStepTestStep;
import cucumber.api.event.*;
import com.autoavaliar.intern.Instances;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;


public class ListCucumberExecute{

    private static boolean started = false;
    //private static String ANSI_RESET = "\u001B[0m";
    //private static String ANSI_GREEN = "\u001B[32m";

    public static void testStepStarted(TestStepStarted event) {
        try {
            PickleStepTestStep testStep = (PickleStepTestStep) event.testStep;
            //System.out.println("BDD> " + ((PickleStepTestStep) event.testStep).getStepText());
            System.out.println(Instances.greenLog("BDD> " + ((PickleStepTestStep) event.testStep).getStepText()));
            Instances.getReportClassInstance().createBDD(((PickleStepTestStep) event.testStep).getStepText());
            Instances.setExecutionActionTimer(Calendar.getInstance().getTimeInMillis());
        } catch (Exception ignored) {
        }
    }
    
    public static void testStepFinished(TestStepFinished event){
        System.out.println("=====================================================");
    }
    
    public static void testCaseStarted(TestCaseStarted event){
        String relativePath = event.testCase.getUri();
        String raizProduto = "";
        if(relativePath.contains("products/features/")){
            raizProduto = relativePath.split("products/features/")[1];
        }else {
            raizProduto = relativePath.split("products/")[1];
        }

        Instances.mongoNameOfProject = raizProduto.split("/")[0];

        //System.out.println(" ===== STARTING TEST CASE: " + event.testCase.getName() + " ============== ");
        System.out.println((Instances.greenLog(" ===== STARTING TEST CASE: " + event.testCase.getName() + " ============== ")));
        System.out.println("package: " + event.testCase.getUri());

        String title = "Not defined";
        String author = "Not defined";
        String category = "Not defined";
        String environment = "Not defined";
        String[] path = event.testCase.getUri().split("/");

        String[] productPathArray;
        if(event.testCase.getUri().contains("/products/features/")){
            productPathArray = event.testCase.getUri().split("/products/features/");
        }else{
            productPathArray = event.testCase.getUri().split("/products/");
        }
        String[] productNameArray = productPathArray[1].split("/");
        Instances.setProduct(productNameArray[0]);


        String[] partesScenarioTitle = event.testCase.getName().split("Author:");
        title = partesScenarioTitle[0].replace(",", "").trim();
        String[] partesScenarioAuthorAndCategory = partesScenarioTitle[1].split("Category:");
        author = partesScenarioAuthorAndCategory[0].replace(",", "").trim();
        String[] partesScenarioCategoryAndEnvironment = partesScenarioAuthorAndCategory[1].split("Environment:");
        category = partesScenarioCategoryAndEnvironment[0].replace(",", "").trim();
        environment = partesScenarioCategoryAndEnvironment[1].replace(",", "").trim();


        Instances.setAuthor(author.replace(" ", "_"));
        Instances.setEnvironment(environment.replace(" ", "_"));
        Instances.setCategory(category.replace(" ", "_"));


        if (Instances.getExtent() == null) {
            try {
                FileUtils.deleteDirectory(new File(Instances.getJenkinsPath()));
            } catch (IOException ignored) {
            }
            Instances.setFeature(path[path.length - 1].replace(".feature", ""));
            Instances.setScenario(title);
            Instances.createInstance();
        }

        if (!Instances.getFeature().equals(path[path.length - 1].replace(".feature", ""))) {
            Instances.setFeature(path[path.length - 1].replace(".feature", ""));
            Instances.createFeatureSection();
            Instances.scenario = "";
            Instances.step = "";
        }

        if (started) {
            Instances.setScenario(title);
            Instances.createScenarioSection();
        } else {
            started = true;
        }
    }
    
    public static void testCaseFinished(TestCaseFinished event){
        //System.out.println("===== FINISHING TEST CASE: " + event.testCase.getName() + " ==============");
        System.out.println(Instances.greenLog("===== FINISHING TEST CASE: " + event.testCase.getName() + " =============="));
        if (!Instances.getTestsKilled()) {
            if (
                    event.result.getStatus().toString().equals("FAILED")
                            && !event.result.getErrorMessage().contains("[FAIL]")
                            && !event.result.getErrorMessage().contains("[ALERT]")
                            && !event.result.getErrorMessage().contains("[ENVIRONMENT]")
            ) {
                System.out.println(event.result.getErrorMessage());
                Instances.getReportClassInstance().stepInfo(Instances.getWebLastLocatorResult());
                Instances.getReportClassInstance().stepError(event.result.getError());
            }
            if (event.result.getStatus().toString().equals("UNDEFINED")) {
                Instances.getReportClassInstance().stepError(event.result.getError());
            }
        }
        Instances.setTestsKilled(false);
        //System.out.println("result: " + event.result.getStatus());
        System.out.println(Instances.greenLog("result: " + event.result.getStatus()));
        Instances.killWebDriver();
    }
    
    public static void testRunStarted(TestRunStarted event){
        System.out.println(Instances.greenLog("-------STARTING TESTS-------"));
        //System.out.println("-------STARTING TESTS-------");
        System.out.println(Instances.greenLog("Execution user: " + System.getProperty("user.name")));
        //System.out.println("Execution user: " + System.getProperty("user.name"));
    }
    
    public static void testRunFinished(TestRunFinished event){
        //System.out.println("-------FINISHING TESTS-------");
        System.out.println(Instances.greenLog("-------FINISHING TESTS-------"));
        //System.out.println("Removendo processos remanescentes do chromedriver");
        //Instances.commandEx("taskkill /F /IM \"chromedriver.exe\" /T");
        System.out.println("--------------------------------");
        Instances.mongoCategoryOfExecution = "desenv";
    }
    
}
