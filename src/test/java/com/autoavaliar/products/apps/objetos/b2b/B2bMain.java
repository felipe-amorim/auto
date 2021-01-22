package com.autoavaliar.products.apps.objetos.b2b;

import java.util.LinkedHashMap;

public class B2bMain {

    public static String B2B_MAIN_TEXT_O_QUE_VOCE_PROCURA = "//h1[text()=\"O que você procura?\"]";
    public static String B2B_MAIN_BUTTON_REPASSSE = "//div[@data-action=\"REPASSE\"]/img";
    public static String B2B_MAIN_TEXT_TIPO_DE_ANUNCIANTE = "//label[text()=\"Tipo de anunciante\"]";
    public static String B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS = "//form[@id=\"hsearch\"]/input";
    public static String B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS = "//span[text()=\"Buscar\"]/ancestor::button";
    public static String B2B_MAIN_BUTTON_AVALIE_AGORA_PRIMEIRO_VEICULO = "(//div[@class=\"vehicle-wrapper\"])[1]//button[@id=\"lance\"]";
    public static String B2B_MAIN_TEXT_ULTIMA_AVALIACAO = "//div[text()=\"ULTIMA AVALIAÇÃO\"]";
    public static String B2B_MAIN_TEXT_ANO_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[1]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_COMBUSTIVEL_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[2]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_KM_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[3]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_PORTAS_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[4]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_COR_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[5]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_MOTOR_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[6]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_PLACA_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[7]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_CAMBIO_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[8]/span[@class=\"value\"]";
    public static String B2B_MAIN_TEXT_ORIGEM_VEICULO = "(//ul[@id=\"vehicleTab1C\"]/li)[9]/span[@class=\"value\"]";

    public static LinkedHashMap<String, String> B2bMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(B2B_MAIN_TEXT_O_QUE_VOCE_PROCURA, "validar login");
        ret.put(B2B_MAIN_BUTTON_REPASSSE, "acessar tela repasse de veiculo");
        ret.put(B2B_MAIN_TEXT_TIPO_DE_ANUNCIANTE, "validar carregou tela de repasse veiculo");
        ret.put(B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS, "input busca veiculos cadastrados");
        ret.put(B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS, "botão busca veiculos cadastrados");
        ret.put(B2B_MAIN_BUTTON_AVALIE_AGORA_PRIMEIRO_VEICULO, "botão avalie agora, primeiro veiculo exibido");
        ret.put(B2B_MAIN_TEXT_ULTIMA_AVALIACAO, "validar carregou tela avaliação");
        ret.put(B2B_MAIN_TEXT_ANO_VEICULO, "ano veiculo");
        ret.put(B2B_MAIN_TEXT_COMBUSTIVEL_VEICULO, "combustivel veiculo");
        ret.put(B2B_MAIN_TEXT_KM_VEICULO, "km veiculo");
        ret.put(B2B_MAIN_TEXT_PORTAS_VEICULO, "portas veiculo");
        ret.put(B2B_MAIN_TEXT_COR_VEICULO, "cor veiculo");
        ret.put(B2B_MAIN_TEXT_MOTOR_VEICULO, "motor veiculo");
        ret.put(B2B_MAIN_TEXT_PLACA_VEICULO, "placa veiculo");
        ret.put(B2B_MAIN_TEXT_CAMBIO_VEICULO, "cambio veiculo");
        ret.put(B2B_MAIN_TEXT_ORIGEM_VEICULO, "origem veiculo");
        return ret;
    }
}
