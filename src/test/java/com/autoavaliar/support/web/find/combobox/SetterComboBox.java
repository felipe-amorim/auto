package com.autoavaliar.support.web.find.combobox;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SetterComboBox {
    public void byText(String text){
        if (!Instances.getEach()) {
            //Select combobox = new Select(Instances.getWebLastElements().get(0));
            //combobox.selectByVisibleText(text);
            Instances.getExecuteClassInstance().execute(()->{
                Select combobox = new Select(Instances.getWebLastElements().get(0));
                combobox.selectByVisibleText(text);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageComboBoxText().replace("arg0", text) + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //Select combobox = new Select(element);
                //combobox.selectByVisibleText(text);
                Instances.getExecuteClassInstance().execute(()->{
                    Select combobox = new Select(element);
                    combobox.selectByVisibleText(text);});
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageComboBoxTextEach().replace("arg0", text) + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void byValue(String value){
        if (!Instances.getEach()) {
            //Select combobox = new Select(Instances.getWebLastElements().get(0));
            //combobox.selectByValue(value);
            Instances.getExecuteClassInstance().execute(()->{
                Select combobox = new Select(Instances.getWebLastElements().get(0));
                combobox.selectByValue(value);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageComboBoxValue().replace("arg0", value) + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //Select combobox = new Select(element);
                //combobox.selectByValue(value);
                Instances.getExecuteClassInstance().execute(()->{
                    Select combobox = new Select(element);
                    combobox.selectByValue(value);});
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageComboBoxValueEach().replace("arg0", value) + Instances.getWebLastXpathLog());
            }
            Instances.setEach(false);
        }
    }

    public void byIndex(int index){
        if (!Instances.getEach()) {
            //Select combobox = new Select(Instances.getWebLastElements().get(0));
            //combobox.selectByIndex(index);
            Instances.getExecuteClassInstance().execute(()->{
                Select combobox = new Select(Instances.getWebLastElements().get(0));
                combobox.selectByIndex(index);});
            Instances.getScreenshotClassInstance().print();
            Instances.getReportClassInstance().stepPass(Instances.getMessageComboBoxIndex().replace("arg0", String.valueOf(index)) + Instances.getWebLastXpathLog());
        } else {
            for (WebElement element : Instances.getWebLastElements()) {
                //Select combobox = new Select(element);
                //combobox.selectByIndex(index);
                Instances.getExecuteClassInstance().execute(()->{
                    Select combobox = new Select(element);
                    combobox.selectByIndex(index);});
                Instances.getScreenshotClassInstance().print();
                Instances.getReportClassInstance().stepPass(Instances.getMessageComboBoxIndexEach().replace("arg0", String.valueOf(index)) + Instances.getWebLastXpathLog());

            }
            Instances.setEach(false);
        }
    }
}
