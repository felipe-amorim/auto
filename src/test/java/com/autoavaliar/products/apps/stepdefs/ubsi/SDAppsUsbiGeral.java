package com.autoavaliar.products.apps.stepdefs.ubsi;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


import static com.autoavaliar.products.aplicativo_android.stepdefs.SDAplicativoAndroidSolicitacao.proprietario;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiAvaliacoes.*;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiMain.*;
import static com.autoavaliar.products.apps.stepdefs.ubsi.SDAppsUsbiSolicitarAvaliacao.*;

public class SDAppsUsbiGeral extends CoreWeb {

    SDAppsUsbiSolicitarAvaliacao SDAppsUsbiSolicitarAvaliacao = new SDAppsUsbiSolicitarAvaliacao();
    SDAppsUsbiLogin SDAppsUsbiLogin = new SDAppsUsbiLogin();

    @And("O usuario realiza uma solicitacao de avaliavao veiculo somente compra usbi")
    public void oUsuarioRealizaUmaSolicitacaoDeAvaliavaoVeiculoSomenteCompraUsbi() {
        SDAppsUsbiSolicitarAvaliacao.oUsuarioSelecionaOTipoDeAvaliacao("Somente compra");
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmCpfValido();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmNomeDoCliente();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOCampoEMailParaSolicitacaoDeAvaliacao();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmTelefoneParaSolicitarAvaliacao();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmCelularDoCliente();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOCampoCrm();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereOCepDaAutoAvaliar();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOOCampoNumero();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOCampoComplemento();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOsDadosDoVeiculo();
    }

    @And("O usuario realiza uma solicitacao de avaliacao veiculo usbi com usuario vendedor")
    public void oUsuarioRealizaUmaSolicitacaoDeAvaliacaoVeiculoUsbiComUsuarioVendedor() {
        SDAppsUsbiLogin.oUsuarioRealizaApenasLoginNoPortalAutoAvaliarUsbiComUsuarioVendedor();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioSelecionaOTipoDeAvaliacao("Somente compra");
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmCpfValido();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmNomeDoCliente();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOCampoEMailParaSolicitacaoDeAvaliacao();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmTelefoneParaSolicitarAvaliacao();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereUmCelularDoCliente();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOCampoCrm();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioInsereOCepDaAutoAvaliar();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOOCampoNumero();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOCampoComplemento();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioPreencheOsDadosDoVeiculoComPlacaSemAvaliacao();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioClicaNoBotaoSolicitarSemPreencherOsCamposObrigatorios();
        SDAppsUsbiSolicitarAvaliacao.oUsuarioValidaQueAvaliacaoFoiRegistradaPorPlaca();
    }

    @Then("O usuario valida que as alteracoes feitas na avaliacao do carro no app refletiram para usbi")
    public void oUsuarioValidaQueAsAlteracoesFeitasNaAvaliacaoDoCarroNoAppRefletiramParaUsbi() {
        log().setLocator(appsAvaliacoes);
        log().setLocator(appsMain);
        find(appsAvalicoesButton).click();
        find(appsAvalicoesExpandidoButton).click();
        find(appsAvaliacoesBuscarPlacaInput).send().text(placaVeiculo);
        find(appsAvaliacoesBuscarButton).click();
        find(APPS_USBI_AVALIACOES_BUTTON_AVALIACAO_ESPECIFICA_PLACA.replace("arg0", placaVeiculo.toUpperCase())).click();
        sleep().untilAppear(APPS_USBI_AVALIACOES_TEXT_AVALIACAO);
        String sClienteProposta = find(APPS_AVALIACOES_TEXT_CLIENTE).get().text().toString();
        String sTelefoneProposta = find(APPS_AVALIACOES_TEXT_TELEFONE).get().text().toString();
        String sCelularProposta = find(APPS_AVALIACOES_TEXT_CELULAR).get().text().toString();
        String sEmailProposta = find(APPS_AVALIACOES_TEXT_EMAIL).get().text().toString();
        assertThat(sClienteProposta).isEqualTo(proprietario);
        sTelefoneProposta = sTelefoneProposta.replace("-", "");
        assertThat(sTelefoneProposta).isEqualTo(telefoneCliente);
        sCelularProposta = sCelularProposta.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
        assertThat(sCelularProposta).isEqualTo(celularCliente);
        assertThat(sEmailProposta).isEqualTo(emailCriacao);

    }
}
