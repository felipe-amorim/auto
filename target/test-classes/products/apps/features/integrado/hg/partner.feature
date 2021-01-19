Feature: Teste para capturar token do partner

  @REST @Integrated: @TesteDeAutenticacaoDoPartiner
  Scenario Outline: Autenticação de usuário, Author: Éricles Alencar, Category: auth_login, Environment: Rest
    Given O usuario constroe requisicao para a URI <URI>
    And O endpoint auth <auth>
    And O usuario define o tipo de request como POST
    And O usuario insere o body com country id <countryid>
    When O usuario dispara a request
    Then O usuario valida que o status recebido e 200
    And O usuario verificar se existe a chave token
    And O usuario armazena o token partner de resposta


    Examples:
      | URI                                             | auth            | countryid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | 76        |