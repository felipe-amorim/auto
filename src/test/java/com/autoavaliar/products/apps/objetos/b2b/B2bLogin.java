package com.autoavaliar.products.apps.objetos.b2b;

import java.util.LinkedHashMap;

public class B2bLogin {

    public static String B2B_LOGIN_INPUT_EMAIL = "//form[@id=\"form_home_login\"]//input[@placeholder=\"E-mail\"]";
    public static String B2B_LOGIN_INPUT_SENHA = "//form[@id=\"form_home_login\"]//input[@placeholder=\"Senha\"]";
    public static String B2B_LOGIN_BUTTON_ENTRAR = "//button[text()=\" ENTRAR \"]";

    public static LinkedHashMap<String, String> B2bLogin = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        ret.put(B2B_LOGIN_INPUT_EMAIL, "e-mail e-mail login url comum");
        ret.put(B2B_LOGIN_INPUT_SENHA, "e-mail senha login url comum");
        ret.put(B2B_LOGIN_BUTTON_ENTRAR, "entrar login url comum");
        return ret;
    }
}
