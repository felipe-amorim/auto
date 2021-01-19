package com.autoavaliar.products.apps.stepdefs.b2b;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;

import static com.autoavaliar.products.apps.objetos.b2b.B2bMain.*;
import static com.autoavaliar.products.apps.objetos.b2b.B2bMainAdmin.b2bMainUrl;
import static com.autoavaliar.products.apps.stepdefs.b2b.SDB2bMainAdmin.*;

public class SDB2bMain extends CoreWeb {

    @And("O usuario realiza busca por veiculo cadastrado por placa")
    public void oUsuarioRealizaBuscaPorVeiculoCadastradoPorPlaca() {
        log().setLocator(B2bMain);
        find(B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS).send().text(placa);
        find(B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS).click();
        sleep().until(5000);
    }

    @And("O usuario valida dados que os dados inseridos no portal admin estao iguais ao portal comum")
    public void oUsuarioValidaDadosQueOsDadosInseridosNoPortalAdminEstaoIguaisAoPortalComum() {
        webDriver().navigate(b2bMainUrl);
        SDB2bLogin SDB2bLogin = new SDB2bLogin();
        SDB2bLogin.oUsuarioNavegaParaPortalAutoAvaliarNaUrlComum();
        SDB2bLogin.oUsuarioAcessaPortalAutoAvaliarComUsuarioQa();
        log().setLocator(B2bMain);
        find(B2B_MAIN_BUTTON_REPASSSE).click();
        sleep().until(120000);
        sleep().untilAppear(B2B_MAIN_TEXT_TIPO_DE_ANUNCIANTE);
        find(B2B_MAIN_INPUT_BUSCA_VEICULOS_CADASTRADOS).send().text(placa);
        find(B2B_MAIN_BUTTON_BUSCA_VEICULOS_CADASTRADOS).click();
        find(B2B_MAIN_BUTTON_AVALIE_AGORA_PRIMEIRO_VEICULO).click();
        sleep().untilAppear(B2B_MAIN_TEXT_ULTIMA_AVALIACAO);
        assertThat(find(B2B_MAIN_TEXT_ANO_VEICULO).get().text().toString()).isEqualTo(anoFab + "/" + anoFab);
        assertThat(find(B2B_MAIN_TEXT_COMBUSTIVEL_VEICULO).get().text().toString().toLowerCase()).isEqualTo(combustivel.toLowerCase());
        assertThat(find(B2B_MAIN_TEXT_KM_VEICULO).get().text().toString().replace(".", "")).isEqualTo(km);
        assertThat(find(B2B_MAIN_TEXT_PORTAS_VEICULO).get().text().toString().replace("P", "")).isEqualTo(portas);
        assertThat(find(B2B_MAIN_TEXT_COR_VEICULO).get().text().toString().toLowerCase()).isEqualTo(cor.toLowerCase());
        assertThat(find(B2B_MAIN_TEXT_MOTOR_VEICULO).get().text().toString()).isEqualTo(motor);
        String primeiroUltimoCaracterePlacaCadastro = placa.substring(0, 1);
        primeiroUltimoCaracterePlacaCadastro += placa.substring(6, 7);
        String primeiroUltimoCaracterePlacaCadastrado = (find(B2B_MAIN_TEXT_PLACA_VEICULO).get().text().toString().substring(0, 1));
        primeiroUltimoCaracterePlacaCadastrado += (find(B2B_MAIN_TEXT_PLACA_VEICULO).get().text().toString().substring(7, 8));
        assertThat(primeiroUltimoCaracterePlacaCadastro.toLowerCase()).isEqualTo(primeiroUltimoCaracterePlacaCadastrado.toLowerCase());
        assertThat(find(B2B_MAIN_TEXT_CAMBIO_VEICULO).get().text().toString().toLowerCase()).isEqualTo(cambio.toLowerCase());
        assertThat(find(B2B_MAIN_TEXT_ORIGEM_VEICULO).get().text().toString().toLowerCase()).isEqualTo(origem.toLowerCase());
    }
}
