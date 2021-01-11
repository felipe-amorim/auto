Feature: Tabela AutoAvaliar

  A Tabela Auto Avaliar FGV é a primeira e única tabela transacional de preços
  para veículos seminovos baseada em valores reais de mercado,
  levando em consideração as características do veículo, região geográfica e muito mais

  Background: Acessar portal da auto avaliar
    Given que acesso o portal da Auto Avaliar
    And seleciono no menu a opcao Tabela Auto Avaliar

  @Integrated @tabelaAutoAvaliar
  Scenario Outline: Validar Tabela Auto Avaliar, Author: Isaias Silva, Category: Validar carregamento dos modelos de veiculos conforme a marca selecionada, Environment: Google Chrome
    When escolho a marca <marca>
    Then verifico que o modelo <modelo> da marca escolhida são exibidos
    When clico no botão próximo
    Then verifico que estou no segundo passo para descobrir o valor transacional do carro a logomarca da marca selecionada é exibida
    When seleciono o ano <ano> do veiculo
    And seleciono o estado <uf> do veiculo
    And seleciono a versão <versao> do veiculo
    And clico no botão próximo do passo dois
    Then valido o resultado final da <marca> <modelo> <ano> <uf> <versao> sao exibidos na ultima etapa
    And valido uma das tabelas de referências

    Examples:
        | marca        | modelo          | ano    | uf      | versao                                                                  |
        | "Audi"       | "A1"            | "2013" | "AC"    | "1.4 TFSI ATTRACTION 16V 122CV GASOLINA 2P AUTOMATICO"                  |
        | "Audi"       | "A1"            | "2013" | "AC"    | "1.4 TFSI ATTRACTION 16V 122CV GASOLINA 4P AUTOMATICO"                  |
        | "Audi"       | "A1"            | "2013" | "AC"    | "1.4 TFSI SPORTBACK AMBITION 16V 185CV GASOLINA 4P AUTOMATICO"          |
        | "Audi"       | "A1"            | "2013" | "AC"    | "1.4 TFSI SPORTBACK ATTRACTION 16V 122CV GASOLINA 4P S-TRONIC"          |
#		| "Audi"       | "A3"            |
#		| "Audi"       | "A4"            |
#		| "Audi"       | "A5"            |
#		| "Audi"       | "A6"            |
#		| "Audi"       | "A7"            |
#		| "Audi"       | "Q3"            |
#		| "Audi"       | "Q5"            |
#		| "Audi"       | "Q7"            |
#		| "Audi"       | "Q8"            |
#		| "Audi"       | "RS Q3"         |
#		| "Audi"       | "RS4"           |
#		| "Audi"       | "RS6"           |
#		| "Audi"       | "S3"            |
#		| "Audi"       | "SQ5"           |
#		| "Audi"       | "TT"            |
#		| "BMW"        | "116I"          |
#		| "BMW"        | "118I"          |
#		| "BMW"        | "120I"          |
#		| "BMW"        | "125I"          |
#		| "BMW"        | "130I"          |
#		| "BMW"        | "220I"          |
#		| "BMW"        | "225I"          |
#		| "BMW"        | "316I"          |
#		| "BMW"        | "318I"          |
#		| "BMW"        | "320I"          |
#		| "BMW"        | "325I"          |
#		| "BMW"        | "328I"          |
#		| "BMW"        | "330I"          |
#		| "BMW"        | "335I"          |
#		| "BMW"        | "420I"          |
#		| "BMW"        | "428I"          |
#		| "BMW"        | "430I"          |
#		| "BMW"        | "435I"          |
#		| "BMW"        | "528I"          |
#		| "BMW"        | "530E"          |
#		| "BMW"        | "530I"          |
#		| "BMW"        | "535I"          |
#		| "BMW"        | "540I"          |
#		| "BMW"        | "550I"          |
#		| "BMW"        | "650I"          |
#		| "BMW"        | "I3"          |
#		| "BMW"        | "M 140I"          |
#		| "BMW"        | "M 240I"          |
#		| "BMW"        | "M3"          |
#		| "BMW"        | "M5"          |
#		| "BMW"        | "M6"          |
#		| "BMW"        | "R 1200 GS ADVENTURE"          |
#		| "BMW"        | "S 1000 XR"          |
#		| "BMW"        | "X1"          |
#		| "BMW"        | "X2"          |
#		| "BMW"        | "X3"          |
#		| "BMW"        | "X4"          |
#		| "BMW"        | "X5"          |
#		| "BMW"        | "X6"          |
#		| "BMW"        | "Z4"          |
#		#
#		| "Chevrolet"  | "Agile"         |
#		| "Chevrolet"  | "Astra"         |
#		| "Chevrolet"  | "Blazer"        |
#		| "Chevrolet"  | "Camaro"        |
#		| "Chevrolet"  | "Captiva"       |
#		| "Chevrolet"  | "Celta"         |
#		| "Chevrolet"  | "Classic"       |
#		| "Chevrolet"  | "Cobalt"        |
#		| "Chevrolet"  | "Cobalt Sedan"  |
#		| "Chevrolet"  | "Corsa"         |
#		| "Chevrolet"  | "Cruze"         |
#		| "Chevrolet"  | "Equinox"       |
#		| "Chevrolet"  | "Joy"           |
#		| "Chevrolet"  | "Kadett"        |
#		| "Chevrolet"  | "Malibu"        |
#		| "Chevrolet"  | "Meriva"        |
#		| "Chevrolet"  | "Montana"       |
#		| "Chevrolet"  | "Omega"         |
#		| "Chevrolet"  | "Onix"          |
#		| "Chevrolet"  | "Onix Hatch"    |
#		| "Chevrolet"  | "Prisma"        |
#		| "Chevrolet"  | "S10"           |
#		| "Chevrolet"  | "Sonic"         |
#		| "Chevrolet"  | "Sonic Hatch"   |
#		| "Chevrolet"  | "Sonic Sedan"   |
#		| "Chevrolet"  | "Spin"          |
#		| "Chevrolet"  | "Tracker"       |
#		| "Chevrolet"  | "TrailBlazer"   |
#		| "Chevrolet"  | "Vectra"        |
#		| "Chevrolet"  | "Zafira"        |
