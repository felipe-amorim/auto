package com.autoavaliar.products.apps.stepdefs.ubsi;

import com.autoavaliar.products.aplicativo_android.stepdefs.SDAplicativoAndroidSolicitacao;
import com.autoavaliar.support.CoreWeb;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.awt.*;

import static com.autoavaliar.products.aplicativo_android.stepdefs.SDAplicativoAndroidSolicitacao.*;
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

    @Then("O usuario valida que todos os dados inseridos na avaliação do caminhao sao apresentados no portal")
    public void oUsuarioValidaQueTodosOsDadosInseridosNaAvaliaçãoDoCaminhaoSaoApresentadosNoPortal() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesBuscarPlacaInput).send().text(placa);
        find(appsAvaliacoesBuscarButton).click();
        find(APPS_USBI_AVALIACOES_BUTTON_AVALIACAO_ESPECIFICA_PLACA.replace("arg0", placa)).click();
        sleep().untilAppear(APPS_USBI_AVALIACOES_TEXT_AVALIACAO);
        String usbiTelefone = find(APPS_USBI_AVALIACOES_TEXT_TELEFONE).get().text().toString();
        String usbiCelular = find(APPS_USBI_AVALIACOES_TEXT_CELULAR).get().text().toString();
        String usbiEmail = find(APPS_USBI_AVALIACOES_TEXT_EMAIL).get().text().toString();
        String usbiSolicitante = find(APPS_USBI_AVALIACOES_TEXT_SOLICITANTE).get().text().toString();
        String usbiPlaca = find(APPS_USBI_AVALIACOES_TEXT_PLACA).get().text().toString();
        String usbiAno = find(APPS_USBI_AVALIACOES_TEXT_ANO).get().text().toString();
        String usbiKm = find(APPS_USBI_AVALIACOES_TEXT_KM).get().text().toString();
        String usbiCor = find(APPS_USBI_AVALIACOES_TEXT_COR).get().text().toString();
        String usbiCombustivel = find(APPS_USBI_AVALIACOES_TEXT_COMBUSTIVEL).get().text().toString();
        String usbiCambio = find(APPS_USBI_AVALIACOES_TEXT_CAMBIO).get().text().toString();
        String usbiAplicacao = find(APPS_USBI_AVALIACOES_TEXT_APLICACAO).get().text().toString();
        String usbiSegmento = find(APPS_USBI_AVALIACOES_TEXT_SEGMENTO).get().text().toString();
        String usbiTracao = find(APPS_USBI_AVALIACOES_TEXT_TRACAO).get().text().toString();
        String usbiFabricanteMotor = find(APPS_USBI_AVALIACOES_TEXT_FABRICANTE_MOTOR).get().text().toString();
        String usbiNumeroCilindros = find(APPS_USBI_AVALIACOES_TEXT_NUMERO_CILINDROS).get().text().toString();
        String usbiNumeroMarchas = find(APPS_USBI_AVALIACOES_TEXT_NUMERO_MARCHAS).get().text().toString();
        String usbiCabine = find(APPS_USBI_AVALIACOES_TEXT_CABINE).get().text().toString();
        String usbiDistanciaEntreEixosAtual = find(APPS_USBI_AVALIACOES_TEXT_DISTANCIA_ENTRE_EIXOS_ATUAL).get().text().toString();
        String usbiDistanciaEntreEixosAnterior = find(APPS_USBI_AVALIACOES_TEXT_DISTANCIA_ENTRE_EIXOS_ANTERIOR).get().text().toString();
        String usbiPotencia = find(APPS_USBI_AVALIACOES_TEXT_POTENCIA).get().text().toString();
        String usbiClassificacao = find(APPS_USBI_AVALIACOES_TEXT_CLASSIFICACAO).get().text().toString();
        String usbiFinalidade = find(APPS_USBI_AVALIACOES_TEXT_FINALIDADE).get().text().toString();
        String usbiValorCompra = find(APPS_USBI_AVALIACOES_TEXT_VALOR_COMPRA).get().text().toString();
        String usbiValorVenda = find(APPS_USBI_AVALIACOES_TEXT_VALOR_VENDA).get().text().toString();

        usbiTelefone = usbiTelefone.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        assertThat(usbiTelefone).isEqualTo(sTelefone);
        usbiCelular = usbiCelular.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        assertThat(usbiCelular).isEqualTo(celular);


        assertThat(usbiEmail).isEqualTo(email);
        assertThat(usbiSolicitante).isEqualTo(vendedor);
        assertThat(usbiPlaca).isEqualTo(placa);
        assertThat(usbiAno).isEqualTo(anoFabricacao + "/" + anoLancamento);
        usbiKm = usbiKm.replace(".", "");
        assertThat(usbiKm).isEqualTo(kilometragem);
        assertThat(usbiCor).isEqualTo(cor);
        assertThat(usbiCombustivel).isEqualTo(combustivel);
        assertThat(usbiCambio).isEqualTo(cambio);
        assertThat(usbiAplicacao).isEqualTo(aplicacao);
        assertThat(segmento).contains(usbiSegmento);
        assertThat(usbiTracao).isEqualTo(tracao);
        assertThat(usbiFabricanteMotor).isEqualTo(fabricanteMotor);
        assertThat(usbiNumeroCilindros).isEqualTo(numeroCiclindros);
        assertThat(usbiNumeroMarchas).isEqualTo(numeroMarchas);
        assertThat(usbiCabine).isEqualTo(configuracaoCabine + "- " + tipoCabine + " -");
        assertThat(usbiDistanciaEntreEixosAtual).isEqualTo(distanciaEntreEixosAtual);
        assertThat(usbiDistanciaEntreEixosAnterior).isEqualTo(distanciaEntreEixosAnterior);
        assertThat(usbiPotencia).isEqualTo(potencia);
        assertThat(usbiClassificacao).isEqualTo(classificacao);
        assertThat(usbiFinalidade).isEqualTo(finalidade);
        usbiValorCompra = usbiValorCompra.replace("R$", "").replace(".", "").replace(",00", "");
        assertThat(usbiValorCompra).contains(valorCompra);
        usbiValorVenda = usbiValorVenda.replace("R$", "").replace(".", "").replace(",00", "");
        assertThat(usbiValorVenda).contains(valorVenda);
    }

    @Then("O usuario valida que todos os dados inseridos na avaliação da moto sao apresentados no portal")
    public void oUsuarioValidaQueTodosOsDadosInseridosNaAvaliaçãoDaMotoSaoApresentadosNoPortal() {
        //placa = "FFF0002";
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesBuscarPlacaInput).send().text(placa);
        find(appsAvaliacoesBuscarButton).click();
        find(APPS_USBI_AVALIACOES_BUTTON_AVALIACAO_ESPECIFICA_PLACA.replace("arg0", placa)).click();
        find(APPS_USBI_AVALIACOES_TEXT_TELEFONE).move();
        String usbiTelefone = find(APPS_USBI_AVALIACOES_TEXT_TELEFONE).get().text().toString();
        usbiTelefone = usbiTelefone.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        System.out.println("variavel usbiTelefone: " + usbiTelefone);
        System.out.println("variavel sTelefone: " + sTelefone);
        assertThat(usbiTelefone).isEqualTo(sTelefone);
        String usbiCelular = find(APPS_USBI_AVALIACOES_TEXT_CELULAR).get().text().toString();
        usbiCelular = usbiCelular.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        assertThat(usbiCelular).isEqualTo(celular);
        String usbiEmail = find(APPS_USBI_AVALIACOES_TEXT_EMAIL).get().text().toString();
        assertThat(usbiEmail).isEqualTo(email);
        String usbiSolicitante = find(APPS_USBI_AVALIACOES_TEXT_SOLICITANTE).get().text().toString();
        assertThat(usbiSolicitante).isEqualTo(vendedor);
        String usbiPlaca = find(APPS_USBI_AVALIACOES_TEXT_PLACA).get().text().toString();
        assertThat(usbiPlaca).isEqualTo(placa);
        String usbiAno = find(APPS_USBI_AVALIACOES_TEXT_ANO).get().text().toString();
        assertThat(usbiAno).isEqualTo(anoFabricacao + "/" + anoLancamento);
        String usbiKm = find(APPS_USBI_AVALIACOES_TEXT_KM).get().text().toString();
        usbiKm = usbiKm.replace(".", "");
        assertThat(usbiKm).isEqualTo(kilometragem);
        String usbiCor = find(APPS_USBI_AVALIACOES_TEXT_COR).get().text().toString();
        assertThat(usbiCor).isEqualTo(cor);
        String usbiCombustivel = find(APPS_USBI_AVALIACOES_TEXT_COMBUSTIVEL).get().text().toString();
        assertThat(usbiCombustivel).isEqualTo(combustivel);
        String usbiCambio =find(APPS_USBI_AVALIACOES_TEXT_CAMBIO).get().text().toString();
        assertThat(usbiCambio).isEqualTo(cambio);
        String usbiClassificacao = find(APPS_USBI_AVALIACOES_TEXT_CLASSIFICACAO).get().text().toString();
        assertThat(usbiClassificacao).isEqualTo(classificacao);
        String usbiFinalidade = find(APPS_USBI_AVALIACOES_TEXT_FINALIDADE).get().text().toString();
        assertThat(usbiFinalidade).isEqualTo(finalidade);
        String usbiValorCompra = find(APPS_USBI_AVALIACOES_TEXT_VALOR_COMPRA).get().text().toString();
        usbiValorCompra = usbiValorCompra.replace("R$", "").replace(".", "").replace(",00", "");
        assertThat(usbiValorCompra).contains(valorCompra);
        String usbiValorVenda = find(APPS_USBI_AVALIACOES_TEXT_VALOR_VENDA).get().text().toString();
        usbiValorVenda = usbiValorVenda.replace("R$", "").replace(".", "").replace(",00", "");
        assertThat(usbiValorVenda).contains(valorVenda);
    }

    @Then("O usuario valida que todos os dados inseridos na avaliação di carro sao apresentados no portal")
    public void oUsuarioValidaQueTodosOsDadosInseridosNaAvaliaçãoDiCarroSaoApresentadosNoPortal() {
        log().setLocator(appsAvaliacoes);
        find(appsAvaliacoesBuscarPlacaInput).send().text(placa);
        find(appsAvaliacoesBuscarButton).click();
        find(APPS_USBI_AVALIACOES_BUTTON_AVALIACAO_ESPECIFICA_PLACA.replace("arg0", placa)).click();
        find(APPS_USBI_AVALIACOES_TEXT_TELEFONE).click();
        String usbiTelefone = find(APPS_USBI_AVALIACOES_TEXT_TELEFONE).get().text().toString();
        usbiTelefone = usbiTelefone.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        assertThat(usbiTelefone).isEqualTo(sTelefone);
        String usbiCelular = find(APPS_USBI_AVALIACOES_TEXT_CELULAR).get().text().toString();
        usbiCelular = usbiCelular.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
        assertThat(usbiCelular).isEqualTo(celular);
        String usbiEmail = find(APPS_USBI_AVALIACOES_TEXT_EMAIL).get().text().toString();
        assertThat(usbiEmail).isEqualTo(email);
        String usbiSolicitante = find(APPS_USBI_AVALIACOES_TEXT_SOLICITANTE).get().text().toString();
        assertThat(usbiSolicitante).isEqualTo(vendedor);
        String usbiPlaca = find(APPS_USBI_AVALIACOES_TEXT_PLACA).get().text().toString();
        assertThat(usbiPlaca).contains(placa);
        String usbiAno = find(APPS_USBI_AVALIACOES_TEXT_ANO).get().text().toString();
        assertThat(usbiAno).isEqualTo(anoFabricacao + "/" + anoLancamento);
        String usbiKm = find(APPS_USBI_AVALIACOES_TEXT_KM).get().text().toString();
        usbiKm = usbiKm.replace(".", "");
        assertThat(usbiKm).isEqualTo(kilometragem);
        String usbiCor = find(APPS_USBI_AVALIACOES_TEXT_COR).get().text().toString();
        assertThat(usbiCor).isEqualTo(cor);
        String usbiCombustivel = find(APPS_USBI_AVALIACOES_TEXT_COMBUSTIVEL).get().text().toString();
        assertThat(usbiCombustivel).isEqualTo(combustivel);
        String usbiCambio =find(APPS_USBI_AVALIACOES_TEXT_CAMBIO).get().text().toString();
        assertThat(usbiCambio).isEqualTo(cambio);
        find(APPS_USBI_AVALIACOES_TEXT_TELEFONE).click();
        String sQuantidadePortas = find(APPS_USBI_AVALIACOES_TEXT_PORTAS).get().text().toString();
        System.out.println("variavel sQuantidadePortas: " + sQuantidadePortas);
        System.out.println("variavel quantidadePortas: " + quantidadePortas);
        assertThat(sQuantidadePortas).isEqualTo(quantidadePortas);
        String usbiClassificacao = find(APPS_USBI_AVALIACOES_TEXT_CLASSIFICACAO).get().text().toString();
        assertThat(usbiClassificacao).isEqualTo(classificacao);
        String usbiFinalidade = find(APPS_USBI_AVALIACOES_TEXT_FINALIDADE).get().text().toString();
        assertThat(usbiFinalidade).isEqualTo(finalidade);
        String usbiValorCompra = find(APPS_USBI_AVALIACOES_TEXT_VALOR_COMPRA).get().text().toString();
        usbiValorCompra = usbiValorCompra.replace("R$", "").replace(".", "").replace(",00", "");
        assertThat(usbiValorCompra).contains(valorCompra);
        String usbiValorVenda = find(APPS_USBI_AVALIACOES_TEXT_VALOR_VENDA).get().text().toString();
        usbiValorVenda = usbiValorVenda.replace("R$", "").replace(".", "").replace(",00", "");
        assertThat(usbiValorVenda).contains(valorVenda);
    }
}
