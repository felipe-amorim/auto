Feature: Realizar nova solicitação


  @NovaSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Carro
  Scenario Outline: Realizar nova solicitacao para carro com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Carro, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "arnaldo.wiziack2@autoavaliar.com.br" "aw203040"
    When O usuario realiza uma nova solicitacao para carro <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada

    #separar
    #Given O usuario realiza uma nova solicitacao com os campos <email> <senha> <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>

    Examples:
      | placa     | ano    | km       | marca        | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      #| "FFF0002" | "2014" | "50000"  | "fiat"       | "uno"         | "bom"       | "bom"        | "20000"     | "35000"    |
      | "FFA0001" | "2016" | "120001" | "volkswagen" | "gol"  | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFA0002" | "2014" | "50000"  | "fiat"       | "uno"         | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0003" | "2015" | "120000" | "FORD"       | "FIESTA"      | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0004" | "2016" | "120001" | "volkswagen" | "gol"         | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0005" | "2017" | "50000"  | "toyota"     | "hilux"       | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0006" | "2018" | "50000"  | "nissan"     | "frontier"    | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0007" | "2019" | "50000"  | "mitsubishi" | "L200"        | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0008" | "2020" | "10000"  | "PEOGEOT"    | "5005"        | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0009" | "2020" | "10000"  | "RENAULT"    | "SANDERO"     | "otimo"     | "otimo"      | "20000"     | "35000"    |
      #| "FFF0010" | "2020" | "10000"  | "CITROEN"    | "C3"          | "bom"       | "otimo"      | "20000"     | "35000"    |

      #| "FFF0011" | "2020" | "10000"  | "AUDI"       | "A3"          | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0012" | "2020" | "10000"  | "BMW"        | "320"         | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0013" | "2020" | "10000"  | "HONDA"      | "CITY"        | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0014" | "2020" | "10000"  | "HYUNDAY"    | "HB20"        | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0015" | "2020" | "10000"  | "JEEP"       | "RENEGADE"    | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0016" | "2020" | "10000"  | "KIA"        | "SOUL"        | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0017" | "2020" | "10000"  | "MINI"       | "COOPER"      | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0018" | "2020" | "10000"  | "SMART"      | "SMART"       | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0019" | "2020" | "10000"  | "SUZUKI"     | "VITARA"      | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0020" | "2020" | "10000"  | "CHERY"      | "CELLER"      | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0021" | "2015" | "10000"  | "chevrolet"  | "TRAILBLAZER" | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0022" | "2020" | "10000"  | "TOYOTA"     | "HILUX SW"    | "bom"       | "bom"        | "20000"     | "35000"    |
      #| "FFF0023" | "2020" | "10000"  | "VOLKSWAGEN" | "VOYAGE"      | "ruim"      | "bom"        | "20000"     | "35000"    |
      #| "FFF0024" | "2020" | "10000"  | "FORD"       | "KA"          | "bom"       | "ruim"       | "20000"     | "35000"    |
      #| "FFF0025" | "2020" | "10000"  | "FIAT "      | "PALIO"       | "ruim"      | "ruim"       | "20000"     | "35000"    |

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

  @NovaSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Moto
  Scenario Outline: Realizar nova solicitacao para moto com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "arnaldo.wiziack2@autoavaliar.com.br" "aw203040"
    When O usuario realiza uma nova solicitacao para moto <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que a solicitacao foi realizada

    Examples:
      | placa     | ano    | km       | marca   | modelo       | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "honda" | "cb twister" | "bom"       | "bom"        | "20000"     | "35000"    |

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

  @NovaSolicitacaoAndroid @ComCamposObrigatoriosAndroidOutLine @Caminhao
  Scenario Outline: Realizar nova solicitacao para caminhao com campos obrigatorios, Author: Felipe Amorim, Category: Nova Solicitacao - Moto, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo como "timeqa.apk@autoavaliar.com.br" "timeqa0102"
    When O usuario realiza uma nova solicitacao para caminhao <placa> <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    #Then O usuario valida que a solicitacao foi realizada
    Then O usuario valida que a solicitacao foi realizada para caminhao

    Examples:
      | placa     | ano    | km       | marca   | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "FFF0002" | "2016" | "120001" | "volvo" | "fh"   | "bom"       | "bom"        | "20000"     | "35000"    |

