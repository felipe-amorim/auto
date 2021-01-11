package com.autoavaliar.products.apps.stepdefs.b2b;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.autoavaliar.support.CoreWeb;
import com.autoavaliar.support.tbi.GeradorPlaca;
import com.autoavaliar.support.tbi.JRobot;

import static com.autoavaliar.products.apps.objetos.b2b.B2bMain.*;

public class SDB2bMain extends CoreWeb {
    private static String placa = "n/a";
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
}
