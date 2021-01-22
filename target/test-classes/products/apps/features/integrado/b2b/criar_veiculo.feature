Feature: Solicitar nova avaliação USBI

  @Integrated @criarVeiculo
  Scenario Outline: Criar veiculo, Author: Felipe Amorim, Category: criar novo veiculo, Environment: Google Chrome
    Given O usuario define os valores do carro <placa> <chassi> <ano> <marca> <modelo> <km> <quatroPorQuatro> <statusQuatroPorQuatro> <motor> <statusCambio> <statusMotor> <compra> <compreja> <minimoOferta> <dataUmaSemanaDepois>
    When O usuario cria um novo veiculo no b2b adm como timeqa usando os arquivos <local>
    Then O usuario valida dados que os dados inseridos no portal admin estao iguais ao portal comum



    #Given O usuario navega para portal auto avaliar na url admin
    #When O usuario acessa portal auto avaliar da url admin com usuario qa
    #And O usuario acessa o menu avaliacoes
    #And O usuario acessa opcao veiculos do menu avaliacoes
    #And O usuario clica em novo para adicionar novo veiculo
    #And O usuario preenche o combobox loja para cadastro de novo veiculo
    #And O usuario preenche o campo placa para cadastro de novo veiculo
    #And O Usuario preenche o campo chassi igual a placa para cadastro de novo veiculo
    #And O usuario preenche o combobox tipo para cadastro de novo veiculo com <veiculo>
    #And O usuario preenche os campos ano fab mod para cadastro de novo veiculo com <ano>
    #And O usuario preenche o campo marca para cadastro de novo veiculo com <marca>
    #And O usuario preenche o campo modelo para cadastro de novo veiculo com <modelo>
    #And O usuario preenche o campo versao para cadastro de novo veiculos
    #And O usuario preenche o campo cor para cadastro de novo veiculo
    #And O usuario preenche o campo combustivel para cadastro de novo veiculo
    #And O usuario preenche o campo km para cadastro de novo veiculo com <km>
    #And O usuario preenche o combobox numero de portas para cadastro de novo veiculo
    #And O usuario marca radio button veiculo quatro por quatro com <quatoxquatro>
    #And O usuario preenche o combobox loja fisica para cadastro de novo veiculo com <lojafisica>
    #And O usuario preenche o campo motor para cadastro de novo veiculo com <motor>
    #And O usuario preenche o combobox cambio para cadastro de novo veiculo
    ##And O usuario preenche o combobox loja para cadastro de novo veiculo por index
    #And O usuario acessa form opcionais para cadastro de novo veiculo
    #And O usuario clica em adicionar para primeiro item disponivel no form opcionais
    #And O usuario clica em adicionar para primeiro item disponivel no form opcionais
    #And O usuario clica em adicionar para primeiro item disponivel no form opcionais
    #And O usuario acessa form itens avaliados para cadastro de novo veiculo
    #And O usuario seleciona o estado do cambio para cadastro de novo veiculo como <statusCambio>
    #And O usuario seleciona o estado do motor para cadastro de novo veiculo como <statusMotor>
    #And O usuario acessa form fotos para cadastro de novo veiculo
    #And O usuario adiciona a primeira foto para cadastro de novo veiculo
    #And O usuario adiciona a segunda foto para cadastro de novo veiculo
    #And O usuario adiciona a terceira foto para cadastro de novo veiculo
    #And O usuario acessa form valores para cadastro de novo veiculo
    #And O usuario preenche o campo valor de compra para cadastro de novo veiculo com <vlrCompra>
#
    ##And O usuario clica em carregar fotos para cadastro de novo veiculo
#
    #And O usuario clica em salvar para cadastro de novo veiculo
#
    #And O usuario valida que o veiculo foi cadastrado como status ativo
    #And O usuario clica em editar para veiculo cadastrado
    #And O usuario acessa form criar avalicacao para veiculo cadastrado
#
    #And O usuario salva avaliacao para veiculo cadastrado

    #And O usuario navega para portal auto avaliar na url comum
    #And O usuario acessa portal auto avaliar com usuario qa
    #And O usuario acessa opcao repassar para portal auto avaliar
    #And O usuario realiza busca por veiculo cadastrado por placa

    #And O usuario cria um novo veiculo no b2b adm como timeqa usando os arquivos <local>
    #Then devo acessar o b2b e verificar se o anuncio do veiculo está publicado
#
    ##When O usuario valida o veiculo cadastrado no b2b


    Examples:
      | local                                                                  | placa     | chassi    | ano    | marca       | modelo   | km      | quatroPorQuatro | statusQuatroPorQuatro | motor  | statusCambio | statusMotor | compra    | compreja  | minimoOferta | dataUmaSemanaDepois |
      | "C:/Users/isaias.silva/AppData/Local/Google/Chrome/User Data/Default/" | "qwe0005" | "qwe0003" | "2016" | "chevrolet" | "prisma" | "50000" | "nao"           | "n/a"                 | "1000" | "ruim"       | "bom"       | "2000000" | "3500000" | "3000000"    | "sim"               |



    #Examples:
    #  | local                                                                  | placa     | chassi    | ano    | marca       | modelo   | km      | quatroPorQuatro | statusQuatroPorQuatro | motor  | statusCambio | statusMotor | compra    | compreja  | minimoOferta | dataUmaSemanaDepois | veiculo | quatoxquatro | conservacaoquatoxquatro | observacoes   | lojafisica | origem     | cambio       | vlrCompra |
    #  | "C:/Users/isaias.silva/AppData/Local/Google/Chrome/User Data/Default/" | "qwe0005" | "qwe0003" | "2016" | "chevrolet" | "prisma" | "50000" | "nao"           | "n/a"                 | "1000" | "bom"        | "bom"       | "2000000" | "3500000" | "3000000"    | "sim"               | "Carro" | "nao"        | "bom"                   | "OBSERVACOES" | "Teste"    | "Nacional" | "Automático" | "2000000" |
    ## | "qwe0004" | "qwe0004" | "2015" | "fiat"      | "uno"    | "50000" | "nao"           | "n/a"                 | "1000" | "bom"        | "ruim"      | "2000000" | "3500000" | "3000000"    | "sim"               |