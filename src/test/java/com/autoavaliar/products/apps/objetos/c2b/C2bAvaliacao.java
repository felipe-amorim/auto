package com.autoavaliar.products.apps.objetos.c2b;

import java.util.LinkedHashMap;

public class C2bAvaliacao {
    //preencher dados para avaliacao
    public static String c2bAvaliacaoMarcaSelect = "//select[@id=\"select-make\"]";
    public static String c2bAvaliacaoModeloSelect = "//select[@id=\"select-model\"]";
    public static String c2bAvaliacaoAnoSelect = "//select[@id=\"select-year\"]";
    public static String c2bAvaliacaoVersaoSelect = "//select[@id=\"select-version\"]";
    public static String c2bAvaliacaoQuilometragemInput = "//input[@id=\"input-mileage\"]";
    public static String c2bAvaliacaoContinuarButton = "//button[@id=\"price-search\"]";

    //dados do veiculo
    public static String c2bAvaliacaoChassiInput = "//input[@placeholder=\"Digite o Chassi\"]";
    public static String c2bAvaliacaoAnoModeloInput = "//div[text()=\"Ano/Modelo\"]//ancestor::div[1]/div[not(text()=\"Ano/Modelo\")]";
    public static String c2bAvaliacaoAnoModeloSelecionadoButton = "//div[@class=\"popup smart-select-popup modal-in\"]//div[text()=\"arg0\"]";
    public static String c2bAvaliacaoAnoFabricacaoInput = "//div[text()=\"Ano/Fabricação\"]//ancestor::div[1]/div[not(text()=\"Ano/Fabricação\")]";
    public static String c2bAvaliacaoMarcaInput = "//div[text()=\"Marca\"]//ancestor::div[1]/div[not(text()=\"Marca\")]";
    public static String c2bAvaliacaoModeloInput = "//div[text()=\"Modelo\"]//ancestor::div[1]/div[not(text()=\"Modelo\")]";
    public static String c2bAvaliacaoVersaoInput = "//div[text()=\"Versão\"]//ancestor::div[1]/div[not(text()=\"Versão\")]";
    public static String c2bAvaliacaoQuilometragem2Input = "//div[text()=\"Quilometragem\"]//ancestor::div[1]/div[not(text()=\"Quilometragem\")]";
    public static String c2bAvaliacaoCorInput = "//div[text()=\"Cor\"]//ancestor::div[1]/div[not(text()=\"Cor\")]";
    public static String c2bAvaliacaoCorSelect = "//div[text()=\"AZUL\"]";
    public static String c2bAvaliacaoCombustivelInput = "//div[text()=\"Combustível\"]//ancestor::div[1]/div[not(text()=\"Combustível\")]";
    public static String c2bAvaliacaoRaiz = "//div[@id=\"tab-1\"]";
    public static String c2bAvaliacaoDetalhesDoVeiculo = "//div[text()=\"Detalhes do veículo\"]";
    public static String c2bAvaliacaoCombustivelSelect = "//div[text()=\"GASOLINA\"]";
    public static String c2bAvaliacaoPassoDois = "//a[@id=\"tab-2-link\"]";
    public static String c2bAvaliacaoFotosInput = "//span[text()=\"Adicionar fotos\"]";
    public static String c2bAvaliacaoPassoTres = "//a[@id=\"tab-3-link\"]";
    public static String c2bAvaliacaoNomeInput = "//input[@id=\"input-name\"]";
    public static String c2bAvaliacaoEmailInput = "//input[@id=\"input-email\"]";
    public static String c2bAvaliacaoDDDInput = "//input[@id=\"input-area-code\"]";
    public static String c2bAvaliacaoTelefoneInput = "//input[@id=\"input-phone\"]";
    public static String c2bAvaliacaoObsTextArea = "//textarea[@id=\"input-message\"]";
    public static String c2bAvaliacaoAceitarNegociacaoInput = "//input[@id=\"acceptNegotiationOlx\"]";
    public static String c2bAvaliacaoEnviarAvaliacaoButton = "//a[@id=\"btn_sent\"]";
    public static String c2bAvaliacaoMotorInput = "//div[text()=\"Motor\"]//ancestor::div[1]/div[not(text()=\"Motor\")]";
    public static String c2bAvaliacaoInformeOMotorInput = "//input[@placeholder=\"Digite o Motor\"]";
    public static String c2bAvaliacaoPortasInput = "//div[text()=\"Portas\"]//ancestor::div[1]/div[not(text()=\"Portas\")]";
    public static String c2bAvaliacaoInformeAsPortasInput = "//input[@id=\"input-doors\"]";
    public static String c2bAvaliacaoCambioInput = "//div[text()=\"Câmbio\"]//ancestor::div[1]/div[not(text()=\"Câmbio\")]";
    public static String c2bAvaliacaoOpcionaisInput = "//div[text()=\"Opcionais\"]//ancestor::div[1]/div[not(text()=\"Opcionais\")]";
    public static String c2bAvaliacaoAbrirItensAvaliadosInput = "//div[text()=\"Abrir itens avaliados\"]//ancestor::div[1]/div[not(text()=\"Abrir itens avaliados\")]";

    public static LinkedHashMap<String, String> c2bAvaliacao = createData();

    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(c2bAvaliacaoMarcaSelect, "Select marca");
        ret.put(c2bAvaliacaoModeloSelect, "Select modelo");
        ret.put(c2bAvaliacaoAnoSelect, "Select ano");
        ret.put(c2bAvaliacaoVersaoSelect, "Select versao");
        ret.put(c2bAvaliacaoQuilometragemInput, "Select quilometragem");
        ret.put(c2bAvaliacaoContinuarButton, "Continuar");
        ret.put(c2bAvaliacaoChassiInput, "Chassi");
        ret.put(c2bAvaliacaoAnoModeloInput, "Ano Modelo");
        ret.put(c2bAvaliacaoAnoModeloSelecionadoButton, "Item selecionado");
        ret.put(c2bAvaliacaoAnoFabricacaoInput, "Ano Fabricacao");
        ret.put(c2bAvaliacaoMarcaInput, "Marca");
        ret.put(c2bAvaliacaoModeloInput, "Modelo");
        ret.put(c2bAvaliacaoCorInput, "Cor");
        ret.put(c2bAvaliacaoCorSelect, "Seleção de Cor");
        ret.put(c2bAvaliacaoCombustivelInput, "Combústivel");
        ret.put(c2bAvaliacaoCombustivelSelect, "Seleção do tipo de Combústivel");
        ret.put(c2bAvaliacaoPassoDois, "Passo 2");
        ret.put(c2bAvaliacaoFotosInput, "Fotos");
        ret.put(c2bAvaliacaoPassoTres, "Passo 3");
        ret.put(c2bAvaliacaoNomeInput, "Nome");
        ret.put(c2bAvaliacaoEmailInput, "Email");
        ret.put(c2bAvaliacaoDDDInput, "DDD");
        ret.put(c2bAvaliacaoTelefoneInput, "Telefone");
        ret.put(c2bAvaliacaoObsTextArea, "Observações");
        ret.put(c2bAvaliacaoAceitarNegociacaoInput, "Checkbox");
        ret.put(c2bAvaliacaoEnviarAvaliacaoButton, "Enviar");
        ret.put(c2bAvaliacaoRaiz, "Raiz da pagina");
        ret.put(c2bAvaliacaoDetalhesDoVeiculo, "Detalhe do veiculo");
        return ret;
    }
}
