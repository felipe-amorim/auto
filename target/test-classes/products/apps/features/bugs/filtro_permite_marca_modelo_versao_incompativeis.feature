Feature: Verificar o comportamento dos filtros marca, modelo e versao permitindo valores incompativeis

  @vendedor @Integrated @buscaFiltroIncompativel @bugs @EmConstrução
  Scenario: Verificar o comportamento dos filtros marca, modelo e versao permitindo valores incompativeis, Author: Marcelo Roland, Category: bugs_marca_modelo_versao_incompativeis, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario expande as opcoes no menu Avaliacoes
    And O usuario clica no botao Avaliacoes dentro do menu expandido
    And O usuario seleciona a versao no filtro de avaliacoes
    And O usuario seleciona o primeiro valor da busca versao
    And O usuario seleciona a marca no filtro de avaliacoes
    And O usuario seleciona o primerio valor da busca marca
    And O usuario seleciona a modelo no filtro de avaliacoes
    And O usuario seleciona o primeiro valor da busca modelo
    And O usuario clica em buscar em avaliacoes
    Then O usuario valida que e possivel buscar com filtros incompativeis
