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
    public static String APPS_USBI_AVALIACOES_BUTTON_AVALIACAO_ESPECIFICA_PLACA = "//span[text()=\"arg0 \"]";
    public static String APPS_USBI_AVALIACOES_TEXT_AVALIACAO = "//h1[text()=\"Avaliação \"]";

    public static String APPS_USBI_AVALIACOES_TEXT_TELEFONE = "//span[text()=\"Telefone\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_CELULAR = "//span[text()=\"Celular\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_EMAIL = "//span[text()=\"E-mail\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_SOLICITANTE = "//span[text()=\"Solicitante\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_PLACA = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]/div[contains(., 'Placa')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_ANO = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]//div[@class=\"row bt p-sm ng-binding\"][contains(., 'Ano')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_KM = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]/div[contains(., 'Km')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_COR = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]/div[contains(., 'Cor')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_COMBUSTIVEL = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]/div[contains(., 'Comb.')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_CAMBIO = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]/div[contains(., 'Câmbio')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_APLICACAO = "//span[text()=\"Aplicação\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_SEGMENTO = "//span[text()=\"Segmento\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_TRACAO = "//span[text()=\"Tração\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_FABRICANTE_MOTOR = "//span[text()=\"Fabricante Motor\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_NUMERO_CILINDROS = "//span[text()=\"Cilindros\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_NUMERO_MARCHAS = "//span[text()=\"Marchas\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_CABINE = "//span[text()=\"Cabine\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_DISTANCIA_ENTRE_EIXOS_ATUAL = "//span[text()=\"Distância entre eixos (Atual)\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_DISTANCIA_ENTRE_EIXOS_ANTERIOR = "//span[text()=\"Distância entre eixos (Anterior)\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_POTENCIA = "//span[text()=\"Potência\"]/following-sibling::span";
    public static String APPS_USBI_AVALIACOES_TEXT_CLASSIFICACAO = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]//div[contains(., 'Classificação')]/div";
    public static String APPS_USBI_AVALIACOES_TEXT_FINALIDADE = "//div[@ng-hide=\"ctrl.editable['vehicle'] || ctrl.editing\"]//div[contains(., 'Finalidade')]/div/span[@style]";
    public static String APPS_USBI_AVALIACOES_TEXT_VALOR_COMPRA = "//div[@class=\"panel-body pb0\"]/h1";
    public static String APPS_USBI_AVALIACOES_TEXT_VALOR_VENDA = "//div[@ng-dblclick=\"ctrl.fieldEdit('valor_app')\"]";
    public static String APPS_USBI_AVALIACOES_TEXT_PORTAS = "//div[@ng-show=\"ctrl.valuation.vehicle.kind_id != 2\"]/div";

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
    public static String APPS_AVALIACOES_TEXT_CLIENTE = "//span[text()=\"Cliente\"]/following-sibling::span";
    public static String APPS_AVALIACOES_TEXT_TELEFONE = "//span[text()=\"Telefone\"]/following-sibling::span";
    public static String APPS_AVALIACOES_TEXT_CELULAR = "//span[text()=\"Celular\"]/following-sibling::span";
    public static String APPS_AVALIACOES_TEXT_EMAIL = "//span[text()=\"E-mail\"]/following-sibling::span";
    public static String APPS_AVALIACOES_TEXT_PROGRESSO_AVALIACAO = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";


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
        ret.put(APPS_USBI_AVALIACOES_BUTTON_AVALIACAO_ESPECIFICA_PLACA, "Resultado pesquisa avaliação por placa");
        ret.put(APPS_USBI_AVALIACOES_TEXT_AVALIACAO, "Validar carregou tela avaliação");
        ret.put(APPS_USBI_AVALIACOES_TEXT_TELEFONE, "Telefone cadastrado");
        ret.put(APPS_USBI_AVALIACOES_TEXT_CELULAR, "Celular cadastrado");
        ret.put(APPS_USBI_AVALIACOES_TEXT_EMAIL, "E-mail cadastrado");
        ret.put(APPS_USBI_AVALIACOES_TEXT_SOLICITANTE, "Solicitante / vendedor cadastrado");
        ret.put(APPS_USBI_AVALIACOES_TEXT_PLACA, "Placa avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_ANO, "Ano avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_KM, "Km avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_COR, "Cor avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_COMBUSTIVEL, "Combustível avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_CAMBIO, "Câmbio avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_APLICACAO, "Aplicação avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_SEGMENTO, "Segmento avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_TRACAO, "Tração avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_FABRICANTE_MOTOR, "Fabricante motor avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_NUMERO_CILINDROS, "Número cilindros avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_NUMERO_MARCHAS, "Número marchas avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_CABINE, "Cabine avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_DISTANCIA_ENTRE_EIXOS_ATUAL, "Distancia entre eixos atual avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_DISTANCIA_ENTRE_EIXOS_ANTERIOR, "Distancia entre eixos anterior avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_POTENCIA, "Potência avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_CLASSIFICACAO, "Classificação avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_FINALIDADE, "Finalidade avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_VALOR_COMPRA, "Valor compra avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_VALOR_VENDA, "Valor venda avaliação cadastrada");
        ret.put(APPS_USBI_AVALIACOES_TEXT_PORTAS, "Número de portas avaliação cadastrada");
        ret.put(APPS_AVALIACOES_TEXT_CLIENTE, "Cliente da proposta");
        ret.put(APPS_AVALIACOES_TEXT_TELEFONE, "Telefone da proposta");
        ret.put(APPS_AVALIACOES_TEXT_CELULAR, "Celular da proposta");
        ret.put(APPS_AVALIACOES_TEXT_EMAIL, "E-mail da proposta");
        return ret;
    }
}
