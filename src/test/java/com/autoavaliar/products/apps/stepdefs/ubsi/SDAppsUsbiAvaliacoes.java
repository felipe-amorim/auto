package com.autoavaliar.products.apps.stepdefs.ubsi;

import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.awt.*;

import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiAvaliacoes.*;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiAvaliacoes.appsSolicitarButton;
import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiSolicitarAvaliacao.*;


public class SDAppsUsbiAvaliacoes extends CoreWeb {

    @Then("O usuario valida que a tela Avaliacoes carregou com sucesso")
    public void oUsuarioValidaQueATelaAvaliacoesCarregouComSucesso() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesTitleText).exists();
    }

    @And("O usuario valida que o botao solicitar e exibido")
    public void oUsuarioValidaQueOBotaoSolicitarEExibido() {
        find(appsSolicitarButton).exists();
    }

    @And("O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas")
    public void oUsuarioInsereUmaPlacaParaOCampoBuscarPlacaAvaliacoesCadastradas() {
        log().setLocator(appsAvaliacoes);
        sleep().untilAppear(appsAvaliacoesValidarCarregouTelaDeBuscaText);
        find(appsAvaliacoesBuscarPlacaInput).send().text("KZA-0263");
    }

    @And("O usuario clica em buscar para filtrar avaliacoes")
    public void oUsuarioClicaEmBuscarParaFiltrarAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesBuscarButton).click();
    }

    @And("O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados")
    public void oUsuarioSelecionaOPrimeiroVeiculoDaBuscaDeVeiculosCadastrados() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesPrimeiroVeiculoCadastradoButton).click();
    }

    @And("O usuario valida que a tela de avaliacao de veiculo carregou")
    public void oUsuarioValidaQueATelaDeAvaliacaoDeVeiculoCarregou() {
        log().setLocator(appsAvaliacoes);
        sleep().untilAppear(appsAvaliacoesValidarAvaliacaoText);
    }


    @And("O usuario clica no botao editar dados do veiculo avaliado")
    public void oUsuarioClicaNoBotaoEditarDadosDoVeiculoAvaliado() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesEditarDadosDoVeiculoAvaliadoButton).click();
        System.out.println("clicou no botao editar");
    }

    @Then("o usuario valida que o perfil tem acesso ao campo editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilTemAcessoAoCampoEditarDadosDoVeiculo() {
        System.out.println("antes do if ");
        if (find(appsAvaliacoesEditarAnoVeiculoText).isAvailable()) {
            System.out.println("entrou no if, o usuario tem acesso");
        } else {
            System.out.println("o usuario nao tem acesso");
            error().Fail();
        }
    }

    @Then("o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilNaoTemAcessoAoCampoEditarDadosDoVeiculo() {
        if (find(appsAvaliacoesEditarAnoVeiculoText).isAvailable()) {
            System.out.println("entrou no if, o elemento esta dispnivel para clique");
            error().Fail();
        } else {
            System.out.println("o elemento nao esta disponivel para clique");
        }
    }

    @Then("O usuario valida que o campo buscar placa esta escrito corretamente")
    public void oUsuarioValidaQueOCampoBuscarPlacaEstaEscritoCorretamente() {
        log().setLocator(appsAvaliacoes);
        assertThat(BuscarPlacatext).isEqualTo(find(appsAvaliacoesBuscarPlacaText).get().text().toString());
    }

    @Then("O usuario valida que o perfil logado nao tem acesso a funcionalidade de editar dados do veiculo")
    public void oUsuarioValidaQueOPerfilLogadoNaoTemAcessoAFuncionalidadeDeEditarDadosDoVeiculo() {
        log().setLocator(appsAvaliacoes);
        if (!find(appsAvaliacoesEditarDadosDoVeiculoAvaliadoButton).exists()) {
            System.out.println("sucesso, usuario realmente nao tem acesso a esta funcionalidade");
        } else {
            System.out.println("falha, usuario tem acesso ao botao editar");
            error().Fail();
        }
    }

    @And("O usuario seleciona o veiculo recem avaliado na lista de avaliacoes")
    public void oUsuarioSelecionaOVeiculoRecemAvaliadoNaListaDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesVeiculoRecemAvaliadoButton.replace("arg0", SDAppsUsbiSolicitarAvaliacao.placaVeiculo)).click();
    }

    @And("O usuario clica no botao para adicionar imagem a avaliacao solicitada")
    public void oUsuarioClicaNoBotaoParaAdicionarImagemAAvaliacaoSolicitada() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesAdicionarImagemAvaliacaoSolicitadaButton).click();
    }

    @And("O usuario clica em selecionar para documento")
    public void oUsuarioClicaEmSelecionarParaDocumento() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesSelecionarImagemDocumentoButton).click();
    }

    @And("O usuario clica em selecionar para frente lado diagonal")
    public void oUsuarioClicaEmSelecionarParaFrenteLadoDiagonal() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesSelecionarImagemFrenteLadoButton).click();
    }

    @And("O usuario envia o endereco de uma imagem")
    public void oUsuarioEnviaOEnderecoDeUmaImagem() {
        Robot JRobot = null;
        try {
            JRobot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @And("O usuario seleciona a versao no filtro de avaliacoes")
    public void oUsuarioSelecionaAVersaoNoFiltroDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesFiltroVersaoInput).send().text("CHERY QQ 1.0 MPFI 12V GASOLINA 4P MANUAL (2011)");
    }

    @And("O usuario seleciona a marca no filtro de avaliacoes")
    public void oUsuarioSelecionaAMarcaNoFiltroDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        //featuresfind(appsInputFiltroMarca).send().text("FERRARI");
    }

    @And("O usuario seleciona a modelo no filtro de avaliacoes")
    public void oUsuarioSelecionaAModeloNoFiltroDeAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesFiltroModeloInput).send().text("UNO");
    }

    @And("O usuario clica em buscar em avaliacoes")
    public void oUsuarioClicaEmBuscarEmAvaliacoes() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesFiltroBuscarButton).click();
    }

    @Then("O usuario valida que e possivel buscar com filtros incompativeis")
    public void oUsuarioValidaQueEPossivelBuscarComFiltrosIncompativeis() {
    }

    @And("O usuario seleciona o primeiro valor da busca versao")
    public void oUsuarioSelecionaOPrimeiroValorDaBuscaVersao() {
        log().setLocator(appsAvaliacoes);
        find(appsResultadoVersaoButton).click();
    }

    @And("O usuario seleciona o primerio valor da busca marca")
    public void oUsuarioSelecionaOPrimerioValorDaBuscaMarca() {
        log().setLocator(appsAvaliacoes);
        find(appsResultadoMarcaButton).click();
    }

    @And("O usuario seleciona o primeiro valor da busca modelo")
    public void oUsuarioSelecionaOPrimeiroValorDaBuscaModelo() {
        log().setLocator(appsAvaliacoes);
        find(appsResultadoModeloButton).click();
    }

    @And("O usuario insere um email valido")
    public void oUsuarioInsereUmEmailValido() {
        log().setLocator(appsAvaliacoes);
        SDAppsUsbiSolicitarAvaliacao.email = "teste@email.com.br";
        find(appsSolicitarAvaliacaoEmailInput).send().text(SDAppsUsbiSolicitarAvaliacao.email);
    }


    @And("O usuarui insere um codigo crm")
    public void oUsuaruiInsereUmCodigoCrm() {
        log().setLocator(appsAvaliacoes);
        SDAppsUsbiSolicitarAvaliacao.codigoCrm = "1";
        find(appsSolicitarAvaliacaoCRMInput).send().text(SDAppsUsbiSolicitarAvaliacao.codigoCrm);
    }
}
