package com.autoavaliar.products.apps.stepdefs.ubsi;

import com.autoavaliar.support.CoreWeb;
import com.autoavaliar.support.tbi.GeradorCPF;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import java.util.Calendar;

import static com.autoavaliar.products.apps.objetos.usbi.AppsUsbiSolicitarAvaliacao.*;


public class SDAppsUsbiSolicitarAvaliacao extends CoreWeb {
    public static String veiculo = "";
    public static String placaVeiculo = "";
    public static String cpf ="";
    public static String email ="";
    public static String codigoCrm ="";
    public static String nomeCliente ="";
    public static String celularCliente ="";
    public static String telefoneCliente ="";
    public static String cep ="";
    public static String numero ="";
    public static String complemento ="";
    public static String anoInteresse = "";
    public static String renavam = "";
    public static String assentos = "";
    public static String estofamento = "";
    public static String motor = "";
    public static String potencia = "";
    public static String expectativaDoCliente = "";
    public static String cidade = "";
    public static String perguntaBinaria = "";
    public static String perguntaMonetaria = "";
    public static String perguntaNumerica = "";
    public static String perguntaParaEscolha = "";
    public static String perguntaString = "";
    public static String manual = "";
    public static String chave = "";
    public static String garantia = "";


    @Then("O usuario valida que a tela solicitar avaliacao carregou com sucesso")
    public void oUsuarioValidaQueATelaSolicitarAvaliacaoCarregouComSucesso() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoTitle).exists();
    }

    @And("O usuario seleciona o tipo de avaliacao {string}")
    public void oUsuarioSelecionaOTipoDeAvaliacao(String arg0) {
        find(appsTipoAvaliacaoCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario seleciona o avaliador responsavel {int}")
    public void oUsuarioSelecionaOAvaliadorResponsavel(int arg0) {
        if(find(appsAvaliadorResponsavelCombobox).exists()) {
            find(appsAvaliadorResponsavelCombobox).comboBox().set().byIndex(arg0);
        }
    }

    @And("O usuario insere um nome do cliente {string}")
    public void oUsuarioInsereUmNomeDoCliente(String arg0) {
        long t = Calendar.getInstance().getTimeInMillis();
        nomeCliente = arg0;
        find(appsNomeDoClienteInput).send().text(arg0);
    }

    @And("O usuario insere um nome do cliente")
    public void oUsuarioInsereUmNomeDoCliente() {
        long t = Calendar.getInstance().getTimeInMillis();
        find(appsNomeDoClienteInput).send().text("Cliente " + t);
    }

    @And("O usuario insere o ano do veiculo de interesse como {string}")
    public void oUsuarioInsereOAnoDoVeiculoDeInteresseComo(String arg0) {
        find(appsAnoDeInteresseInput).clear();
        find(appsAnoDeInteresseInput).send().text(arg0);
    }

    @And("O usuario insere o veiculo {string}")
    public void oUsuarioInsereOVeiculo(String arg0) {
        find(appsVeiculoInput).send().text(arg0);
        veiculo = arg0;
    }

    @And("O usuario seleciona o primeiro veiculo da busca")
    public void oUsuarioSelecionaOPrimeiroVeiculoDaBusca() {
        if (!find(appsPrimeiroVeiculoLi).get().attribute("title").toString().toLowerCase().contains(veiculo)) {
            error().Warning("O primeiro veiculo não possuia o critério de busca inserido (" + veiculo + ")");
        }
        find(appsPrimeiroVeiculoLi).click();
    }

    @Then("O usuario clica no botao solicitar sem preencher os campos obrigatorios")
    public void oUsuarioClicaNoBotaoSolicitarSemPreencherOsCamposObrigatorios() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarButton).click();
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoTipoDeAvaliacao() {
        if (!find(appsObrigatoriedadeTipoDeAvaliacaoText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeTipoDeAvaliacaoText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeTipoDeAvaliacaoText);
        }
    }

    @And("O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel")
    public void oUsuarioPreencheOCampoTipoDeAvaliacaoComOPrimeiroItemDisponivel() {
        find(appsTipoAvaliacaoCombobox).comboBox().set().byIndex(1);
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCampoTipoDeAvaliacao() {
        if (find(appsObrigatoriedadeTipoDeAvaliacaoText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoAvaliadorResponsavel() {
        if (!find(appsObrigatoriedadeAvaliadorResponsavelText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeAvaliadorResponsavelText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeAvaliadorResponsavelText);
        }
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCampoAvaliadorResponsavel() {
        if (find(appsObrigatoriedadeAvaliadorResponsavelText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo nome")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoNome() {
        if (!find(appsObrigatoriedadeNomeText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeNomeText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeNomeText);
        }
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do campo nome")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCampoNome() {
        if (find(appsObrigatoriedadeNomeText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo celular")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoCelular() {
        if (!find(appsObrigatoriedadeCelularText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadeCelularText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadeCelularText);
        }
    }

    @And("O usuario insere um celular")
    public void oUsuarioInsereUmCelular() {
        long t = Calendar.getInstance().getTimeInMillis();
        find(appsCelularInput).send().text("" + t);
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade do celular")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDoCelular() {
        if (find(appsObrigatoriedadeCelularText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario valida a mensagem de obrigatoriedade do campo placa")
    public void oUsuarioValidaAMensagemDeObrigatoriedadeDoCampoPlaca() {
        if (!find(appsObrigatoriedadePlacaText).exists()) {
            error().Fail();
        } else {
            if (find(appsObrigatoriedadePlacaText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsObrigatoriedadePlacaText);
        }
    }

    @And("O usuario insere uma placa real")
    public void oUsuarioInsereUmaPlacaReal() {
        find(appsPlacaInput).send().text("KZA0263");
        placaVeiculo = "KZA0263";
    }

    @And("O usuario valida nao existencia da mensagem de obrigatoriedade da placa")
    public void oUsuarioValidaNaoExistenciaDaMensagemDeObrigatoriedadeDaPlaca() {
        if (find(appsObrigatoriedadePlacaText).exists()) {
            error().Fail();
        }
    }

    @And("O usuario limpa o campo placa")
    public void oUsuarioLimpaOCampoPlaca() {
        find(appsPlacaInput).clear();
    }

    @And("O usuario perde o foco do campo placa")
    public void oUsuarioPerdeOFocoDoCampoPlaca() {
        find(appsPlacaInput).send().tab();
    }

    @And("O usuario insere uma placa invalida")
    public void oUsuarioInsereUmaPlacaInvalida() {
        find(appsPlacaInput).send().text("-");
    }

    @And("O usuario valida a mensagem de placa invalida")
    public void oUsuarioValidaAMensagemDePlacaInvalida() {
        if (!find(appsPlacaInvalidaText).exists()) {
            error().Fail();
        } else {
            if (find(appsPlacaInvalidaText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsPlacaInvalidaText);
        }
    }

    @And("O usuario clica em buscar placa")
    public void oUsuarioClicaEmBuscarPlaca() {
        find(appsBuscarPlacaButton).click();
    }

    @And("O usuario clica no botao solicitar para realizar solicitacao de avaliacao")
    public void oUsuarioClicaNoBotaoSolicitarParaRealizarSolicitacaoDeAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        sleep().until(1000);
        find(appsSolicitarAvaliacoSolicitarButton).click();
    }

    @And("O usuario insere o renavam")
    public void oUsuarioInsereORenavam() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoRenavamInput).send().text("144003058");
    }

    @And("O usuario seleciona sim para chave reserva")
    public void oUsuarioSelecionaSimParaChaveReserva() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoChaveReservaSelect).comboBox().set().byIndex(1);
    }

    @And("O usuario seleciona sim para manual")
    public void oUsuarioSelecionaSimParaManual() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoManualSelect).comboBox().set().byIndex(1);
    }

    @And("O usuario clica no botao solicitar")
    public void oUsuarioClicaNoBotaoSolicitar() {
        log().setLocator(appsSolicitarAvaliacao);
        scroll().up(800);
        find(appsSolicitarAvaliacaoSolicitaButton).click();
    }

    @Then("O usuario insere uma placa valida e inexistente")
    public void oUsuarioInsereUmaPlacaValidaEInexistente() {
        find(appsPlacaInput).send().text("AAA-0000");
    }

    @And("O usuario valida a mensagem de placa nao encontrada")
    public void oUsuarioValidaAMensagemDePlacaNaoEncontrada() {
        if (!find(appsPlacaNaoEncontradaText).exists()) {
            error().Fail();
        } else {
            if (find(appsPlacaNaoEncontradaText).count() > 1) {
                error().Warning("Mais de uma mensagem de erro com a mesma mensagem foi exibida");
            }
            sleep().untilDisapear(appsPlacaNaoEncontradaText);
        }
    }

    @And("O usuario insere um cpf valido")
    public void oUsuarioInsereUmCpfValido() {
        log().setLocator(appsSolicitarAvaliacao);
        cpf = GeradorCPF.geraCPF();
        find(appsSolicitarAvaliacaoCPFInput).send().text(cpf);
    }

    @And("O usuario insere um numero de renavam")
    public void oUsuarioInsereUmNumeroDeRenavam() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoRenavamInput).send().text("123456789");
    }

    @And("O usuario insere um valor para expectativa do cliente")
    public void oUsuarioInsereUmValorParaExpectativaDoCliente() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoExpectativaDoClienteInput).send().text("1500000");


    }

    @And("O usuario preenche o campo observacoes")
    public void oUsuarioPreencheOCampoObservacoes() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoOpenFieldObsButton).click();
        find(appsSolicitarAvaliacaoTextObsInput).send().text("Observações Testes Automatizados");
    }

    @And("O usuario insere um telefone")
    public void oUsuarioInsereUmTelefone() {
        long t = Calendar.getInstance().getTimeInMillis();
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoNumeroTelefoneInput).send().text("" + t);
    }

    @And("O usuario preenche o campo e-mail para solicitacao de avaliacao")
    public void oUsuarioPreencheOCampoEMailParaSolicitacaoDeAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoEmailClienteInput).send().text("automacao@teste.com");
    }

    @And("O usuario insere um cpf valido para solicitar avaliacao")
    public void oUsuarioInsereUmCpfValidoParaSolicitarAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoAndretaCPFInput).send().text("43711064043");
    }

    @And("O usuario insere um email")
    public void oUsuarioInsereUmEmail() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoEmailInput).send().text("automacao@email.com");
    }

    @And("O usuario insere um telefone para solicitar avaliacao")
    public void oUsuarioInsereUmTelefoneParaSolicitarAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoTelefoneInput).send().text("1111111111");
    }

    @And("O usuario preenche o campo observacoes para solicitar avaliacao")
    public void oUsuarioPreencheOCampoObservacoesParaSolicitarAvaliacao() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoAbrirObservacoesButton).click();
        find(appsSolicitarAvaliacaoAreaObservacoesText).send().text("automacao");
    }

    @And("O usuario preenche o campo renavam")
    public void oUsuarioPreencheOCampoRenavam() {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoRenavamAndretaInput).send().text("03309259996");
    }

    @And("O usuario preenche o combobox o veiculo possui garantia com {string}")
    public void oUsuarioPreencheOComboboxOVeiculoPossuiGarantiaCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoVeiculoPossuiGarantiaCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o combobox possui manual para solicitar avaliacao com {string}")
    public void oUsuarioPreencheOComboboxPossuiManualParaSolicitarAvaliacaoCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoPossuiManualDoVeiculoCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o combobox todas as revisoes feitas em concessionarias com {string}")
    public void oUsuarioPreencheOComboboxTodasAsRevisoesFeitasEmConcessionariasCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoRevisoesCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o combobox possui manual do proprietario para solicitar avaliacao com {string}")
    public void oUsuarioPreencheOComboboxPossuiManualDoProprietarioParaSolicitarAvaliacaoCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoManualDoProprietarioCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o combobox foram efetuadas revisoes com {string}")
    public void oUsuarioPreencheOComboboxForamEfetuadasRevisoesCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoForamEfetuadasRevisoesCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o combobox livrete para solicitar avaliacao com {string}")
    public void oUsuarioPreencheOComboboxLivreteParaSolicitarAvaliacaoCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoLivreteCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario preenche o combobox de o veiculo esta em garantia de fabrica com {string}")
    public void oUsuarioPreencheOComboboxDeOVeiculoEstaEmGarantiaDeFabricaCom(String arg0) {
        log().setLocator(appsSolicitarAvaliacao);
        find(appsSolicitarAvaliacaoVeiculoEmGarantiaDeFabricaCombobox).comboBox().set().byText(arg0);
    }

    @And("O usuario insere um celular do cliente")
    public void oUsuarioInsereUmCelularDoCliente() {
        find(appsCelularDoClienteInput).send().text("99999999999");
    }

    @And("O usuario insere uma placa para o veiculo")
    public void oUsuarioInsereUmaPlacaParaOVeiculo() {
        find(appsPlacaInput).send().text("KZA-0263");
    }

    @And("O usuario insere um celular {string}")
    public void oUsuarioInsereUmCelularCelularCliente(String arg0) {
        find(appsCelularDoClienteInput).click();
        celularCliente = arg0;
        find(appsCelularDoClienteInput).send().slow().text(arg0);
    }

    @And("O usuario insere uma placa {string}")
    public void oUsuarioInsereUmaPlacaPlaca(String arg0) {
        placaVeiculo = arg0;
        find(appsPlacaInput).send().text(arg0);
    }

    @And("O usuario insere o renavam {string}")
    public void oUsuarioInsereORenavamManual(String arg0) {
        find(appsSolicitarAvaliacaoRenavamInput).send().text(arg0);
    }

    @And("O usuario insere um telefone {string}")
    public void oUsuarioInsereUmTelefoneTelefoneCliente(String arg0) {
        find(appsTelefoneDoClienteInput).click();
        telefoneCliente = arg0;
        find(appsTelefoneDoClienteInput).send().slow().text(arg0);
    }

    @And("O usuario insere o cep da auto avaliar")
    public void oUsuarioInsereOCepDaAutoAvaliar() {
        log().setLocator(appsSolicitarAvaliacao);
        cep = "13289180";
        find(appsSolicitarAvaliacaoCEPInput).send().slow().text(cep);
        find(appsSolicitarAvaliacaoBuscaCEPButton).click();
    }

    @And("O usuario preenche o o campo numero")
    public void oUsuarioPreencheOOCampoNumero() {
        log().setLocator(appsSolicitarAvaliacao);
        numero = "60";
        find(appsSolicitarAvaliacaoNumeroInput).send().text(numero);
    }

    @And("O usuario preenche o campo complemento")
    public void oUsuarioPreencheOCampoComplemento() {
        log().setLocator(appsSolicitarAvaliacao);
        complemento = "a";
        find(appsSolicitarAvaliacaoComplementoInput).send().text(complemento);
    }



    @And("O usuario preenche os dados do veiculo")
    public void oUsuarioPreencheOsDadosDoVeiculo() {
        anoInteresse = "2018";
        oUsuarioInsereOAnoDoVeiculoDeInteresseComo(anoInteresse);
        veiculo = "palio";
        oUsuarioInsereOVeiculo(veiculo);
        oUsuarioSelecionaOPrimeiroVeiculoDaBusca();
        placaVeiculo = "KZA0263";
        oUsuarioInsereUmaPlacaPlaca(placaVeiculo);
        find(appsSolicitarAvaliacaoRenavamInput).click();
        renavam = "1";
        find(appsSolicitarAvaliacaoRenavamInput).send().slow().text(renavam);
        assentos = "4";
        find(appsSolicitarAvaliacaoAssentosInput).send().text(assentos);
        estofamento = "couro";
        find(appsSolicitarAvaliacaoEstofamentoInput).send().text(estofamento);
        motor = "1";
        find(appsSolicitarAvaliacaoNumeroDoMotorInput).send().text(motor);
        potencia = "1";
        find(appsSolicitarAvaliacaoPotenciaInput).send().text(potencia);
        expectativaDoCliente = "1";
        find(appsSolicitarAvaliacaoExpectativaDoClienteInput).send().text(expectativaDoCliente);
        cidade = "campinas";
        find(appsSolicitarAvaliacaoCidadeDoVeiculoInput).send().text(cidade);
        find(appsSolicitarAvaliacaoCidadeCampinasInput).click();
        perguntaBinaria = "Sim";
        find(appsSolicitarAvaliacaoEstaPerguntaEBinariaInput).comboBox().set().byText(perguntaBinaria);
        perguntaMonetaria = "1";
        find(appsSolicitarAvaliacaoEstaPerguntaEMonetariaInput).send().text(perguntaMonetaria);
        perguntaNumerica = "1";
        find(appsSolicitarAvaliacaoEstaPerguntaENumericaInput).send().text(perguntaNumerica);
        perguntaParaEscolha = "Escolha 1";
        find(appsSolicitarAvaliacaoEstaPerguntaEParaEscolhaInput).comboBox().set().byText(perguntaParaEscolha);
        find(appsSolicitarAvaliacaoEstaPerguntaEMultiplaEscolhaOpcaoUmButton).click();
        perguntaString = "1";
        find(appsSolicitarAvaliacaoEstaPerguntaEStringInput).send().text(perguntaString);
        manual = "Sim";
        find(appsSolicitarAvaliacaoPossuiManualDoVeiculoCombobox).comboBox().set().byText(manual);
        chave = "Sim";
        find(appsSolicitarAvaliacaoPossuiChaveReservaComboBox).comboBox().set().byText(chave);
        garantia = "Sim";
        find(appsSolicitarAvaliacaoPossuiPossuiGarantiaComboBox).comboBox().set().byText(garantia);
        scroll().up(800);
    }
}
