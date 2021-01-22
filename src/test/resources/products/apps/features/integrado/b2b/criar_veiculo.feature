Feature: Solicitar nova avaliação USBI

  @Integrated @criarVeiculo
  Scenario Outline: Criar veiculo, Author: Felipe Amorim, Category: criar novo veiculo, Environment: Google Chrome
    Given O usuario define os valores do carro <placa> <chassi> <ano> <marca> <modelo> <km> <quatroPorQuatro> <statusQuatroPorQuatro> <motor> <statusCambio> <statusMotor> <compra> <compreja> <minimoOferta> <dataUmaSemanaDepois>
    When O usuario cria um novo veiculo no b2b adm como timeqa usando os arquivos <local>
    Then O usuario valida dados que os dados inseridos no portal admin estao iguais ao portal comum

    Examples:
      | local                                                                  | placa     | chassi    | ano    | marca       | modelo   | km      | quatroPorQuatro | statusQuatroPorQuatro | motor  | statusCambio | statusMotor | compra    | compreja  | minimoOferta | dataUmaSemanaDepois |
      | "C:/Users/isaias.silva/AppData/Local/Google/Chrome/User Data/Default/" | "qwe0005" | "qwe0003" | "2016" | "chevrolet" | "prisma" | "50000" | "nao"           | "n/a"                 | "1000" | "ruim"       | "bom"       | "2000000" | "3500000" | "3000000"    | "sim"               |

