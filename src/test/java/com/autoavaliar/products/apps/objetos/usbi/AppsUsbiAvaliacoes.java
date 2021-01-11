package com.autoavaliar.products.apps.objetos.usbi;

import java.util.LinkedHashMap;

public class AppsUsbiAvaliacoes {
    public static String appsAvaliacoesTitleText = "//div[contains(text(), \"Avaliações\")]";
    public static String appsSolicitarButton = "//button[@ng-click=\"ctrl.solicita()\"]";
    public static String appsAvaliacoesBuscarPlacaInput = "//input[@class=\"form-control ng-pristine ng-untouched ng-valid ng-empty\"]";
    public static String appsAvaliacoesBuscarButton = "//button[@class=\"btn btn-success text-uppercase ng-binding\"]";
    public static String appsAvaliacoesPrimeiroVeiculoCadastradoButton = "//tbody[@class=\"spaceSave\"]//tr[1]";
    public static String appsAvaliacoesValidarCarregouTelaDeBuscaText = "//label[@class=\"control-label ng-binding\"][text()=\"Empresa\"]";
    public static String appsAvaliacoesValidarAvaliacaoText = "//h1[@class=\"m0 pull-left ng-binding\"]";
    public static String appsAvaliacoesEditarDadosDoVeiculoAvaliadoButton = "//div[@class=\"row bg-gray-lighter p-sm\"]//span[@class=\"pull-right ng-scope\"]";
    public static String appsAvaliacoesEditarAnoVeiculoText = "//input[@ng-blur=\"ctrl.subVehicleDataHandler('', 'year')\"]";
    public static String appsAvaliacoesChassiEditarTesteInput = "//label[text()=\"Veículo\"]";

    //Layout
    public static String appsAvaliacoesBuscarPlacaText = "//input[@placeholder=\"Buscar Placa\"]/ancestor::div/label";
    public static String appsAvaliacoesVeiculoRecemAvaliadoButton = "//td[@class=\"text-uppercase\"]/div/span[contains(text(),\"arg0\")]";
    public static String appsAvaliacoesAdicionarImagemAvaliacaoSolicitadaButton = "//a[@ng-click=\"ctrl.showPhotosModal()\"]";
    public static String appsAvaliacoesSelecionarImagemDocumentoButton = "//div[contains(text(),\"Documento\")]/ancestor::div[@class=\"panel-heading pb0\"]/following-sibling::div/button";
    public static String appsAvaliacoesSelecionarImagemFrenteLadoButton = "//div[contains(text(),\"Frente-Lado Diagonal\")]/ancestor::div[@class=\"panel-heading pb0\"]/following-sibling::div/button";
    public static String appsAvaliacoesFiltroMarcaInput = "//label[contains(text(),\"Marca\")]/ancestor::div/av-search-filter/div/div/input";
    public static String appsAvaliacoesFiltroModeloInput = "//label[contains(text(),\"Modelo\")]/ancestor::div/av-search-filter/div/div/input";
    public static String appsAvaliacoesFiltroVersaoInput = "//label[contains(text(),\"Versão\")]/ancestor::div/av-search-filter/div/div/input";
    public static String appsAvaliacoesFiltroBuscarButton = "//button[@ng-click=\"ctrl.find()\"]";


    //TEXT
    public static String BuscarPlacatext = "Buscar placa";


    public static LinkedHashMap<String, String> appsAvaliacoes = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsAvaliacoesTitleText, "Titulo avaliações");
        ret.put(appsSolicitarButton, "Solicitar");
        ret.put(appsAvaliacoesBuscarPlacaInput, "Input buscar placa");
        ret.put(appsAvaliacoesBuscarButton, "Botão buscar para filtrar avaliações");
        ret.put(appsAvaliacoesPrimeiroVeiculoCadastradoButton, "Primeiro veiculo cadastrado da lista de veiculos avaliados");
        ret.put(appsAvaliacoesValidarCarregouTelaDeBuscaText, "Validar carregou tela de busca de avaliacoes");
        ret.put(appsAvaliacoesValidarAvaliacaoText, "Validar carregou tela dentro da avaliação");
        ret.put(appsAvaliacoesEditarDadosDoVeiculoAvaliadoButton, "Editar dados do veiculo avaliado");
        ret.put(appsAvaliacoesEditarAnoVeiculoText, "Campo usado para validar funcionalidade do botao editar");
        ret.put(appsAvaliacoesBuscarPlacaText, "Buscar placa");
        ret.put(appsAvaliacoesChassiEditarTesteInput, "Input chassi teste");
        ret.put(appsAvaliacoesVeiculoRecemAvaliadoButton, "Veiculo recem avaliado");
        ret.put(appsAvaliacoesVeiculoRecemAvaliadoButton, "Adicionar imagem");
        ret.put(appsAvaliacoesSelecionarImagemDocumentoButton, "Selecionar Documento");
        ret.put(appsAvaliacoesSelecionarImagemFrenteLadoButton, "Selecionar Frente-Lado Diagonal");
        ret.put(appsAvaliacoesFiltroMarcaInput, "Marca");
        ret.put(appsAvaliacoesFiltroModeloInput, "Modelo");
        ret.put(appsAvaliacoesFiltroVersaoInput, "Versão");
        ret.put(appsAvaliacoesFiltroBuscarButton, "Buscar");
        return ret;
    }
}
