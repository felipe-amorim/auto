package com.autoavaliar.products.apps.stepdefs.b2b;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.support.tbi.GeradorPlaca;
import com.autoavaliar.support.tbi.JRobot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;

import static com.autoavaliar.products.apps.objetos.b2b.B2bMain.*;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMainAdmin.*;
import static com.autoavaliar.products.apps.stepdefs.b2b.SDB2bMainAdmin.*;

public class SDB2bMain extends CoreWeb {

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
        sleep().until(2000);

        if(Instances.operationalSystem.toLowerCase().startsWith("win")){
            JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\1.png");
        }else {
            JRobot.mouseMoveMiddle();
            sleep().until(500);
            JRobot.robotClick();
            sleep().until(500);
            JRobot.commandShiftG();
            sleep().until(500);
            JRobot.enviar(System.getProperty("user.dir") + "/src/test/resources/products/apps/massas/b2b/1.png");
            sleep().until(500);
            JRobot.enter();
        }


        //JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\car_fusca.jpg");

        sleep().until(500);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");

        find(tabFotos.b2bMainFoto2).actions().click();
        sleep().until(500);
        if(Instances.operationalSystem.toLowerCase().startsWith("win")) {
            JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\2.png");
        }else {
            JRobot.mouseMoveMiddle();
            sleep().until(500);
            JRobot.robotClick();
            sleep().until(500);
            JRobot.commandShiftG();
            sleep().until(500);
            JRobot.enviar(System.getProperty("user.dir") + "/src/test/resources/products/apps/massas/b2b/2.png");
            sleep().until(500);
            JRobot.enter();
        }
        sleep().until(500);
        JRobot.enter();
        sleep().until(2000);
        evidence("Foto anexada");

        find(tabFotos.b2bMainFoto3).actions().click();
        sleep().until(500);
        if(Instances.operationalSystem.toLowerCase().startsWith("win")) {
            JRobot.enviar(System.getProperty("user.dir") + "\\src\\test\\resources\\products\\apps\\massas\\b2b\\3.png");
        }else {
            JRobot.mouseMoveMiddle();
            sleep().until(500);
            JRobot.robotClick();
            sleep().until(500);
            JRobot.commandShiftG();
            sleep().until(500);
            JRobot.enviar(System.getProperty("user.dir") + "/src/test/resources/products/apps/massas/b2b/3.png");
            sleep().until(500);
            JRobot.enter();
        }
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

    @And("O usuario realiza busca por veiculo cadastrado por placa")
    public void oUsuarioRealizaBuscaPorVeiculoCadastradoPorPlaca() {
        log().setLocator(B2bMain);
        find(B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS).send().text(placa);
        find(B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS).click();
        sleep().until(5000);
    }
}
