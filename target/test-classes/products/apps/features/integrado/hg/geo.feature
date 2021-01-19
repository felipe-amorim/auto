Feature: Testes de requisições do endpoint GEO

  #----COUNTRIES
  #--positivo
  @REST @geo @geoGetCountries @Integrated @geoGetCountriesAuth
  Scenario Outline: Coleta de informacoes Geo por pais, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcountries <URI> <endpoint3>
    Then O usuario valida que o corpo de resposta possui argentina brasil e chile 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-countries" |

  #--positivo
  @REST @geo @geoGetCountries @Integrated @geoGetCountriesAuthPartner
  Scenario Outline: Coleta de informacoes Geo por pais com token partner, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcountries com o token de parter <URI> <endpoint3>
    Then O usuario valida que o corpo de resposta possui argentina brasil e chile 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-countries" |

  #--positivo
  @REST @geo @geoGetCountries @Integrated @geoGetCountriesNoAuth
  Scenario Outline: Coleta de informacoes Geo por pais sem token, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcountries sem token <URI> <endpoint3>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3           |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-countries" |




  #----STATES
  #--positivo
  @REST @geo @geoGetStates @Integrated @geoGetStatesAuth
  Scenario Outline: Coleta de informacoes Geo por estado, Author: Felipe Amorim, Category: geo_states, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getstates <URI> <endpoint3>
    Then O usuario valida que o corpo de resposta possui todos os estados 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-states" |

  #--positivo
  @REST @geo @geoGetStates @Integrated @geoGetStatesAuthPartner
  Scenario Outline: Coleta de informacoes Geo por estado com token partner, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getstates com o token de parter <URI> <endpoint3>
    Then O usuario valida que o corpo de resposta possui todos os estados 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-states" |

  #--positivo
  @REST @geo @geoGetStates @Integrated @geoGetStatesNoAuth
  Scenario Outline: Coleta de informacoes Geo por estado sem token, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getstates sem token <URI> <endpoint3>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-states" |








  #----CITIES
  @REST @geo @geoGetCities @Integrated @geoGetCitiesAuth
  Scenario Outline: Coleta de informacoes Geo por cidade, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities <URI> <endpoint3> <stateid>
    Then O usuario valida que o corpo de resposta possui todos as cidades 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | "1"     |

  #--positivo
  @REST @geo @geoGetCities @Integrated @geoGetCitiesAuthPartner
  Scenario Outline: Coleta de informacoes Geo por cidade com token partner, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities com token partner <URI> <endpoint3> <stateid>
    Then O usuario valida que o corpo de resposta possui todos as cidades 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | "1"     |

  #--positivo
  @REST @geo @geoGetCities @Integrated @geoGetCitiesNoAuth
  Scenario Outline: Coleta de informacoes Geo por cidade sem token, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities sem token <URI> <endpoint3> <stateid>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | "1"     |

  @REST @geo @geoGetCities @Integrated @geoGetCitiesStateCode0
  Scenario Outline: Coleta de informacoes Geo por cidade com state id 0, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities <URI> <endpoint3> <stateid>
    Then O usuario valida que o endpoint retornou vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | "0"     |

  @REST @geo @geoGetCities @Integrated @geoGetCitiesStateCodeInvalid
  Scenario Outline: Coleta de informacoes Geo por cidade com state id invalido, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities <URI> <endpoint3> <stateid>
    Then O usuario valida que o endpoint retornou vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | "a"     |

  @REST @geo @geoGetCities @Integrated @geoGetCitiesStateCodeBoolean
  Scenario Outline: Coleta de informacoes Geo por cidade com state id boleano, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities <URI> <endpoint3> <stateid>
    Then O usuario valida que o endpoint retornou vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | "true"  |

  @REST @geo @geoGetCities @Integrated @geoGetCitiesStateCodeEmpty
  Scenario Outline: Coleta de informacoes Geo por cidade com state id vazio, Author: Felipe Amorim, Category: geo_countries, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getcities <URI> <endpoint3> <stateid>
    Then O usuario valida a mensagem de erro de stateId nao pode ser vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | stateid |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-cities" | ""      |





  #----ZIP
  @REST @geo @geoGetZip @Integrated @geoGetByZipAuth
  Scenario Outline: Coleta de informacoes Geo por cep, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida o corpo de resposta 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" |

  @REST @geo @geoGetZip @Integrated @geoGetByZipAuthPartner
  Scenario Outline: Coleta de informacoes Geo por cep com token partner, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip com token partner <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida o corpo de resposta 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" |

  @REST @geo @geoGetZip @Integrated @geoGetByZipNoAuth
  Scenario Outline: Coleta de informacoes Geo por cep sem token, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip sem token <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida que a requisicao nao pode ser feita sem o token 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" |

  @REST @geo @geoGetZip @Integrated @geoGetByZip0
  Scenario Outline: Coleta de informacoes Geo pelo cep 0, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida que o cep nao foi encontrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "0"     |

  @REST @geo @geoGetZip @Integrated @geoGetByZipInvalid
  Scenario Outline: Coleta de informacoes Geo com um cep invalido, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida que o cep nao foi encontrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "a"     |

  @REST @geo @geoGetZip @Integrated @geoGetByZipBoolean
  Scenario Outline: Coleta de informacoes Geo com um cep boleano, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida que o cep nao foi encontrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "true"  |

  @REST @geo @geoGetZip @Integrated @geoGetByZipVazio
  Scenario Outline: Coleta de informacoes Geo com um cep boleano, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryid> <zipCode>
    Then O usuario valida a mensagem de erro de Cep nao pode ser vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | ""      |

  @REST @geo @geoGetZip @Integrated @geoGetByZipCountry0
  Scenario Outline: Coleta de informacoes Geo com o country id sendo 0, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryidBody> <zipCode>
    Then O usuario valida que o cep nao foi encontrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      | countryidBody |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" | 0             |

  @REST @geo @geoGetZip @Integrated @geoGetByZipCountryBoolean
  Scenario Outline: Coleta de informacoes Geo com o country id sendo boleano, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryidBody> <zipCode>
    Then O usuario valida que o cep nao foi encontrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      | countryidBody |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" | "true"        |

  @REST @geo @geoGetZip @Integrated @geoGetByZipCountryInvalido
  Scenario Outline: Coleta de informacoes Geo com o country id sendo boleano, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryidBody> <zipCode>
    Then O usuario valida que o cep nao foi encontrado 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      | countryidBody |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" | "a"           |

  @REST @geo @geoGetZip @Integrated @geoGetByZipCountryVazio
  Scenario Outline: Coleta de informacoes Geo com o country id sendo boleano, Author: Felipe Amorim, Category: geo_cities, Environment: Rest
    Given O usuario esta autenticado <URI> <endpoint1> <countryid> 200 <endpoint2> <email> <password> 200
    When O usuario envia uma requisicao para o geo getbyzip <URI> <endpoint3> <countryidBody> <zipCode>
    Then O usuario valida a mensagem de erro de countryId nao pode ser vazio 200

    Examples:
      | URI                                             | endpoint1       | email                               | password   | countryid | endpoint2    | endpoint3        | zipCode      | countryidBody |
      | "https://hg-sandbox-dot-sa-hg-sys.appspot.com/" | "partner/login" | "ericles.santos@autoavaliar.com.br" | "AA@2020." | 76        | "auth/login" | "geo/get-by-zip" | "13.184-140" | ""           |


