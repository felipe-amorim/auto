package com.autoavaliar.products.apps.stepdefs.ubsi;

import com.autoavaliar.products.apps.objetos.Environment;
import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.When;

import static com.autoavaliar.products.apps.objetos.Environment.*;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiLogin.*;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiMain.appsIconUser;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiMain.appsMain;

public class SDAppsUsbiLogin extends CoreWeb {
    @When("O usuario acessa portal auto avaliar usb com usuario vendedor")
    public void oUsuarioAcessaPortalAutoAvaliarUsbComUsuarioVendedor() {
        log().setLocator(appsUsbiLogin);
        webDriver().set().options().maximized();
        webDriver().navigate(url);
        sleep().untilAppear(APPS_USBI_LOGIN_INPUT_EMAIL);
        find(APPS_USBI_LOGIN_INPUT_EMAIL).send().text(vendedorAutoavaliar);
        find(APPS_USBI_LOGIN_INPUT_SENHA).send().text(defaultPassword);
        find(APPS_USBI_LOGIN_BUTTON_LOGIN).click();
        log().setLocator(appsMain);
        sleep().untilAppear(appsIconUser);
        SDAppsUsbiMain sdAppsUsbiMain = new SDAppsUsbiMain();
        SDAppsUsbiAvaliacoes sdAppsUsbiAvaliacoes = new SDAppsUsbiAvaliacoes();
        sdAppsUsbiMain.oUsuarioExpandeAsOpcoesNoMenuAvaliacoes();
        sdAppsUsbiMain.oUsuarioClicaNoBotaoAvaliacoesDentroDoMenuExpandido();
        sdAppsUsbiAvaliacoes.oUsuarioValidaQueATelaAvaliacoesCarregouComSucesso();
    }
}