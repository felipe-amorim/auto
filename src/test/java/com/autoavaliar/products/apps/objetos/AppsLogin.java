package com.autoavaliar.products.apps.objetos;

import java.util.LinkedHashMap;

public class AppsLogin {
    public static String appsEmailInput = "//input[@id=\"inputEmail\"]";
    public static String appsPasswordInput = "//input[@id=\"inputPassword\"]";
    public static String appsLoginButton = "//button";
    public static String appsLoginCaptcha = "//label[@id=\"recaptcha-anchor-label\"]";
    public static String appsCaptcha = "//div[@ng-switch-default][contains(.,\"Captcha inválido!\")]";
    public static String appsCloseModalButton = "//a[@class=\"iziModal-button iziModal-button-close\"]";


    public static LinkedHashMap<String, String> appsLogin = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsEmailInput, "E-mail");
        ret.put(appsPasswordInput, "Senha");
        ret.put(appsLoginCaptcha, "Botão login");
        ret.put(appsLoginCaptcha, "Captcha");
        ret.put(appsLoginButton, "Login");
        ret.put(appsCaptcha, "Captcha");
        ret.put(appsCloseModalButton, "Fechar modal");
        return ret;
    }
}
