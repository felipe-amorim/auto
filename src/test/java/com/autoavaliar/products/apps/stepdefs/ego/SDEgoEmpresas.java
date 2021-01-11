package com.autoavaliar.products.apps.stepdefs.ego;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


import static com.autoavaliar.products.apps.objetos.ego.AppsEgoEmpresas.*;

public class SDEgoEmpresas extends CoreWeb {
    private static String empresaProcurada = "null";

    @Then("O usuario preenche o campo de busca por empresa por {string}")
    public void oUsuarioPreencheOCampoDeBuscaPorEmpresaPorEmpresa(String arg0) {
        log().setLocator(appsEgoEmpresas);
        find(appsEgoBuscarEmpresaInput).send().text(arg0);
        empresaProcurada = arg0;
    }

    @And("O usuario clica em buscar empresa")
    public void oUsuarioClicaEmBuscarEmpresa() {
        log().setLocator(appsEgoEmpresas);
        find(appsEgoBuscarButton).click();
    }

    @And("O usuario clica na empresa resultante da busca")
    public void oUsuarioClicaNaEmpresaResultanteDaBusca() {
        log().setLocator(appsEgoEmpresas);
        find(appsEgoEmprsaResultanteDaBuscaButton.replace("arg0", empresaProcurada)).click();
    }
}
