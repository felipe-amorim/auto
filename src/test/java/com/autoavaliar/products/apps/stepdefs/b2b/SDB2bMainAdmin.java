package com.autoavaliar.products.apps.stepdefs.b2b;

import com.autoavaliar.intern.Instances;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.autoavaliar.support.CoreWeb;
import com.autoavaliar.support.tbi.GeradorPlaca;
import com.autoavaliar.support.tbi.JRobot;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;

import java.awt.event.KeyEvent;
import java.util.jar.JarEntry;

import static com.autoavaliar.products.apps.objetos.b2b.B2bMainAdmin.*;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMainAdmin.B2bVeiculos.*;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMainAdmin.tabDadosCadastrais.*;

public class SDB2bMainAdmin extends CoreWeb {
    static String placa = "n/a";
    private static String chassi = "1";
    private static String anoFab = "2000";
    private static String marca = "FIAT";
    private static String modelo = "UNO";
    private static String km = "67541";
    private static String quatroxquatro = "";
    private static String statusQuatroPorQuatro = "";
    private static String motor = "1";
    private static String statusCambio = "";
    private static String statusMotor = "";
    private static String valorDeCompra = "1012300";
    private static String valorDeCompreJa = "1912300";
    private static String valorMinimoOFerta = "1512300";
    private static String dataFinal = "n/a";


    @Given("O usuario cria um novo veiculo no b{int}b adm como timeqa usando os arquivos {string}")
    public void oUsuarioCriaUmNovoVeiculoNoBBAdmComoTimeqa(int arg0, String arg1) {
        //webDriver().set().options().withUserData(arg1);
        webDriver().set().options().maximized();
        webDriver().navigate(b2bADMMainUrl);
        log().setLocator(b2bMain);
        if (find(b2bMainLogin).exists()) {
            find(b2bMainLogin).send().nonRobotic().text(b2bMainLoginTimeQa);
            find(b2bMainSenha).send().nonRobotic().text(b2bMainSenhaTimeQa);
            find(b2bMainButtonLogin).click();
        }
        find(b2bMainAvaliacoes).move();
        find(b2bMainVeiculos).click();
        find(b2bMainNovoVeiculo).click();
        find(tabDadosCadastrais.b2bMainLoja).comboBox().set().byIndex(1);

        if(placa.length()<=0 || placa.toLowerCase().equals("n/a")){
            placa = GeradorPlaca.gerarPlaca();
        }

        while (true) {
            find(tabDadosCadastrais.b2bMainPlaca).send().text(placa);
            find(tabDadosCadastrais.b2bMainChassi).click();
            sleep().until(3000);
            if (find().popUp().exists()) {
                find().popUp();
                placa = GeradorPlaca.gerarPlaca();
            } else {
                break;
            }
            find(tabDadosCadastrais.b2bMainPlaca).clear();
        }

        //find(b2bMainPlaca).send().text(placa);
        //find(b2bMainChassi).click();
        //sleep().until(3000);

        find(tabDadosCadastrais.b2bMainChassi).send().text(chassi);
        find(tabDadosCadastrais.b2bMainSelectCarro).comboBox().set().byText("Carro");


        find(tabDadosCadastrais.b2bMainAnoFab).send().text(anoFab);
        find(tabDadosCadastrais.b2bMainAnoModelo).send().text(anoFab);
        find(tabDadosCadastrais.b2bMainSelectMarca).comboBox().set().byText(marca.toUpperCase());
        find(tabDadosCadastrais.b2bMainSelectModelo).comboBox().set().byText(modelo.toUpperCase());
        find(tabDadosCadastrais.b2bMainVersao).comboBox().set().byIndex(1);
        find(tabDadosCadastrais.b2bMainSelectCor).comboBox().set().byIndex(1);
        find(tabDadosCadastrais.b2bMainCombustivel).comboBox().set().byIndex(1);
        find(tabDadosCadastrais.b2bMainQuilometragem).send().text(km);
        find(tabDadosCadastrais.b2bMainPortas).comboBox().set().byIndex(2);
        if (!quatroxquatro.toLowerCase().equals("sim")) {
            find(tabDadosCadastrais.b2bMain4x4).click();
        } else {
            find(tabDadosCadastrais.b2bMain4x4Sim).click();
            if (statusQuatroPorQuatro.toLowerCase().equals("bom")) {
                find(tabDadosCadastrais.b2bMain4x4StatusBom).click();
            } else if (statusQuatroPorQuatro.toLowerCase().equals("otimo")) {
                find(tabDadosCadastrais.b2bMain4x4StatusOtimo).click();
            } else {
                find(tabDadosCadastrais.b2bMain4x4StatusRuim).click();
            }
        }
        find(tabDadosCadastrais.b2bMainLojaFisica).comboBox().set().byText("Teste");
        find(tabDadosCadastrais.b2bMainMotor).send().text(motor);
        find(tabDadosCadastrais.b2bMainCambio).comboBox().set().byIndex(1);
        sleep().until(5000);//todo remover depois
        find(tabOpcionais.b2bMainOpcionais).click();
        find(tabOpcionais.b2bMainAdicionarPrimeiroItem).click();
        find(tabOpcionais.b2bMainAdicionarPrimeiroItem).click();
        find(tabOpcionais.b2bMainAdicionarPrimeiroItem).click();
        find(tabItensAvaliados.b2bMainItensAvaliados).click();
        if (statusCambio.toLowerCase().equals("bom")) {
            find(b2bMainItensAvaliadosCambioBom).click();
        } else if (statusCambio.toLowerCase().equals("otimo")) {
            find(b2bMainItensAvaliadosCambioOtimo).click();
        } else {
            find(b2bMainItensAvaliadosCambioRuim).click();
        }

        if (statusMotor.toLowerCase().equals("bom")) {
            find(b2bMainItensAvaliadosMotorBom).click();
        } else if (statusMotor.toLowerCase().equals("otimo")) {
            find(b2bMainItensAvaliadosMotorOtimo).click();
        } else {
            find(b2bMainItensAvaliadosMotorRuim).click();
        }

        scroll().up(700);

        find(tabFotos.b2bMainFotos).click();

        find(tabFotos.b2bMainFoto1).actions().click();
        sleep().until(500);

        JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\2.jpg");

        //JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\car_fusca.jpg");

        sleep().until(500);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");

        find(tabFotos.b2bMainFoto2).actions().click();
        sleep().until(500);
        JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\fusca3.jpg");
        sleep().until(500);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");

        find(tabFotos.b2bMainFoto3).actions().click();
        sleep().until(500);
        JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\fusca4.jpg");
        sleep().until(500);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");


        find(tabValores.b2bMainValores).click();
        find(tabValores.b2bMainValorDeCompra).send().text(valorDeCompra);
        find(b2bMainSalvar).click();
        sleep().until(5000);
        if (find().popUp().exists()) {
            find().popUp();
        } else {
            error().Fail();
        }
        find(b2bMainBuscarPlaca).send().text(placa);
        find(b2bMainBuscarPlacaLupa).click();
        assertThat(find(b2bMainStatusDoVeiculo).get().text().toString()).isEqualTo("Ativo");
        find(b2bMainAlterar).click();
        find(b2bMainCriarAvaliacao).click();
        find(b2bMainIntervaloDeValor).clear();
        String intervaloDeValor = "38900";
        find(b2bMainIntervaloDeValor).send().text(intervaloDeValor);
        find(b2bMainValorCompreJa).send().text(valorDeCompreJa);
        find(b2bMainValorMinimoOferta).send().text(valorMinimoOFerta);
        find(b2bMainValorMinimoAceitoParaAprovacao).click();
        find(b2bMainPercentualCalculoFipeAprovacao).send().text("10");
        find(b2bMainAlterarCompreJaAutomaticamente).comboBox().set().byText("Sim");
        find(b2bMainPorcentagemCalculoCompreJa).send().text("10");
        /*if (dataFinal.length() > 0 && !dataFinal.toLowerCase().equals("n/a")) {
            //find(b2bMainDataFinal).send().text();
            find(b2bMainDataFinal).send().setValueThroughJavaScript(new SimpleDateFormat().format(convert().getDate().add().days(7)));
        }*/
        find(b2bMainSalvar).click();
        sleep().until(4000);
        find().popUp().accept();
        sleep().until(4000);
        find().popUp().accept();
        find(b2bMainConfirmar).click();
        sleep().until(4000);
        find().popUp().accept();
    }

    @When("O usuario valida o veiculo cadastrado no b{int}b")
    public void oUsuarioValidaOVeiculoCadastradoNoBB(int arg0) {
        //Login no B2b
        webDriver().navigate(b2bMainUrl);
        log().setLocator(b2bMain);

        find(permitirTodosCookies2).click();
        find(b2bMainEmailB2b).send().nonRobotic().text(b2bMainLoginTimeQaB2b);
        find(b2bMaiPasswordB2b).send().nonRobotic().text(b2bMainSenhaTimeQaB2b);
        find(b2bMainEntrar).click();


        // Selecionar Opção REPASSE
        find(b2bMainRepasse).click();

        //Pesquisar por AutoAvaliar
        find(b2bMainFiltro).send().text("auto avaliar");
        find(b2bMainAutoAvaliar).click();
        int countQuantosCardsDeVeiculos = find(b2bMainCardsDeCarrosAvaliados).count();

    }

    @Given("O usuario define os valores do carro {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioDefineOsValoresDoCarroPlacaChassiAnoMarcaKmQuatroPorQuatroStatusQuatroPorQuatroMotorStatusCambioStatusMotorCompraComprejaMinimoOferta(String arg0,
                                                                                                                                                              String arg1,
                                                                                                                                                              String arg2,
                                                                                                                                                              String arg3,
                                                                                                                                                              String arg4,
                                                                                                                                                              String arg5,
                                                                                                                                                              String arg6,
                                                                                                                                                              String arg7,
                                                                                                                                                              String arg8,
                                                                                                                                                              String arg9,
                                                                                                                                                              String arg10,
                                                                                                                                                              String arg11,
                                                                                                                                                              String arg12,
                                                                                                                                                              String arg13,
                                                                                                                                                              String arg14) {
        placa = arg0;
        chassi = arg1;
        anoFab = arg2;
        marca = arg3;
        modelo = arg4;
        km = arg5;
        quatroxquatro = arg6;
        statusQuatroPorQuatro = arg7;
        motor = arg8;
        statusCambio = arg9;
        statusMotor = arg10;
        valorDeCompra = arg11;
        valorDeCompreJa = arg12;
        valorMinimoOFerta = arg13;
        dataFinal = arg14;
    }

    @Given("O usuario acessa portal auto avaliar da url admin com usuario qa")
    public void oUsuarioAcessaPortalAutoAvaliarDaUrlAdminComUsuarioQa() {
        log().setLocator(b2bMain);
        find(b2bMainLogin).send().nonRobotic().text(b2bMainLoginTimeQa);
        find(b2bMainSenha).send().nonRobotic().text(b2bMainSenhaTimeQa);
        find(b2bMainButtonLogin).click();
        sleep().untilAppear(B2B_MAIN_TEXT_DADOS_INICIAIS);
        error().Warning("ativar validacao alert IA");
        //sleep().setMaxTime(30000);
        //if (find(B2B_MAIN_IMG_ALERTA_IA).exists()) {
        //    find(B2B_MAIN_BUTTON_FECHAR_ALERTA_IA).click();
        //}
        //sleep().setDefaultTime();
    }

    @And("O usuario acessa o menu avaliacoes")
    public void oUsuarioAcessaOMenuAvaliacoes() {
        log().setLocator(b2bMain);
        find(b2bMainAvaliacoes).move();
    }

    @And("O usuario acessa opcao veiculos do menu avaliacoes")
    public void oUsuarioAcessaOpcaoVeiculosDoMenuAvaliacoes() {
        log().setLocator(b2bMain);
        find(b2bMainVeiculos).click();
        sleep().untilAppear(B2B_VEICULOS_TEXT_VEICULOS);
    }

    @And("O usuario clica em novo para adicionar novo veiculo")
    public void oUsuarioClicaEmNovoParaAdicionarNovoVeiculo() {
        log().setLocator(b2bMain);
        find(b2bMainNovoVeiculo).click();
    }

    @And("O usuario preenche o combobox loja para cadastro de novo veiculo por index")
    public void oUsuarioPreencheOComboboxLojaParaCadastroDeNovoVeiculoPorIndex() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainLoja).comboBox().set().byIndex(1);
    }

    @And("O usuario preenche o campo placa para cadastro de novo veiculo")
    public void oUsuarioPreencheOCampoPlacaParaCadastroDeNovoVeiculo() {
        if (placa.length() <= 0 || placa.toLowerCase().equals("n/a")) {
            placa = GeradorPlaca.gerarPlaca();
        }
        while (true) {
            log().setLocator(b2bMain);
            find(tabDadosCadastrais.b2bMainPlaca).send().text(placa);
            find(tabDadosCadastrais.b2bMainChassi).click();
            sleep().until(3000);
            if (find().popUp().exists()) {
                find().popUp();
                placa = GeradorPlaca.gerarPlaca();
            } else {
                break;
            }
            find(tabDadosCadastrais.b2bMainPlaca).clear();
        }
    }

    @And("O Usuario preenche o campo chassi igual a placa para cadastro de novo veiculo")
    public void oUsuarioPreencheOCampoChassiIgualAPlacaParaCadastroDeNovoVeiculo() {
        chassi = placa;
        log().setLocator(b2bMain);
        find(b2bMainChassi).send().text(chassi);
    }

    @And("O usuario preenche o combobox tipo para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOComboboxTipoParaCadastroDeNovoVeiculoComVeiculo(String arg0) {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainSelectCarro).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche os campos ano fab mod para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOsCamposAnoFabModParaCadastroDeNovoVeiculoComAno(String arg0) {
        log().setLocator(b2bMain);
        anoFab = arg0;
        find(tabDadosCadastrais.b2bMainAnoFab).send().text(anoFab);
        find(tabDadosCadastrais.b2bMainAnoModelo).send().text(anoFab);
    }

    @And("O usuario preenche o campo marca para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOCampoMarcaParaCadastroDeNovoVeiculoComMarca(String arg0) {
        log().setLocator(b2bMain);
        marca = arg0;
        find(tabDadosCadastrais.b2bMainSelectMarca).comboBox().set().byText(marca.toUpperCase());
    }

    @And("O usuario preenche o campo modelo para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOCampoModeloParaCadastroDeNovoVeiculoComModeloCom(String arg0) {
        modelo = arg0;
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainSelectModelo).comboBox().set().byText(modelo.toUpperCase());
    }

    @And("O usuario preenche o campo versao para cadastro de novo veiculos")
    public void oUsuarioPreencheOCampoVersaoParaCadastroDeNovoVeiculos() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainVersao).comboBox().set().byIndex(1);
    }

    @And("O usuario preenche o campo cor para cadastro de novo veiculo")
    public void oUsuarioPreencheOCampoCorParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainSelectCor).comboBox().set().byIndex(1);
    }

    @And("O usuario preenche o campo combustivel para cadastro de novo veiculo")
    public void oUsuarioPreencheOCampoCombustivelParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainCombustivel).comboBox().set().byIndex(1);
    }

    @And("O usuario preenche o campo km para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOCampoKmParaCadastroDeNovoVeiculoCom(String arg0) {
        log().setLocator(b2bMain);
        km = arg0;
        find(tabDadosCadastrais.b2bMainQuilometragem).send().text(km);
    }

    @And("O usuario preenche o combobox numero de portas para cadastro de novo veiculo")
    public void oUsuarioPreencheOComboboxNumeroDePortasParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainPortas).comboBox().set().byIndex(2);
    }

    @And("O usuario marca radio button veiculo quatro por quatro com {string}")
    public void oUsuarioMarcaRadioButtonVeiculoQuatroPorQuatroComSim(String arg0) {
        log().setLocator(b2bMain);
        switch (arg0) {
            case "sim":
                find(b2bMain4x4Sim).click();
                break;
            case "nao":
                find(b2bMain4x4Nao).click();
                break;
        }
    }

    @Given("O usuario navega para portal auto avaliar na url admin")
    public void oUsuarioNavegaParaPortalAutoAvaliarNaUrlAdmin() {
        webDriver().set().options().maximized();
        webDriver().navigate(b2bADMMainUrl);
    }

    @And("O usuario marca o radio button estado de conservacao quatro pro quatro com {string}")
    public void oUsuarioMarcaORadioButtonEstadoDeConservacaoQuatroProQuatroComConservacaoquatoxquatro(String arg0) {
        log().setLocator(b2bMain);
        switch (arg0){
            case "ruim":
                find(tabDadosCadastrais.b2bMain4x4StatusRuim).click();
                break;
            case "bom":
                find(tabDadosCadastrais.b2bMain4x4StatusBom).click();
                break;
            case "otimo":
                find(tabDadosCadastrais.b2bMain4x4StatusOtimo).click();
                break;
        }
    }

    @And("O usuario preenche o campo observacoes para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOCampoObservacoesParaCadastroDeNovoVeiculoComObservacoes(String arg0) {
        log().setLocator(b2bMain);
        find(B2B_VEICULOS_INPUT_OBSERVACOES).send().text(arg0);
    }

    @And("O usuario preenche o combobox loja fisica para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOComboboxLojaFisicaParaCadastroDeNovoVeiculoComLojafisica(String arg0) {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainLojaFisica).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o campo motor para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOCampoMotorParaCadastroDeNovoVeiculoComMotorCom(String arg0) {
        motor = arg0;
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainMotor).send().text(motor);
    }

    @And("O usuario preenche o combobox cambio para cadastro de novo veiculo")
    public void oUsuarioPreencheOComboboxCambioParaCadastroDeNovoVeiculoComCambio() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainCambio).comboBox().set().byIndex(1);
    }

    @And("O usuario acessa form opcionais para cadastro de novo veiculo")
    public void oUsuarioAcessaFormOpcionaisParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabOpcionais.b2bMainOpcionais).click();
        log().setLocator(B2bVeiculos);
        sleep().untilAppear(B2B_VEICULOS_TEXT_OPCIONAIS_CARRO);
    }

    @And("O usuario clica em adicionar para primeiro item disponivel no form opcionais")
    public void oUsuarioClicaEmAdicionarParaPrimeiroItemDisponivelNoFormOpcionais() {
        log().setLocator(b2bMain);
        find(tabOpcionais.b2bMainAdicionarPrimeiroItem).click();
    }

    @And("O usuario acessa form itens avaliados para cadastro de novo veiculo")
    public void oUsuarioAcessaFormItensAvaliadosParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabItensAvaliados.b2bMainItensAvaliados).click();
        log().setLocator(B2bVeiculos);
        sleep().untilAppear(B2B_VEICULOS_TEXT_ITEM_AVALIADO);
    }

    @And("O usuario seleciona o estado do cambio para cadastro de novo veiculo como {string}")
    public void oUsuarioSelecionaOEstadoDoCambioParaCadastroDeNovoVeiculoComoStatusCambioComo(String arg0) {
        log().setLocator(b2bMain);
        switch (arg0){
            case "ruim":
                find(b2bMainItensAvaliadosCambioRuim).click();
                break;
            case "bom":
                find(b2bMainItensAvaliadosCambioBom).click();
                break;
            case "otimo":
                find(b2bMainItensAvaliadosCambioOtimo).click();
                break;
        }
    }

    @And("O usuario seleciona o estado do motor para cadastro de novo veiculo como {string}")
    public void oUsuarioSelecionaOEstadoDoMotorParaCadastroDeNovoVeiculoComoStatusMotorComo(String arg0) {
        log().setLocator(b2bMain);
        switch (arg0){
            case "ruim":
                find(b2bMainItensAvaliadosMotorRuim).click();
                break;
            case "bom":
                find(b2bMainItensAvaliadosMotorBom).click();
                break;
            case "otimo":
                find(b2bMainItensAvaliadosMotorOtimo).click();
                break;
        }
        scroll().up(700);
    }

    @And("O usuario acessa form fotos para cadastro de novo veiculo")
    public void oUsuarioAcessaFormFotosParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabFotos.b2bMainFotos).click();
        log().setLocator(B2bVeiculos);
        sleep().untilAppear(B2B_VEICULOS_TEXT_FOTO);
    }

    @And("O usuario adiciona a primeira foto para cadastro de novo veiculo")
    public void oUsuarioAdicionaAPrimeiraFotoParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabFotos.b2bMainFoto1).actions().click();
        sleep().until(1000);
        JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\fusca2.jfif");
        sleep().until(1000);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");
    }

    @And("O usuario adiciona a segunda foto para cadastro de novo veiculo")
    public void oUsuarioAdicionaASegundaFotoParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabFotos.b2bMainFoto2).actions().click();
        sleep().until(1000);
        JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\fusca3.jpg");
        sleep().until(1000);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");
    }

    @And("O usuario adiciona a terceira foto para cadastro de novo veiculo")
    public void oUsuarioAdicionaATerceiraFotoParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabFotos.b2bMainFoto3).actions().click();
        sleep().until(1000);
        JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\fusca4.jpg");
        sleep().until(1000);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");
    }

    @And("O usuario acessa form valores para cadastro de novo veiculo")
    public void oUsuarioAcessaFormValoresParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabValores.b2bMainValores).click();
        log().setLocator(B2bVeiculos);
        sleep().untilAppear(B2B_VEICULOS_TEXT_ULTIMAS_AVALIACOES);
    }

    @And("O usuario preenche o campo valor de compra para cadastro de novo veiculo com {string}")
    public void oUsuarioPreencheOCampoValorDeCompraParaCadastroDeNovoVeiculoComVlrCompraCom(String arg0) {
        valorDeCompra = arg0;
        log().setLocator(b2bMain);
        find(tabValores.b2bMainValorDeCompra).send().text(valorDeCompra);
    }

    @And("O usuario clica em salvar para cadastro de novo veiculo")
    public void oUsuarioClicaEmSalvarParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(b2bMainSalvar).click();
        sleep().until(5000);
        find().popUp().accept();
    }

    @And("O usuario valida que o veiculo foi cadastrado como status ativo")
    public void oUsuarioValidaQueOVeiculoFoiCadastradoComoStatusAtivo() {
        log().setLocator(b2bMain);
        //placa = "cro8631";
        find(b2bMainBuscarPlaca).send().text(placa);
        find(b2bMainBuscarPlacaLupa).click();
        //error().Warning("descomentar valicacao status veiculo");
        if (assertThat(find(b2bMainStatusDoVeiculo).get().text().toString()).isEqualTo("Ativo")){
            scroll().down(5000);
            evidence("Status do veículo era Ativo");
        } else {
            evidence("Status do veículo não era Ativo");
            error().Fail();
        }
    }


    @And("O usuario clica em editar para veiculo cadastrado")
    public void oUsuarioClicaEmEditarParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainAlterar).click();
        sleep().untilAppear(b2bMainCriarAvaliacao);
    }

    @And("O usuario acessa form criar avalicacao para veiculo cadastrado")
    public void oUsuarioAcessaFormCriarAvalicacaoParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        error().Warning("asdasds");
        //find(b2bMainCriarAvaliacao).click();
        sleep().untilAppear(b2bMainCriarAvaliacao);
        sleep().until(3000);
        find(b2bMainCriarAvaliacao).click();
        //sleep().untilAppear(b2bMainSalvar);
    }

    @And("O usuario salva avaliacao para veiculo cadastrado")
    public void oUsuarioSalvaAvaliacaoParaVeiculoCadastrado() {
        sleep().untilAppear(b2bMainSalvar);
        find(b2bMainSalvar).click();
        find().popUp().accept();
        find().popUp().accept();
        find(B2B_MAIN_BUTTON_CONFIRMAR_AVALIACAO).click();
        find().popUp().accept();
    }

    @And("O usuario atualiza o campo intervalo de avaliacao para veiculo cadastrado")
    public void oUsuarioAtualizaOCampoIntervaloDeAvaliacaoParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainIntervaloDeValor).clear();
        String intervaloDeValor = "100000";
        find(b2bMainIntervaloDeValor).send().text(intervaloDeValor);
    }

    @And("O usuario preenche o campo compre por para veiculo cadastrado")
    public void oUsuarioPreencheOCampoComprePorParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainValorCompreJa).send().text(valorDeCompreJa);
    }

    @And("O usuario preenche o campo valor minimo oferta para veiculo cadastrado")
    public void oUsuarioPreencheOCampoValorMinimoOfertaParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainValorMinimoOferta).send().text(valorMinimoOFerta);
    }

    @And("O usuario marca sim para valor minimo aceito para aprovacao para veiculo cadastrado")
    public void oUsuarioMarcaSimParaValorMinimoAceitoParaAprovacaoParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainValorMinimoAceitoParaAprovacao).click();
    }

    @And("O usuario preenche o campo valor minimo aceito para aprovacao para veiculo cadastrado")
    public void oUsuarioPreencheOCampoValorMinimoAceitoParaAprovacaoParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(B2B_MAIN_INPUT_VALOR_MINIMO_PARA_APROVACAO).send().text("2000000");
    }

    @And("O usuario preenche o campo percentual calculo fipe para veiculo cadastrado")
    public void oUsuarioPreencheOCampoPercentualCalculoFipeParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainPercentualCalculoFipeAprovacao).send().text("10");
    }

    @And("O usuario preenche o combobox alterar compre ja automaticamente")
    public void oUsuarioPreencheOComboboxAlterarCompreJaAutomaticamente() {
        log().setLocator(b2bMain);
        find(b2bMainAlterarCompreJaAutomaticamente).comboBox().set().byText("Sim");
    }

    @And("O usuario preenche o campo porcentagem para calculo do compre ja para veiculo cadastrado")
    public void oUsuarioPreencheOCampoPorcentagemParaCalculoDoCompreJaParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(b2bMainPorcentagemCalculoCompreJa).send().text("10");
    }

    @And("O usuario preenche o combobox loja para cadastro de novo veiculo")
    public void oUsuarioPreencheOComboboxLojaParaCadastroDeNovoVeiculo() {
        log().setLocator(b2bMain);
        find(tabDadosCadastrais.b2bMainLoja).comboBox().set().byIndex(1);
    }

    @And("O usuario preenche o campo ou participante especifico para veiculo cadastrado")
    public void oUsuarioPreencheOCampoOuParticipanteEspecificoParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(B2B_MAIN_INPUT_OU_PARTICIPANTE_ESPECIFICO).send().text("Revenda Teste Ltda | Loja Correio (89371231231231) |1");
    }

    @And("O usuario preenche o campo definir valor de compre por da avaliacao para veiculo cadastrado")
    public void oUsuarioPreencheOCampoDefinirValorDeComprePorDaAvaliacaoParaVeiculoCadastrado() {
        log().setLocator(b2bMain);
        find(B2B_MAIN_INPUT_DEFINIR_VALOR_COMPRE_POR).send().text("6000000");
    }

    @And("O usuario clica em carregar fotos para cadastro de novo veiculo")
    public void oUsuarioClicaEmCarregarFotosParaCadastroDeNovoVeiculo() {
        log().setLocator(B2bVeiculos);
        find(B2B_VEICULOS_BUTTON_CARREGAR_FOTOS).click();
        //int tempoMaximo = 30000;
        //while (find(B2B_VEICULOS_DIV_CARREGANDO_IMAGENS).isAvailable() && tempoMaximo > 0){
        //    sleep().until(1000);
        //    tempoMaximo = tempoMaximo - 1000;
        //    System.out.println("##########################");
        //    System.out.println(tempoMaximo);
        //}
        sleep().until(5000);
    }
}
