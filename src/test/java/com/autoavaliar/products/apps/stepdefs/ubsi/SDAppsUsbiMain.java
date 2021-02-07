package com.autoavaliar.products.apps.stepdefs.ubsi;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.autoavaliar.products.apps.objetos.AppsLogin.*;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiMain.*;

public class SDAppsUsbiMain extends CoreWeb {

    @Then("O usuario valida que a tela de dashboard carregou com sucesso")
    public void oUsuarioValidaQueATelaDeDashboardCarregouComSucesso() {
        log().setLocator(appsMain);
        sleep().untilAppear(appsIconUser);
        log().type("Efetuando um clique para assegurar que a página é exibida corretamente");
    }

    @And("O usuario realiza o logoff")
    public void oUsuarioRealizaOLogoff() {
        log().setLocator(appsMain);
        find(appsIconUser).click();
        find(appsSairButton).click();
        log().setLocator(appsLogin);
        find(appsEmailInput).click();
    }

    @When("O usuario clica no botao solicitar avaliacao")
    public void oUsuarioClicaNoBotaoSolicitarAvaliacao() {
        log().setLocator(appsLogin);
        sleep().setMaxTime(5000);
        if (find(appsCloseModalButton).exists()) {
            find(appsCloseModalButton).click();
        }
        sleep().setDefaultTime();
        log().setLocator(appsMain);
        find(appsSolicitarAvaliacaoButton).click();
    }

    @When("O usuario expande as opcoes no menu Avaliacoes")
    public void oUsuarioExpandeAsOpcoesNoMenuAvaliacoes() {
        log().setLocator(appsMain);
        find(appsAvalicoesButton).click();
    }

    @And("O usuario clica no botao Avaliacoes dentro do menu expandido")
    public void oUsuarioClicaNoBotaoAvaliacoesDentroDoMenuExpandido() {
        log().setLocator(appsMain);
        find(appsAvalicoesExpandidoButton).click();
    }

    @And("A automacao espera o usuario resolver o captcha")
    public void aAutomacaoEsperaOUsuarioResolverOCaptcha() {
        sleep().until(120000);
    }

    @When("O usuario clica no menu lateral para selecionar outro sistema")
    public void oUsuarioClicaNoMenuLateralParaSelecionarOutroSistema() {
        log().setLocator(appsMain);
        sleep().until(7000);
        find(appsTopSystemMenuButton).click();
    }

    @And("O usuario clica no botao do sistema ego")
    public void oUsuarioClicaNoBotaoDoSistemaEgo() {
        log().setLocator(appsMain);
        find(appsEgoButton).click();
    }
}
