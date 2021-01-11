package com.autoavaliar.products.apps.stepdefs.c2b;

import com.autoavaliar.support.CoreWeb;
import com.autoavaliar.support.tbi.JRobot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.awt.event.KeyEvent;

import static com.autoavaliar.products.apps.massas.Locator.*;
import static com.autoavaliar.products.apps.objetos.c2b.C2bAvaliacao.*;

public class SDC2bAvaliacao extends CoreWeb {


    @Then("O usuario preenche o select de marca como {string}")
    public void oUsuarioPreencheOSelectDeMarcaComoMarca(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoMarcaSelect).comboBox().set().byText(arg0);
    }

    @Then("O usuario preenche o select de modelo como {string}")
    public void oUsuarioPreencheOSelectDeModeloComoModelo(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoModeloSelect).comboBox().set().byText(arg0);
    }

    @Then("O usuario preenche o select de ano como {string}")
    public void oUsuarioPreencheOSelectDeAnoComoAno(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoAnoSelect).comboBox().set().byText(arg0);
    }

    @Then("O usuario preenche o select de versao como {string}")
    public void oUsuarioPreencheOSelectDeVersaoComoVersao(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoVersaoSelect).comboBox().set().byText(arg0);
    }

    @Then("O usuario preenche o input de quilometragem como {string}")
    public void oUsuarioPreencheOinputDeQuilometragemComoQuilometragem(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoQuilometragemInput).send().text(arg0);
    }

    @Then("O usuario preenche o input de quilometragem com a quilometragem exibida no placeholder")
    public void oUsuarioPreencheOinputDeQuilometragemComAQuilometragemExibidaNoPlaceholder() {
        log().setLocator(c2bAvaliacao);
        String placeholder = String.valueOf(find(c2bAvaliacaoQuilometragemInput).get().attribute("placeholder"));
        find(c2bAvaliacaoQuilometragemInput).send().text(placeholder);
    }

    @Then("O usuario clica em continuar")
    public void oUsuarioClicaEmContinuar() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoContinuarButton).click();
    }

    @And("O usuario seleciona a cor do carro")
    public void oUsuarioSelecionaACorDoCarro() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoCorInput).click();
        find(c2bAvaliacaoCorSelect).click();
        sleep().until(1000);
        evidence("Evidência de que clicou na cor");
    }

    @And("O usuario seleciona o tipo do combustivel do carro")
    public void oUsuarioSelecionaOTipoDoCombustivelDoCarro() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoDetalhesDoVeiculo).click();
        sleep().until(1000);
        JRobot.getRobot().keyPress(KeyEvent.VK_PAGE_DOWN);
        JRobot.getRobot().keyRelease(KeyEvent.VK_PAGE_DOWN);
        sleep().until(1000);
        find(c2bAvaliacaoCombustivelInput).click();
        find(c2bAvaliacaoCombustivelSelect).click();
        sleep().until(1000);
    }

    @And("O usuario segue para o segundo passo do cadastro")
    public void oUsuarioSegueParaOSegundoPassoDoCadastro() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoPassoDois).click();
    }

    @And("O usuario clica em adicionar fotos")
    public void oUsuarioClicaEmAdicionarFotos() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoFotosInput).click();
        sleep().until(1000);
    }

    @And("O usuario segue para o terceiro passo do cadastro")
    public void oUsuarioSegueParaOTerceiroPassoDoCadastro() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoPassoTres).click();
    }

    @And("O usuario preenche o nome como {string}")
    public void oUsuarioPreencheONomeComoNome(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoNomeInput).send().text(arg0);
    }

    @And("O usuario preenche o email como {string}")
    public void oUsuarioPreencheOEmailEmail(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoEmailInput).send().text(arg0);
    }

    @And("O usuario preenche o DDD como {string}")
    public void oUsuarioPreencheODDDDDD(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoDDDInput).send().text(arg0);
    }

    @And("O usuario preenche o Telefone como {string}")
    public void oUsuarioPreencheOTelefoneComoTelefone(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoTelefoneInput).send().text(arg0);
    }

    @And("O usuario preenche o campo observacoes como {string}")
    public void oUsuarioPreencheOCampoObservacoesComoObs(String arg0) {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoObsTextArea).send().text(arg0);

    }

    @And("O usuario clica no checkbox aceitando os termos")
    public void oUsuarioClicaNoCheckboxAceitandoOsTermos(){
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoAceitarNegociacaoInput).click();
    }

    @Then("O usuario clica em enviar")
    public void oUsuarioClicaEmEnviar() {
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoEnviarAvaliacaoButton).click();
        sleep().until(15000);
        evidence("Evidência que deu sucesso o envio da avaliação");
    }

    @And("O usuario adiciona as fotos")
    public void oUsuarioAdicionaAsFotos() {
        enviarImagem(img1);
            }

    public void enviarImagem(String imagem){
        log().setLocator(c2bAvaliacao);
        find(c2bAvaliacaoFotosInput).click();
        sleep().until(2000);
        JRobot.enviar(imagem);
        sleep().until(2000);
        JRobot.getRobot().keyPress(KeyEvent.VK_ENTER);
        JRobot.getRobot().keyRelease(KeyEvent.VK_ENTER);
        sleep().until(2000);
    }
}
