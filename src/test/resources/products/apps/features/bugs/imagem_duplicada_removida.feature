Feature: Verificar o comportamento do sistema ao subir duas imagens na avaliação com o mesmo nome

  @vendedor @Integrated @verificarImagemDuplicada @bugs @EmConstrução
  Scenario: Verificar a atuação do sistema ao subir duas imagens com o mesmo nome, Author: Marcelo Roland, Category: integrated_verificar_imagem_duplicada-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere o ano do veiculo de interesse como 2018
    And O usuario insere o veiculo "palio"
    And O usuario seleciona o primeiro veiculo da busca
    And O usuario insere uma placa real
    And O usuario insere o renavam
    And O usuario seleciona sim para chave reserva
    And O usuario seleciona sim para manual
    And O usuario clica no botao solicitar

    And O usuario seleciona o veiculo recem avaliado na lista de avaliacoes
    And O usuario clica no botao para adicionar imagem a avaliacao solicitada
    And O usuario clica em selecionar para documento
    And O usuario envia o endereco de uma imagem
    And O usuario clica em selecionar para frente lado diagonal

