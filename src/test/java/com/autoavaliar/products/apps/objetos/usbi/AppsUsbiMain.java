package com.autoavaliar.products.apps.objetos.usbi;

import java.util.LinkedHashMap;

public class AppsUsbiMain {
        public static String appsIconUser = "//a[@id=\"top-user-menu\"]";
        public static String appsSairButton = "//a[text()=\"Sair\"]";
        public static String appsSolicitarAvaliacaoButton = "//a[@href=\"#/app/solicita\"]";
        public static String appsAvalicoesButton = "//a[@ng-click=\"sc.toggleCollapseKey('app.avaliacoes')\"]";
        public static String appsAvalicoesExpandidoButton = "//a[@href=\"#/app/avaliacoes/avaliacoes/lista\"]";
        public static String appsTopSystemMenuButton = "//a[@id=\"top-systems-menu\"]";
        public static String appsEgoButton = "//a[@href=\"https://apps.autoavaliar.com.br/ego\"]";
        public static String APPS_USBI_MAIN_TEXT_ALERTA = "//img[@id=\"pb__modal_image\"]";
        public static String APPS_USBI_MAIN_TEXT_FECHAR_ALERTA = "//img[@id=\"pb__modal_image\"]//ancestor::div[@id]/a";


        public static LinkedHashMap<String, String> appsMain = createData();
        private static LinkedHashMap<String, String> createData() {
            LinkedHashMap<String, String> ret = new LinkedHashMap<>();
            ret.put(appsIconUser, "Icone de usuário logado");
            ret.put(appsTopSystemMenuButton, "Botao de menu para outros sistemas");
            ret.put(appsSairButton, "Sair");
            ret.put(appsSolicitarAvaliacaoButton, "Solicitar Avaliação");
            ret.put(appsAvalicoesButton, "Avalicações");
            ret.put(appsAvalicoesExpandidoButton, "Sub menu avalicações");
            ret.put(appsEgoButton, "Botao Ego");
            ret.put(APPS_USBI_MAIN_TEXT_ALERTA, "Alerta");
            ret.put(APPS_USBI_MAIN_TEXT_FECHAR_ALERTA, "Fechar alerta");
            return ret;
        }
}
