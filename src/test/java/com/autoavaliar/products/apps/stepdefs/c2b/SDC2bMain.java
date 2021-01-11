package com.autoavaliar.products.apps.stepdefs.c2b;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import com.autoavaliar.products.apps.objetos.c2b.C2bMain;

public class SDC2bMain extends CoreWeb {

    @And("O usuario aceita os termos e condicoes de uso")
    public void oUsuarioAceitaOsTermosECondicoesDeUso() {
        log().setLocator(C2bMain.c2bMain);
        find(C2bMain.c2bMainTermsAgreementButton).click();
    }

    @And("O usuario realiza a busca pela placa {string}")
    public void oUsuarioRealizaABuscaPelaPlacaPlaca(String arg0) {
        log().setLocator(C2bMain.c2bMain);
        find(C2bMain.c2bMainPlacaInput).send().text(arg0);
        find(C2bMain.c2bMainConsultarButton).click();
    }

    @And("O usuario clica em continuar para o preenchimento dos dados do carro")
    public void oUsuarioClicaEmContinuarParaOPreenchimentoDosDadosDoCarro() {
        log().setLocator(C2bMain.c2bMain);
        find(C2bMain.c2bMainContinuarButton).click();
    }
}
