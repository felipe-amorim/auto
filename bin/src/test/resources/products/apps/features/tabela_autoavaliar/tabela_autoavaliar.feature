Feature: Tabela AutoAvaliar

  A Tabela Auto Avaliar FGV é a primeira e única tabela transacional de preços
  para veículos seminovos baseada em valores reais de mercado,
  levando em consideração as características do veículo, região geográfica e muito mais

  @Integrated @tabelaAutoAvaliar
  Scenario Outline: Tabela Auto Avaliar, Author: Isaias Silva, Category: Descobrir Valor Transacional do Veiculo, Environment: Google Chrome
    Given que acesso o portal da Auto Avaliar
    And seleciono a opção <opcao> no menu
    When Escolho a marca <marca>
    Then verifico que o modelo <modelo> da marca <marca> escolhida são exibidos

    Examples:
      | opcao                       | marca       | modelo |
      | Tabela Auto Avaliar         | Chevrolet   | Onix   |
