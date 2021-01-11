package com.autoavaliar.products.apps.stepdefs.ego;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static com.autoavaliar.products.apps.objetos.ego.AppsEgoEmpresa.*;

public class SDEgoEmpresa extends CoreWeb {
    public static String ambienteHomologC2BURL = "null";

    @Then("O usuario clica na aba c{int}b da empresa")
    public void oUsuarioClicaNaAbaCBDaEmpresa(int arg0) {
        log().setLocator(appsEgoEmpresa);
        find(appsEgoC2BButton).click();
    }

    @And("O usuario armazena a url de navegacao para o ambiente homolog do c{int}b")
    public void oUsuarioArmazenaAUrlDeNavegacaoParaOAmbienteHomologDoCB(int arg0) {
        log().setLocator(appsEgoEmpresa);
        ambienteHomologC2BURL = String.valueOf(find(appsEgoLinkC2bHomologTextarea).get().text());
    }

    @And("O usuaro navega para a url do ambiente de homolog c{int}b")
    public void oUsuaroNavegaParaAUrlDoAmbienteDeHomologCB(int arg0) {
        webDriver().navigate(ambienteHomologC2BURL);
    }
}
