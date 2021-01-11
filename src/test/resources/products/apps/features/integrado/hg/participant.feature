Feature: Testes de requisições do endpoint Participant

  #----CPF
  @REST @Integrated @participantCpfExists
  Scenario Outline: Validacao de CPF existente, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists <URI> <endpoint3> <cpf>
    Then O usuario valida que o corpo de resposta exibe cpf ja cadastrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "27691418809" |

  @REST @Integrated @participantCpfExistsAuthPartner
  Scenario Outline: Validacao de CPF existente com token partner, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists com token partner <URI> <endpoint3> <cpf>
    Then O usuario valida que a requisicao nao pode ser feita sem o token correto 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "27691418809" |

  @REST @Integrated @participantCpfExistsNoAuth
  Scenario Outline: Validacao de CPF existente sem token, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists sem token <URI> <endpoint3> <cpf>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "27691418809" |


  @REST @Integrated @participantCpfNotExists
  Scenario Outline: Validacao de CPF nao existente, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists <URI> <endpoint3> <cpf>
    Then O usuario valida que o corpo de resposta exibe cpf nao cadastrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "12605275736" |

  @REST @Integrated @participantCpfEmpty
  Scenario Outline: Validacao de CPF vazio, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists <URI> <endpoint3> <cpf>
    Then O usuario valida a mensagem de erro de Cpf nao pode ser vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "" |

  @REST @Integrated @participantCpfBoolean
  Scenario Outline: Validacao de CPF boleano, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists <URI> <endpoint3> <cpf>
    Then O usuario valida que o corpo de resposta exibe cpf e invalido 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "true" |


  @REST @Integrated @participantCpfInvalid
  Scenario Outline: Validacao de CPF invalido, Author: Felipe Amorim, Category: cpf_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cpfexists <URI> <endpoint3> <cpf>
    Then O usuario valida que o corpo de resposta exibe cpf e invalido 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "aabbccddeeff" |









  #----EMAIL
  @REST @Integrated @participantEmailExists
  Scenario Outline: Validacao de email existente, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists <URI> <endpoint3> <emailpost>
    Then O usuario valida que o corpo de resposta exibe que o status do email e verdadeiro 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "fernando.petry@autoavaliar.com.br" |

  @REST @Integrated @participantEmailExistsAuthPartner
  Scenario Outline: Validacao de email existente com token partner, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists com token partner <URI> <endpoint3> <emailpost>
    Then O usuario valida que a requisicao nao pode ser feita sem o token correto 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "fernando.petry@autoavaliar.com.br" |

  @REST @Integrated @participantEmailExistsNoAuth
  Scenario Outline: Validacao de email existente sem token, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists sem token <URI> <endpoint3> <emailpost>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "fernando.petry@autoavaliar.com.br" |

  @REST @Integrated @participantEmailNotExists
  Scenario Outline: Validacao de email nao existente, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists <URI> <endpoint3> <emailpost>
    Then O usuario valida que o corpo de resposta exibe que o status do email e falso 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                               |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "fernando.pesssstry@autoavaliar.com.br" |

  @REST @Integrated @participantEmailInvalid
  Scenario Outline: Validacao de email nao existente, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists <URI> <endpoint3> <emailpost>
    Then O usuario valida que o endpoint retornou vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                               |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "aaar.com.br" |

  @REST @Integrated @participantEmailInvalid
  Scenario Outline: Validacao de email invalido, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists <URI> <endpoint3> <emailpost>
    Then O usuario valida que o endpoint retornou vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                               |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "aaar.com.br" |

  @REST @Integrated @participantEmailBoolean
  Scenario Outline: Validacao de email boleano, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists <URI> <endpoint3> <emailpost>
    Then O usuario valida que o endpoint retornou vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                               |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "true" |

  @REST @Integrated @participantEmailEmpty
  Scenario Outline: Validacao de email vazio, Author: Felipe Amorim, Category: email_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant emailexists <URI> <endpoint3> <emailpost>
    Then O usuario valida a mensagem de erro de Email nao pode ser vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                  | emailpost                               |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/email-exists" | "" |


  #@REST @Integrated @participantCnpjExists
  #Scenario Outline: Validacao de CNPJ existente, Author: Felipe Amorim, Category: cnpj_exists, Environment: Rest
  #  Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
  #  When O usuario envia uma requisicao para o participant cpfexists <URI> <endpoint3> <cpf>
  #  Then O usuario valida que o corpo de resposta exibe cpf ja cadastrado 200
#
  #  Examples:
  #    | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                | cpf           |
  #    | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cpf-exists" | "27691418809" |

  @REST @Integrated @participantCnpjNotExists
  Scenario Outline: Validacao de CNPJ nao existente, Author: Felipe Amorim, Category: cnpj_not_exists, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cnpjexists <URI> <endpoint3> <cnpj> <countryid>
    Then O usuario valida que o corpo de resposta exibe cnpj nao cadastrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                 | cnpj             |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cnpj-exists" | "77260848000184" |

  @REST @Integrated @participantCnpjInvalid
  Scenario Outline: Validacao de CNPJ invalido, Author: Felipe Amorim, Category: cnpj_invalid, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o participant cnpjexists <URI> <endpoint3> <cnpj> <countryid>
    Then O usuario valida que o corpo de resposta exibe cnpj e invalido 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3                 | cnpj             |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "participant/cnpj-exists" | "aaaaaaa" |
