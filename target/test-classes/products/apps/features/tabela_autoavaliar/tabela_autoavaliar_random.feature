Feature: Tabela AutoAvaliar

  A Tabela Auto Avaliar FGV é a primeira e única tabela transacional de preços
  para veículos seminovos baseada em valores reais de mercado,
  levando em consideração as características do veículo, região geográfica e muito mais

  Background: Acessar portal da auto avaliar
    Given que acesso o portal da Auto Avaliar
    And seleciono no menu a opcao Tabela Auto Avaliar

  @Integrated @tabelaAutoAvaliarRandom
  Scenario: Validação Aleatória, Author: Isaias Silva, Category: Validar carregamento dos modelos de veiculos conforme a marca selecionada, Environment: Google Chrome
    When escolho a marca aleatória
    Then verifico que o modelo da marca aleatória escolhida são exibidos
    When seleciono um modelo aleatorio
    And clico no botão próximo
    Then verifico e valido que estou no segundo passo
    When seleciono um ano aleatório
    And seleciono uma uf aleatória
    And seleciono uma versao aleatória
    And humanizo o processo do recaptcha

