package com.autoavaliar.products.apps.objetos.b2b;

import java.util.LinkedHashMap;

public class B2bMainAdmin {
    //Separar em outra classe, pois é outra tela.
    public static String b2bADMMainUrl = "https://adm.autoavaliar.com.br/";
    public static String b2bMainUrl = "https://www.autoavaliar.com.br/";
    public static String b2bMainLoginTimeQa = "timeqa.apk@autoavaliar.com.br";
    public static String b2bMainSenhaTimeQa = "de102030";
    public static String b2bMainLoginTimeQaB2b = "qaautoavaliar@gmail.com";
    public static String b2bMainSenhaTimeQaB2b = "timeqa0102";
    public static String b2bMainLogin = "//input[@name=\"usuario\"]";
    public static String b2bMainSenha = "//input[@name=\"senha\"]";
    public static String b2bMainButtonLogin = "//button";

    public static String b2bMainAvaliacoes = "//span[text()=\"Avaliações\"]//ancestor::a[1]";
    public static String b2bMainVeiculos = "//span[text()=\"Avaliações\"]//ancestor::li[1]//a[@href=\"veiculos.php\"]";
    public static String b2bMainNovoVeiculo = "//a[@id=\"btnNovo\"]";

    public static String b2bMainSalvar = "//a[@id=\"frmVeiculosBtn\"]";
    public static String b2bMainBuscarPlaca = "//input[@id=\"placaChassiVeic\"]";
    public static String b2bMainBuscarPlacaLupa = "//a[@href=\"javascript:document.frmBuscar1.submit();\"]";
    public static String b2bMainAlterar = "//img[@src=\"img/table/edit.png\"]//ancestor::a[1]";
    public static String b2bMainCriarAvaliacao = "//a[text()=\"Criar Avaliação\"]";
    public static String b2bMainStatusDoVeiculo = "//table[@id=\"tabled\"]//tbody//td[10]";
    public static String b2bMainIntervaloDeValor = "//input[@name=\"vlr_intervalo_lance\"]";
    public static String b2bMainValorCompreJa = "//input[@id=\"vlr_compre_avaliacao\"]";
    public static String b2bMainValorMinimoOferta = "//input[@name=\"valorMinimoOferta\"]";
    public static String b2bMainValorMinimoAceitoParaAprovacao = "//input[@name=\"veiculo_processo_aprovacao_lance\"][@value=\"1\"]";
    public static String b2bMainPercentualCalculoFipeAprovacao = "//input[@id=\"percCalculoFipeAprovacao\"]";
    public static String b2bMainAlterarCompreJaAutomaticamente = "//select[@name=\"compre_ja_atualizado\"]";
    public static String b2bMainPorcentagemCalculoCompreJa = "//input[@name=\"compre_ja_porcentagem\"]";
    public static String b2bMainConfirmar = "//input[@value=\"Confirmar\"]";
    public static String b2bMainFacaLoginB2b = "//p[text()=\"Faça login para acessar esta página.\"]";
    public static String b2bMainEmailB2b = "//div[@class=\"input-box\"]//input[@name=\"email\"]";
    public static String b2bMaiPasswordB2b = "//div[@class=\"input-box\"]//input[@name=\"password\"]";
    public static String b2bMainEntrar = "//button[contains(text(), \"ENTRAR\")]";
    public static String permitirTodosCookies = "//*[contains(text(),'Permitir todos os cookies')]";
    public static String permitirTodosCookies2 = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";


    public static String b2bMainRepasse = "//div[@data-action=\"REPASSE\"]";
    public static String b2bMainFiltro = "//input[@name=\"q\"]";
    public static String b2bMainAutoAvaliar = "//a[@href=\"/avaliacoes/autoavaliar\"]";
    public static String b2bMainCardsDeCarrosAvaliados = "//div[@class=\"info\"]";
    public static String b2bMainItensAvaliadosCambioRuim = "//input[@data-nameitem=\"Câmbio\"][@value=\"R\"]";
    public static String b2bMainItensAvaliadosCambioBom = "//input[@data-nameitem=\"Câmbio\"][@value=\"B\"]";
    public static String b2bMainItensAvaliadosCambioOtimo = "//input[@data-nameitem=\"Câmbio\"][@value=\"O\"]";
    public static String b2bMainItensAvaliadosMotorRuim = "//input[@data-nameitem=\"Motor\"][@value=\"R\"]";
    public static String b2bMainItensAvaliadosMotorBom = "//input[@data-nameitem=\"Motor\"][@value=\"B\"]";
    public static String b2bMainItensAvaliadosMotorOtimo = "//input[@data-nameitem=\"Motor\"][@value=\"O\"]";
    public static String B2B_MAIN_IMG_ALERTA_IA = "//img[@id=\"pb__modal_image\"]";
    public static String B2B_MAIN_BUTTON_FECHAR_ALERTA_IA = "//img[@id=\"pb__modal_image\"]/ancestor::div/a[@class]";
    public static String B2B_MAIN_TEXT_DADOS_INICIAIS = "//h3[text()=\"Dados Iniciais\"]";
    public static String B2B_MAIN_TEXT_ALERTA_AVALIACAO = "//span[@id=\"ui-dialog-title-dialog_score\"]";
    public static String B2B_MAIN_BUTTON_CONFIRMAR_AVALIACAO = "//div[@id=\"divSubmitScore\"]//input";
    public static String B2B_MAIN_TEXT_PESQUISA = "//th[text()=\"PESQUISA\"]";
    public static String B2B_MAIN_INPUT_VALOR_MINIMO_PARA_APROVACAO = "//input[@id=\"vlr_processo_aprovacao_lance\"]";
    public static String B2B_MAIN_INPUT_OU_PARTICIPANTE_ESPECIFICO = "//input[@id=\"participante_grupo\"]";
    public static String B2B_MAIN_INPUT_DEFINIR_VALOR_COMPRE_POR = "//input[@id=\"vlr_compre_avaliacao\"]";


    public static String b2bMainDataFinal = "//input[@name=\"datafinal\"]";
    public static String b2bMai = "";

    public static class tabDadosCadastrais  {
        public static String b2bMainLoja = "//select[@name=\"id_anunciante\"]";
        public static String b2bMainPlaca = "//input[@name=\"placa\"]";
        public static String b2bMainChassi = "//input[@id=\"chassi\"]";
        public static String b2bMainSelectCarro = "//select[@id=\"dadosTipo\"]";
        public static String b2bMainAnoFab = "//input[@name=\"ano_fabrica\"]";
        public static String b2bMainAnoModelo = "//input[@name=\"ano_modelo\"]";
        public static String b2bMainSelectMarca = "//select[@id=\"dadosMarca\"]";
        public static String b2bMainSelectModelo = "//select[@id=\"dadosModeloM\"]";
        public static String b2bMainVersao = "//select[@id=\"dadosVersaoM\"]";
        public static String b2bMainSelectCor = "//select[@id=\"dadosCor\"]";
        public static String b2bMainCombustivel = "//select[@id=\"dadosComb\"]";
        public static String b2bMainQuilometragem = "//input[@name=\"km\"]";
        public static String b2bMainPortas = "//select[@name=\"porta\"]";
        public static String b2bMain4x4 = "//div[@id=\"uniform-no\"]//input";
        public static String b2bMain4x4Sim = "//div[@id=\"uniform-yes\"]//input";
        public static String b2bMain4x4Nao = "//div[@id=\"uniform-no\"]//input";
        public static String b2bMain4x4StatusRuim = "//tr[@id=\"conservation-status\"]//input[@value=\"R\"]";
        public static String b2bMain4x4StatusBom = "//tr[@id=\"conservation-status\"]//input[@value=\"B\"]";
        public static String b2bMain4x4StatusOtimo = "//tr[@id=\"conservation-status\"]//input[@value=\"O\"]";
        public static String b2bMainLojaFisica = "//select[@name=\"loja_fisica\"]";
        public static String b2bMainMotor = "//input[@name=\"motor\"]";
        public static String b2bMainCambio = "//select[@id=\"dadosCambio\"]";
    }

    public static class tabOpcionais {
        public static String b2bMainOpcionais = "//a[text()=\"Opcionais\"]";
        public static String b2bMainAdicionarTodos = "//a[@class=\"add-all\"]";
        public static String b2bMainAdicionarPrimeiroItem = "//div[@class=\"available\"]//li[2]";
    }

    public static class tabItensAvaliados {
        public static String b2bMainItensAvaliados = "//a[text()=\"Itens Avaliados\"]";
        public static String b2bMainRadioOtimos = "//input[@value=\"O\"][@data-in]";
        public static String b2bMainRadioBom = "//input[@value=\"B\"][@data-in]";
        public static String b2bMainRadioRuim = "//input[@value=\"R\"][@data-in]";
    }

    public static class tabFotos {
        public static String b2bMainFotos = "//a[text()=\"Fotos\"]";
        public static String b2bMainFoto1 = "//*[@id=\"foto1\"]";
        public static String b2bMainFoto2 = "//input[@id=\"foto2\"]";
        public static String b2bMainFoto3 = "//input[@id=\"foto3\"]";
        public static String b2bMainFoto4 = "//input[@id=\"foto4\"]";
    }

    public static class tabValores {
        public static String b2bMainValores = "//a[text()=\"Valores\"]";
        public static String b2bMainValorDeCompra = "//input[@name=\"valor_compra\"]";
    }


    public static class B2bVeiculos {
        public static String B2B_VEICULOS_TEXT_VEICULOS = "//h3[text()=\"Veículos\"]";
        public static String B2B_VEICULOS_INPUT_OBSERVACOES = "//tr[@id=\"obs-4x4\"]//input";
        public static String B2B_VEICULOS_TEXT_OPCIONAIS_CARRO = "//label[text()=\"Opcionais (Carro)\"]";
        public static String B2B_VEICULOS_TEXT_ITEM_AVALIADO = "//th[text()=\"Item avaliado\"]";
        public static String B2B_VEICULOS_TEXT_FOTO = "//td[text()=\"Foto 1 (Destaque)\"]";
        public static String B2B_VEICULOS_TEXT_ULTIMAS_AVALIACOES = "//strong[text()=\"Últimas Avaliações Modelo: \"]";
        public static String B2B_VEICULOS_BUTTON_CARREGAR_FOTOS = "//a[text()=\"*Carregar Fotos*\"]";
        public static String B2B_VEICULOS_DIV_CARREGANDO_IMAGENS = "//div[@id=\"dialog_overlay\"]";

        public static LinkedHashMap<String, String> B2bVeiculos = createData();
        private static LinkedHashMap<String, String> createData() {
            LinkedHashMap<String, String> ret = new LinkedHashMap<>();
            ret.put(B2B_VEICULOS_TEXT_VEICULOS, "valida carregou tela de veiculos");
            ret.put(B2B_VEICULOS_INPUT_OBSERVACOES, "observações 4x4");
            ret.put(B2B_VEICULOS_TEXT_OPCIONAIS_CARRO, "validar carregou form opcionais(carro)");
            ret.put(B2B_VEICULOS_TEXT_ITEM_AVALIADO, "validar carregou form Itens avaliados");
            ret.put(B2B_VEICULOS_TEXT_FOTO, "validar carregou form Fotos");
            ret.put(B2B_VEICULOS_TEXT_ULTIMAS_AVALIACOES, "validar carregou form valores");
            ret.put(B2B_VEICULOS_BUTTON_CARREGAR_FOTOS, "carregar fotos");
            ret.put(B2B_VEICULOS_DIV_CARREGANDO_IMAGENS, "div carregando fotos");
            return ret;
        }
    }

    public static LinkedHashMap<String, String> b2bMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        //Aba de Dados Cadastrais
        ret.put(tabDadosCadastrais.b2bMainLoja, "Select Loja");
        ret.put(tabDadosCadastrais.b2bMainPlaca, "Placa");
        ret.put(tabDadosCadastrais.b2bMainChassi, "Chassi");
        ret.put(tabDadosCadastrais.b2bMainSelectCarro, "Tipo de veiculo");
        ret.put(tabDadosCadastrais.b2bMainAnoFab, "Ano fabricacao");
        ret.put(tabDadosCadastrais.b2bMainAnoModelo, "Ano modelo");
        ret.put(tabDadosCadastrais.b2bMainSelectMarca, "Marca");
        ret.put(tabDadosCadastrais.b2bMainSelectModelo, "Modelo");
        ret.put(tabDadosCadastrais.b2bMainVersao, "Versao");
        ret.put(tabDadosCadastrais.b2bMainSelectCor, "Cor");
        ret.put(tabDadosCadastrais.b2bMainCombustivel, "Combustivel");
        ret.put(tabDadosCadastrais.b2bMainQuilometragem, "Quilometragem");
        ret.put(tabDadosCadastrais.b2bMainPortas, "Portas");
        ret.put(tabDadosCadastrais.b2bMain4x4, "4x4 Não");
        ret.put(tabDadosCadastrais.b2bMain4x4Sim, "4x4 Sim");
        ret.put(tabDadosCadastrais.b2bMain4x4Nao, "4x4 Não");
        ret.put(tabDadosCadastrais.b2bMain4x4StatusRuim, "4x4 Ruim");
        ret.put(tabDadosCadastrais.b2bMain4x4StatusBom, "4x4 Bom");
        ret.put(tabDadosCadastrais.b2bMain4x4StatusOtimo, "4x4 Otimo");
        ret.put(tabDadosCadastrais.b2bMainLojaFisica, "Loja Fisica");
        ret.put(tabDadosCadastrais.b2bMainMotor, "Motor");
        ret.put(tabDadosCadastrais.b2bMainCambio, "Cambio");

        //Aba de Opcionais
        ret.put(tabOpcionais.b2bMainOpcionais, "Opcionais");
        ret.put(tabOpcionais.b2bMainAdicionarTodos, "Adicionar todos");
        ret.put(tabOpcionais.b2bMainAdicionarPrimeiroItem, "Adicionar primeiro item");

        //Aba Itens Avaliados
        ret.put(tabItensAvaliados.b2bMainItensAvaliados, "Itens avaliados");
        ret.put(tabItensAvaliados.b2bMainRadioOtimos, "Radio otimos");
        ret.put(tabItensAvaliados.b2bMainRadioBom, "Radio bom");
        ret.put(tabItensAvaliados.b2bMainRadioRuim, "Radio ruim");

        //Aba Fotos
        ret.put(tabFotos.b2bMainFotos, "Fotos");
        ret.put(tabFotos.b2bMainFoto1, "Foto 1");
        ret.put(tabFotos.b2bMainFoto2, "Foto 2");
        ret.put(tabFotos.b2bMainFoto3, "Foto 3");
        ret.put(tabFotos.b2bMainFoto4, "Foto 4");

        //Aba Valores
        ret.put(tabValores.b2bMainValores, "Valores");
        ret.put(tabValores.b2bMainValorDeCompra, "Valor de compra");

   ///
        ret.put(b2bMainLogin, "Login");
        ret.put(b2bMainSenha, "Senha");
        ret.put(b2bMainButtonLogin, "Login");
        ret.put(b2bMainAvaliacoes, "Menu Avaliações");
        ret.put(b2bMainVeiculos, "Menu Valicações/Veiculos");
        ret.put(b2bMainNovoVeiculo, "Novo veiculo");




        ret.put(b2bMainSalvar, "Salvar");
        ret.put(b2bMainBuscarPlaca, "Buscar placa");
        ret.put(b2bMainBuscarPlacaLupa, "Buscar placa lupa");
        ret.put(b2bMainAlterar, "Alterar");
        ret.put(b2bMainCriarAvaliacao, "Criar avaliação");
        ret.put(b2bMainStatusDoVeiculo, "Status do veiculo");
        ret.put(b2bMainIntervaloDeValor, "Intervalo de valor");
        ret.put(b2bMainValorCompreJa, "Valor compre já");
        ret.put(b2bMainValorMinimoOferta, "Valor minimo oferta");
        ret.put(b2bMainValorMinimoAceitoParaAprovacao, "Valor minimo aceito para aprovacao");
        ret.put(b2bMainPercentualCalculoFipeAprovacao, "Percentual calculo fipe aprovacao");
        ret.put(b2bMainAlterarCompreJaAutomaticamente, "Alterar compre já automaticamente");
        ret.put(b2bMainPorcentagemCalculoCompreJa, "Porcentagem calculo compre já");
        ret.put(b2bMainConfirmar, "Confirmar");
        ret.put(b2bMainFacaLoginB2b, "Faça login para acessar esta página");
        ret.put(b2bMainEmailB2b, "Campo login");
        ret.put(b2bMaiPasswordB2b, "Campo senha");
        ret.put(b2bMainEntrar, "Campo entrar");
        ret.put(b2bMainRepasse, "Repasse");
        ret.put(b2bMainFiltro, "Filtro");
        ret.put(b2bMainAutoAvaliar, "Auto avaliar");
        ret.put(b2bMainCardsDeCarrosAvaliados, "Cards de veiculos");
        ret.put(b2bMainItensAvaliadosCambioRuim, "Cambio ruim");
        ret.put(b2bMainItensAvaliadosCambioBom, "Cambio bom");
        ret.put(b2bMainItensAvaliadosCambioOtimo, "Cambio otimo");
        ret.put(b2bMainItensAvaliadosMotorRuim, "Motor ruim");
        ret.put(b2bMainItensAvaliadosMotorBom, "Motor bom");
        ret.put(b2bMainItensAvaliadosMotorOtimo, "Motor otimo");
        ret.put(b2bMainDataFinal, "Data final");
        ret.put(B2B_MAIN_IMG_ALERTA_IA, "Imagem alerta IA");
        ret.put(B2B_MAIN_BUTTON_FECHAR_ALERTA_IA, "Botão fechar alerta IA");
        ret.put(B2B_MAIN_TEXT_DADOS_INICIAIS, "Dados iniciais main");
        ret.put(B2B_MAIN_TEXT_ALERTA_AVALIACAO, "alerta campos avaliacao");
        ret.put(B2B_MAIN_BUTTON_CONFIRMAR_AVALIACAO, "confirmar avaliacao");
        ret.put(B2B_MAIN_TEXT_PESQUISA, "validar carregou tela listagem veiculos cadastrados");
        ret.put(B2B_MAIN_INPUT_VALOR_MINIMO_PARA_APROVACAO, "valor minimo aceito para aprovação");
        ret.put(B2B_MAIN_INPUT_OU_PARTICIPANTE_ESPECIFICO, "ou participante especifico");
        ret.put(B2B_MAIN_INPUT_DEFINIR_VALOR_COMPRE_POR, "definir valor de 'compre por' da avaliação");

        return ret;
    }
}
