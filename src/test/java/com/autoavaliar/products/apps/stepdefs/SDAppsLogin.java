package com.autoavaliar.products.apps.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import com.autoavaliar.products.apps.objetos.Environment;
import com.autoavaliar.support.CoreWeb;

import static com.autoavaliar.products.apps.objetos.AppsLogin.*;


public class SDAppsLogin extends CoreWeb {
    public static String getUsuario(String arg0, String arg1) {
        String email = "";
        switch (arg1) {
            case "abrao":
                email = arg0.equals("avaliador") ? Environment.avaliadorAbraao : arg0.equals("vendedor") ? Environment.vendedorAbraao : Environment.gerenteAbraao;
                break;
            case "andreta":
                email = arg0.equals("avaliador") ? Environment.avaliadorAndreta : arg0.equals("vendedor") ? Environment.vendedorAndreta : Environment.gerenteAndreta;
                break;
            case "caoa":
                email = arg0.equals("avaliador") ? Environment.avaliadorCaoa : arg0.equals("vendedor") ? Environment.vendedorCaoa : Environment.gerenteCaoa;
                break;
            case "carhouse":
                email = arg0.equals("avaliador") ? Environment.avaliadorCarhouse : arg0.equals("vendedor") ? Environment.vendedorCarhouse : Environment.gerenteCarhouse;
                break;
            case "gnc":
                email = arg0.equals("avaliador") ? Environment.avaliadorGnc : arg0.equals("vendedor") ? Environment.vendedorGnc : Environment.gerenteGnc;
                break;
            case "jorlan":
                email = arg0.equals("avaliador") ? Environment.avaliadorJorlan : arg0.equals("vendedor") ? Environment.vendedorJorlan : Environment.gerenteJorlan;
                break;
            case "localiza":
                email = arg0.equals("avaliador") ? Environment.avaliadorLocaliza : arg0.equals("vendedor") ? Environment.vendedorLocaliza : Environment.gerenteLocaliza;
                break;
            case "newland":
                email = arg0.equals("avaliador") ? Environment.avaliadorNewland : arg0.equals("vendedor") ? Environment.vendedorNewland : Environment.gerenteNewland;
                break;
            case "parvi":
                email = arg0.equals("avaliador") ? Environment.avaliadorParvi : arg0.equals("vendedor") ? Environment.vendedorParvi : Environment.gerenteParvi;
                break;
            case "saga":
                email = arg0.equals("avaliador") ? Environment.avaliadorSaga : arg0.equals("vendedor") ? Environment.vendedorSaga : Environment.gerenteSaga;
                break;
            case "servopa":
                email = arg0.equals("avaliador") ? Environment.avaliadorServopa : arg0.equals("vendedor") ? Environment.vendedorServopa : Environment.gerenteServopa;
                break;
            case "autoavaliar":
                email = arg0.equals("avaliador") ? Environment.avaliadorAutoavaliar : arg0.equals("vendedor") ? Environment.vendedorAutoavaliar : Environment.gerenteAutoavaliar;
                break;
            case "viamar":
                email = arg0.equals("avaliador") ? Environment.avaliadorViamar : arg0.equals("vendedor") ? Environment.vendedorViamar : Environment.gerenteViamar;
                break;
            case "carrera":
                email = arg0.equals("avaliador") ? Environment.avaliadorCarrera : arg0.equals("vendedor") ? Environment.vendedorCarrera : Environment.gerenteCarrera;
                break;
            case "timeqa":
                email = Environment.timeQaLogin;
                break;
        }
        return email;
    }

    @Given("O usuario acessa {string}")

    @When("O usuario clica no botao log in")
    public void oUsuarioClicaNoBotaoLogIn() {
        log().setLocator(appsLogin);
        webDriver().set().options().maximized();
        find(appsLoginButton).click();
    }

    @Given("O usuario acessa a url do portal apps usbi")
    public void oUsuarioAcessaAUrlDoPortalAppsUsbi() {
        //webDriver().set().browser().chrome().headless();
        webDriver().set().options().maximized();
        webDriver().navigate(Environment.url);
    }

    @And("O usuario preenche o campo password a senha padrao")
    public void oUsuarioPreencheOCampoPasswordASenhaPadrao() {
        find(appsPasswordInput).send().text(Environment.defaultPassword);
    }

    @And("O usuario preenche o campo e-mail como {string} do grupo {string}")
    public void oUsuarioPreencheOCampoEMailComoDoGrupo(String arg0, String arg1) {
        String email = getUsuario(arg0, arg1);

        log().setLocator(appsLogin);
        //sleep().setMaxTime(5000);
        //if (find(appsCloseModalButton).exists()) {
        //    find(appsCloseModalButton).click();
        //}
        //sleep().setDefaultTime();
        find(appsEmailInput).send().text(email);
    }

    @And("O usuario preenche o campo e-mail como {string}")
    public void oUsuarioPreencheOCampoEMailComo(String arg0) {
        log().setLocator(appsLogin);
        sleep().until(5000);
    /*    sleep().setMaxTime(5000);
        if (find(appsCloseModalButton).exists()) {
            find(appsCloseModalButton).click();
        }
        sleep().setDefaultTime();*/
        find(appsEmailInput).send().text(arg0);
    }

    @And("O usuario preenche o campo password a senha {string}")
    public void oUsuarioPreencheOCampoPasswordASenhaSenha(String arg0) {
        find(appsPasswordInput).send().text(arg0);
    }

    @And("O usuario encerra o navegador")
    public void oUsuarioEncerraONavegador() {
        log().type("Encerrando o navegador");
        webDriver().kill();
    }
}
