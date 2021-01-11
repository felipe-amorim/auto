package com.autoavaliar.products.apps.objetos.c2b;

import java.util.LinkedHashMap;

public class C2bMain {
    public static String c2bMainTermsAgreementButton = "//input[@id=\"terms-agreement\"]";
    public static String c2bMainPlacaInput = "//input[@id=\"plate-input\"]";
    public static String c2bMainConsultarButton = "//button[@onclick=\"search()\"]";
    public static String c2bMainContinuarButton = "//button[@id=\"generate-negotiation\"]";

    public static LinkedHashMap<String, String> c2bMain = createData();

    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(c2bMainTermsAgreementButton, "Checkbox termos e condições de uso");
        ret.put(c2bMainPlacaInput, "Placa");
        ret.put(c2bMainConsultarButton, "Consultar");
        ret.put(c2bMainContinuarButton, "Continuar");
        return ret;
    }
}
