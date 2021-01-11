Feature: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação

  @abrao @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo abrao com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @abrao @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo abrao com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @abrao @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo abrao com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff




  @andreta @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo andreta com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @andreta @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo andreta com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @andreta @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo andreta com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff




  @caoa @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo caoa com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @caoa @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo caoa com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @caoa @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo caoa com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff



  @carhouse @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo carhouse com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @carhouse @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo carhouse com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @carhouse @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo carhouse com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff




  @carhouse @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo ngc com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "ngc"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @carhouse @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo ngc com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "ngc"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @carhouse @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo ngc com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "ngc"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff





  @jorlan @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo jorlan com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @jorlan @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo jorlan com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @jorlan @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo jorlan com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff




  @localiza @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo localiza com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "localiza"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @localiza @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo localiza com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "localiza"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @localiza @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo localiza com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "localiza"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff





  @newland @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo newland com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @newland @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo newland com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @newland @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo newland com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff






  @parvi @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo parvi com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @parvi @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo parvi com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @parvi @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo parvi com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff







  @saga @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo saga com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @saga @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo saga com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @saga @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo saga com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff








  @servopa @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo servopa com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @servopa @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo servopa com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @servopa @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo servopa com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff









  @autoavaliar @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo autoavaliar com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "autoavaliar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @autoavaliar @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo autoavaliar com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "autoavaliar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @autoavaliar @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo autoavaliar com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "autoavaliar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff








  @viamar @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo viamar com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @viamar @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo viamar com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @viamar @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo viamar com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff









  @carrera @vendedor @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo carrera com perfil vendedor, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @carrera @avaliador @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo carrera com perfil avaliador, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff

  @carrera @gerente @unit @mandatory_avaliador_responsavel
  Scenario: Validar a obrigatoriedade do campo (avaliador responsavel) ao solicitar avaliação para o grupo carrera com perfil gerente, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario seleciona o avaliador responsavel 1
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo avaliador responsavel
    And O usuario realiza o logoff