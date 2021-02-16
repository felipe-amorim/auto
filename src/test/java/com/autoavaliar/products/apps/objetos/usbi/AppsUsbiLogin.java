package com.autoavaliar.products.apps.objetos.usbi;

import java.util.LinkedHashMap;

public class AppsUsbiLogin {
    public static String APPS_USBI_LOGIN_INPUT_EMAIL = "//input[@id=\"inputEmail\"]";
    public static String APPS_USBI_LOGIN_INPUT_SENHA = "//input[@id=\"inputPassword\"]";
    public static String APPS_USBI_LOGIN_BUTTON_LOGIN = "//button[text()=\"LOG IN\"]";
    public static String APPS_USBI_LOGIN_IMAGE_ALERTA_ABAIXO_ASSINADO = "//img[@id=\"pb__modal_image\"]";
    public static String APPS_USBI_LOGIN_BUTTON_FECHAR_ALERTA_ABAIXO_ASSINADO = "//img[@id=\"pb__modal_image\"]/ancestor::div[@id]/a";

    public static LinkedHashMap<String, String> appsUsbiLogin = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(APPS_USBI_LOGIN_INPUT_EMAIL, "E-mail");
        ret.put(APPS_USBI_LOGIN_INPUT_SENHA, "Senha");
        ret.put(APPS_USBI_LOGIN_BUTTON_LOGIN, "Login");
        ret.put(APPS_USBI_LOGIN_IMAGE_ALERTA_ABAIXO_ASSINADO, "Alerta abaixo-assinado");
        ret.put(APPS_USBI_LOGIN_BUTTON_FECHAR_ALERTA_ABAIXO_ASSINADO, "Fechar alerta abaixo-assinado");
        return ret;
    }
}
