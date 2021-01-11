package com.autoavaliar.products.apps.objetos.ego;

import java.util.LinkedHashMap;

public class AppsEgoMain {
    public static String appsEgoGestaoDeContasButton = "//a[@ng-click=\"sc.toggleCollapseKey('app.contas')\"]";
    public static String appsEgoEmpresasButton = "//a[@href=\"#/app/contas/empresas/listar\"]";

    public static LinkedHashMap<String, String> appsEgoMain = createData();

    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsEgoGestaoDeContasButton, "Gestão de contas");
        ret.put(appsEgoEmpresasButton, "Empresas");
        return ret;
    }
}
