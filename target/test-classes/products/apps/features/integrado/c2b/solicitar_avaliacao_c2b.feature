Feature: Solicitar avaliacao C2B

  @Integrated @solicitarNovaAvaliacaoC2bOutline
  Scenario Outline: Solicitar Avaliacao C2B, Author: Éricles Alencar, Category: solicitar_nova_avaliacao_c2b, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi

    #------------------------TELA LOGIN
    #And O usuario preenche o campo e-mail como <tipoLogin> do grupo <grupo>
    And O usuario preenche o campo e-mail como <tipoLogin>
    And O usuario preenche o campo password a senha <senha>
    And O usuario clica no botao log in

    When O usuario clica no menu lateral para selecionar outro sistema
    And O usuario clica no botao do sistema ego
    And O usuario clica no menu gestao de contas
    And O usuario clica no menu empresas
    And O usuario preenche o campo de busca por empresa por <empresa>
    And O usuario clica em buscar empresa
    And O usuario clica na empresa resultante da busca
    Then O usuario clica na aba c2b da empresa
    And O usuario armazena a url de navegacao para o ambiente homolog do c2b
    When O usuario realiza o logoff
    And O usuaro navega para a url do ambiente de homolog c2b
    And O usuario aceita os termos e condicoes de uso
    And O usuario realiza a busca pela placa <placa>
    And O usuario preenche o select de marca como <marca>
    And O usuario preenche o select de modelo como <modelo>
    And O usuario preenche o select de ano como <ano>
    And O usuario preenche o select de versao como <versao>
    #Then O usuario preenche o select de quilometragem como <quilometragem>
    And O usuario preenche o input de quilometragem com a quilometragem exibida no placeholder
    Then O usuario clica em continuar
    And O usuario clica em continuar para o preenchimento dos dados do carro
    And O usuario seleciona a cor do carro
    And O usuario seleciona o tipo do combustivel do carro
    And O usuario segue para o segundo passo do cadastro
    #And O usuario clica em adicionar fotos
    And O usuario adiciona as fotos
    And O usuario segue para o terceiro passo do cadastro
    And O usuario preenche o nome como <nome>
    And O usuario preenche o email como <email>
    And O usuario preenche o DDD como <DDD>
    And O usuario preenche o Telefone como <telefone>
    And O usuario preenche o campo observacoes como <obs>
    And O usuario clica no checkbox aceitando os termos
    Then O usuario clica em enviar


    Examples:
      | tipoLogin                           | senha      | empresa        | placa     | marca  | modelo  | ano    | versao                           | quilometragem | nome    | email            | DDD | telefone  | obs     |
      | "ericles.santos@autoavaliar.com.br" | "AA@2020." | "AA FENABRAVE" | "KZA0263" | "FIAT" | "PALIO" | "2007" | "1.0 MPI FIRE 8V FLEX 2P MANUAL" | "126342"      | "Teste" | "teste@teste.com"| "19"| "99999999"| "teste" |
