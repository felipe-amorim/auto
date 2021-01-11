package com.autoavaliar.support.web.find;

import com.autoavaliar.intern.Instances;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.autoavaliar.support.web.find.combobox.ComboBox;

public class ActionsWeb {
    public ActionsWeb actions() {
        Instances.setActions(true);
        return this;
    }

    public ClicksWeb click() {
        throwExceptionNoElement();
        if (!Instances.getActions()) {
            Instances.getExecuteClassInstance().execute(() -> {
                Instances.getWebLastElements().get(0).click();
            });
        } else {
            Instances.getExecuteClassInstance().execute(() -> {
                Actions action = new Actions(Instances.getWebDriver());
                action.moveToElement(Instances.getWebLastElements().get(0)).click().perform();
            });
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageClick() + Instances.getWebLastXpathLog());
        Instances.setActions(false);
        return Instances.getClicksClassInstance();
    }

    private void throwExceptionNoElement() {
        if (Instances.getWebLastElements().size() <= 0) {
            Instances.getReportClassInstance().stepError(new NoSuchElementException("The xpath " + Instances.getWebLastXpath() + " returned no elements"));
        }
    }

    public boolean exists() {
        boolean exist = false;
        if (Instances.getWebLastElements().size() > 0) {
            exist = true;
        }
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageExists() + Instances.getWebLastXpathLog());
        return exist;
    }

    public int count() {
        return Instances.getWebLastElements().size();
    }

    public boolean isReadOnly() {
        final boolean[] isReadOnly = {false};
        Instances.getExecuteClassInstance().execute(() -> {
            try {
                Instances.getWebLastElements().get(0).sendKeys("a");
            } catch (ElementNotInteractableException e) {
                isReadOnly[0] = true;
            }
        }, true);
        return isReadOnly[0];
    }

    public boolean isAvailable() {
        Instances.getExecuteClassInstance().execute(() -> {
            Instances.getWebLastElements().get(0).clear();
        }, true);
        return Instances.getIsAvailable();
    }


    public SendsWeb send() {
        throwExceptionNoElement();
        return Instances.getSendsClassInstance();
    }

    public void clear() {
        throwExceptionNoElement();
        Instances.getExecuteClassInstance().execute(() -> {
            Instances.getWebLastElements().get(0).clear();
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageClear() + Instances.getWebLastXpathLog());
    }

    public void move() {
        throwExceptionNoElement();
        Instances.getExecuteClassInstance().execute(() -> {
            org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(Instances.getWebDriver());
            action.moveToElement(Instances.getWebLastElements().get(0)).perform();
        });
        Instances.getScreenshotClassInstance().print();
        Instances.getReportClassInstance().stepPass(Instances.getMessageMove() + Instances.getWebLastXpathLog());
    }


    public ComboBox comboBox() {
        throwExceptionNoElement();
        return Instances.getComboBoxClassInstance();
    }

    public GetterActionsWeb get() {
        throwExceptionNoElement();
        return Instances.getFindGetterClassInstance();
    }

}
