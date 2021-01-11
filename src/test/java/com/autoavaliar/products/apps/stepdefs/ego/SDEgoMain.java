package com.autoavaliar.products.apps.stepdefs.ego;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.autoavaliar.products.apps.objetos.ego.AppsEgoMain.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SDEgoMain extends CoreWeb {

    @And("O usuario clica no menu gestao de contas")
    public void oUsuarioClicaNoMenuGestaoDeContas() {
        log().setLocator(appsEgoMain);
        find(appsEgoGestaoDeContasButton).click();
    }

    @And("O usuario clica no menu empresas")
    public void oUsuarioClicaNoMenuEmpresas() {
        log().setLocator(appsEgoMain);
        find(appsEgoEmpresasButton).click();
    }
}
