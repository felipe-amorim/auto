Feature: Teste de autentiação via requisição REST

  #@REST @Integrated @testeDeAutenticacaoDeUsuarioNaHg
  #Scenario Outline: Autenticação de usuário, Author: Éricles Alencar, Category: auth_login, Environment: Rest
  #  Given O usuario constroe requisicao para a URI <URI>
  #  And O endpoint auth <auth>
  #  And O usuario define o tipo de request como POST
  #  And O usuario insere o token "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJoZ2FwaS5hYSIsImlhdCI6MTU5Mzc5Nzc3NCwianRpIjoiMWFiOSIsInR5cCI6MiwiZXhwIjoxNTkzODg0MTc0LCJkYXRhIjp7InVzZXJfaWQiOjEyMDE0NywiaW5zdGFuY2VfaWQiOjEsImVudGl0eV9pZCI6MjM4MDEsImNvdW50cnlfaWQiOjc2LCJhcHBfaWQiOjEsIm9zIjoyLCJwYXJ0bmVyX2lkIjoxLCJwYXJ0bmVyX3R5cGVfaWQiOjEwLCJnb2FsIjoid2ViIiwiaGFzaCI6IjY4NDEyYzA3NWZhMDAyMTZmNTFlZjU1ODk3Nzg1MWIwZTQ5NWM3YzFjMGRlYyJ9fQ.LHYQPE9hbtuV4A8LE4WAjxfiJNpbNcgfbvvIggb34uc"
  #  And O usuario insere o body com o email <email> e password <password>
  #  When O usuario dispara a request
  #  Then O usuario valida que o status recebido e 200
  #  And O usuario verificar se existe a chave token
  #  And O usuario armazena o token de resposta
  #  Examples:
  #    | URI                                             | auth         | email                               | password   |
  #    | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "auth/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." |


  @REST @Integrated @testeDeAutenticacaoDeUsuarioNaHg
  Scenario Outline: Autenticação de usuario automatica, Author: Ericles Alencar, Category: auth_login, Environment: Rest
    Given O usuario constroe requisicao para a URI <URI>
    And O endpoint auth <auth>
    And O usuario define o tipo de request como POST
    And O usuario insere o body com country id <countryid>
    When O usuario dispara a request
    Then O usuario valida que o status recebido e 200
    And O usuario verificar se existe a chave token
    And O usuario armazena o token partner de resposta
    Given O usuario constroe requisicao para a URI <URI>
    And O endpoint auth <auth2>
    And O usuario define o tipo de request como POST
    And O usuario utiliza o token ja capturado
    And O usuario insere o body com o email <email> e password <password>
    When O usuario dispara a request
    Then O usuario valida que o status recebido e 200
    And O usuario verificar se existe a chave token
    And O usuario armazena o token de resposta
    Examples:
      | URI                                             | auth            | email                               | password   | countryid | auth2        |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" |


  @REST @Integrated @testeDeAutenticacaoDeUsuarioNaHgAuto
  Scenario Outline: Autenticação de usuario automatica, Author: Ericles Alencar, Category: auth_login, Environment: Rest
    Given O usuario pega o token partner <URI> <auth> <countryid> 200
    When O usuario envia requisicao de autenticacao para hg <URI> <auth2> <email> <password>
    Then O usuario faz as validações de autenticacao 200
    Examples:
      | URI                                             | auth            | email                               | password   | countryid | auth2        |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" |
