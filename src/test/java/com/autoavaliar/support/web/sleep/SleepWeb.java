package com.autoavaliar.support.web.sleep;

import com.autoavaliar.intern.Instances;

public class SleepWeb {
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

    public void untilDisapear(String xpath){
        long localWait = Instances.getDefaultWaitMilis();
        Instances.setDefaultWaitMilis(0);
        while (true){
            Instances.setWebLastXpath(xpath);
            if(Instances.getWebLastElements().size()<=0){
                break;
            } /*else{
                System.out.println(Instances.getWebLastElements().get(0).isDisplayed());
                System.out.println(Instances.getWebLastElements().get(0).isEnabled());
                System.out.println(Instances.getWebLastElements().get(0).getRect().height);
                System.out.println(Instances.getWebLastElements().get(0).getRect().width);
                System.out.println(Instances.getWebLastElements().get(0).getLocation().x);
                System.out.println(Instances.getWebLastElements().get(0).getLocation().y);
                System.out.println(Instances.getWebLastElements().get(0).getSize().height);
                System.out.println(Instances.getWebLastElements().get(0).getSize().width);
                org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
                action.moveToElement(Instances.getWebLastElements().get(0)).perform();
            }*/
            until(100);
            localWait = localWait-100;
            if(localWait<=0){
                Instances.getReportClassInstance().stepFail(new NullPointerException(Instances.getMessageWaitDisapearStillHasElement()));
                break;
            }
        }
        Instances.setDefaultWaitMilisBackUp();
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageWaitDisapear() + Instances.getWebLastXpathLog());
    }

    public void untilAppear(String xpath){
        long localWait = Instances.getDefaultWaitMilis();
        System.out.println("localwait: "+Instances.getDefaultWaitMilis());
        Instances.setDefaultWaitMilis(0);
        while (true){
            Instances.setWebLastXpath(xpath);
            if(Instances.getWebLastElements().size()>0){
                break;
            }
            until(100);
            localWait = localWait-100;
            if(localWait<=0){
                Instances.getReportClassInstance().stepFail(new NullPointerException(Instances.getMessageWaitAppearStillHasElement()));
                break;
            }
        }
        Instances.setDefaultWaitMilisBackUp();
        System.out.println("localwaitup: "+Instances.getDefaultWaitMilis());
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageWaitAppear() + Instances.getWebLastXpathLog());
    }

    public void untilThreadsFinish(){
        //todo final matrix of new threads into instances
    }
}
