package com.autoavaliar.support.web.find;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.intern.LocatorWeb;
import cucumber.api.java.sl.In;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class GetterActionsWeb {
    public GetterActionsWeb each(){
        Instances.setEach(true);
        return this;
    }

    public Object text(){
        if(!Instances.getEach()) {
            WebElement e = Instances.getWebLastElements().get(0);
            int waitingTimeBefore = Instances.getDefaultWaitMilis();
            Instances.setDefaultWaitMilis(0);
            Instances.setWebLastXpath(Instances.getWebLastXpath()+"/*");
            String ret = e.getText();
            if(Instances.getWebLastElements().size()>0) {
                WebElement child = Instances.getWebLastElements().get(0);
                ret = ret.replace(child.getText(), "");
            }
            Instances.setDefaultWaitMilis(waitingTimeBefore);
            return ret.trim();
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getText());
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object type(){
        if(!Instances.getEach()) {
            return Instances.getWebLastElements().get(0).getTagName();
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getTagName());
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object value(){
        if(!Instances.getEach()) {
            return Instances.getWebLastElements().get(0).getAttribute("value");
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getAttribute("value"));
            }
            Instances.setEach(false);
            return ret;
        }
    }

    public Object attribute(String attribute){
        if(!Instances.getEach()) {
            return Instances.getWebLastElements().get(0).getAttribute(attribute);
        }else {
            List<String> ret = new ArrayList<>();
            for (WebElement element: Instances.getWebLastElements()) {
                ret.add(element.getAttribute(attribute));
            }
            Instances.setEach(false);
            return ret;
        }
    }


}
