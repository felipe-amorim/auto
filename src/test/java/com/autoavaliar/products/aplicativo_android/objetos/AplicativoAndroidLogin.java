package com.autoavaliar.products.aplicativo_android.objetos;

import java.util.LinkedHashMap;

public class AplicativoAndroidLogin {
    public static String aplicativoAndroidEmailPadrao = "timeqa.apk@autoavaliar.com.br";
    public static String aplicativoAndroidSenhaPadrao = "timeqa0102";

    public static String aplicativoAndroidLoginBrasilButton = "com.autoaction.app:id/brazil_container";
    public static String aplicativoAndroidLoginEmailInput = "com.autoaction.app:id/email";
    public static String aplicativoAndroidLoginSenhaInput = "com.autoaction.app:id/password";
    public static String aplicativoAndroidLoginEntrar = "com.autoaction.app:id/login_enter";


    public static LinkedHashMap<String, String> aplicativoAndroidLogin = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(aplicativoAndroidLoginBrasilButton, "Brasil");
        ret.put(aplicativoAndroidLoginEmailInput, "E-mail");
        ret.put(aplicativoAndroidLoginSenhaInput, "Senha");
        ret.put(aplicativoAndroidLoginEntrar, "Botão entrar");
        return ret;
    }
}
