package com.autoavaliar.support.web;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollWeb {
    public void inside(String xpath){
        //Instances.setWebLastModalXpath(xpath);
        //Instances.getLocatorWebClassInstance().locate(xpath, true);
    }

    public void up(int amount){
        JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
        //if(Instances.getWebLastModal().size()>0){
        //    //js.executeScript("arguments[0].scrollBy(0,-" + amount + ")", Instances.getWebLastModal().get(0));
        //    js.executeScript("arguments[0].scrollBy = arguments[1];",Instances.getWebLastModal().get(0), amount*-1);
        //    System.out.println("scroll up modal");
        //}else {
        //    js.executeScript("window.scrollBy(0,-" + amount + ")");
        //    System.out.println("scroll up");
        //}
    }

    public void down(int amount){
        JavascriptExecutor js = (JavascriptExecutor) Instances.getWebDriver();
        //if(Instances.getWebLastModal().size()>0){
        //    //js.executeScript("arguments[0].scrollBy(0," + amount + ")", Instances.getWebLastModal().get(0));
        //    js.executeScript("arguments[0].scrollBy = arguments[1];",Instances.getWebLastModal().get(0), amount*-1);
        //    System.out.println("scroll down modal");
        //}else {
        //    js.executeScript("window.scrollBy(0," + amount + ")");
        //    System.out.println("scroll down");
        //}
    }
}
