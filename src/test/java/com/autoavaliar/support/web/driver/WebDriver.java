package com.autoavaliar.support.web.driver;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriver {
    public SetterConfig set() {
        return Instances.getSetterConfigClassInstance();
    }

    public GetterConfig get() {
        return Instances.getGetterConfigClassInstance();
    }

    public void navigate(String url) {
        Instances.setWebDriver();
        Instances.getWebDriver().navigate().to(url);
        Capabilities cap = ((RemoteWebDriver) Instances.getWebDriver()).getCapabilities();
        System.out.println("Browser version: " + cap.getVersion());
        //Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageNavigate() + url);
    }

    public void kill(){
        Instances.killWebDriver();
    }

    public void nextTab() {
        //String[] paginas = Instances.getWebDriver().getWindowHandles().toArray(new String[0]);
//
        //Instances.getWebDriver().switchTo().window(paginas[Instances.getWebdriverPageNumber()+1]);
        //Instances.setWebdriverPageNumber(Instances.getWebdriverPageNumber()+1);
        //todo depreciated

        /*//System.out.println("nexttab");
        int lastNumberOfWindows = Instances.getLastWindows().size();
        //System.out.println("nome aba atual: "+Instances.getWebDriver().getWindowHandle());
        //System.out.println("-----------------------------");
        //System.out.println(Instances.getWebDriver().getPageSource());
        //System.out.println("-----------------------------");

        Instances.setLastWindows(Instances.getWebDriver().getWindowHandles());
        Instances.setLastIeratos(Instances.getLastWindows().iterator());

        int actualNumberOfWindows = Instances.getLastWindows().size();
        int tempoLocal = Instances.getDefaultWaitMilis();
        if(actualNumberOfWindows>lastNumberOfWindows) {
            System.out.println("actualNumberOfWindows "+actualNumberOfWindows);
            System.out.println("lastNumberOfWindows "+ lastNumberOfWindows);
            int countOfWindows = 0;

            Iterator<String> actualIterator = Instances.getLastIeratos();
            while (actualIterator.hasNext()) {
                System.out.println("while de navegação");
                tempoLocal = tempoLocal-100;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(tempoLocal<=0){
                    System.out.println("não foi possivel mudar de aba");
                    break;
                }
                try {
                    Instances.getWebDriver().switchTo().window(actualIterator.next());
                    System.out.println("navegou");
                    System.out.println("nome nova aba: "+Instances.getWebDriver().getWindowHandle());
                    System.out.println("-----------------------------");
                    System.out.println(Instances.getWebDriver().getPageSource());
                    System.out.println("-----------------------------");
                    break;
                }catch (WebDriverException e){
                    e.printStackTrace();
                }

            }
        }else {
            System.out.println("não tinham paginas novas");
        }*/
    }

    public void previousTab() {
        //System.out.println("TO BE IMPLEMENTED...........");
        //todo depreciated
    }

    public void refresh(){
        Instances.getWebDriver().navigate().refresh();
    }
}
