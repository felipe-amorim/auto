Feature: Testes de requisições do endpoint Ego

  #----SELLERS
  @REST @ego @egoSellersList @Integrated @egoSellersListAuth
  Scenario Outline: Exibir lista de vendedores, Author: Felipe Amorim, Category: sellers_list, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o ego sellers list <URI> <endpoint3>
    Then O usuario valida que o corpo possui algum vendedor 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3          |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "ego/sellers-list" |

  @REST @ego @egoSellersList @Integrated @egoSellersListAuthPartner
  Scenario Outline: Exibir lista de vendedores com token partner, Author: Felipe Amorim, Category: sellers_list_auth_partner, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o ego sellers list com o token de parter <URI> <endpoint3>
    Then O usuario valida que a requisicao nao pode ser feita sem o token correto 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3          |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "ego/sellers-list" |

  @REST @ego @egoSellersList @Integrated @egoSellersListNoAuth
  Scenario Outline: Exibir lista de vendedores sem token, Author: Felipe Amorim, Category: sellers_list_auth_partner, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o ego sellers list sem token <URI> <endpoint3>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3          |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "ego/sellers-list" |



  #----ENTITIES
  @REST @ego @egoEntitiesList @Integrated @egoEntitiesListAuth
  Scenario Outline: Exibir lista de entidades, Author: Felipe Amorim, Category: entities_list, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o ego entities list <URI> <endpoint3>
    Then O usuario valida que o corpo possui alguma entidade 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3          |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "ego/entities-list" |

  @REST @ego @egoEntitiesList @Integrated @egoEntitiesListAuthPartner
  Scenario Outline: Exibir lista de entidades, Author: Felipe Amorim, Category: entities_list_auth_partner, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o ego entities list com o token de parter <URI> <endpoint3>
    Then O usuario valida que a requisicao nao pode ser feita sem o token correto 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3          |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "ego/entities-list" |

  @REST @ego @egoEntitiesList @Integrated @egoEntitiesListNoAuth
  Scenario Outline: Exibir lista de entidades sem token, Author: Felipe Amorim, Category: entities_list_auth_partner, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o ego entities list sem token <URI> <endpoint3>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3          |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "ego/entities-list" |
