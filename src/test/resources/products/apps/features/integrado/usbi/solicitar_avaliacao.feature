Feature: Solicitar nova avaliação USBI

  @Integrated @solicitarNovaAvaliacaoOutlineUSBI
  Scenario Outline: Solicitar Avaliacao, Author: Felipe Amorim, Category: solicitar_nova_avaliacao_usbi, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como <tipoLogin> do grupo <grupo>
    And O usuario preenche o campo password a senha <senha>
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    And O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao <tipoSolicitacao>
    #And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um cpf valido
    And O usuario insere um email valido
    And O usuarui insere um codigo crm
    And O usuario insere um nome do cliente <nomeCliente>
    And O usuario insere um celular <celularCliente>
    And O usuario insere um telefone <telefoneCliente>

    And O usuario insere o cep da auto avaliar
    And O usuario preenche o o campo numero
    And O usuario preenche o campo complemento

    #And O usuario insere o ano do veiculo de interesse como <anoVeiculo>
    #And O usuario insere o veiculo <veiculo>
    #And O usuario seleciona o primeiro veiculo da busca
    #And O usuario insere uma placa <placa>
    #And O usuario insere o renavam <renavam>

    And O usuario preenche os dados do veiculo

    #And O usuario seleciona sim para chave reserva
    #And O usuario seleciona sim para manual
    Then O usuario clica no botao solicitar
    And O usuario seleciona o veiculo recem avaliado na lista de avaliacoes
    And O usuario encerra o navegador
    When O usuario abre o aplicativo com o dispositivo <device> e versao do OS <versaoOS>
    And O usuario acessa o menu brasil
    And O usuario preenche o campo email como <tipoLoginAvaliador> do grupo <grupo>
    And O usuario preenche o campo senha com a senha padrao
    And O usuario clica em entrar
    And O usuario clica no card com a placa cadastrada
    And O usuario permite o acesso as fotos do aplicativo
    And O usuario permite acesso ao microfone do aplicativo
    And O usuario aceita o popUp de alerta que o veiculo ja foi avaliado
    And O usuario confere os dados do proprietario
    And O usuario preenche a kilometragem
    And O usuario arrasta a tela para baixo
    And O usuario arrasta a tela para baixo
    And O usuario preenche o campo versao
    And O usuario arrasta a tela para baixo
    And O usuario preenche o campo cambio
    And O usuario arrasta a tela para baixo
    And O usuario arrasta a tela para baixo
    And O usuario arrasta a tela para baixo
    And O usuario preenche o campo quantidade de portas utilizando o filtro por "4"
    And O usuario arrasta a tela para baixo
    And O usuario insere quatro fotos de teste
    And O usuario clica em salvar e avancar
    And O usuario clica em salvar e avancar
    And O usuario clica em salvar e avancar
    And O usuario preenche o campo classificacao como A
    And O usuario preenche o campo finalidade como oferta
    And O usuario clica em salvar e avancar
    And O usuario espera a avaliacao ser feita

    Examples:
      | tipoLoginAvaliador | tipoLogin  | grupo    | senha        | tipoSolicitacao  | nomeCliente       | celularCliente | telefoneCliente | anoVeiculo | veiculo | placa     | renavam     | device            | versaoOS |
      #| "avaliador"        | "vendedor" | "abrao"  | "timeqa0102" | "Somente compra" | "Nome do Cliente" | "19999999999"  | "1912345678"    | "2018"     | "palio" | "KZA0263" | "144003058" | "AA_Galaxy_S9_10" | "10"     |
      | "timeqa"           | "timeqa"   | "timeqa" | "timeqa0102" | "Somente compra" | "Nome do Cliente" | "19999999999"  | "1912345678"    | "2018"     | "palio" | "KZA0263" | "144003058" | "AA_Galaxy_S9_10" | "10"     |



