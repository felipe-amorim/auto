Feature: Solicitar nova avaliação

  @Integrated @solicitarNovaAvaliacaoOutline @SolicitacaoUSBI @Carro
  Scenario Outline: Solicitar Avaliacao, Author: Felipe Amorim, Category: solicitar_nova_avaliacao, Environment: Google Chrome
    Given O usuario realiza uma solicitacao de avaliacao veiculo usbi com usuario vendedor
    When O usuario acessa a avaliacao solicitada pelo usbi no app com usuario "timeqa.apk@autoavaliar.com.br" "timeqa0102" <ano> <km> <marca> <modelo> <statusMotor> <statusCambio> <valorCompra> <valorVenda>
    Then O usuario valida que as alteracoes feitas na avaliacao do carro no app refletiram para usbi

    Examples:
      | ano    | km       | marca        | modelo | statusMotor | statusCambio | valorCompra | valorVenda |
      | "2016" | "120001" | "volkswagen" | "gol"  | "bom"       | "bom"        | "19000"     | "21000"    |

