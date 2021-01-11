package com.autoavaliar.products.aplicativo_android.stepdefs;

import com.autoavaliar.support.CoreAndroid;
import cucumber.api.java.en.And;

import static com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidMain.*;


public class SDAplicativoAndroidMain extends CoreAndroid {
    @And("O usuario clica em mais")
    public void oUsuarioClicaEmMais() {
        log().setLocator(aplicativoAndroidMain);
        find(aplicativoAndroidMainMaisButton).click();
    }

    @And("O usuario clica no menu carro")
    public void oUsuarioClicaNoMenuCarro() {
        log().setLocator(aplicativoAndroidMain);
        find(aplicativoAndroidMainCarroButton).click();
    }

    @And("O usuario clica no menu moto")
    public void oUsuarioClicaNoMenuMoto() {
        log().setLocator(aplicativoAndroidMain);
        find(aplicativoAndroidMainMotoButton).click();
    }

    @And("O usuario clica no menu caminhao")
    public void oUsuarioClicaNoMenuCaminhao() {
        log().setLocator(aplicativoAndroidMain);
        find(aplicativoAndroidMainCaminhaoButton).click();
    }
}
