package com.autoavaliar.products.apps.stepdefs.portal.tabela_autoavaliar;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarMain.MapTabelaAutoAvaliarMain;
import static com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarMain.*;

public class SDTabelaAutoAvaliarMain extends CoreWeb  {

    private static String ano, uf, marca, modelo, versao = "";//todo normalmente em java as variaveis devem ser iniciadas, por exemplo: ano = "", uf = "", ....

    @Given("que acesso o portal da Auto Avaliar")
    public void queAcessoOportaldaAutoAvaliar() {
        webDriver().set().options().maximized();
        webDriver().navigate(urlPortalAutoAvaliar);
        log().setLocator(MapTabelaAutoAvaliarMain);
        //Ignorar Cookies e Politicas de Privacidade
        if(find(permitirTodosCookies).exists()) {//todo o projeto ja valida que o elemento existe/esta disponivel antes de qualquer acao
            find(permitirTodosCookies).click();
            sleep().until(2000);
        }

        if(find(btnLerPoliticaPrivacidade).exists()) {//todo o projeto ja valida que o elemento existe/esta disponivel antes de qualquer acao
            find(btnLerPoliticaPrivacidade).click();
            sleep().until(2000);
        }

        if(find(btnEmAcordoPoliticasPrivacidade).exists()){//todo o projeto ja valida que o elemento existe/esta disponivel antes de qualquer acao
            find(btnEmAcordoPoliticasPrivacidade).click();
            sleep().until(2000);
        }
    }

    @Given("seleciono no menu a opcao Tabela Auto Avaliar")
    public void selecionoAOpcaoNoMenuTabelaAutoAvaliar() {

        /*if(find(menuTabelaAutoAvaliar).exists()) { //todo o projeto ja vai dar erro se nao encontrar o botao
            find(menuTabelaAutoAvaliar).click();
        } else {
            error().Fail();
        }*/

    }

    @When("escolho a marca {string}")
    public void escolho_a_marca(String string) {
        marca = string;

        assertThat(textVamosComecar).contains("Vamos começar?");

        find(comboMarca).click();

        if(marca.equals("Audi")){
            find(marcas.valorMarcaAudi).click();
        } else if(marca.equals("BMW")){
            find(marcas.valorMarcaBMW).click();
        } else if(marca.equals("Chery")){
            find(marcas.valorMarcaChery).click();
        } else if(marca.equals("Chevrolet")){
            find(marcas.valorMarcaChevrolet).click();
        } else if(marca.equals("Chrysler")){
            find(marcas.valorMarcaChrysler).click();
        } else if(marca.equals("Citroen")){
            find(marcas.valorMarcaCitroen).click();
        } else if(marca.equals("Dodge")){
            find(marcas.valorMarcaDodge).click();
        } else if(marca.equals("Fiat")){
            find(marcas.valorMarcaFiat).click();
        } else if(marca.equals("Ford")){
            find(marcas.valorMarcaFord).click();
        } else if(marca.equals("Geely")){
            find(marcas.valorMarcaGeely).click();
        } else if(marca.equals("Honda")){
            find(marcas.valorMarcaHonda).click();
        } else if(marca.equals("Hyundai")){
            find(marcas.valorMarcaHyundai).click();
        } else if(marca.equals("Iveco")){
            find(marcas.valorMarcaIveco).click();
        } else if(marca.equals("Jac")){
            find(marcas.valorMarcaJac).click();
        } else if(marca.equals("Jaquar")){
            find(marcas.valorMarcaJaguar).click();
        } else if(marca.equals("Jeep")){
            find(marcas.valorMarcaJeep).click();
        } else if(marca.equals("Kia")){
            find(marcas.valorMarcaKia).click();
        } else if(marca.equals("Land Rover")){
            find(marcas.valorMarcaLandRover).click();
        } else if(marca.equals("Lexus")){
            find(marcas.valorMarcaLexus).click();
        } else if(marca.equals("Lifan")){
            find(marcas.valorMarcaLifan).click();
        } else if(marca.equals("Mahindra")){
            find(marcas.valorMarcaMahindra).click();
        } else if(marca.equals("Mercedes Benz")){
            find(marcas.valorMarcaMercedesBenz).click();
        } else if(marca.equals("Mini")){
            find(marcas.valorMarcaMini).click();
        } else if(marca.equals("Mitsubishi")){
            find(marcas.valorMarcaMitsubishi).click();
        } else if(marca.equals("Miura")){
            find(marcas.valorMarcaMiura).click();
        } else if(marca.equals("Nissan")){
            find(marcas.valorMarcaNissan).click();
        } else if(marca.equals("Peugeot")){
            find(marcas.valorMarcaPeugeot).click();
        } else if(marca.equals("Porsche")){
            find(marcas.valorMarcaPorsche).click();
        } else if(marca.equals("Renault")){
            find(marcas.valorMarcaRenault).click();
        } else if(marca.equals("Smart")){
            find(marcas.valorMarcaSmart).click();
        } else if(marca.equals("Ssangyong")){
            find(marcas.valorMarcaSsangyong).click();
        } else if(marca.equals("Subaru")){
            find(marcas.valorMarcaSubaru).click();
        } else if(marca.equals("Suziki")){
            find(marcas.valorMarcaSuzuki).click();
        } else if(marca.equals("Toyota")){
            find(marcas.valorMarcaToyota).click();
        } else if(marca.equals("Troller")){
            find(marcas.valorMarcaTroller).click();
        }  else if(marca.equals("Volkswagen")){
            find(marcas.valorMarcaVolkswagen).click();
        }  else if(marca.equals("Volvo")){
            find(marcas.valorMarcaVolvo).click();
        }  else if(marca.equals("Ram")){
            find(marcas.valorMarcaRam).click();
        }
        else {
            error().Fail();
        }
    }

    @Then("verifico que o modelo {string} da marca escolhida são exibidos")
    public void verifico_que_o_modelo_da_marca_escolhida_são_exibidos(String string) {
        modelo = string;

        sleep().until(2000);

        find(comboModelo).click();

        if(modelo.equals("Agile")){
            assertThat(modelosChevrolet.valorModeloAgile).contains("AGILE");
            find(modelosChevrolet.valorModeloAgile).click();
            sleep().until(500);
        } else if(modelo.equals("Astra")){
            assertThat(modelosChevrolet.valorModeloAstra).contains("ASTRA");
            find(modelosChevrolet.valorModeloAstra).click();
            sleep().until(500);
        } else if(modelo.equals("Blazer")){
            assertThat(modelosChevrolet.valorModeloBlazer).contains("BLAZER");
            find(modelosChevrolet.valorModeloBlazer).click();
            sleep().until(500);
        } else if(modelo.equals("Camaro")){
            assertThat(modelosChevrolet.valorModeloCamaro).contains("CAMARO");
            find(modelosChevrolet.valorModeloCamaro).click();
            sleep().until(500);
        } else if(modelo.equals("Captiva")){
            assertThat(modelosChevrolet.valorModeloCaptiva).contains("CAPTIVA");
            find(modelosChevrolet.valorModeloCaptiva).click();
            sleep().until(500);
        } else if(modelo.equals("Celta")){
            assertThat(modelosChevrolet.valorModeloCelta).contains("CELTA");
            find(modelosChevrolet.valorModeloCelta).click();
            sleep().until(500);
        } else if(modelo.equals("Classic")){
            assertThat(modelosChevrolet.valorModeloClassic).contains("CLASSIC");
            find(modelosChevrolet.valorModeloClassic).click();
            sleep().until(500);
        } else if(modelo.equals("Cobalt")){
            assertThat(modelosChevrolet.valorModeloCobalt).contains("COBALT");
            find(modelosChevrolet.valorModeloCobalt).click();
            sleep().until(500);
        } else if(modelo.equals("Cobalt Sedan")){
            assertThat(modelosChevrolet.valorModeloCobaltSedan).contains("COBALT SEDAN");
            find(modelosChevrolet.valorModeloCobaltSedan).click();
            sleep().until(500);
        } else if(modelo.equals("Corsa")){
            assertThat(modelosChevrolet.valorModeloCorsa).contains("CORSA");
            find(modelosChevrolet.valorModeloCorsa).click();
            sleep().until(500);
        } else if(modelo.equals("Cruze")){
            assertThat(modelosChevrolet.valorModeloCruze).contains("CRUZE");
            find(modelosChevrolet.valorModeloCruze).click();
            sleep().until(500);
        } else if(modelo.equals("Equinox")){
            assertThat(modelosChevrolet.valorModeloEquinox).contains("EQUINOX");
            find(modelosChevrolet.valorModeloEquinox).click();
            sleep().until(500);
        } else if(modelo.equals("Joy")){
            assertThat(modelosChevrolet.valorModeloJoy).contains("JOY");
            find(modelosChevrolet.valorModeloJoy).click();
            sleep().until(500);
        } else if(modelo.equals("Kadett")){
            assertThat(modelosChevrolet.valorModeloKadett).contains("KADETT");
            find(modelosChevrolet.valorModeloKadett).click();
            sleep().until(500);
        } else if(modelo.equals("Malibu")){
            assertThat(modelosChevrolet.valorModeloMalibu).contains("MALIBU");
            find(modelosChevrolet.valorModeloMalibu).click();
            sleep().until(500);
        } else if(modelo.equals("Meriva")){
            assertThat(modelosChevrolet.valorModeloMeriva).contains("MERIVA");
            find(modelosChevrolet.valorModeloMeriva).click();
            sleep().until(500);
        } else if(modelo.equals("Montana")){
            assertThat(modelosChevrolet.valorModeloMontana).contains("MONTANA");
            find(modelosChevrolet.valorModeloMontana).click();
            sleep().until(500);
        } else if(modelo.equals("Omega")){
            assertThat(modelosChevrolet.valorModeloOmega).contains("OMEGA");
            find(modelosChevrolet.valorModeloOmega).click();
            sleep().until(500);
        } else if(modelo.equals("Onix")){
            assertThat(modelosChevrolet.valorModeloOnix).contains("ONIX");
            find(modelosChevrolet.valorModeloOnix).click();
            sleep().until(500);
        } else if(modelo.equals("Onix Hatch")){
            assertThat(modelosChevrolet.valorModeloOnixHatch).contains("ONIX HATCH");
            find(modelosChevrolet.valorModeloOnixHatch).click();
            sleep().until(500);
        } else if(modelo.equals("Prisma")){
            assertThat(modelosChevrolet.valorModeloPrisma).contains("PRISMA");
            find(modelosChevrolet.valorModeloPrisma).click();
            sleep().until(500);
        } else if(modelo.equals("S10")){
            assertThat(modelosChevrolet.valorModeloS10).contains("S10");
            find(modelosChevrolet.valorModeloS10).click();
            sleep().until(500);
        } else if(modelo.equals("Sonic")){
            assertThat(modelosChevrolet.valorModeloSonic).contains("SONIC");
            find(modelosChevrolet.valorModeloSonic).click();
            sleep().until(500);
        } else if(modelo.equals("Sonic Hatch")){
            assertThat(modelosChevrolet.valorModeloSonicHatch).contains("SONIC HATCH");
            find(modelosChevrolet.valorModeloSonicHatch).click();
            sleep().until(500);
        }  else if(modelo.equals("Sonic Sedan")){
            assertThat(modelosChevrolet.valorModeloSonicSedan).contains("SONIC SEDAN");
            find(modelosChevrolet.valorModeloSonicSedan).click();
            sleep().until(500);
        }else if(modelo.equals("Spin")){
            assertThat(modelosChevrolet.valorModeloSpin).contains("SPIN");
            find(modelosChevrolet.valorModeloSpin).click();
            sleep().until(500);
        } else if(modelo.equals("Tracker")){
            assertThat(modelosChevrolet.valorModeloTracker).contains("TRACKER");
            find(modelosChevrolet.valorModeloTracker).click();
            sleep().until(500);
        } else if(modelo.equals("TrailBlazer")){
            assertThat(modelosChevrolet.valorModeloTrailblazer).contains("TRAILBLAZER");
            find(modelosChevrolet.valorModeloTrailblazer).click();
            sleep().until(500);
        } else if(modelo.equals("Vectra")){
            assertThat(modelosChevrolet.valorModeloVectra).contains("VECTRA");
            find(modelosChevrolet.valorModeloVectra).click();
            sleep().until(500);
        } else if(modelo.equals("Zafira")){
            assertThat(modelosChevrolet.valorModeloZafira).contains("Zafira");
            find(modelosChevrolet.valorModeloZafira).click();
            sleep().until(500);
        }
        // MODELOS DA AUDI
        else if(modelo.equals("A1")){
            assertThat(modelosAudi.valorModeloA1).contains("A1");
            find(modelosAudi.valorModeloA1).click();
            sleep().until(500);
        }
        else if(modelo.equals("A3")){
            assertThat(modelosAudi.valorModeloA3).contains("A3");
            find(modelosAudi.valorModeloA3).click();
            sleep().until(500);
        }
        else if(modelo.equals("A4")){
            assertThat(modelosAudi.valorModeloA4).contains("A4");
            find(modelosAudi.valorModeloA4).click();
            sleep().until(500);
        }
        else if(modelo.equals("A5")){
            assertThat(modelosAudi.valorModeloA5).contains("A5");
            find(modelosAudi.valorModeloA5).click();
            sleep().until(500);
        }
        else if(modelo.equals("A6")){
            assertThat(modelosAudi.valorModeloA6).contains("A6");
            find(modelosAudi.valorModeloA6).click();
            sleep().until(500);
        }
        else if(modelo.equals("A7")){
            assertThat(modelosAudi.valorModeloA7).contains("A7");
            find(modelosAudi.valorModeloA7).click();
            sleep().until(500);
        }
        else if(modelo.equals("Q3")){
            assertThat(modelosAudi.valorModeloQ3).contains("Q3");
            find(modelosAudi.valorModeloQ3).click();
            sleep().until(500);
        }
        else if(modelo.equals("Q5")){
            assertThat(modelosAudi.valorModeloQ5).contains("Q5");
            find(modelosAudi.valorModeloQ5).click();
            sleep().until(500);
        }
        else if(modelo.equals("Q7")){
            assertThat(modelosAudi.valorModeloQ7).contains("Q7");
            find(modelosAudi.valorModeloQ7).click();
            sleep().until(500);
        }
        else if(modelo.equals("Q8")){
            assertThat(modelosAudi.valorModeloQ8).contains("Q8");
            find(modelosAudi.valorModeloQ8).click();
            sleep().until(500);
        }
        else if(modelo.equals("RS Q3")){
            assertThat(modelosAudi.valorModeloRSQ3).contains("RS Q3");
            find(modelosAudi.valorModeloRSQ3).click();
            sleep().until(500);
        }
        else if(modelo.equals("RS4")){
            assertThat(modelosAudi.valorModeloRS4).contains("RS4");
            find(modelosAudi.valorModeloRS4).click();
            sleep().until(500);
        }
        else if(modelo.equals("RS6")){
            assertThat(modelosAudi.valorModeloRS6).contains("RS6");
            find(modelosAudi.valorModeloRS6).click();
            sleep().until(500);
        }
        else if(modelo.equals("S3")){
            assertThat(modelosAudi.valorModeloS3).contains("S3");
            find(modelosAudi.valorModeloS3).click();
            sleep().until(500);
        }
        else if(modelo.equals("SQ5")){
            assertThat(modelosAudi.valorModeloSQ5).contains("SQ5");
            find(modelosAudi.valorModeloSQ5).click();
            sleep().until(500);
        }
        else if(modelo.equals("TT")){
            assertThat(modelosAudi.valorModeloTT).contains("TT");
            find(modelosAudi.valorModeloTT).click();
            sleep().until(500);
        }
        // MODELOS DA BMW
        else if(modelo.equals("116I")){
            assertThat(modelosBMW.valorModelo116i).contains("116I");
            find(modelosBMW.valorModelo116i).click();
            sleep().until(500);
        }
        else if(modelo.equals("118I")){
            assertThat(modelosBMW.valorModelo118i).contains("118I");
            find(modelosBMW.valorModelo118i).click();
            sleep().until(500);
        }
        else if(modelo.equals("120I")){
            assertThat(modelosBMW.valorModelo120i).contains("120I");
            find(modelosBMW.valorModelo120i).click();
            sleep().until(500);
        }
        else if(modelo.equals("125I")){
            assertThat(modelosBMW.valorModelo125i).contains("125I");
            find(modelosBMW.valorModelo125i).click();
            sleep().until(500);
        }
        else if(modelo.equals("130I")){
            assertThat(modelosBMW.valorModelo130i).contains("130I");
            find(modelosBMW.valorModelo130i).click();
            sleep().until(500);
        }
        else if(modelo.equals("220I")){
            assertThat(modelosBMW.valorModelo220i).contains("220I");
            find(modelosBMW.valorModelo220i).click();
            sleep().until(500);
        }
        else if(modelo.equals("116I")){
            assertThat(modelosBMW.valorModelo116i).contains("116I");
            find(modelosBMW.valorModelo116i).click();
            sleep().until(500);
        }
        else if(modelo.equals("225I")){
            assertThat(modelosBMW.valorModelo225i).contains("225I");
            find(modelosBMW.valorModelo225i).click();
            sleep().until(500);
        }
        else if(modelo.equals("316I")){
            assertThat(modelosBMW.valorModelo316i).contains("316I");
            find(modelosBMW.valorModelo316i).click();
            sleep().until(500);
        }
        else if(modelo.equals("318I")){
            assertThat(modelosBMW.valorModelo318i).contains("318I");
            find(modelosBMW.valorModelo318i).click();
            sleep().until(500);
        }
        else if(modelo.equals("320I")){
            assertThat(modelosBMW.valorModelo320i).contains("320I");
            find(modelosBMW.valorModelo320i).click();
            sleep().until(500);
        }
        else if(modelo.equals("325I")){
            assertThat(modelosBMW.valorModelo325i).contains("325I");
            find(modelosBMW.valorModelo325i).click();
            sleep().until(500);
        }
        else if(modelo.equals("328I")){
            assertThat(modelosBMW.valorModelo3281i).contains("328I");
            find(modelosBMW.valorModelo3281i).click();
            sleep().until(500);
        }
        else if(modelo.equals("330I")){
            assertThat(modelosBMW.valorModelo330i).contains("330I");
            find(modelosBMW.valorModelo330i).click();
            sleep().until(500);
        }
        else if(modelo.equals("335I")){
            assertThat(modelosBMW.valorModelo335i).contains("335I");
            find(modelosBMW.valorModelo335i).click();
            sleep().until(500);
        }
        else if(modelo.equals("420I")){
            assertThat(modelosBMW.valorModelo420i).contains("420I");
            find(modelosBMW.valorModelo420i).click();
            sleep().until(500);
        }
        else if(modelo.equals("428I")){
            assertThat(modelosBMW.valorModelo428i).contains("428I");
            find(modelosBMW.valorModelo428i).click();
            sleep().until(500);
        }
        else if(modelo.equals("430I")){
            assertThat(modelosBMW.valorModelo430i).contains("430I");
            find(modelosBMW.valorModelo430i).click();
            sleep().until(500);
        }
        else if(modelo.equals("435I")){
            assertThat(modelosBMW.valorModelo435i).contains("435I");
            find(modelosBMW.valorModelo435i).click();
            sleep().until(500);
        }
        else if(modelo.equals("528I")){
            assertThat(modelosBMW.valorModelo528i).contains("528I");
            find(modelosBMW.valorModelo528i).click();
            sleep().until(500);
        }
        else if(modelo.equals("530E")){
            assertThat(modelosBMW.valorModelo530e).contains("530E");
            find(modelosBMW.valorModelo530e).click();
            sleep().until(500);
        }
        else if(modelo.equals("530I")){
            assertThat(modelosBMW.valorModelo530i).contains("530I");
            find(modelosBMW.valorModelo530i).click();
            sleep().until(500);
        }
        else if(modelo.equals("535I")){
            assertThat(modelosBMW.valorModelo535i).contains("535I");
            find(modelosBMW.valorModelo535i).click();
            sleep().until(500);
        }
        else if(modelo.equals("540I")){
            assertThat(modelosBMW.valorModelo540i).contains("540I");
            find(modelosBMW.valorModelo540i).click();
            sleep().until(500);
        }
        else if(modelo.equals("550I")){
            assertThat(modelosBMW.valorModelo550i).contains("550I");
            find(modelosBMW.valorModelo550i).click();
            sleep().until(500);
        }
        else if(modelo.equals("650I")){
            assertThat(modelosBMW.valorModelo650i).contains("650I");
            find(modelosBMW.valorModelo650i).click();
            sleep().until(500);
        }
        else if(modelo.equals("I3")){
            assertThat(modelosBMW.valorModeloi3).contains("I3");
            find(modelosBMW.valorModeloi3).click();
            sleep().until(500);
        }
        else if(modelo.equals("M 140I")){
            assertThat(modelosBMW.valorModeloM140i).contains("M 140I");
            find(modelosBMW.valorModeloM140i).click();
            sleep().until(500);
        }
        else if(modelo.equals("M 240I")){
            assertThat(modelosBMW.valorModeloM240i).contains("M 240I");
            find(modelosBMW.valorModeloM240i).click();
            sleep().until(500);
        }
        else if(modelo.equals("M3")){
            assertThat(modelosBMW.valorModeloM3).contains("M3");
            find(modelosBMW.valorModeloM3).click();
            sleep().until(500);
        }
        else if(modelo.equals("M5")){
            assertThat(modelosBMW.valorModeloM5).contains("M5");
            find(modelosBMW.valorModeloM5).click();
            sleep().until(500);
        }
        else if(modelo.equals("M6")){
            assertThat(modelosBMW.valorModeloM6).contains("M6");
            find(modelosBMW.valorModeloM6).click();
            sleep().until(500);
        }
        else if(modelo.equals("R 1200 GS ADVENTURE")){
            assertThat(modelosBMW.valorModeloR1200GsAdv).contains("R 1200 GS ADVENTURE");
            find(modelosBMW.valorModeloR1200GsAdv).click();
            sleep().until(500);
        }
        else if(modelo.equals("S 1000 XR")){
            assertThat(modelosBMW.valorModeloS1000XR).contains("S 1000 XR");
            find(modelosBMW.valorModeloS1000XR).click();
            sleep().until(500);
        }
        else if(modelo.equals("X1")){
            assertThat(modelosBMW.valorModeloX1).contains("X1");
            find(modelosBMW.valorModeloX1).click();
            sleep().until(500);
        }
        else if(modelo.equals("X2")){
            assertThat(modelosBMW.valorModeloX2).contains("X2");
            find(modelosBMW.valorModeloX2).click();
            sleep().until(500);
        }
        else if(modelo.equals("X3")){
            assertThat(modelosBMW.valorModeloX3).contains("X3");
            find(modelosBMW.valorModeloX3).click();
            sleep().until(500);
        }
        else if(modelo.equals("X4")){
            assertThat(modelosBMW.valorModeloX4).contains("X4");
            find(modelosBMW.valorModeloX4).click();
            sleep().until(500);
        }
        else if(modelo.equals("X5")){
            assertThat(modelosBMW.valorModeloX5).contains("X5");
            find(modelosBMW.valorModeloX5).click();
            sleep().until(500);
        }
        else if(modelo.equals("X6")){
            assertThat(modelosBMW.valorModeloX6).contains("X6");
            find(modelosBMW.valorModeloX6).click();
            sleep().until(500);
        }
        else if(modelo.equals("Z4")){
            assertThat(modelosBMW.valorModeloZ4).contains("Z4");
            find(modelosBMW.valorModeloZ4).click();
            sleep().until(500);
        }

        else {
            error().Fail();
        }

    }

    @And("clico no botão próximo")
    public void clicoNoBotaoProximo(){
        if(find(botaoProximo).exists()){
            find(botaoProximo).click();
        } else {
            error().Fail();
        }
    }

    @Then("verifico que estou no segundo passo para descobrir o valor transacional do carro a logomarca da marca selecionada é exibida")
    public void verificoQueEstouNoPassoDoisEaLogomarcaEhExibida(){
        if(find(logoMarcaVeiculo).exists()){
            find(logoMarcaVeiculo).click();
            assertThat(textPasso2CompleteOsDados).contains("Completo os dados abaixo para obter o resultado");
        } else {
            error().Fail();
        }
    }

    @When("seleciono o ano {string} do veiculo")
    public void selecionoOAnodoVeiculo(String string){
        ano = string;

        find(anoVeiculo.comboAnoVeiculo).click();

        switch (ano) {
            case "2013":
                find(anoVeiculo.valorAno2013).click();
                break;
            case "2014":
                find(anoVeiculo.valorAno2014).click();
                break;
            case "2015":
                find(anoVeiculo.valorAno2015).click();
                break;
            case "2016":
                find(anoVeiculo.valorAno2016).click();
                break;
            case "2017":
                find(anoVeiculo.valorAno2017).click();
                break;
            case "2018":
                find(anoVeiculo.valorAno2018).click();
                break;
            case "2019":
                find(anoVeiculo.valorAno2019).click();
                break;
            case "2020":
                find(anoVeiculo.valorAno2020).click();
                break;
            case "2021":
                find(anoVeiculo.valorAno2021).click();
                break;
        }

    }

    @And("seleciono o estado {string} do veiculo")
    public void selecionoOEstadoUFVeiculo(String string){
        uf = string;

        find(estadoUF.comboUFVeiculo).click();

        switch (uf) {
            case "AC":
                find(estadoUF.valorUfAcre).click();
                break;
            case "AL":
                find(estadoUF.valorUfAlagoas).click();
                break;
            case "AP":
                find(estadoUF.valorUfAmapa).click();
                break;
            case "AM":
                find(estadoUF.valorUfAmazonas).click();
                break;
            case "BA":
                find(estadoUF.valorUfBahia).click();
                break;
            case "CE":
                find(estadoUF.valorUfCeara).click();
                break;
            case "DF":
                find(estadoUF.valorUfDistritoFederal).click();
                break;
            case "ES":
                find(estadoUF.valorUfEspiritoSanto).click();
                break;
            case "GO":
                find(estadoUF.valorUfGoias).click();
                break;
            case "MA":
                find(estadoUF.valorUfMaranhao).click();
                break;
            case "MT":
                find(estadoUF.valorUfMatoGrosso).click();
                break;
            case "MS":
                find(estadoUF.valorUfmatoGrossoSul).click();
                break;
            case "MG":
                find(estadoUF.valorUfMinasGerais).click();
                break;
            case "PR":
                find(estadoUF.valorUfParana).click();
                break;
            case "PB":
                find(estadoUF.valorUfParaiba).click();
                break;
            case "PA":
                find(estadoUF.valorUfPara).click();
                break;
            case "PE":
                find(estadoUF.valorUfPernambuco).click();
                break;
            case "PI":
                find(estadoUF.valorUfPiaui).click();
                break;
            case "RN":
                find(estadoUF.valorUfRioGrandeNorte).click();
                break;
            case "RS":
                find(estadoUF.valorUfRioGrandeSul).click();
                break;
            case "RJ":
                find(estadoUF.valorUfRioJaneiro).click();
                break;
            case "RO":
                find(estadoUF.valorUfRondonia).click();
                break;
            case "RR":
                find(estadoUF.valorUfRoraima).click();
                break;
            case "SC":
                find(estadoUF.valorUfSantaCatarina).click();
                break;
            case "SE":
                find(estadoUF.valorUfSergipe).click();
                break;
            case "SP":
                find(estadoUF.valorUfSaoPaulo).click();
                break;
            case "TO":
                find(estadoUF.valorUfTocantins).click();
                break;


        }

    }

    @And("seleciono a versão {string} do veiculo")
    public void selecionoVersaoDoVeiculo(String string){
        versao = string;

        find(versoesAudi.comboVersaoVeiculo).click();

        if(versao.equals("1.4 TFSI ATTRACTION 16V 122CV GASOLINA 2P AUTOMATICO")){
            find(versoesAudi.valorTFSIAtractionGasolina2PAuto).click();
        } else if(versao.equals("1.4 TFSI ATTRACTION 16V 122CV GASOLINA 4P AUTOMATICO")){
            find(versoesAudi.valorTFSIAtractionGasolina4PAuto).click();
        } else if(versao.equals("1.4 TFSI SPORTBACK AMBITION 16V 185CV GASOLINA 4P AUTOMATICO")){
            find(versoesAudi.valorTFSISportBackGasolina4PAuto).click();
        } else if(versao.equals("1.4 TFSI SPORTBACK ATTRACTION 16V 122CV GASOLINA 4P S-TRONIC")) {
            find(versoesAudi.valorTFSISportBackAttractionGasolina4PStronic).click();
        } else {
            error().Fail();
        }

    }

    @And("clico no botão próximo do passo dois")
    public void clicoNoBotaoProximodoPassoDois(){
        //Clicar no Captcha eu Nao Sou um Robo.
        sleep().until(1000);



        find(btnCaptchaEuNaoSouRobo).click();
        sleep().until(2000);

        find(btnProximoPassoDois).click();
        sleep().until(1000);
    }

}
