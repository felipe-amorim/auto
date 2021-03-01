Feature: Realizar nova solicitação

  @NovaSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Carro
  Scenario Outline: Realizar nova solicitacao para carro com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Carro, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    When O usuario realiza uma nova solicitacao para carro <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada para carro

    Examples:
      | placa     | ano    | km       | marca        | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFA0001" | "2016" | "120001" | "volkswagen" | "gol"  | "bom"       | "bom"        | "19000"     | "21000"    |


  @NovaSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Moto
  Scenario Outline: Realizar nova solicitacao para moto com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "arnaldo.wiziack2@autoavaliar.com.br" "aw203040"
    When O usuario realiza uma nova solicitacao para moto <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada para moto

    Examples:
      | placa     | ano    | km       | marca   | modelo       | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "honda" | "cb twister" | "bom"       | "bom"        | "20000"     | "35000"    |


  @NovaSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Caminhao
  Scenario Outline: Realizar nova solicitacao para caminhao com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    When O usuario realiza uma nova solicitacao para caminhao <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada para caminhao

    Examples:
      | placa     | ano    | km       | marca   | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "volvo" | "fh"   | "bom"       | "bom"        | "20000"     | "35000"    |


  @NovaSolicitacaoUsbiAndroid @ComCamposObrigatoriosAndroidOutLine @Carro
  Scenario Outline: Realizar nova solicitacao para carro mais usbi, com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Carro, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    When O usuario realiza uma nova solicitacao para carro <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    And O usuario acessa portal auto avaliar usb com usuario vendedor
    Then O usuario valida que todos os dados inseridos na avaliação do carro sao apresentados no portal

    Examples:
      | placa     | ano    | km       | marca        | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFA0001" | "2016" | "120001" | "volkswagen" | "gol"  | "bom"       | "bom"        | "19000"     | "21000"    |


  @NovaSolicitacaoUsbiAndroid @ComCamposObrigatoriosAndroidOutLine @Moto
  Scenario Outline: Realizar nova solicitacao para moto mais usbi, com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    When O usuario realiza uma nova solicitacao para moto <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    And O usuario acessa portal auto avaliar usb com usuario vendedor
    Then O usuario valida que todos os dados inseridos na avaliação da moto sao apresentados no portal

    Examples:
      | placa     | ano    | km       | marca   | modelo       | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "honda" | "cb twister" | "bom"       | "bom"        | "20000"     | "35000"    |


  @NovaSolicitacaoUsbiAndroid @ComCamposObrigatoriosAndroidOutLine @Caminhao
  Scenario Outline: Realizar nova solicitacao para caminhao mais usbi, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    When O usuario realiza uma nova solicitacao para caminhao <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    And O usuario acessa portal auto avaliar usb com usuario vendedor
    Then O usuario valida que todos os dados inseridos na avaliação do caminhao sao apresentados no portal

    Examples:
      | placa     | ano    | km       | marca   | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "volvo" | "fh"   | "bom"       | "bom"        | "20000"     | "35000"    |


  @EditarSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Carro
  Scenario Outline: Realizar nova solicitacao para carro com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Carro, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    And O usuario realiza uma nova solicitacao para carro <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    When O usuario atualiza todos os campos da solicitacao <ano> <km> <segundaMarca> <segundoModelo> <segundoStatusMotor> <segundoStatusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada para carro

    Examples:
      | placa     | ano    | km       | marca        | segundaMarca | modelo | segundoModelo | statusMotor | segundoStatusMotor | statusCambio | segundoStatusCambio | valorCompra | valorVenda |
      | "FFA0001" | "2016" | "120001" | "volkswagen" | "chevrolet"  | "gol"  | "onix"        | "bom"       | "excelente"        | "bom"        | "excelente"         | "19000"     | "21000"    |


  @EditarSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Moto
  Scenario Outline: Realizar nova solicitacao para carro com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Carro, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    And O usuario realiza uma nova solicitacao para moto <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    When O usuario atualiza todos os campos da solicitacao moto <ano> <km> <segundaMarca> <segundoModelo> <segundoStatusMotor> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada para moto

    Examples:
      | placa     | ano    | km       | marca   | segundaMarca | modelo       | segundoModelo | statusMotor | segundoStatusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "honda" | "yamaha"     | "cb twister" | "mt-03"       | "bom"       | "excelente"        | "bom"        | "20000"     | "35000"    |


  @EditarSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Caminhao
  Scenario Outline: Realizar nova solicitacao para caminhao com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    And O usuario realiza uma nova solicitacao para caminhao <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    When O usuario atualiza todos os campos da solicitacao caminhao <ano> <km> <segundaMarca> <segundoModelo> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada para caminhao

    Examples:
      | placa     | ano    | km       | marca   | segundaMarca | modelo | segundoModelo | statusMotor | segundoStatusMotor | statusCambio | segundoStatusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "volvo" | "iveco"      | "fh"   | "tector"      | "bom"       | "excelente"        | "bom"        | "excelente"         | "20000"     | "35000"    |


  @ValidarBloqueioDuplicidadePlaca @ComCamposObrigatoriosAndroidOutLine @Carro
  Scenario: Realizar nova solicitacao para carro com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Carro, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    Then O usuario valida bloqueio duplicidade placa para proposta

  @NovaSolicitacaoComEdicaoAndroid
  Scenario Outline: Realizar nova solicitacao com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "arnaldo.wiziack2@autoavaliar.com.br" "aw203040"
    When O usuario realiza uma nova solicitacao para carro <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    And O usuario valida que a solicitacao foi realizada
    And O usuario realiza modificacoes <km2>
    Then O usuario valida que as modificacoes foram realizadas

    #separar
    #Given O usuario realiza uma nova solicitacao com os campos <email> <senha> <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>

    Examples:
      | placa     | ano    | km       | marca        | modelo | statusMotor | statusCambio | valorCompra | valorVenda | km2      |
      | "KZA9997" | "2016" | "120001" | "volkswagen" | "gol"  | "bom"       | "bom"        | "20000"     | "35000"    | "120002" |


  @NovaAvaliacaoJaLogadoAndroidSemAmbienteLimpo @ComCamposObrigatoriosAndroidSemAmbienteLimpo
  Scenario Outline: Realizar nova solicitacao com campos obrigatorios sem ambiente limpo, Author: Felipe Amorim, Category: Nova Solicitacao, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "arnaldo.wiziack2@autoavaliar.com.br" "aw203040"
    When O usuario realiza uma nova solicitacao para carro <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    #Then O usuario valida que a solicitacao foi realizada

    #separar
    #Given O usuario realiza uma nova solicitacao com os campos <email> <senha> <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>

    Examples:
      | placa     | ano    | km       | marca        | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFA0001" | "2016" | "120001" | "volkswagen" | "gol"  | "bom"       | "bom"        | "20000"     | "35000"    |
      | "FFA0002" | "2014" | "50000"  | "fiat"       | "uno"  | "bom"       | "bom"        | "20000"     | "35000"    |




