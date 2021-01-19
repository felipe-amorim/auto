package com.autoavaliar.products.apps.stepdefs.b2b;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;

import static com.autoavaliar.products.apps.objetos.b2b.B2bMain.*;
import static com.autoavaliar.products.apps.stepdefs.b2b.SDB2bMainAdmin.placa;

public class SDB2bMain extends CoreWeb {

    @And("O usuario acessa opcao repassar para portal auto avaliar")
    public void oUsuarioAcessaOpcaoRepassarParaPortalAutoAvaliar() {
        log().setLocator(B2bMain);
        find(B2B_MAIN_BUTTON_REPASSSE).click();
        sleep().until(120000);
        sleep().untilAppear(B2B_MAIN_TEXT_TIPO_DE_ANUNCIANTE);
    }

    @And("O usuario realiza busca por veiculo cadastrado por placa")
    public void oUsuarioRealizaBuscaPorVeiculoCadastradoPorPlaca() {
        log().setLocator(B2bMain);
        find(B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS).send().text(placa);
        find(B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS).click();
        sleep().until(5000);
    }
}
