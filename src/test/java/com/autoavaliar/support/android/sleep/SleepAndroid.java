package com.autoavaliar.support.android.sleep;

import com.autoavaliar.intern.Instances;

public class SleepAndroid {
    public void until(int milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setMaxTime(int max){
        Instances.setDefaultWaitMilis(max);
    }

    public void setDefaultTime(){
        Instances.setDefaultWaitMilisBackUp();
    }

    /*@Test
    public void tet(){
        System.out.println(System.getenv("ANDROID_HOME"));
        List<String> respostsss = Instances.commandEx("adb devices -l");
        if(respostsss.get(1).trim().length()==0){
            System.out.println("nenhum device conectado");
        }else {
            System.out.println("tem devices");
        }

        List<String> respost = Instances.commandEx("tasklist");
        for (String linha:respost
             ) {
            if(linha.contains("Appium")){
                System.out.println(linha);
            }
        }

        String SERVER_URL = String.format("http://127.0.0.1:%d/wd/hub", 4723);

        URL status;
        try {
            status = new URL(SERVER_URL + "/sessions");
            new UrlChecker().waitUntilAvailable(5000, TimeUnit.MILLISECONDS, status);
            System.out.println("conectado");
        } catch (UrlChecker.TimeoutException | MalformedURLException e) {
            System.out.println("não conectado");
        }

        AppiumDriverLocalService server;
        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        serviceBuilder.usingPort(4723);
        serviceBuilder.usingDriverExecutable(new File("D:\\nodejs\\node.exe"));
        serviceBuilder.withAppiumJS(new File("C:\\Users\\felip\\AppData\\Roaming\\npm\\node_modules\\appium\\"));
        server = AppiumDriverLocalService.buildService(serviceBuilder);
        server.start();

        Instances.getSleepWebClassInstance().until(3000);

        try {
            status = new URL(SERVER_URL + "/sessions");
            new UrlChecker().waitUntilAvailable(5000, TimeUnit.MILLISECONDS, status);
            System.out.println("conectado");
        } catch (UrlChecker.TimeoutException | MalformedURLException e) {
            System.out.println("não conectado");
        }

    }*/
}
