package com.autoavaliar.products.apps.stepdefs.b2b;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static com.autoavaliar.products.apps.objetos.b2b.B2bLogin.*;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMain.B2B_MAIN_TEXT_O_QUE_VOCE_PROCURA;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMain.B2bMain;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMainAdmin.*;
import static com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar.TabelaAutoAvaliarMain.permitirTodosCookies;

public class SDB2bLogin extends CoreWeb {

    @Given("O usuario navega para portal auto avaliar na url comum")
    public void oUsuarioNavegaParaPortalAutoAvaliarNaUrlComum() {
        webDriver().set().options().maximized();
        webDriver().navigate(b2bMainUrl);
    }

    @When("O usuario acessa portal auto avaliar com usuario qa")
    public void oUsuarioAcessaPortalAutoAvaliarComUsuarioQa() {
        log().setLocator(B2bLogin);
        sleep().setMaxTime(20000);
        if(find(permitirTodosCookies).exists()) {//todo o projeto ja valida que o elemento existe/esta disponivel antes de qualquer acao
            find(permitirTodosCookies).click();
            sleep().until(2000);
        }
        sleep().setDefaultTime();
        find(B2B_LOGIN_INPUT_EMAIL).send().nonRobotic().text(b2bMainLoginTimeQaB2b);
        find(B2B_LOGIN_INPUT_SENHA).send().nonRobotic().text(b2bMainSenhaTimeQaB2b);
        find(B2B_LOGIN_BUTTON_ENTRAR).click();
        log().setLocator(B2bMain);
        sleep().untilAppear(B2B_MAIN_TEXT_O_QUE_VOCE_PROCURA);
    }

}
