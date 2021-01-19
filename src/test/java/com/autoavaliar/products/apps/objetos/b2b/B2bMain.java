package com.autoavaliar.products.apps.objetos.b2b;

import java.util.LinkedHashMap;

public class B2bMain {

    public static String B2B_MAIN_TEXT_O_QUE_VOCE_PROCURA = "//h1[text()=\"O que você procura?\"]";
    public static String B2B_MAIN_BUTTON_REPASSSE = "//div[@data-action=\"REPASSE\"]/img";
    public static String B2B_MAIN_TEXT_TIPO_DE_ANUNCIANTE = "//label[text()=\"Tipo de anunciante\"]";
    public static String B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS = "//form[@id=\"hsearch\"]/input";
    public static String B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS = "//span[text()=\"Buscar\"]/ancestor::button";

    public static LinkedHashMap<String, String> B2bMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(B2B_MAIN_TEXT_O_QUE_VOCE_PROCURA, "validar login");
        ret.put(B2B_MAIN_BUTTON_REPASSSE, "acessar tela repasse de veiculo");
        ret.put(B2B_MAIN_TEXT_TIPO_DE_ANUNCIANTE, "validar carregou tela de repasse veiculo");
        ret.put(B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS, "input busca veiculos cadastrados");
        ret.put(B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS, "botão busca veiculos cadastrados");
        return ret;
    }
}
