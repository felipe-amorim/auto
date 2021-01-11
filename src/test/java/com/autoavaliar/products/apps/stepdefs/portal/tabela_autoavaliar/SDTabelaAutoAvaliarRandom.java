package com.autoavaliar.products.apps.stepdefs.portal.tabela_autoavaliar;

import com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarMain;
import com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarRandom;
import com.autoavaliar.support.CoreWeb;
import com.autoavaliar.support.convert.Converter;
import com.autoavaliar.support.tbi.JRobot;
import com.autoavaliar.support.web.find.ActionsWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


import static com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarRandom.*;

public class SDTabelaAutoAvaliarRandom extends CoreWeb {
    public static String marca;

    @When("escolho a marca aleatória")
    public void queEscolhoUmaMarcaAleatoria() {
        log().setLocator(MapTabelaAutoAvaliarRandom);

        //Verificar que está no passo1
        assertThat(textPasso1MarcaEModelo).equals("1");//todo esse equals nao eh a validacao do projeto, verificar a troca por isEqualTo

        List<String> list = Arrays.asList(principaisMarcas.valorMarcaAudi,
                                          principaisMarcas.valorMarcaBMW,
                                          principaisMarcas.valorMarcaChevrolet,
                                          principaisMarcas.valorMarcaCitroen,
                                          principaisMarcas.valorMarcaFiat,
                                          principaisMarcas.valorMarcaFord,
                                          principaisMarcas.valorMarcaHonda,
                                          principaisMarcas.valorMarcaHyundai,
                                          principaisMarcas.valorMarcaJeep,
                                          principaisMarcas.valorMarcaKia,
                                          principaisMarcas.valorMarcaMercedesBenz,
                                          principaisMarcas.valorMarcaMitsubishi,
                                          principaisMarcas.valorMarcaNissan,
                                          principaisMarcas.valorMarcaPeugeot,
                                          principaisMarcas.valorMarcaRenault,
                                          principaisMarcas.valorMarcaToyota,
                                          principaisMarcas.valorMarcaVolkswagen);

        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        marca = randomElement;

        find(comboMarca).click();
        sleep().until(1000);

        //todo usar switch case no lugar de muitos if/else ajuda a manutencao

        if(randomElement.contains("AUDI")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaAudi).click();
        } else if(randomElement.contains("BMW")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaBMW).click();
        } else if(randomElement.contains("CHEVROLET")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaChevrolet).click();
        } else if(randomElement.contains("CITROEN")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaCitroen).click();
        } else if(randomElement.contains("FIAT")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaFiat).click();
        } else if(randomElement.contains("FORD")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaFord).click();
        } else if(randomElement.contains("HONDA")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaHonda).click();
        } else if(randomElement.contains("HYUNDAI")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaHyundai).click();
        } else if(randomElement.contains("JEEP")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaJeep).click();
        } else if(randomElement.contains("KIA")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaKia).click();
         } else if(randomElement.contains("MERCEDES-BENZ")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaMercedesBenz).click();
        } else if(randomElement.contains("MITSUBISHI")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaMitsubishi).click();
        } else if(randomElement.contains("NISSAN")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaNissan).click();
        } else if(randomElement.contains("PEUGEOT")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaPeugeot).click();
        }  else if(randomElement.contains("RENAULT")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaRenault).click();
        } else if(randomElement.contains("TOYOTA")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaToyota).click();
        } else if(randomElement.contains("VOLKSWAGEN")){
            find(TabelaAutoAvaliarRandom.principaisMarcas.valorMarcaVolkswagen).click();
        }
        else {
            error().Fail();
        }

    }

    @Then("verifico que o modelo da marca aleatória escolhida são exibidos")
    public void verificoModeloMarcaAleatorioEhExibido() {
        sleep().until(2000);
        find(comboModelo).click();
        System.out.println("o Valor da MARCA éhhh " + marca);

        //find(comboModelo).get().each().text();

        if(marca.contains("AUDI")){


        } else if(marca.contains("BMW")){
            //Validar se todos modelos da Chevrolet estão no combo
            assertThat(modelosBMW.valorModelo116i).contains("116I");
            find(modelosBMW.valorModelo116i).click();
            assertThat(modelosBMW.valorModelo118i).contains("118I");
            find(modelosBMW.valorModelo118i).click();
            assertThat(modelosBMW.valorModelo120i).contains("120I");
            find(modelosBMW.valorModelo120i).click();
            assertThat(modelosBMW.valorModelo125i).contains("125I");
            find(modelosBMW.valorModelo125i).click();
            assertThat(modelosBMW.valorModelo130i).contains("130I");
            find(modelosBMW.valorModelo130i).click();
            assertThat(modelosBMW.valorModelo220i).contains("220I");
            find(modelosBMW.valorModelo220i).click();
            assertThat(modelosBMW.valorModelo225i).contains("225I");
            find(modelosBMW.valorModelo225i).click();
            assertThat(modelosBMW.valorModelo316i).contains("316I");
            find(modelosBMW.valorModelo316i).click();
            assertThat(modelosBMW.valorModelo318i).contains("318I");
            find(modelosBMW.valorModelo318i).click();
            assertThat(modelosBMW.valorModelo320i).contains("320I");
            find(modelosBMW.valorModelo320i).click();
            assertThat(modelosBMW.valorModelo325i).contains("325I");
            find(modelosBMW.valorModelo325i).click();
            assertThat(modelosBMW.valorModelo328i).contains("328I");
            find(modelosBMW.valorModelo328i).click();
            assertThat(modelosBMW.valorModelo330i).contains("330I");
            find(modelosBMW.valorModelo330i).click();
            assertThat(modelosBMW.valorModelo335i).contains("335I");
            find(modelosBMW.valorModelo335i).click();
            assertThat(modelosBMW.valorModelo420i).contains("420I");
            find(modelosBMW.valorModelo420i).click();
            assertThat(modelosBMW.valorModelo428i).contains("428I");
            find(modelosBMW.valorModelo428i).click();
            assertThat(modelosBMW.valorModelo430i).contains("430I");
            find(modelosBMW.valorModelo430i).click();
            assertThat(modelosBMW.valorModelo435i).contains("435I");
            find(modelosBMW.valorModelo435i).click();
            assertThat(modelosBMW.valorModelo528i).contains("528I");
            find(modelosBMW.valorModelo528i).click();
            assertThat(modelosBMW.valorModelo530e).contains("530E");
            find(modelosBMW.valorModelo530e).click();
            assertThat(modelosBMW.valorModelo530i).contains("530I");
            find(modelosBMW.valorModelo530i).click();
            assertThat(modelosBMW.valorModelo535i).contains("535I");
            find(modelosBMW.valorModelo535i).click();
            assertThat(modelosBMW.valorModelo540i).contains("540I");
            find(modelosBMW.valorModelo540i).click();
            assertThat(modelosBMW.valorModelo550i).contains("550I");
            find(modelosBMW.valorModelo550i).click();
            assertThat(modelosBMW.valorModelo650i).contains("650I");
            find(modelosBMW.valorModelo650i).click();
            assertThat(modelosBMW.valorModeloi3).contains("I3");
            find(modelosBMW.valorModeloi3).click();
            assertThat(modelosBMW.valorModeloM140i).contains("M 140I");
            find(modelosBMW.valorModeloM140i).click();
            assertThat(modelosBMW.valorModeloM240i).contains("M 240I");
            find(modelosBMW.valorModeloM240i).click();
            assertThat(modelosBMW.valorModeloM3).contains("M3");
            find(modelosBMW.valorModeloM3).click();
            assertThat(modelosBMW.valorModeloM5).contains("M5");
            find(modelosBMW.valorModeloM5).click();
            assertThat(modelosBMW.valorModeloM6).contains("M6");
            find(modelosBMW.valorModeloM6).click();
            assertThat(modelosBMW.valorModeloR1200GsAdv).contains("R 1200 GS ADVENTURE");
            find(modelosBMW.valorModeloR1200GsAdv).click();
            assertThat(modelosBMW.valorModeloR1200GsAdv).contains("S 1000 XR");
            find(modelosBMW.valorModeloR1200GsAdv).click();
            assertThat(modelosBMW.valorModeloX1).contains("X1");
            find(modelosBMW.valorModeloX1).click();
            assertThat(modelosBMW.valorModeloX2).contains("X2");
            find(modelosBMW.valorModeloX2).click();
            assertThat(modelosBMW.valorModeloX3).contains("X3");
            find(modelosBMW.valorModeloX3).click();
            assertThat(modelosBMW.valorModeloX4).contains("X4");
            find(modelosBMW.valorModeloX4).click();
            assertThat(modelosBMW.valorModeloX5).contains("X5");
            find(modelosBMW.valorModeloX5).click();
            assertThat(modelosBMW.valorModeloX6).contains("X6");
            find(modelosBMW.valorModeloX6).click();
            assertThat(modelosBMW.valorModeloZ4).contains("Z4");
            find(modelosBMW.valorModeloZ4).click();

        } else if(marca.contains("CHEVROLET")){
            find(comboModelo).click();

            //Validar se todos modelos da Chevrolet estão no combo
            assertThat(modelosChevrolet.valorModeloAgile).contains("AGILE");
            find(modelosChevrolet.valorModeloAgile).click();
            assertThat(modelosChevrolet.valorModeloAstra).contains("ASTRA");
            find(modelosChevrolet.valorModeloAstra).click();
            assertThat(modelosChevrolet.valorModeloBlazer).contains("BLAZER");
            find(modelosChevrolet.valorModeloBlazer).click();
            assertThat(modelosChevrolet.valorModeloCaptiva).contains("CAPTIVA");
            find(modelosChevrolet.valorModeloCaptiva).click();
            assertThat(modelosChevrolet.valorModeloCelta).contains("CELTA");
            find(modelosChevrolet.valorModeloCelta).click();
            assertThat(modelosChevrolet.valorModeloClassic).contains("CLASSIC");
            find(modelosChevrolet.valorModeloClassic).click();
            assertThat(modelosChevrolet.valorModeloCobalt).contains("COBALT");
            find(modelosChevrolet.valorModeloCobalt).click();
            assertThat(modelosChevrolet.valorModeloCobaltSedan).contains("COBALT SEDAN");
            find(modelosChevrolet.valorModeloCobaltSedan).click();
            assertThat(modelosChevrolet.valorModeloEquinox).contains("EQUINOX");
            find(modelosChevrolet.valorModeloEquinox).click();
            assertThat(modelosChevrolet.valorModeloJoy).contains("JOY");
            find(modelosChevrolet.valorModeloJoy).click();
            assertThat(modelosChevrolet.valorModeloKadett).contains("KADETT");
            find(modelosChevrolet.valorModeloKadett).click();
            assertThat(modelosChevrolet.valorModeloMalibu).contains("MALIBU");
            find(modelosChevrolet.valorModeloMalibu).click();
            assertThat(modelosChevrolet.valorModeloMeriva).contains("MERIVA");
            find(modelosChevrolet.valorModeloMeriva).click();
            assertThat(modelosChevrolet.valorModeloMontana).contains("MONTANA");
            find(modelosChevrolet.valorModeloMontana).click();
            assertThat(modelosChevrolet.valorModeloOmega).contains("OMEGA");
            find(modelosChevrolet.valorModeloOmega).click();
            assertThat(modelosChevrolet.valorModeloOnix).contains("ONIX");
            find(modelosChevrolet.valorModeloOnix).click();
            assertThat(modelosChevrolet.valorModeloOnixHatch).contains("ONIX HATCH");
            find(modelosChevrolet.valorModeloOnixHatch).click();
            assertThat(modelosChevrolet.valorModeloPrisma).contains("PRISMA");
            find(modelosChevrolet.valorModeloPrisma).click();
            assertThat(modelosChevrolet.valorModeloS10).contains("S10");
            find(modelosChevrolet.valorModeloS10).click();
            assertThat(modelosChevrolet.valorModeloSonic).contains("SONIC");
            find(modelosChevrolet.valorModeloSonic).click();
            assertThat(modelosChevrolet.valorModeloSonicHatch).contains("SONIC HATCH");
            find(modelosChevrolet.valorModeloSonicHatch).click();
            assertThat(modelosChevrolet.valorModeloSonicSedan).contains("SONIC SEDAN");
            find(modelosChevrolet.valorModeloSonicSedan).click();
            assertThat(modelosChevrolet.valorModeloSpin).contains("SPIN");
            find(modelosChevrolet.valorModeloSpin).click();
            assertThat(modelosChevrolet.valorModeloTracker).contains("TRACKER");
            find(modelosChevrolet.valorModeloTracker).click();
            assertThat(modelosChevrolet.valorModeloTrailblazer).contains("TRAILBLAZER");
            find(modelosChevrolet.valorModeloTrailblazer).click();
            assertThat(modelosChevrolet.valorModeloVectra).contains("VECTRA");
            find(modelosChevrolet.valorModeloVectra).click();
            assertThat(modelosChevrolet.valorModeloZafira).contains("Zafira");
            find(modelosChevrolet.valorModeloZafira).click();


        } else if(marca.contains("CITROEN")){

        } else if(marca.contains("FIAT")){

        } else if(marca.contains("FORD")){

        } else if(marca.contains("HONDA")){

        } else if(marca.contains("HYUNDAI")){

        } else if(marca.contains("JEEP")){

        } else if(marca.contains("KIA")){

        } else if(marca.contains("MERCEDES-BENZ")){

        } else if(marca.contains("MITSUBISHI")){

        } else if(marca.contains("NISSAN")){

        } else if(marca.contains("PEUGEOT")){

        }  else if(marca.contains("RENAULT")){

        } else if(marca.contains("TOYOTA")){

        } else if(marca.contains("VOLKSWAGEN")){

        }
        else {
            error().Fail();
        }


    }


    @When("seleciono um modelo aleatorio")
    public void selecionoUmModeloAleatorio() {

        List<WebElement> itemsIndDropDown = find(comboModelo).comboBox().get().elements();
        int size = itemsIndDropDown.size();

        int randomNumber = ThreadLocalRandom.current().nextInt(1,size);
        itemsIndDropDown.get(randomNumber).click();

    }

    @Then("verifico e valido que estou no segundo passo")
    public void verificoQueEstouNoPassoDoisEaLogomarcaEhExibida(){
        //Verificar que está no passo2
        assertThat(textPasso2AnoEstadoVersao).contains("2");

        //Validar Logo e Passo 2
        if(find(logoMarcaVeiculo).exists()){
            find(logoMarcaVeiculo).click();
            assertThat(textPasso2CompleteOsDados).contains("Completo os dados abaixo para obter o resultado");
        } else {
            error().Fail();
        }
    }

    @When("seleciono um ano aleatório")
    public void selecionoUmAnoAleatorio() {

        List<WebElement> itemsIndDropDown = find(comboAnoVeiculo).comboBox().get().elements();
        int size = itemsIndDropDown.size();
        //System.out.println("TESTE ANO VEICULO ISAIAS" + itemsIndDropDown);

        int randomNumber = ThreadLocalRandom.current().nextInt(1,size);
        itemsIndDropDown.get(randomNumber).click();
        sleep().until(4000);
    }

    @And("seleciono uma uf aleatória")
    public void selecionoUFAleatoria() {

        List<WebElement> itemsIndDropDown = find(comboUFVeiculo).comboBox().get().elements();
        int size = itemsIndDropDown.size();
        int randomNumber = ThreadLocalRandom.current().nextInt(1,size);

        itemsIndDropDown.get(randomNumber).click();
        sleep().until(2000);
    }

    @And("seleciono uma versao aleatória")
    public void selecionoVersaoVeiculoAleatoria() {

        List<WebElement> itemsIndDropDown = find(comboVersaoVeiculo).comboBox().get().elements();
        int size = itemsIndDropDown.size();
       // System.out.println("TESTE VERSAO ISAIAS" + itemsIndDropDown);
        int randomNumber = ThreadLocalRandom.current().nextInt(1,size);
        itemsIndDropDown.get(randomNumber).click();
        sleep().until(2000);
    }

    @And("humanizo o processo do recaptcha")
    public void humanizoProcessodoRecaptcha() {

         System.out.println("PROCESSO RECAPTCHA" );
         sleep().until(2000);

         webDriver().set().options().withUserData("C:/Users/isaias.silva/AppData/Local/Google/Chrome/User Data/Default/");
         find(checkRecaptcha).send().nonRobotic().tabEnter();
        sleep().until(2000);
        find(checkRecaptcha).actions().click();
        sleep().until(2000);

    }

    int getRandAmout(){
        return convert().getRandomNumber(450,1500);
    }

    void possibleMistake(){
        int chance = convert().getRandomNumber(1,4);
        if(chance==1) {
            JRobot.shiftTab();
            sleep().until(getRandAmout());
            JRobot.tab();
            sleep().until(getRandAmout());
        }
    }


    @When("O usuario escolhe uma marca utilizando tabs")
    public void oUsuarioEscolheUmaMarcaUtilizandoTabs() {
        log().setLocator(MapTabelaAutoAvaliarRandom);
        //sleep().untilAppear(comboMarca);
        sleep().until(20000);
        for (int i = 12; i >0; i--) {
            JRobot.tab();
            sleep().until(getRandAmout());
            possibleMistake();
        }
        JRobot.space();
        sleep().until(getRandAmout());
        JRobot.arrowDown();
        sleep().until(getRandAmout());
        JRobot.enter();
        sleep().until(getRandAmout());
        //for (int i = 10; i >0; i--){
            //sleep().until(getRandAmout());
            //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //}
        /*sleep().until(getRandAmout());
        find(comboMarca).send().space();
        sleep().until(getRandAmout());
        find(comboMarca).send().arrowDown();
        sleep().until(getRandAmout());
        find(comboMarca).send().enter();
        sleep().until(getRandAmout());*/
        sleep().until(3000);
    }

    @And("O Usuario escolhe um modelo utilizando tabs")
    public void oUsuarioEscolheUmModeloUtilizandoTabs() {
        JRobot.tab();
        sleep().until(getRandAmout());
        possibleMistake();
        JRobot.space();
        sleep().until(getRandAmout());
        JRobot.arrowDown();
        sleep().until(getRandAmout());
        JRobot.enter();
        sleep().until(getRandAmout());
        JRobot.tab();
        sleep().until(getRandAmout());
        possibleMistake();
        JRobot.enter();
        sleep().until(getRandAmout());
        /*log().setLocator(MapTabelaAutoAvaliarRandom);
        //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //sleep().until(getRandAmout());
        find(comboModelo).send().space();
        sleep().until(getRandAmout());
        find(comboModelo).send().arrowDown();
        sleep().until(getRandAmout());
        find(comboModelo).send().enter();
        sleep().until(getRandAmout());
        sleep().until(3000);
        //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //sleep().until(getRandAmout());
        //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().enter();
        find(botaoProximo).click();
        sleep().until(getRandAmout());*/
    }

    @And("O usuario escolhe o ano do carro utilizando tabs")
    public void oUsuarioEscolheOAnoDoCarroUtilizandoTabs() {
        log().setLocator(MapTabelaAutoAvaliarRandom);
        //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //sleep().until(getRandAmout());
        sleep().untilAppear(comboAnoVeiculo);
        JRobot.tab();
        sleep().until(getRandAmout());
        possibleMistake();
        JRobot.space();
        sleep().until(getRandAmout());
        JRobot.arrowDown();
        sleep().until(getRandAmout());
        JRobot.enter();
        sleep().until(getRandAmout());
        sleep().until(3000);
        /*find(comboAnoVeiculo).send().space();
        sleep().until(getRandAmout());
        find(comboAnoVeiculo).send().arrowDown();
        sleep().until(getRandAmout());
        find(comboAnoVeiculo).send().enter();
        sleep().until(getRandAmout());
        sleep().until(3000);*/
    }

    @And("O usuario escolhe o estado do carro utilizando tabs")
    public void oUsuarioEscolheOEstadoDoCarroUtilizandoTabs() {
        log().setLocator(MapTabelaAutoAvaliarRandom);
        //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //sleep().until(getRandAmout());
     /*   find(comboUFVeiculo).send().space();
        sleep().until(getRandAmout());
        find(comboUFVeiculo).send().arrowDown();
        sleep().until(getRandAmout());
        find(comboUFVeiculo).send().enter();
        sleep().until(getRandAmout());
        sleep().until(3000);*/
        JRobot.tab();
        sleep().until(getRandAmout());
        possibleMistake();
        JRobot.space();
        sleep().until(getRandAmout());
        JRobot.arrowDown();
        sleep().until(getRandAmout());
        JRobot.enter();
        sleep().until(getRandAmout());
        sleep().until(3000);
    }

    @And("O usuario escolhe a versao do carro utilizando tabs")
    public void oUsuarioEscolheAVersaoDoCarroUtilizandoTabs() {
        log().setLocator(MapTabelaAutoAvaliarRandom);
        //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //sleep().until(getRandAmout());
        /*find(comboVersaoVeiculo).send().space();
        sleep().until(getRandAmout());
        find(comboVersaoVeiculo).send().arrowDown();
        sleep().until(getRandAmout());
        find(comboVersaoVeiculo).send().enter();
        sleep().until(getRandAmout());
        sleep().until(3000);*/
        JRobot.tab();
        sleep().until(getRandAmout());
        possibleMistake();
        JRobot.space();
        sleep().until(getRandAmout());
        JRobot.arrowDown();
        sleep().until(getRandAmout());
        JRobot.enter();
        sleep().until(getRandAmout());
        sleep().until(3000);
    }

    @And("O usuario marca o validador de captcha utilizando tabs")
    public void oUsuarioMarcaOValidadorDeCaptchaUtilizandoTabs() {
        log().setLocator(MapTabelaAutoAvaliarRandom);
       /* //find(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA).send().tab();
        //sleep().until(getRandAmout());
        find(checkRecaptcha).send().space();
        sleep().until(getRandAmout());
        sleep().until(3000);*/
        JRobot.tab();
        sleep().until(getRandAmout());
        possibleMistake();
        JRobot.space();
        sleep().until(getRandAmout());
    }

    @Then("O usuario vai para a ultima pagina")
    public void oUsuarioVaiParaAUltimaPagina() {
        log().setLocator(MapTabelaAutoAvaliarRandom);
        find(botaoProximo).click();
        sleep().until(50000);
    }

    @Given("O usuario abre a tabela auto avaliar utilizando tabs")
    public void oUsuarioAbreATabelaAutoAvaliarUtilizandoTabs() {
        //sleep().until(20000);
        for (int i = 16; i >0; i--) {
            JRobot.tab();
            sleep().until(getRandAmout());
        }
        JRobot.enter();
        sleep().until(getRandAmout());
        //sleep().until(20000);
    }
}
