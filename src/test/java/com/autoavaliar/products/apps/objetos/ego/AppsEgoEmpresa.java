package com.autoavaliar.products.apps.objetos.ego;

import java.util.LinkedHashMap;

public class AppsEgoEmpresa {

    //aba empresa
    public static String appsEgoC2BButton = "//li[@heading=\"C2B\"]//a[@class=\"nav-link ng-binding\"]";

    //aba c2b
    public static String appsEgoLinkC2bHomologTextarea = "//textarea[@id=\"c2blinkHomologation\"]";

    public static LinkedHashMap<String, String> appsEgoEmpresa = createData();

    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsEgoC2BButton, "C2B");
        ret.put(appsEgoLinkC2bHomologTextarea, "Link C2B homolog");
        return ret;
    }
}
