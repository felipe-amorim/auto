package com.autoavaliar.intern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.Rectangle;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {
    private String cleanText(String text) {
        if (text != null) {
            text = text
                    .replace(".feature", "")
                    .replace("Scenario:", "")
                    .replaceAll(" ", "_")
                    .replaceAll("[^a-zA-Z0-9]", "")
                    .trim();
        } else {
            text = "";
        }
        return text;
    }

    public void print() {
        File screenshot = null;
        String scenarioName = cleanText(Instances.getScenario());
        String featureName = cleanText(Instances.getFeature());
        String stepName = cleanText(Instances.getStep());
        String screenshotPath = Instances.getJenkinsEvidencesPath() + featureName + "/" + scenarioName + "/";
        int filesCount = 1;
        File pathEvidenciasReport = new File(screenshotPath);
        pathEvidenciasReport.mkdirs();
        while (true) {
            File f = new File(screenshotPath + stepName + "_" + filesCount + ".png");
            if (!f.exists()) {
                break;
            }
            filesCount++;
        }
        screenshot = new File(screenshotPath + stepName + "_" + filesCount + ".png");
        try {
            Instances.setScreenShotLocation("../evidencias/" + featureName + "/" + scenarioName + "/" + stepName + "_" + filesCount + ".png");
            System.out.println("Screenshot count: " + stepName + "_" + filesCount + ".png");

            if (Instances.getWebDriver() != null && !Instances.getWebDriver().toString().contains("null") && (Instances.getLastTechnology().equals(Instances.Technology.WEB)||Instances.getLastTechnology().length()==0)  ) {
                boolean tinhaAlerta = false;
                if(!Instances.getWebdriverType().equals(Instances.phantomjs)) {
                    try {
                        Instances.getWebDriver().switchTo().alert().getText();
                        tinhaAlerta = true;
                    } catch (NoAlertPresentException ignored) {
                    }
                }
                if (!tinhaAlerta) {
                    System.out.println("Page loading status: " + ((JavascriptExecutor) Instances.getWebDriver()).executeScript("return document.readyState"));
                    FileUtils.moveFile(((TakesScreenshot) Instances.getWebDriver()).getScreenshotAs(OutputType.FILE), screenshot);
                }

            } else if (Instances.getAndroidDriver() != null && !Instances.getAndroidDriver().toString().contains("null") && Instances.getLastTechnology().equals(Instances.Technology.MOBILE)) {
                FileUtils.moveFile(((TakesScreenshot) Instances.getAndroidDriver()).getScreenshotAs(OutputType.FILE), screenshot);
            } else {
                Thread.sleep(120);
                Robot r = new Robot();
                Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                BufferedImage Image = r.createScreenCapture(capture);
                ImageIO.write(Image, "jpg", new File(Instances.getScreenShotLocation().replace("../evidencias", Instances.getJenkinsEvidencesPath())));
                new File(Instances.getScreenShotLocation().replace("../evidencias", Instances.getJenkinsEvidencesPath()));
            }


        } catch (IOException | InterruptedException | AWTException e) {
            e.printStackTrace();
        } catch (WebDriverException e) {
            if (e.getMessage().contains("ocalhost/0:0:0:0:0:")) {
                //Instances.getReportClassInstance().stepFatal(e);
                System.out.println("LOCALHOST NO PRINT----");
            }
        }
    }
}
