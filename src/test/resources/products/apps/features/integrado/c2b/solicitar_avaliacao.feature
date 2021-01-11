Feature: Solicitar nova avaliação

  @Integrated @solicitarNovaAvaliacaoOutline
  Scenario Outline: Solicitar Avaliacao, Author: Felipe Amorim, Category: solicitar_nova_avaliacao, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi

    #------------------------TELA LOGIN
    And O usuario preenche o campo e-mail como <tipoLogin> do grupo <grupo>
    #And O usuario preenche o campo e-mail como <tipoLogin>
    And O usuario preenche o campo password a senha <senha>
    And O usuario clica no botao log in

    #------------------------TELA PRINCIPAL
    When O usuario clica no botao solicitar avaliacao

    #------------------------TELA SOLICITAR AVALIACAO

    #------------------------dados cliente
    And O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao <tipoSolicitacao>
    And O usuario seleciona o avaliador responsavel 1
    #And O usuario insere um nome do cliente (valor automatico)
    And O usuario insere um nome do cliente <nomeCliente>
    #And O usuario insere um celular (valor automatico)
    And O usuario insere um celular <celularCliente>

    #------------------------dados veiculo
    #And O usuario insere o ano do veiculo de interesse como "2018" (valor inserido na linha)
    And O usuario insere o ano do veiculo de interesse como <anoVeiculo>
    And O usuario insere o veiculo <veiculo>
    And O usuario seleciona o primeiro veiculo da busca
    And O usuario insere uma placa <placa>
    And O usuario insere o renavam <renavam>
    And O usuario seleciona sim para chave reserva
    And O usuario seleciona sim para manual
    Then O usuario clica no botao solicitar
    And O usuario seleciona o veiculo recem avaliado na lista de avaliacoes
    Examples:
      | tipoLogin  | grupo     | senha        | tipoSolicitacao  | nomeCliente       | celularCliente | anoVeiculo | veiculo | placa      | renavam     |
      #| "ericles.santos@autoavaliar.com.br" | "" | "Somente compra" | "Nome do Cliente" | "19999999999"  | "2018"     | "palio" | "KZA-0263" | "144003058" |
      | "vendedor" | "abrao"   | "timeqa0102" | "Somente compra" | "Nome do Cliente" | "19999999999"  | "2018"     | "palio" | "KZA-0263" | "144003058" |
      | "gerente"  | "abrao"   | "timeqa0102" | "Somente compra" | "Nome do Cliente" | "19999999999"  | "2018"     | "palio" | "KZA-0263" | "144003058" |
      | "vendedor" | "andreta" | "timeqa0102" | "Somente compra" | "Nome do Cliente" | "19999999999"  | "2018"     | "palio" | "KZA-0263" | "144003058" |
    #todo continuar



