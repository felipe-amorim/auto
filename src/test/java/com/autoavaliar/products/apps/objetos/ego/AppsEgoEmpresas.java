package com.autoavaliar.products.apps.objetos.ego;

import java.util.LinkedHashMap;

public class AppsEgoEmpresas {
    public static String appsEgoBuscarEmpresaInput = "//input[@ng-model=\"ctrl.query\"]";
    public static String appsEgoBuscarButton = "//button[@class=\"btn btn-success\"]";
    public static String appsEgoEmprsaResultanteDaBuscaButton = "//span[not(@ng-show=\"entity.instance.id\")]//a[contains(text(), \"arg0\")]";

    public static LinkedHashMap<String, String> appsEgoEmpresas = createData();

    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsEgoBuscarEmpresaInput, "Buscar empresa");
        ret.put(appsEgoBuscarButton, "Buscar");
        ret.put(appsEgoEmprsaResultanteDaBuscaButton, "Empresa resultante da busca");
        return ret;
    }
}
