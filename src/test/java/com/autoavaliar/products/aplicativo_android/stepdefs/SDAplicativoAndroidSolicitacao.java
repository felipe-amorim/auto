package com.autoavaliar.products.aplicativo_android.stepdefs;


import com.autoavaliar.support.tbi.Arduino;
import com.autoavaliar.support.tbi.GeradorPlaca;
import cucumber.api.java.en.*;

import com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidLogin;
import com.autoavaliar.products.apps.stepdefs.ubsi.SDAppsUsbiSolicitarAvaliacao;
import com.autoavaliar.support.CoreAndroid;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import java.util.Calendar;
import java.io.IOException;


import static com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidMain.*;
import static com.autoavaliar.products.aplicativo_android.objetos.AplicativoAndroidSolicitacao.*;
import static com.autoavaliar.products.apps.stepdefs.ubsi.SDAppsUsbiSolicitarAvaliacao.*;


public class SDAplicativoAndroidSolicitacao extends CoreAndroid {

    private static final String[] PORT_NAMES = {
            "/dev/tty.usbmodem", // Mac OS X
            "/dev/usbdev", // Linux
            "/dev/tty", // Linux
            "/dev/serial", // Linux
            "COM3", // Windows
    };
    public static long t = Calendar.getInstance().getTimeInMillis();
    public static String OWNER_ULTIMA = "";
    public static String placa = "";
    public static String ano = "";
    public static String km = "";
    public static String marca = "";
    public static String modelo = "";
    public static String statusMotor = "";
    public static String statusCambio = "";
    public static String valorCompra = "";
    public static String valorVenda = "";
    public static String celular = "";
    public static String telefone = "";
    public static String versao = "";
    public static String cor = "";
    public static String combustivel = "";
    public static String cambio = "";
    public static String procedencia = "";
    public static String portas = "";
    public static String classificacao = "";
    public static String finalidade = "";
    public static int plate = 0;
    public static String sTelefone = String.valueOf(t);
    public static String proprietario = "";
    public static String anoFabricacao = "";
    public static String anoLancamento = "";
    public static String kilometragem = "";
    public static String email = "";
    public static String vendedor = "";
    public static String aplicacao = "";
    public static String segmento = "";
    public static String tracao = "";
    public static String fabricanteMotor = "";
    public static String numeroCiclindros = "";
    public static String numeroMarchas = "";
    public static String tipoCabine = "";
    public static String configuracaoCabine = "";
    public static String distanciaEntreEixosAtual = "";
    public static String distanciaEntreEixosAnterior = "";
    public static String potencia = "";
    public static String estadoMotor = "";
    public static String estadoCambio = "";
    public static String quantidadePortas = "";

    private final Arduino arduino = new Arduino();

    @And("O usuario permite o acesso as fotos do aplicativo")
    public void oUsuarioPermiteOAcessoAsFotosDoAplicativo() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoPermitirFotosButton).click();
    }

    @And("O usuario permite acesso ao microfone do aplicativo")
    public void oUsuarioPermiteAcessoAoMicrofoneDoAplicativo() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoPermitirMicrofoneButton).click();
    }

    @And("O usuario preenche o campo owner")
    public void oUsuarioPreencheOCampoOwner() {
        log().setLocator(aplicativoAndroidSolicitacao);
        OWNER_ULTIMA = "AUTO-" + t;
        proprietario = OWNER_ULTIMA;
        find(aplicativoAndroidSolicitacaoOwnerInput).send().text(OWNER_ULTIMA);
    }

    @And("O usuario preenche o campo telefone")
    public void oUsuarioPreencheOCampoTelefone() {
        log().setLocator(aplicativoAndroidSolicitacao);
        telefone = t + "";
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(telefone);
    }

    @And("O usuario preenche o campo celular")
    public void oUsuarioPreencheOCampoCelular() {
        log().setLocator(aplicativoAndroidSolicitacao);
        celular = t + "";
        celular = celular.substring(0, 11);
        find(aplicativoAndroidSolicitacaoCelularInput).send().text(celular);
    }

    @And("O usuario preenche o campo email")
    public void oUsuarioPreencheOCampoEmail() {
        log().setLocator(aplicativoAndroidSolicitacao);
        email = aplicativoAndroidEmailTeste;
        find(aplicativoAndroidSolicitacaoEmailInput).send().text(aplicativoAndroidEmailTeste);

    }

    @And("O usuario escolhe o vendedor QA")
    public void oUsuarioEscolheOVendedorQA() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoVendedorButton).click();
        find(aplicativoAndroidSolicitacaoVendedorQAButton).click();
        vendedor = find(APLICATIVO_ANDROID_NOME_VENDEDOR_SELECIONADO).get().text().toString();
    }

    @And("O usuario preenche a placa")
    public void oUsuarioPreencheAPlaca() {
        sendPlaca("");
    }

    private void sendPlaca(String placaParam) {
        log().setLocator(aplicativoAndroidSolicitacao);
        if (placaParam.length() <= 0) {
            placa = aplicativoAndroidPlacaTeste;
            find(aplicativoAndroidSolicitacaoPlacaInput).send().text(aplicativoAndroidPlacaTeste);
        } else {
            placa = placaParam;
            find(aplicativoAndroidSolicitacaoPlacaInput).send().text(placa.toUpperCase());
        }
        placa = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
    }

    private void digitarPlaca(){
        placa = GeradorPlaca.gerarPlaca().toUpperCase();
        System.out.println("variavel placa gerada por gerador de placa: " + placa);
        find(aplicativoAndroidSolicitacaoPlacaInput).send().text(placa);
    }

    private void digitarPlacaComVariavelJaPopulada(){
        System.out.println("variavel placa gerada por gerador de placa: " + placa);
        find(aplicativoAndroidSolicitacaoPlacaInput).send().text(placa);
        find(aplicativoAndroidSolicitacaoPlacaBusca).click();
    }

    @And("O usuario arrasta a tela para baixo")
    public void oUsuarioArrastaATelaParaBaixo() {
        scroll().down(1);
        evidence("Evidencia scroll");
    }

    @And("O usuario preenche o ano de fabricacao")
    public void oUsuarioPreencheOAnoDeFabricacao() {
        sendAnoFab("");
    }

    private void sendAnoFab(String anoFab) {
        ano = anoFab;
        anoFabricacao = anoFab;
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoAnoDeFabricacaoButton).click();
        if (anoFab.length() <= 0) {
            anoFabricacao = "2007";
            find(aplicativoAndroidSolicitacaoBuscaInput).send().text(anoFabricacao);
        } else {
            anoFabricacao = anoFab;
            find(aplicativoAndroidSolicitacaoBuscaInput).send().text(anoFab);
        }
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
    }

    @And("O usuario preenche o ano de lancamento")
    public void oUsuarioPreencheOAnoDeLancamento() {
        anoLancamento("");
    }

    private void anoLancamento(String anoLanc) {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoAnoDeLancamentoButton).click();
        if (anoLanc.length() <= 0) {
            anoLancamento = "2007";
            find(aplicativoAndroidSolicitacaoBuscaInput).send().text(anoLancamento);
        } else {
            anoLancamento = anoLanc;
            find(aplicativoAndroidSolicitacaoBuscaInput).send().text(anoLanc);
        }
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();

        //anoLancamento = find(aplicativoAndroidSolicitacaoBuscaInput).get().text().toString();
    }

    @And("O usuario preenche a kilometragem")
    public void oUsuarioPreencheAKilometragem() {
        sendKM("");
    }

    private void sendKM(String kmPar) {
        log().setLocator(aplicativoAndroidSolicitacao);
        km = kmPar;
        if (km.length() <= 0) {
            find(aplicativoAndroidSolicitacaoKilometragemInput).send().text("" + t);
            kilometragem = String.valueOf(t);
        } else {
            find(aplicativoAndroidSolicitacaoKilometragemInput).send().text(km);
            kilometragem = km;
        }

        //kilometragem = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
    }

    @And("O usuario preenche a marca utilizando o filtro por {string}")
    public void oUsuarioPreencheAMarcaUtilizandoOFiltroPor(String arg0) {
        log().setLocator(aplicativoAndroidSolicitacao);
        marca = arg0;
        find(aplicativoAndroidSolicitacaoMarcaButton).click();
        find(aplicativoAndroidSolicitacaoFiltroButton).send().text(marca);
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        marca = find(APLICATIVO_ANDROID_MARCA_VEICULO_SELECIONADA).get().text().toString();
        sleep().until(1000);
    }

    @And("O usuario preenche o modelo utilizando o filtro por {string}")
    public void oUsuarioPreencheOModeloUtilizandoOFiltroPor(String arg0) {
        log().setLocator(aplicativoAndroidSolicitacao);
        modelo = arg0;
        find(aplicativoAndroidSolicitacaoModeloButton).click();
        find(aplicativoAndroidSolicitacaoFiltroButton).send().text(modelo);
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        modelo = find(APLICATIVO_ANDROID_MODELO_VEICULO_SELECIONADO).get().text().toString();
    }

    @And("O usuario preenche o campo versao")
    public void oUsuarioPreencheOCampoVersao() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoVersaoButton).click();
        find(aplicativoAndroidSolicitacaoPrimeiraVersaoButton).click();
        sleep().until(2500);
        versao = find(APLICATIVO_ANDROID_VERSAO_VEICULO_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche o campo cor")
    public void oUsuarioPreencheOCampoCor() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCorButton).click();
        cor = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PRIMEIRA_COR_VEICULO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        System.out.println("variavel cor na camptura: " + cor);
    }

    @And("O usuario preenche o campo cor com segunda opcao")
    public void oUsuarioPreencheOCampoCorComSegundaOpcao() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCorButton).click();
        cor = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_SEGUNDA_COR_VEICULO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_SEGUNDA_COR_VEICULO).click();
        System.out.println("variavel cor na camptura: " + cor);
    }

    @And("O usuario preenche o campo combustivel")
    public void oUsuarioPreencheOCampoCombustivel() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCombustivelButton).click();
        combustivel = find(APLICATIVO_ANDROID_SOLICITACAO_TEXTO_PRIMEIRO_ITEM).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
    }

    @And("O usuario preenche o campo combustivelcom segunda opcao")
    public void oUsuarioPreencheOCampoCombustivelComSegundaOpcao() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCombustivelButton).click();
        combustivel = find(APLICATIVO_ANDROID_SOLICITACAO_TEXTO_SEGUNDO_ITEM).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_TEXTO_SEGUNDO_ITEM).click();
        System.out.println("variavel combustivel: " + combustivel);
    }

    @And("O usuario preenche o campo cambio")
    public void oUsuarioPreencheOCampoCambio() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCambioButton).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        cambio = find(APLICATIVO_ANDROID_TIPO_CAMBIO_VEICULO_SELECIONADO).get().text().toString();
        System.out.println("variavel cambio na criacao: " + cambio);
    }

    @And("O usuario preenche o campo cambio com segunda opcao lista")
    public void oUsuarioPreencheOCampoCambioComSegundaOpcaoLista() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCambioButton).click();
        cambio = find(APLICATIVO_ANDROID_SOLICITACAO_TEXTO_SEGUNDO_ITEM).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_TEXTO_SEGUNDO_ITEM).click();
        //cambio = find(APLICATIVO_ANDROID_TIPO_CAMBIO_VEICULO_SELECIONADO).get().text().toString();
        System.out.println("variavel cambio na criacao: " + cambio);
    }

    @And("O usuario preenche o campo procedencia para carro")
    public void oUsuarioPreencheOCampoProcedenciaParaCarro() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoProcedenciaButton).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        procedencia = find(APLICATIVO_ANDROID_PROCEDENCIA_CARRO_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche o campo procedencia para carro com segunda opcao lista")
    public void oUsuarioPreencheOCampoProcedenciaParaCarroComSegundaOpcaoLista() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoProcedenciaButton).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_TEXTO_SEGUNDO_ITEM).click();
        procedencia = find(APLICATIVO_ANDROID_PROCEDENCIA_CARRO_SELECIONADA).get().text().toString();
        System.out.println("variavel procedencia: " + procedencia);
    }

    @And("O usuario preenche o campo procedencia")
    public void oUsuarioPreencheOCampoProcedencia() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoProcedenciaButton).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        procedencia = find(APLICATIVO_ANDROID_PROCEDENCIA_VEICULO_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche o campo quantidade de portas utilizando o filtro por {string}")
    public void oUsuarioPreencheOCampoQuantidadeDePortasUtilizandoOFiltroPor(String arg0) {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoQuantidadeDePortasButton).click();
        quantidadePortas = arg0;
        find(aplicativoAndroidSolicitacaoFiltroButton).send().text(quantidadePortas);
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        quantidadePortas = find(APLICATIVO_ANDROID_QUANTIDADE_PORTAS).get().text().toString();
        System.out.println("variavel quantidadePortas: " + quantidadePortas);
    }

    @And("O usuario insere quatro fotos de teste")
    public void oUsuarioInsereQuatroFotosDeTeste() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoFotosButton).click();
        //find(aplicativoAndroidSolicitacaoPermitirAcessoFotosButton).click();
        //find(aplicativoAndroidPermitirGravarAudio).click();
        //find(aplicativoAndroidSolicitacaoPermitirAcessoFotosSempreButton).click();
        //find(aplicativoAndroidSolicitacaoLembrarLocalizacaoDeFotosButton).click();
        sleep().until(2000);

        sleep().until(5000);
        //find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        //find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
        find(aplicativoAndroidTirarFoto).click();
        arduino.send('3');
        sleep().until(2000);
        find(aplicativoAndroidTirarFoto).click();
        arduino.send('3');
        //System.out.println("INICIANDO SLEEP");
        sleep().until(2000);
        find(aplicativoAndroidTirarFoto).click();
        arduino.send('3');
        sleep().until(2000);
        find(aplicativoAndroidTirarFoto).click();
        arduino.send('3');
        arduino.killPort();
        sleep().until(2000);

        find(aplicativoAndroidFecharCamera).click();
//
        //find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        //find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
//
        //find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        //find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
//
        //find(aplicativoAndroidSolicitacaoTirarFotoButton).click();
        //find(aplicativoAndroidSolicitacaoEnviarFotoButton).click();
        //androidDriver().back();
        find(aplicativoAndroidSolicitacaoFotosButton).exists();
        evidence("Evidencia de fotos armazenadas");
    }

    @And("O usuario clica em salvar e avancar")
    public void oUsuarioClicaEmSalvarEAvancar() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoSalvarEAvancarButton).click();
        sleep().until(5000);
    }

    @And("O usuario preenche o campo classificacao como A")
    public void oUsuarioPreencheOCampoClassificacaoComoA() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoClassificacaoButton).click();
        find(aplicativoAndroidSolicitacaoClassificacaoAButton).click();
        classificacao = find(APLICATIVO_ANDROID_CLASSIFICACAO_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche o campo classificacao como B")
    public void oUsuarioPreencheOCampoClassificacaoComoB() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoClassificacaoButton).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_BUTTON_CLASSIFICACAO_B).click();
        classificacao = find(APLICATIVO_ANDROID_CLASSIFICACAO_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche o campo finalidade como oferta")
    public void oUsuarioPreencheOCampoFinalidadeComoOferta() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoFinalidadeButton).click();
        find(aplicativoAndroidSolicitacaoFinalidadeShowRoomButton).click();
        finalidade = find(APLICATIVO_ANDROID_FINALIDADE_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche o campo finalidade como repasse")
    public void oUsuarioPreencheOCampoFinalidadeComoRepasse() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoFinalidadeButton).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_BUTTON_FINALIDADE_REPASSE).click();
        finalidade = find(APLICATIVO_ANDROID_FINALIDADE_SELECIONADA).get().text().toString();
    }

    @And("O usuario preenche a segunda tudo como sim e um")
    public void oUsuarioPreencheASegundaTudoComoSimEUm() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoEssaPerguntaEBinariaCheckBox).click();
        find(aplicativoAndroidSolicitacaoEnviarEssaPerguntaEMonetariaTexto).send().text("100");
        find(aplicativoAndroidSolicitacaoEnviarEssaPerguntaENumericaTexto).send().text("1");
        find(aplicativoAndroidSolicitacaoEscolhaPerguntaSelect).click();
        find(aplicativoAndroidSolicitacaoEscolhePrimeiroValorSelect).click();
        find(aplicativoAndroidSolicitacaoEscolhaMultiplasUmCheckbox).click();
        find(aplicativoAndroidSolicitacaoEscolhaMultiplasDoisCheckbox).click();
        find(aplicativoAndroidSolicitacaoEscolhaMultiplasTresCheckbox).click();
        find(aplicativoAndroidSolicitacaoEscolhaMultiplasQuatroCheckbox).click();
        oUsuarioArrastaATelaParaBaixo();
        find(aplicativoAndroidSolicitacaoEssaPerguntaEStringText).send().text("Teste");
        find(aplicativoAndroidSolicitacaoVeiculoPossuiChaveReservaCheckbox).click();
        oUsuarioArrastaATelaParaBaixo();
        find(aplicativoAndroidSolicitacaoPossuiManualDoVeiculoCheckbox).click();
        find(aplicativoAndroidSolicitacaoVeiculoPossuiGarantiaCheckbox).click();
    }

    @And("O usuario preenche os itens pneus motor freios")
    public void oUsuarioPreencheOsItensPneusMotorFreios() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoCarroPneuButton).click();
        find(aplicativoAndroidSolicitacaoCarroEstadoPneuDropDown).click();

        int quantidadeDeOpcoes = convert().getRandomNumber(1, 3);
        switch (quantidadeDeOpcoes) {
            case 1:
                find(aplicativoAndroidSolicitacaoCarroEstadoPneuSelecaoRuimButton).click();
                break;
            case 2:
                find(aplicativoAndroidSolicitacaoCarroEstadoPneuSelecaoBomButton).click();
                break;
            case 3:
                find(aplicativoAndroidSolicitacaoCarroEstadoPneuSelecaoExcelenteButton).click();
                break;
        }
    }

    @And("O usuario clica no card com a placa cadastrada")
    public void oUsuarioClicaNoCardComAPlacaCadastrada() {
        log().setLocator(aplicativoAndroidSolicitacao);
        String placa = find(aplicativoAndroidSolicitacaoVeiculoCardPorPlacaButton).get().text().toString();
        assertThat(placa).isEqualTo(placaVeiculo);
        find(aplicativoAndroidSolicitacaoVeiculoCardPorPlacaButton).click();
    }

    @And("O usuario aceita o popUp de alerta que o veiculo ja foi avaliado")
    public void oUsuarioAceitaOPopUpDeAlertaQueOVeiculoJaFoiAvaliado() {
        log().setLocator(aplicativoAndroidSolicitacao);
        find(aplicativoAndroidSolicitacaoVeiculoVeiculoJaAvaliadoButton).click();

    }

    @And("O usuario espera a avaliacao ser feita")
    public void oUsuarioEsperaAAvaliacaoSerFeita() {
        sleep().until(5000);
        evidence("Validando a ultima tela");//todo melhorar mensagem
    }

    @And("O usuario confere os dados do proprietario")
    public void oUsuarioConfereOsDadosDoProprietario() {
        log().setLocator(aplicativoAndroidSolicitacao);
        assertThat(find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString()).isEqualTo(SDAppsUsbiSolicitarAvaliacao.telefoneCliente);
        assertThat(find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString()).isEqualTo(SDAppsUsbiSolicitarAvaliacao.celularCliente);
        assertThat(find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString()).isEqualTo(SDAppsUsbiSolicitarAvaliacao.email);
        //assertThat(find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString()).isEqualTo(SDAppsUsbiSolicitarAvaliacao.placaVeiculo);
        //assertThat(find(aplicativoAndroidSolicitacaoModeloButton).get().text().toString()).isEqualTo(SDAppsUsbiSolicitarAvaliacao.veiculo);
    }

    @And("O usuario avalia o motor")
    public void oUsuarioAvaliaOMotor() {
        sendAvaliaMotor("");
    }

    private void sendAvaliaMotor(String status) {
        if (status.length() <= 0) {
            log().setLocator(aplicativoAndroidSolicitacao);
            find(aplicativoAndroidSolicitacaoAvaliacaoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
            find(aplicativoAndroidSolicitacaoSalvar).click();
        } else {
            log().setLocator(aplicativoAndroidSolicitacao);
            find(aplicativoAndroidSolicitacaoAvaliacaoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            switch (status.toLowerCase()) {
                case "bom":
                    estadoMotor = "bom";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
                    break;
                case "excelente":
                    estadoMotor = "otimo";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorExcelente).click();
                    break;
                case "ruim":
                    estadoMotor = "ruim";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorRuim).click();
                    break;
            }
            find(aplicativoAndroidSolicitacaoSalvar).click();
        }
    }

    private void  sendAvaliaMotorCarro(String status) {
        if (status.length() <= 0) {
            log().setLocator(aplicativoAndroidSolicitacao);
            //find(aplicativoAndroidSolicitacaoAvaliacaoMotor).click();
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_MOTOR_CARRO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
            find(aplicativoAndroidSolicitacaoSalvar).click();
        } else {
            log().setLocator(aplicativoAndroidSolicitacao);
            //find(aplicativoAndroidSolicitacaoAvaliacaoMotor).click();
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_MOTOR_CARRO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            switch (status.toLowerCase()) {
                case "bom":
                    estadoMotor = "bom";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
                    break;
                case "excelente":
                    estadoMotor = "excelente";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorExcelente).click();
                    break;
                case "ruim":
                    estadoMotor = "ruim";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorRuim).click();
                    break;
            }
            find(aplicativoAndroidSolicitacaoSalvar).click();
        }
    }

    private void  sendAvaliaMotorCaminhao(String status) {
        if (status.length() <= 0) {
            log().setLocator(aplicativoAndroidSolicitacao);
            //find(aplicativoAndroidSolicitacaoAvaliacaoMotor).click();
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_MOTOR_CAMINHAO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
            find(aplicativoAndroidSolicitacaoSalvar).click();
        } else {
            log().setLocator(aplicativoAndroidSolicitacao);
            //find(aplicativoAndroidSolicitacaoAvaliacaoMotor).click();
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_MOTOR_CAMINHAO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            switch (status.toLowerCase()) {
                case "bom":
                    estadoMotor = "bom";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
                    break;
                case "excelente":
                    estadoMotor = "excelente";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorExcelente).click();
                    break;
                case "ruim":
                    estadoMotor = "ruim";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorRuim).click();
                    break;
            }
            find(aplicativoAndroidSolicitacaoSalvar).click();
        }
    }

    @And("O usuario avalia o cambio")
    public void oUsuarioAvaliaOCambio() {
        sendAvaliaCambio("");
    }

    private void sendAvaliaCambio(String status) {
        if (status.length() <= 0) {
            log().setLocator(aplicativoAndroidSolicitacao);
            find(aplicativoAndroidSolicitacaoAvaliacaoCambio).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
            find(aplicativoAndroidSolicitacaoSalvar).click();
        } else {
            log().setLocator(aplicativoAndroidSolicitacao);
            find(aplicativoAndroidSolicitacaoAvaliacaoCambio).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            switch (status.toLowerCase()) {
                case "bom":
                    estadoCambio = "bom";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
                    break;
                case "otimo":
                    estadoCambio = "otimo";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorExcelente).click();
                    break;
                case "ruim":
                    estadoCambio = "ruim";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorRuim).click();
                    break;
            }
            find(aplicativoAndroidSolicitacaoSalvar).click();
        }
    }

    private void sendAvaliaCambioCarro(String status) {
        if (status.length() <= 0) {
            log().setLocator(aplicativoAndroidSolicitacao);
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_CAMBIO_CARRO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
            find(aplicativoAndroidSolicitacaoSalvar).click();
        } else {
            log().setLocator(aplicativoAndroidSolicitacao);
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_CAMBIO_CARRO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            switch (status.toLowerCase()) {
                case "bom":
                    estadoCambio = "bom";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
                    break;
                case "excelente":
                    estadoCambio = "excelente";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorExcelente).click();
                    break;
                case "ruim":
                    estadoCambio = "ruim";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorRuim).click();
                    break;
            }
            find(aplicativoAndroidSolicitacaoSalvar).click();
        }
    }

    private void sendAvaliaCambioCaminhao(String status) {
        if (status.length() <= 0) {
            log().setLocator(aplicativoAndroidSolicitacao);
            //find(aplicativoAndroidSolicitacaoAvaliacaoCambio).click();
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_CAMBIO_CAMINHAO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
            find(aplicativoAndroidSolicitacaoSalvar).click();
        } else {
            log().setLocator(aplicativoAndroidSolicitacao);
            //find(aplicativoAndroidSolicitacaoAvaliacaoCambio).click();
            find(APLICATIVO_ANDROID_SOLICITACAO_AVALIACAO_CAMBIO_CAMINHAO).click();
            find(aplicativoAndroidSolicitacaoEstadoDoMotor).click();
            switch (status.toLowerCase()) {
                case "bom":
                    estadoCambio = "bom";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorBom).click();
                    break;
                case "excelente":
                    estadoCambio = "excelente";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorExcelente).click();
                    break;
                case "ruim":
                    estadoCambio = "ruim";
                    find(aplicativoAndroidSolicitacaoEstadoDoMotorRuim).click();
                    break;
            }
            find(aplicativoAndroidSolicitacaoSalvar).click();
        }
    }

    @And("O usuario preenche o campo valor compra")
    public void oUsuarioPreencheOCampoValorCompra() {
        sendCampoValor("");
    }

    private void sendCampoValor(String valor) {
        log().setLocator(aplicativoAndroidSolicitacao);
        if (valor.length() <= 0) {
            valorCompra = "11000";
            find(aplicativoAndroidSolicitacaoValorCompra).send().text(valorCompra);
        } else {
            valorCompra = valor;
            find(aplicativoAndroidSolicitacaoValorCompra).send().text(valor);
        }
    }

    @And("O usuario preenche o campo valor venda")
    public void oUsuarioPreencheOCampoValorVenda() {
        sendCampoVenda("");
    }

    private void sendCampoVenda(String valor) {
        log().setLocator(aplicativoAndroidSolicitacao);
        if (valor.length() <= 0) {
            valorVenda = "15000";
            find(aplicativoAndroidSolicitacaoValorVenda).send().text(valorVenda);
        } else {
            valorVenda = valor;
            find(aplicativoAndroidSolicitacaoValorVenda).send().text(valor);
        }
    }

    @Given("O usuario realiza uma nova solicitacao com os campos {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioRealizaUmaNovaSolicitacaoComOsCamposPlacaAnoMarcaModeloKmStatusCambioStatusMotorValorCompraValorVenda(String arg0,
                                                                                                                              String arg1,
                                                                                                                              String arg2,
                                                                                                                              String arg3,
                                                                                                                              String arg4,
                                                                                                                              String arg5,
                                                                                                                              String arg6,
                                                                                                                              String arg7,
                                                                                                                              String arg8,
                                                                                                                              String arg9,
                                                                                                                              String arg10
    ) throws IOException, InterruptedException {


        SDAplicativoAndroidLogin login = new SDAplicativoAndroidLogin();
        SDAplicativoAndroidMain main = new SDAplicativoAndroidMain();

        login.oUsuarioAbreOAplicativoComODispositivoEVersaoDoOS("device ", "10");


        login.oUsuarioAcessaOMenuBrasil();
        find(AplicativoAndroidLogin.aplicativoAndroidLoginEmailInput).send().text(arg0);
        find(AplicativoAndroidLogin.aplicativoAndroidLoginSenhaInput).send().text(arg1);
        login.oUsuarioClicaEmEntrar();
        find(aplicativoAndroidMenuPrincipal).click();
        find(aplicativoAndroidMenuPrincipalConfiguracoes).click();
        find(aplicativoAndroidSwitchCameraCustomizada).click();
        find(aplicativoAndroidMenuPrincipal).click();
        find(aplicativoAndroidMenuPrincipalAvaliacoes).click();
        main.oUsuarioClicaEmMais();
        main.oUsuarioClicaNoMenuCarro();
        //find(aplicativoAndroidPermitirGravarAudio).click();
        //find(aplicativoAndroidPermitirGravarAudio).click();
        oUsuarioPermiteOAcessoAsFotosDoAplicativo();
        oUsuarioPermiteAcessoAoMicrofoneDoAplicativo();

        oUsuarioPreencheOCampoOwner();
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text("" + t);
        oUsuarioPreencheOCampoCelular();
        oUsuarioPreencheOCampoEmail();
        oUsuarioEscolheOVendedorQA();
        oUsuarioArrastaATelaParaBaixo();
        sendPlaca(arg2);
        sleep().until(3000);

        //find(aplicativoAndroidSolicitacaoPlacaBusca).click();
        //find(aplicativoAndroidSolicitacaoPlacaInput).click();
        sleep().until(2000);
        //androidDriver().enter();

        //sleep().until(2000);
        //sleep().until(30000);
        oUsuarioArrastaATelaParaBaixo();
        //oUsuarioPreencheOAnoDeFabricacao();
        sendAnoFab(arg3);
        anoLancamento(arg3);
        oUsuarioArrastaATelaParaBaixo();
        sendKM(arg4);
        //oUsuarioArrastaATelaParaBaixo();
        //oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg5);
        sleep().until(2000);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg6);
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoVersao();
        oUsuarioPreencheOCampoCor();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoCombustivel();
        oUsuarioPreencheOCampoCambio();
        oUsuarioPreencheOCampoProcedencia();
        oUsuarioPreencheOCampoQuantidadeDePortasUtilizandoOFiltroPor("4");
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioInsereQuatroFotosDeTeste();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotor(arg7);
        sendAvaliaCambio(arg8);
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        //sleep().until(10000);
        evidence("evidence");

        oUsuarioPreencheOCampoClassificacaoComoA();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sendCampoValor(arg9);
        sendCampoVenda(arg10);
        oUsuarioClicaEmSalvarEAvancar();
        //main.oUsuarioClicaEmMais();
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        //find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS.replace("arg0", "CLIENTE: "+OWNER_ULTIMA)).click();
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo("CLIENTE: " + OWNER_ULTIMA);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();

        sleep().until(5000);
    }

    @When("O usuario realiza uma nova solicitacao para carro {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioRealizaUmaNovaSolicitacaoPlacaAnoKmMarcaModeloStatusMotorStatusCambioValorCompraValorVenda(String arg2,
                                                                                                                   String arg3,
                                                                                                                   String arg4,
                                                                                                                   String arg5,
                                                                                                                   String arg6,
                                                                                                                   String arg7,
                                                                                                                   String arg8,
                                                                                                                   String arg9,
                                                                                                                   String arg10) {


        SDAplicativoAndroidMain main = new SDAplicativoAndroidMain();
        main.oUsuarioClicaEmMais();
        main.oUsuarioClicaNoMenuCarro();
        oUsuarioPreencheOCampoOwner();
        sTelefone = String.valueOf(t);
        sTelefone = sTelefone.substring(0,10);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(sTelefone);
        oUsuarioPreencheOCampoCelular();
        oUsuarioPreencheOCampoEmail();
        oUsuarioEscolheOVendedorQA();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        //sendPlaca(arg2);
        digitarPlaca();
        sendAnoFab(arg3);
        anoLancamento(arg3);
        oUsuarioArrastaATelaParaBaixo();
        sendKM(arg4);
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg5);
        //sleep().until(2000);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg6);
        //sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoVersao();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoCor();
        oUsuarioPreencheOCampoCombustivel();
        oUsuarioPreencheOCampoCambio();
        oUsuarioPreencheOCampoProcedenciaParaCarro();
        oUsuarioPreencheOCampoQuantidadeDePortasUtilizandoOFiltroPor("4");
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioInsereQuatroFotosDeTeste();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotorCarro(arg7);
        sendAvaliaCambioCarro(arg8);
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        evidence("evidence");
        oUsuarioPreencheOCampoClassificacaoComoA();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sendCampoValor(arg9);
        sendCampoVenda(arg10);
        oUsuarioClicaEmSalvarEAvancar();
        sleep().until(5000);
        //evidence("evidence");
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @Then("O usuario valida que a solicitacao foi realizada")
    public void oUsuarioValidaQueASolicitacaoFoiRealizada() {
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo("CLIENTE: " + OWNER_ULTIMA);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();

        String actualOwner = find(aplicativoAndroidSolicitacaoOwnerInput).get().text().toString();
        evidence("Validando o nome do owner");
        assertThat(actualOwner).isEqualTo(OWNER_ULTIMA);

        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text("" + t);

        StringBuilder mascaraCelular = new StringBuilder();
        for (int i = 0; i < celular.length(); i++) {
            if (mascaraCelular.toString().length() == 13) {
                break;
            }
            if (i == 0) {
                mascaraCelular.append("(");
            } else if (i == 2) {
                mascaraCelular.append(") ");
            }
            mascaraCelular.append(celular.charAt(i));
        }
        String actualCel = find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString();
        evidence("Validando o celular");
        assertThat(actualCel).isEqualTo(mascaraCelular.toString());

        StringBuilder mascaraTelefone = new StringBuilder();
        for (int i = 0; i < celular.length(); i++) {
            if (mascaraTelefone.toString().length() == 11) {
                break;
            }
            if (i == 0) {
                mascaraTelefone.append("(");
            } else if (i == 2) {
                mascaraTelefone.append(") ");
            }
            mascaraTelefone.append(celular.charAt(i));
        }
        String actualTel = find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString();
        evidence("Validando o telefone");
        assertThat(actualTel).isEqualTo(mascaraTelefone.toString());

        String actualEmail = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        evidence("Validando o email");
        assertThat(actualEmail).isEqualTo(aplicativoAndroidEmailTeste);

        oUsuarioArrastaATelaParaBaixo();

        String actualPlaca = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
        evidence("Validando a placa");
        assertThat(actualPlaca).isEqualTo(placa);

        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();

        String actualAnoFab = find(aplicativoAndroidSolicitacaoAnoDeFabricacaoText).get().text().toString();
        evidence("Validando o ano de fabricacao");
        assertThat(actualAnoFab).isEqualTo(ano);

        String actualAnoLanc = find(aplicativoAndroidSolicitacaoAnoDeLancamentoText).get().text().toString();
        evidence("Validando o ano de lancamento");
        assertThat(actualAnoLanc).isEqualTo(ano);

        oUsuarioArrastaATelaParaBaixo();
        String actualKm = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
        evidence("Validando a kilometragem");
        assertThat(actualKm).isEqualTo(km);

        String actualMarca = find(aplicativoAndroidSolicitacaoMarcaText).get().text().toString();
        evidence("Validando a marca");
        assertThat(actualMarca).isEqualTo(marca.toUpperCase());

        String actualModelo = find(aplicativoAndroidSolicitacaoModeloTexto).get().text().toString();
        evidence("Validando o modelo");
        assertThat(actualModelo).isEqualTo(modelo.toUpperCase());

        oUsuarioArrastaATelaParaBaixo();

        String actualVersao = find(aplicativoAndroidSolicitacaoVersaoText).get().text().toString();
        evidence("Validando a versao");
        assertThat(actualVersao).isEqualTo(versao.toUpperCase());

        String actualCor = find(aplicativoAndroidSolicitacaoCorText).get().text().toString();
        evidence("Validando a cor");
        assertThat(actualCor).isEqualTo(cor.toUpperCase());

        //oUsuarioArrastaATelaParaBaixo();

        //String actualCombustivel = find(aplicativoAndroidSolicitacaoCombustivelText).get().text().toString();
        //evidence("Validando o combustivel");
        //assertThat(actualCombustivel).isEqualTo(combustivel.toUpperCase());

        //String actualCambio = find(aplicativoAndroidSolicitacaoCambioText).get().text().toString();
        //evidence("Validando o cambio");
        //assertThat(actualCambio).isEqualTo(cambio.toUpperCase());

        //String actualProcedencia = find(aplicativoAndroidSolicitacaoProcedenciaText).get().text().toString();
        //evidence("Validando a procedencia");
        //assertThat(actualProcedencia).isEqualTo(procedencia.toUpperCase());
//
        ////terminar de trocar os xpaths de texto pelo botao de volta e incluir novos para os textos
        //String actualPortas = find(aplicativoAndroidSolicitacaoQuantidadeDePortasText).get().text().toString();
        //evidence("Validando as portas");
        //assertThat(actualPortas).isEqualTo(portas.toUpperCase());

        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        //oUsuarioInsereQuatroFotosDeTeste(); ver na url + contador
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();

        String actualStatusMotor = find(aplicativoAndroidSolicitacaoStatusAvaliacaoMotor).get().text().toString();
        evidence("Validando o status do motor");
        assertThat(actualStatusMotor).isEqualTo(statusMotor.toUpperCase());

        String actualStatusCambio = find(aplicativoAndroidSolicitacaoStatusAvaliacaoCambio).get().text().toString();
        evidence("Validando o status do cambio");
        assertThat(actualStatusCambio).isEqualTo(statusCambio.toUpperCase());

        oUsuarioClicaEmSalvarEAvancar();
        evidence("evidence");

        //String actualClassificacao = find(aplicativoAndroidSolicitacaoClassificacaoButton).get().text().toString();
        //evidence("Validando a classificacao");
        //assertThat(actualClassificacao).isEqualTo(classificacao);

        //String actualFinalidade = find(aplicativoAndroidSolicitacaoFinalidadeButton).get().text().toString();
        //evidence("Validando a finalidade");
        //assertThat(actualFinalidade).isEqualTo(finalidade);

        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();

        String actualValor = find(aplicativoAndroidSolicitacaoValorCompra).get().text().toString();
        StringBuilder actualValorHold = new StringBuilder();
        StringBuilder actualValorMascara = new StringBuilder();
        actualValorHold.append(valorCompra).reverse();

        for (int i = 0; i < actualValorHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualValorMascara.append(".");
            }
            actualValorMascara.append(actualValorHold.toString().charAt(i));
        }
        evidence("Validando o valor de compra");
        assertThat(actualValor).isEqualTo(actualValorMascara.reverse().toString());

        String actualVenda = find(aplicativoAndroidSolicitacaoValorVenda).get().text().toString();
        StringBuilder actualVendaHold = new StringBuilder();
        StringBuilder actualVendaMascara = new StringBuilder();
        actualVendaHold.append(valorVenda).reverse();

        for (int i = 0; i < actualVendaHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualVendaMascara.append(".");
            }
            actualVendaMascara.append(actualVendaHold.toString().charAt(i));
        }
        evidence("Validando o valor de venda");
        assertThat(actualVenda).isEqualTo(actualVendaMascara.reverse().toString());

        oUsuarioClicaEmSalvarEAvancar();
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @And("O usuario realiza modificacoes {string}")
    public void oUsuarioRealizaModificacoesKm(String arg0) {
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        oUsuarioArrastaATelaParaBaixo();
        km = arg0;
        sendKM(arg0);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioClicaEmSalvarEAvancar();
        sleep().until(3000);
        oUsuarioClicaEmSalvarEAvancar();

        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @Then("O usuario valida que as modificacoes foram realizadas")
    public void oUsuarioValidaQueAsModificacoesForamRealizadas() {
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        oUsuarioArrastaATelaParaBaixo();
        String actualKm = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
        assertThat(actualKm).isEqualTo(km);
    }

    @When("O usuario realiza uma nova solicitacao para moto {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioRealizaUmaNovaSolicitacaoParaMotoPlacaAnoKmMarcaModeloStatusMotorStatusCambioValorCompraValorVenda(String arg2,
                                                                                                                           String arg3,
                                                                                                                           String arg4,
                                                                                                                           String arg5,
                                                                                                                           String arg6,
                                                                                                                           String arg7,
                                                                                                                           String arg8,
                                                                                                                           String arg9,
                                                                                                                           String arg10) {
        SDAplicativoAndroidMain main = new SDAplicativoAndroidMain();
        main.oUsuarioClicaEmMais();
        main.oUsuarioClicaNoMenuMoto();
        oUsuarioPreencheOCampoOwner();
        sTelefone = String.valueOf(t);
        sTelefone = sTelefone.substring(0,10);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(sTelefone);
        oUsuarioPreencheOCampoCelular();
        oUsuarioPreencheOCampoEmail();
        oUsuarioEscolheOVendedorQA();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        //sendPlaca(arg2);
        digitarPlaca();
        sendAnoFab(arg3);
        anoLancamento(arg3);
        sendKM(arg4);
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg5);
        //sleep().until(2000);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg6);
        //sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoVersao();
        oUsuarioPreencheOCampoCor();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoCombustivel();
        oUsuarioPreencheOCampoCambio();
        oUsuarioPreencheOCampoProcedencia();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioInsereQuatroFotosDeTeste();
        oUsuarioArrastaATelaParaBaixo();
        //sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        //sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        //sendAvaliaMotor(arg7);
        sendAvaliaMotorCarro(arg7);
        //sendAvaliaCambio(arg8);
        //sendAvaliaCambioCarro(arg8);
        oUsuarioClicaEmSalvarEAvancar();
        evidence("evidence");
        oUsuarioPreencheOCampoClassificacaoComoA();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sendCampoValor(arg9);
        sendCampoVenda(arg10);
        oUsuarioClicaEmSalvarEAvancar();
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @When("O usuario realiza uma nova solicitacao para caminhao {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioRealizaUmaNovaSolicitacaoParaCaminhaoPlacaAnoKmMarcaModeloStatusMotorStatusCambioValorCompraValorVenda(String arg2,
                                                                                                                               String arg3,
                                                                                                                               String arg4,
                                                                                                                               String arg5,
                                                                                                                               String arg6,
                                                                                                                               String arg7,
                                                                                                                               String arg8,
                                                                                                                               String arg9,
                                                                                                                               String arg10) {
        SDAplicativoAndroidMain main = new SDAplicativoAndroidMain();
        main.oUsuarioClicaEmMais();
        main.oUsuarioClicaNoMenuCaminhao();
        oUsuarioPreencheOCampoOwner();
        sTelefone = sTelefone.substring(0,10);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text("" + sTelefone);
        oUsuarioPreencheOCampoCelular();
        oUsuarioPreencheOCampoEmail();
        oUsuarioEscolheOVendedorQA();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        //sendPlaca(arg2);
        digitarPlaca();
        sendAnoFab(arg3);
        anoLancamento(arg3);
        sendKM(arg4);
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg5);
        sleep().until(2000);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg6);
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoVersao();
        oUsuarioPreencheOCampoCor();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoCombustivel();
        oUsuarioPreencheOCampoCambio();
        oUsuarioPreencheOCampoProcedencia();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        find(APLICATIVO_ANDROID_SOLICITACAO_APLICACAO).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        aplicacao = find(APLICATIVO_ANDROID_APLICACAO_SELECIONADA).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUIMENTO).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        segmento = find(APLICATIVO_ANDROID_SEGMENTO_SELECIONADO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_TRACAO).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        tracao = find(APLICATIVO_ANDROID_TRACAO_SELECIONADO).get().text().toString();
        System.out.println("variavel tracao: " + tracao);
        find(APLICATIVO_ANDROID_SOLICITACAO_FABRICANTE_MOTOR).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        fabricanteMotor = find(APLICATIVO_ANDROID_FABRICANTE_MOTOR_SELECIONADO).get().text().toString();
        System.out.println("variavel fabricanteMotor: " + fabricanteMotor);
        find(APLICATIVO_ANDROID_SOLICITACAO_NUMERO_CILINDOS).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        numeroCiclindros = find(APLICATIVO_ANDROID_NUMERO_CILINDROS_SELECIONADO).get().text().toString();
        System.out.println("variavel numeroCiclindros: " + numeroCiclindros);
        find(APLICATIVO_ANDROID_SOLICITACAO_NUMERO_MARCHAS).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        numeroMarchas = find(APLICATIVO_ANDROID_NUMERO_MARCHAS_SELECIONADO).get().text().toString();
        System.out.println("variavel numeroMarchas: " + numeroMarchas);
        oUsuarioArrastaATelaParaBaixo();
        find(APLICATIVO_ANDROID_SOLICITACAO_TIPO_CABINE).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        tipoCabine = find(APLICATIVO_ANDROID_TIPO_CABINE_SELECIONADA).get().text().toString();
        System.out.println("variavel tipoCabine: " + tipoCabine);
        find(APLICATIVO_ANDROID_SOLICITACAO_CONFIGURACAO_CABINE).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_PRIMEIRO_ITEM).click();
        configuracaoCabine = find(APLICATIVO_ANDROID_CONFIGURACAO_CABINE_SELECIONADA).get().text().toString();
        System.out.println("varaivel configuracaoCabine: " + configuracaoCabine);
        distanciaEntreEixosAtual = "1000";
        find(APLICATIVO_ANDROID_SOLICITACAO_DISTANCIA_ENTRE_EIXOS_ATUAL).send().text(distanciaEntreEixosAtual);
        distanciaEntreEixosAnterior = "1000";
        find(APLICATIVO_ANDROID_SOLICITACAO_DISTANCIA_ENTRE_EIXOS_ANTERIOR).send().text(distanciaEntreEixosAnterior);
        potencia = "400";
        find(APLICATIVO_ANDROID_SOLICITACAO_POTENCIA).send().text(potencia);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioInsereQuatroFotosDeTeste();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotorCaminhao(arg7);
        sendAvaliaCambioCaminhao(arg8);
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        evidence("evidence");
        oUsuarioPreencheOCampoClassificacaoComoA();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sendCampoValor(arg9);
        sendCampoVenda(arg10);
        oUsuarioClicaEmSalvarEAvancar();
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @Then("O usuario valida que a solicitacao foi realizada com sucesso")
    public void oUsuarioValidaQueASolicitacaoFoiRealizadaComSucesso() {
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo("CLIENTE: " + OWNER_ULTIMA);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        String actualOwner = find(aplicativoAndroidSolicitacaoOwnerInput).get().text().toString();
        evidence("Validando o nome do owner");
        assertThat(actualOwner).isEqualTo(OWNER_ULTIMA);
        String actualTel = find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString();
        evidence("Validando o telefone");
        actualTel = actualTel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualTel).isEqualTo(sTelefone);
        String actualCel = find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString();
        evidence("Validando o celular");
        actualCel = actualCel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualCel).isEqualTo(celular);
        String actualEmail = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        evidence("Validando o email");
        assertThat(actualEmail).isEqualTo(aplicativoAndroidEmailTeste);
        oUsuarioArrastaATelaParaBaixo();
        String actualPlaca = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
        evidence("Validando a placa");
        assertThat(actualPlaca).isEqualTo(placa);
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        String actualAnoFab = find(aplicativoAndroidSolicitacaoAnoDeFabricacaoText).get().text().toString();
        evidence("Validando o ano de fabricacao");
        assertThat(actualAnoFab).isEqualTo(ano);
        String actualAnoLanc = find(aplicativoAndroidSolicitacaoAnoDeLancamentoText).get().text().toString();
        evidence("Validando o ano de lancamento");
        assertThat(actualAnoLanc).isEqualTo(ano);
        oUsuarioArrastaATelaParaBaixo();
        String actualKm = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
        evidence("Validando a kilometragem");
        assertThat(actualKm).isEqualTo(km);
        String actualMarca = find(aplicativoAndroidSolicitacaoMarcaText).get().text().toString();
        evidence("Validando a marca");
        assertThat(actualMarca).isEqualTo(marca.toUpperCase());
        String actualModelo = find(aplicativoAndroidSolicitacaoModeloTexto).get().text().toString();
        evidence("Validando o modelo");
        assertThat(actualModelo).isEqualTo(modelo.toUpperCase());
        oUsuarioArrastaATelaParaBaixo();
        String actualVersao = find(aplicativoAndroidSolicitacaoVersaoText).get().text().toString();
        evidence("Validando a versao");
        assertThat(actualVersao).isEqualTo(versao.toUpperCase());
        String actualCor = find(aplicativoAndroidSolicitacaoCorText).get().text().toString();
        evidence("Validando a cor");
        assertThat(actualCor).isEqualTo(cor.toUpperCase());
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        String actualStatusMotor = find(aplicativoAndroidSolicitacaoStatusAvaliacaoMotor).get().text().toString();
        evidence("Validando o status do motor");
        assertThat(actualStatusMotor).isEqualTo(estadoMotor.toUpperCase());
        String actualStatusCambio = find(aplicativoAndroidSolicitacaoStatusAvaliacaoCambio).get().text().toString();
        evidence("Validando o status do cambio");
        assertThat(actualStatusCambio).isEqualTo(estadoCambio.toUpperCase());
        oUsuarioClicaEmSalvarEAvancar();
        evidence("evidence");
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        String actualValor = find(aplicativoAndroidSolicitacaoValorCompra).get().text().toString();
        StringBuilder actualValorHold = new StringBuilder();
        StringBuilder actualValorMascara = new StringBuilder();
        actualValorHold.append(valorCompra).reverse();

        for (int i = 0; i < actualValorHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualValorMascara.append(".");
            }
            actualValorMascara.append(actualValorHold.toString().charAt(i));
        }
        evidence("Validando o valor de compra");
        assertThat(actualValor).isEqualTo(actualValorMascara.reverse().toString());
        String actualVenda = find(aplicativoAndroidSolicitacaoValorVenda).get().text().toString();
        StringBuilder actualVendaHold = new StringBuilder();
        StringBuilder actualVendaMascara = new StringBuilder();
        actualVendaHold.append(valorVenda).reverse();
        for (int i = 0; i < actualVendaHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualVendaMascara.append(".");
            }
            actualVendaMascara.append(actualVendaHold.toString().charAt(i));
        }
        evidence("Validando o valor de venda");
        assertThat(actualVenda).isEqualTo(actualVendaMascara.reverse().toString());
        oUsuarioClicaEmSalvarEAvancar();
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @Then("O usuario valida que a solicitacao foi realizada para caminhao")
    public void oUsuarioValidaQueASolicitacaoFoiRealizadaParaCaminhao() {
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo("CLIENTE: " + OWNER_ULTIMA);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        String actualOwner = find(aplicativoAndroidSolicitacaoOwnerInput).get().text().toString();
        evidence("Validando o nome do owner");
        assertThat(actualOwner).isEqualTo(OWNER_ULTIMA);
        String actualTel = find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString();
        evidence("Validando o telefone");
        actualTel = actualTel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualTel).isEqualTo(sTelefone);
        String actualCel = find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString();
        evidence("Validando o celular");
        actualCel = actualCel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualCel).isEqualTo(celular);
        String actualEmail = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        evidence("Validando o email");
        assertThat(actualEmail).isEqualTo(aplicativoAndroidEmailTeste);
        oUsuarioArrastaATelaParaBaixo();
        String actualPlaca = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
        evidence("Validando a placa");
        assertThat(actualPlaca).isEqualTo(placa);
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        String actualAnoFab = find(aplicativoAndroidSolicitacaoAnoDeFabricacaoText).get().text().toString();
        evidence("Validando o ano de fabricacao");
        assertThat(actualAnoFab).isEqualTo(ano);
        String actualAnoLanc = find(aplicativoAndroidSolicitacaoAnoDeLancamentoText).get().text().toString();
        evidence("Validando o ano de lancamento");
        assertThat(actualAnoLanc).isEqualTo(ano);
        oUsuarioArrastaATelaParaBaixo();
        String actualKm = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
        evidence("Validando a kilometragem");
        assertThat(actualKm).isEqualTo(km);
        String actualMarca = find(aplicativoAndroidSolicitacaoMarcaText).get().text().toString();
        evidence("Validando a marca");
        assertThat(actualMarca).isEqualTo(marca.toUpperCase());
        String actualModelo = find(aplicativoAndroidSolicitacaoModeloTexto).get().text().toString();
        evidence("Validando o modelo");
        assertThat(actualModelo).isEqualTo(modelo.toUpperCase());
        oUsuarioArrastaATelaParaBaixo();
        String actualVersao = find(aplicativoAndroidSolicitacaoVersaoText).get().text().toString();
        evidence("Validando a versao");
        assertThat(actualVersao).isEqualTo(versao.toUpperCase());
        String actualCor = find(aplicativoAndroidSolicitacaoCorText).get().text().toString();
        evidence("Validando a cor");
        assertThat(actualCor).isEqualTo(cor.toUpperCase());
        String sCombustivel = find(APLICATIVO_ANDROID_COMBUSTIVEL_VEICULO_SELECIONADO).get().text().toString();
        assertThat(sCombustivel).isEqualTo(combustivel);
        String sTipoCambio = find(APLICATIVO_ANDROID_TIPO_CAMBIO_VEICULO_SELECIONADO).get().text().toString();
        assertThat(sTipoCambio).isEqualTo(cambio);
        String sProcedencia = find(APLICATIVO_ANDROID_PROCEDENCIA_VEICULO_SELECIONADA).get().text().toString();
        assertThat(sProcedencia).isEqualTo(procedencia);
        String sAplicacao = find(APLICATIVO_ANDROID_APLICACAO_SELECIONADA).get().text().toString();
        assertThat(sAplicacao).isEqualTo(aplicacao);
        String sSegmento = find(APLICATIVO_ANDROID_SEGMENTO_SELECIONADO).get().text().toString();
        assertThat(sSegmento).isEqualTo(segmento);
        String sTracao = find(APLICATIVO_ANDROID_TRACAO_SELECIONADO).get().text().toString();
        assertThat(sTracao).isEqualTo(tracao);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        String sFabricanteMotor = find(APLICATIVO_ANDROID_FABRICANTE_MOTOR_SELECIONADO).get().text().toString();
        assertThat(sFabricanteMotor).isEqualTo(fabricanteMotor);
        String sNumeroCilindros = find(APLICATIVO_ANDROID_NUMERO_CILINDROS_SELECIONADO).get().text().toString();
        assertThat(sNumeroCilindros).isEqualTo(numeroCiclindros);
        String sNumeroMarchas = find(APLICATIVO_ANDROID_NUMERO_MARCHAS_SELECIONADO).get().text().toString();
        assertThat(sNumeroMarchas).isEqualTo(numeroMarchas);
        String sTipoCabine = find(APLICATIVO_ANDROID_TIPO_CABINE_SELECIONADA).get().text().toString();
        assertThat(sTipoCabine).isEqualTo(tipoCabine);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        String sConfiguracaoCabine = find(APLICATIVO_ANDROID_CONFIGURACAO_CABINE_SELECIONADA).get().text().toString();
        assertThat(sConfiguracaoCabine).isEqualTo(configuracaoCabine);
        String sDistanciaEntreEixosAtual = find(APLICATIVO_ANDROID_SOLICITACAO_DISTANCIA_ENTRE_EIXOS_ATUAL).get().text().toString();
        assertThat(sDistanciaEntreEixosAtual).isEqualTo(distanciaEntreEixosAtual);
        String sDistanciaEntreEixosAnterior = find(APLICATIVO_ANDROID_SOLICITACAO_DISTANCIA_ENTRE_EIXOS_ANTERIOR).get().text().toString();
        assertThat(sDistanciaEntreEixosAnterior).isEqualTo(distanciaEntreEixosAnterior);
        String sPotencia = find(APLICATIVO_ANDROID_SOLICITACAO_POTENCIA).get().text().toString();
        assertThat(sPotencia).isEqualTo(potencia);
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        //String actualStatusMotor = find(aplicativoAndroidSolicitacaoStatusAvaliacaoMotor).get().text().toString();
        String actualStatusMotor = find(APLICATIVO_ANDROID_SOLICITACAO_STATUS_AVALIACAO_MOTOR).get().text().toString();
        evidence("Validando o status do motor");
        assertThat(actualStatusMotor).isEqualTo(estadoMotor.toUpperCase());
        //String actualStatusCambio = find(aplicativoAndroidSolicitacaoStatusAvaliacaoCambio).get().text().toString();
        String actualStatusCambio = find(APLICATIVO_ANDROID_SOLICITACAO_STATUS_AVALIACAO_CAMBIO).get().text().toString();
        evidence("Validando o status do cambio");
        assertThat(actualStatusCambio).isEqualTo(estadoCambio.toUpperCase());
        oUsuarioClicaEmSalvarEAvancar();
        String sClassificacao = find(APLICATIVO_ANDROID_CLASSIFICACAO_SELECIONADA).get().text().toString();
        assertThat(sClassificacao).isEqualTo(classificacao);
        String sFinalidade = find(APLICATIVO_ANDROID_FINALIDADE_SELECIONADA).get().text().toString();
        assertThat(sFinalidade).isEqualTo(finalidade);
        String actualValor = find(aplicativoAndroidSolicitacaoValorCompra).get().text().toString();
        StringBuilder actualValorHold = new StringBuilder();
        StringBuilder actualValorMascara = new StringBuilder();
        actualValorHold.append(valorCompra).reverse();
        for (int i = 0; i < actualValorHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualValorMascara.append(".");
            }
            actualValorMascara.append(actualValorHold.toString().charAt(i));
        }
        evidence("Validando o valor de compra");
        assertThat(actualValor).isEqualTo(actualValorMascara.reverse().toString());
        String actualVenda = find(aplicativoAndroidSolicitacaoValorVenda).get().text().toString();
        StringBuilder actualVendaHold = new StringBuilder();
        StringBuilder actualVendaMascara = new StringBuilder();
        actualVendaHold.append(valorVenda).reverse();
        for (int i = 0; i < actualVendaHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualVendaMascara.append(".");
            }
            actualVendaMascara.append(actualVendaHold.toString().charAt(i));
        }
        evidence("Validando o valor de venda");
        assertThat(actualVenda).isEqualTo(actualVendaMascara.reverse().toString());
        oUsuarioClicaEmSalvarEAvancar();
    }

    @Then("O usuario valida que a solicitacao foi realizada para moto")
    public void oUsuarioValidaQueASolicitacaoFoiRealizadaParaMoto() {
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo("CLIENTE: " + OWNER_ULTIMA);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        String actualOwner = find(aplicativoAndroidSolicitacaoOwnerInput).get().text().toString();
        evidence("Validando o nome do owner");
        assertThat(actualOwner).isEqualTo(OWNER_ULTIMA);
        String actualTel = find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString();
        evidence("Validando o telefone");
        actualTel = actualTel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualTel).isEqualTo(sTelefone);
        String actualCel = find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString();
        evidence("Validando o celular");
        actualCel = actualCel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualCel).isEqualTo(celular);
        String actualEmail = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        evidence("Validando o email");
        assertThat(actualEmail).isEqualTo(aplicativoAndroidEmailTeste);
        oUsuarioArrastaATelaParaBaixo();
        String actualPlaca = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
        evidence("Validando a placa");
        assertThat(actualPlaca).isEqualTo(placa);
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        String actualAnoFab = find(aplicativoAndroidSolicitacaoAnoDeFabricacaoText).get().text().toString();
        evidence("Validando o ano de fabricacao");
        assertThat(actualAnoFab).isEqualTo(ano);
        String actualAnoLanc = find(aplicativoAndroidSolicitacaoAnoDeLancamentoText).get().text().toString();
        evidence("Validando o ano de lancamento");
        assertThat(actualAnoLanc).isEqualTo(ano);
        oUsuarioArrastaATelaParaBaixo();
        String actualKm = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
        evidence("Validando a kilometragem");
        assertThat(actualKm).isEqualTo(km);
        String actualMarca = find(aplicativoAndroidSolicitacaoMarcaText).get().text().toString();
        evidence("Validando a marca");
        assertThat(actualMarca).isEqualTo(marca.toUpperCase());
        String actualModelo = find(aplicativoAndroidSolicitacaoModeloTexto).get().text().toString();
        evidence("Validando o modelo");
        assertThat(actualModelo).isEqualTo(modelo.toUpperCase());
        oUsuarioArrastaATelaParaBaixo();
        String actualVersao = find(aplicativoAndroidSolicitacaoVersaoText).get().text().toString();
        evidence("Validando a versao");
        assertThat(actualVersao).isEqualTo(versao.toUpperCase());
        String actualCor = find(aplicativoAndroidSolicitacaoCorText).get().text().toString();
        evidence("Validando a cor");
        assertThat(actualCor).isEqualTo(cor.toUpperCase());
        String sCombustivel = find(APLICATIVO_ANDROID_COMBUSTIVEL_VEICULO_SELECIONADO).get().text().toString();
        assertThat(sCombustivel).isEqualTo(combustivel);
        String sTipoCambio = find(APLICATIVO_ANDROID_TIPO_CAMBIO_VEICULO_SELECIONADO).get().text().toString();
        assertThat(sTipoCambio).isEqualTo(cambio);
        String sProcedencia = find(APLICATIVO_ANDROID_PROCEDENCIA_VEICULO_SELECIONADA).get().text().toString();
        assertThat(sProcedencia).isEqualTo(procedencia);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        String actualStatusMotor = find(aplicativoAndroidSolicitacaoStatusAvaliacaoMotor).get().text().toString();
        evidence("Validando o status do motor");
        assertThat(actualStatusMotor).isEqualTo(estadoMotor.toUpperCase());
        //String actualStatusCambio = find(aplicativoAndroidSolicitacaoStatusAvaliacaoCambio).get().text().toString();
        evidence("Validando o status do cambio");
        //assertThat(actualStatusCambio).isEqualTo(estadoCambio.toUpperCase());
        oUsuarioClicaEmSalvarEAvancar();
        String sClassificacao = find(APLICATIVO_ANDROID_CLASSIFICACAO_SELECIONADA).get().text().toString();
        assertThat(sClassificacao).isEqualTo(classificacao);
        String sFinalidade = find(APLICATIVO_ANDROID_FINALIDADE_SELECIONADA).get().text().toString();
        assertThat(sFinalidade).isEqualTo(finalidade);
        evidence("evidence");
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        String actualValor = find(aplicativoAndroidSolicitacaoValorCompra).get().text().toString();
        StringBuilder actualValorHold = new StringBuilder();
        StringBuilder actualValorMascara = new StringBuilder();
        actualValorHold.append(valorCompra).reverse();
        for (int i = 0; i < actualValorHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualValorMascara.append(".");
            }
            actualValorMascara.append(actualValorHold.toString().charAt(i));
        }
        evidence("Validando o valor de compra");
        assertThat(actualValor).isEqualTo(actualValorMascara.reverse().toString());
        String actualVenda = find(aplicativoAndroidSolicitacaoValorVenda).get().text().toString();
        StringBuilder actualVendaHold = new StringBuilder();
        StringBuilder actualVendaMascara = new StringBuilder();
        actualVendaHold.append(valorVenda).reverse();
        for (int i = 0; i < actualVendaHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualVendaMascara.append(".");
            }
            actualVendaMascara.append(actualVendaHold.toString().charAt(i));
        }
        evidence("Validando o valor de venda");
        assertThat(actualVenda).isEqualTo(actualVendaMascara.reverse().toString());
        oUsuarioClicaEmSalvarEAvancar();
        log().setLocator(aplicativoAndroidMain);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }

    @Then("O usuario valida que a solicitacao foi realizada para carro")
    public void  oUsuarioValidaQueASolicitacaoFoiRealizadaParaCarro() {
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo("CLIENTE: " + OWNER_ULTIMA);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        String actualOwner = find(aplicativoAndroidSolicitacaoOwnerInput).get().text().toString();
        evidence("Validando o nome do owner");
        assertThat(actualOwner).isEqualTo(OWNER_ULTIMA);
        String actualTel = find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString();
        evidence("Validando o telefone");
        actualTel = actualTel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualTel).isEqualTo(sTelefone);
        String actualCel = find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString();
        evidence("Validando o celular");
        actualCel = actualCel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualCel).isEqualTo(celular);
        String actualEmail = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        evidence("Validando o email");
        assertThat(actualEmail).isEqualTo(aplicativoAndroidEmailTeste);
        oUsuarioArrastaATelaParaBaixo();
        String actualPlaca = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
        evidence("Validando a placa");
        assertThat(actualPlaca).isEqualTo(placa);
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        String actualAnoFab = find(aplicativoAndroidSolicitacaoAnoDeFabricacaoText).get().text().toString();
        evidence("Validando o ano de fabricacao");
        assertThat(actualAnoFab).isEqualTo(ano);
        String actualAnoLanc = find(aplicativoAndroidSolicitacaoAnoDeLancamentoText).get().text().toString();
        evidence("Validando o ano de lancamento");
        assertThat(actualAnoLanc).isEqualTo(ano);
        oUsuarioArrastaATelaParaBaixo();
        String actualKm = find(aplicativoAndroidSolicitacaoKilometragemInput).get().text().toString();
        evidence("Validando a kilometragem");
        assertThat(actualKm).isEqualTo(km);
        String actualMarca = find(aplicativoAndroidSolicitacaoMarcaText).get().text().toString();
        evidence("Validando a marca");
        assertThat(actualMarca).isEqualTo(marca.toUpperCase());
        String actualModelo = find(aplicativoAndroidSolicitacaoModeloTexto).get().text().toString();
        evidence("Validando o modelo");
        assertThat(actualModelo).isEqualTo(modelo.toUpperCase());
        oUsuarioArrastaATelaParaBaixo();
        String actualVersao = find(aplicativoAndroidSolicitacaoVersaoText).get().text().toString();
        evidence("Validando a versao");
        assertThat(actualVersao).isEqualTo(versao.toUpperCase());
        String actualCor = find(aplicativoAndroidSolicitacaoCorText).get().text().toString();
        evidence("Validando a cor");
        System.out.println("variavel actualCor: " + actualCor);
        System.out.println("variavel cor: " + cor);
        assertThat(actualCor).isEqualTo(cor.toUpperCase());
        String sCombustivel = find(APLICATIVO_ANDROID_COMBUSTIVEL_VEICULO_SELECIONADO).get().text().toString();
        assertThat(sCombustivel).isEqualTo(combustivel);
        String sTipoCambio = find(APLICATIVO_ANDROID_TIPO_CAMBIO_VEICULO_SELECIONADO).get().text().toString();
        System.out.println("variavel sTipoCambio: " + sTipoCambio);
        System.out.println("variavel cambio: " + cambio);
        assertThat(sTipoCambio).isEqualTo(cambio);
        String sProcedencia = find(APLICATIVO_ANDROID_PROCEDENCIA_VEICULO_SELECIONADA).get().text().toString();
        assertThat(sProcedencia).isEqualTo(procedencia);
        String sQuatidadePortas = find(APLICATIVO_ANDROID_QUANTIDADE_PORTAS).get().text().toString();
        assertThat(sQuatidadePortas).isEqualTo(quantidadePortas);
        oUsuarioClicaEmSalvarEAvancar();
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioClicaEmSalvarEAvancar();
        String actualStatusMotor = find(aplicativoAndroidSolicitacaoStatusAvaliacaoMotor).get().text().toString();
        evidence("Validando o status do motor");
        assertThat(actualStatusMotor).isEqualTo(estadoMotor.toUpperCase());
        System.out.println("variavel actualStatusMotor: " + actualStatusMotor);
        System.out.println("variavel estadoMotor: " + estadoMotor);
        String actualStatusCambio = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_AVALIACAO_CAMBIO_CARRO).get().text().toString();
        evidence("Validando o status do cambio");
        assertThat(actualStatusCambio).isEqualTo(estadoCambio.toUpperCase());
        System.out.println("variavel actualStatusCambio: " + actualStatusCambio);
        System.out.println("variavel estadoCambio: " + estadoCambio);
        oUsuarioClicaEmSalvarEAvancar();
        String sClassificacao = find(APLICATIVO_ANDROID_CLASSIFICACAO_SELECIONADA).get().text().toString();
        assertThat(sClassificacao).isEqualTo(classificacao);
        String sFinalidade = find(APLICATIVO_ANDROID_FINALIDADE_SELECIONADA).get().text().toString();
        assertThat(sFinalidade).isEqualTo(finalidade);
        evidence("evidence");
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        String actualValor = find(aplicativoAndroidSolicitacaoValorCompra).get().text().toString();
        StringBuilder actualValorHold = new StringBuilder();
        StringBuilder actualValorMascara = new StringBuilder();
        actualValorHold.append(valorCompra).reverse();
        for (int i = 0; i < actualValorHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualValorMascara.append(".");
            }
            actualValorMascara.append(actualValorHold.toString().charAt(i));
        }
        evidence("Validando o valor de compra");
        assertThat(actualValor).isEqualTo(actualValorMascara.reverse().toString());
        String actualVenda = find(aplicativoAndroidSolicitacaoValorVenda).get().text().toString();
        StringBuilder actualVendaHold = new StringBuilder();
        StringBuilder actualVendaMascara = new StringBuilder();
        actualVendaHold.append(valorVenda).reverse();
        for (int i = 0; i < actualVendaHold.toString().length(); i++) {
            if (i % 3 == 0 && i != 0) {
                actualVendaMascara.append(".");
            }
            actualVendaMascara.append(actualVendaHold.toString().charAt(i));
        }
        evidence("Validando o valor de venda");
        assertThat(actualVenda).isEqualTo(actualVendaMascara.reverse().toString());
        oUsuarioClicaEmSalvarEAvancar();
        log().setLocator(aplicativoAndroidMain);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
    }


    @And("O usuario atualiza todos os campos da solicitacao {string} {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioAtualizaTodosOsCamposDaSolicitacaoAnoKmSegundaMarcaSegundoModelo(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        log().setLocator(aplicativoAndroidSolicitacao);
        String placaVeiculoPrimeiraAvaliacao = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_PRIMEIRA_AVALIACAO).get().text().toString();
        if (placaVeiculoPrimeiraAvaliacao.equals(placa)){
            find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        } else {
            error().Fail();
        }
        oUsuarioPreencheOCampoOwner();
        sTelefone = String.valueOf(t);
        sTelefone = sTelefone.substring(0,10);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(sTelefone);
        oUsuarioPreencheOCampoCelular();
        aplicativoAndroidEmailTeste = aplicativoAndroidEmailTesteEditado;
        oUsuarioPreencheOCampoEmail();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        int intAno = Integer.parseInt(arg0);
        intAno += 1;
        sendAnoFab(String.valueOf((intAno)));
        anoLancamento(String.valueOf((intAno)));
        int intKm = Integer.parseInt(arg1);
        intKm += 10000;
        sendKM(String.valueOf((intKm)));
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg2);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg3);
        oUsuarioPreencheOCampoVersao();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoCorComSegundaOpcao();
        oUsuarioPreencheOCampoCombustivelComSegundaOpcao();
        oUsuarioPreencheOCampoCambioComSegundaOpcaoLista();
        oUsuarioPreencheOCampoProcedenciaParaCarroComSegundaOpcaoLista();
        oUsuarioPreencheOCampoQuantidadeDePortasUtilizandoOFiltroPor("5");
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotorCarro(arg4);
        sendAvaliaCambioCarro(arg5);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioPreencheOCampoClassificacaoComoB();
        oUsuarioPreencheOCampoFinalidadeComoRepasse();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        int valorCompra = Integer.parseInt(arg6);
        valorCompra += 500;
        int valorVenda = Integer.parseInt(arg7);
        valorVenda += 500;
        sendCampoValor(String.valueOf(valorCompra));
        sendCampoVenda(String.valueOf(valorVenda));
        oUsuarioClicaEmSalvarEAvancar();
    }

    @Then("O usuario valida bloqueio duplicidade placa para proposta")
    public void oUsuarioValidaBloqueioDuplicidadePlacaParaProposta() {
        SDAplicativoAndroidMain sDAplicativoAndroidMain = new SDAplicativoAndroidMain();
        log().setLocator(aplicativoAndroidMain);
        find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        placa = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_PRIMEIRA_AVALIACAO).get().text().toString();
        sDAplicativoAndroidMain.oUsuarioClicaEmMais();
        sDAplicativoAndroidMain.oUsuarioClicaNoMenuCarro();
        sleep().until(2000);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        digitarPlacaComVariavelJaPopulada();
        sleep().setMaxTime(30000);
        String msgAlerta = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_ALERTA_VEICULO_JA_AVALIADO).get().text().toString();
        if (msgAlerta.contains("Veículo já avaliado!")){
            evidence("Menssagem de placa já cadastrada exibida como esperado");
            sleep().setDefaultTime();
        } else {
            evidence("Menssagem de placa já cadastrada não exibida como esperado");
            sleep().setDefaultTime();
            error().Fail();
        }
        System.out.println("variavel msgAlerta: " + msgAlerta);
    }

    @And("O usuario atualiza todos os campos da solicitacao caminhao {string} {string} {string} {string} {string} {string}")
    public void oUsuarioAtualizaTodosOsCamposDaSolicitacaoCaminhao(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        //find(APLICATIVO_ANDROID_MAIN_REALIZADAS).click();
        //placa = "FFF0002";
        log().setLocator(aplicativoAndroidSolicitacao);
        String placaVeiculoPrimeiraAvaliacao = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_PRIMEIRA_AVALIACAO).get().text().toString();
        if (placaVeiculoPrimeiraAvaliacao.equals(placa)){
            find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        } else {
            error().Fail();
        }
        oUsuarioPreencheOCampoOwner();
        sTelefone = String.valueOf(t);
        sTelefone = sTelefone.substring(0,10);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(sTelefone);
        oUsuarioPreencheOCampoCelular();
        aplicativoAndroidEmailTeste = aplicativoAndroidEmailTesteEditado;
        oUsuarioPreencheOCampoEmail();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        int intAno = Integer.parseInt(arg0);
        intAno += 1;
        sendAnoFab(String.valueOf((intAno)));
        anoLancamento(String.valueOf((intAno)));
        int intKm = Integer.parseInt(arg1);
        intKm += 10000;
        sendKM(String.valueOf((intKm)));
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg2);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg3);
        oUsuarioPreencheOCampoVersao();
        oUsuarioPreencheOCampoCorComSegundaOpcao();
        oUsuarioPreencheOCampoCombustivelComSegundaOpcao();
        oUsuarioPreencheOCampoCambioComSegundaOpcaoLista();
        oUsuarioPreencheOCampoProcedenciaParaCarroComSegundaOpcaoLista();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        find(APLICATIVO_ANDROID_SOLICITACAO_APLICACAO).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        aplicacao = find(APLICATIVO_ANDROID_APLICACAO_SELECIONADA).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUIMENTO).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        segmento = find(APLICATIVO_ANDROID_SEGMENTO_SELECIONADO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_TRACAO).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        tracao = find(APLICATIVO_ANDROID_TRACAO_SELECIONADO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_FABRICANTE_MOTOR).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        fabricanteMotor = find(APLICATIVO_ANDROID_FABRICANTE_MOTOR_SELECIONADO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_NUMERO_CILINDOS).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        numeroCiclindros = find(APLICATIVO_ANDROID_NUMERO_CILINDROS_SELECIONADO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_NUMERO_MARCHAS).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        numeroMarchas = find(APLICATIVO_ANDROID_NUMERO_MARCHAS_SELECIONADO).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_TIPO_CABINE).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        tipoCabine = find(APLICATIVO_ANDROID_TIPO_CABINE_SELECIONADA).get().text().toString();
        find(APLICATIVO_ANDROID_SOLICITACAO_CONFIGURACAO_CABINE).click();
        find(APLICATIVO_ANDROID_SOLICITACAO_SEGUNDO_ITEM).click();
        configuracaoCabine = find(APLICATIVO_ANDROID_CONFIGURACAO_CABINE_SELECIONADA).get().text().toString();
        distanciaEntreEixosAtual = "1500";
        find(APLICATIVO_ANDROID_SOLICITACAO_DISTANCIA_ENTRE_EIXOS_ATUAL).send().text(distanciaEntreEixosAtual);
        distanciaEntreEixosAnterior = "1500";
        find(APLICATIVO_ANDROID_SOLICITACAO_DISTANCIA_ENTRE_EIXOS_ANTERIOR).send().text(distanciaEntreEixosAnterior);
        potencia = "700";
        find(APLICATIVO_ANDROID_SOLICITACAO_POTENCIA).send().text(potencia);
        oUsuarioClicaEmSalvarEAvancar();
        sleep().until(1000);
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotorCaminhao(arg4);
        sendAvaliaCambioCaminhao(arg5);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioPreencheOCampoClassificacaoComoB();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        int valorCompra = Integer.parseInt(arg4);
        valorCompra += 500;
        int valorVenda = Integer.parseInt(arg5);
        valorVenda += 500;
        sendCampoValor(String.valueOf(valorCompra));
        sendCampoVenda(String.valueOf(valorVenda));
        oUsuarioClicaEmSalvarEAvancar();
    }

    @And("O usuario atualiza todos os campos da solicitacao moto {string} {string} {string} {string} {string} {string} {string}")
    public void oUsuarioAtualizaTodosOsCamposDaSolicitacaoMoto(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        log().setLocator(aplicativoAndroidSolicitacao);
        String placaVeiculoPrimeiraAvaliacao = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_PRIMEIRA_AVALIACAO).get().text().toString();
        if (placaVeiculoPrimeiraAvaliacao.equals(placa)){
            find(APLICATIVO_ANDROID_MAIN_REALIZADAS_CARDS).click();
        } else {
            error().Fail();
        }
        oUsuarioPreencheOCampoOwner();
        sTelefone = String.valueOf(t);
        sTelefone = sTelefone.substring(0,10);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(sTelefone);
        oUsuarioPreencheOCampoCelular();
        aplicativoAndroidEmailTeste = aplicativoAndroidEmailTesteEditado;
        oUsuarioPreencheOCampoEmail();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        int intAno = Integer.parseInt(arg0);
        intAno += 1;
        sendAnoFab(String.valueOf((intAno)));
        anoLancamento(String.valueOf((intAno)));
        int intKm = Integer.parseInt(arg1);
        intKm += 10000;
        sendKM(String.valueOf((intKm)));
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg2);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg3);
        oUsuarioPreencheOCampoVersao();
        oUsuarioPreencheOCampoCorComSegundaOpcao();
        oUsuarioPreencheOCampoCombustivelComSegundaOpcao();
        oUsuarioPreencheOCampoCambioComSegundaOpcaoLista();
        oUsuarioPreencheOCampoProcedenciaParaCarroComSegundaOpcaoLista();
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotorCarro(arg4);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioPreencheOCampoClassificacaoComoB();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        oUsuarioArrastaATelaParaBaixo();
        int valorCompra = Integer.parseInt(arg5);
        valorCompra += 500;
        int valorVenda = Integer.parseInt(arg6);
        valorVenda += 500;
        sendCampoValor(String.valueOf(valorCompra));
        sendCampoVenda(String.valueOf(valorVenda));
        oUsuarioClicaEmSalvarEAvancar();
    }

    @And("O usuario acessa a avaliacao solicitada pelo usbi no app com usuario {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void  oUsuarioAcessaAAvaliacaoSolicitadaPeloUsbiNoAppComUsuario(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9){
        log().setLocator(aplicativoAndroidSolicitacao);
        SDAplicativoAndroidLogin SDAplicativoAndroidLogin = new SDAplicativoAndroidLogin();
        SDAplicativoAndroidLogin.oUsuarioAbreOAplicativoComo(arg0, arg1);
        String placaVeiculoPrimeiraAvaliacao = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_PRIMEIRA_SOLICITACAO).get().text().toString();
        if (placaVeiculoPrimeiraAvaliacao.toLowerCase().equals(placaVeiculo)){
            find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_PRIMEIRA_SOLICITACAO).click();
        } else {
            placaVeiculoPrimeiraAvaliacao = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_SEGUNDA_SOLICITACAO).get().text().toString();
            if (placaVeiculoPrimeiraAvaliacao.equals(placaVeiculo)){
                find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PLACA_VEICULO_SEGUNDA_SOLICITACAO).click();
            } else {
                error().Fail();
            }
        }
        String nomeDaAvaliacao = find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PROPRIETARIO).get().text().toString();
        assertThat(nomeDaAvaliacao).isEqualTo(nomeCliente);
        proprietario = "Novo Cliente " + Calendar.getInstance().getTimeInMillis();
        find(APLICATIVO_ANDROID_SOLICITACAO_TEXT_PROPRIETARIO).send().text(proprietario);
        String actualTel = find(aplicativoAndroidSolicitacaoTelefoneInput).get().text().toString();
        actualTel = actualTel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualTel).isEqualTo(telefoneCliente);
        telefoneCliente = String.valueOf(Calendar.getInstance().getTimeInMillis());
        telefoneCliente = telefoneCliente.substring(3, 12);
        find(aplicativoAndroidSolicitacaoTelefoneInput).send().text(telefoneCliente);
        String actualCel = find(aplicativoAndroidSolicitacaoCelularInput).get().text().toString();
        actualCel = actualCel.replace("(", "").replace(")", "").replace(" ", "");
        assertThat(actualCel).isEqualTo(celularCliente);
        celularCliente = String.valueOf(Calendar.getInstance().getTimeInMillis());
        celularCliente = celularCliente.substring(1, 12);
        find(aplicativoAndroidSolicitacaoCelularInput).send().text(celularCliente);
        String emailAvaliacao = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        assertThat(emailAvaliacao).isEqualTo(emailCriacao);
        emailCriacao = "automacao@editado.com";
        find(aplicativoAndroidSolicitacaoEmailInput).send().text(emailCriacao);
        String emailAvaliacaoTemp = find(aplicativoAndroidSolicitacaoEmailInput).get().text().toString();
        String placaAvaliacao = find(aplicativoAndroidSolicitacaoPlacaInput).get().text().toString();
        assertThat(placaAvaliacao.toLowerCase()).isEqualTo(placaVeiculo);
        oUsuarioPreencheOsDadosDoVeiculoParaNovaAvaliacaoCarro(arg2, arg3, arg4, arg5);
        oUsuarioInsereQuatroFotosDeTeste();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioClicaEmSalvarEAvancar();
        sendAvaliaMotorCarro(arg6);
        sendAvaliaCambioCarro(arg7);
        sleep().until(2000);
        oUsuarioClicaEmSalvarEAvancar();
        oUsuarioPreencheOCampoClassificacaoComoA();
        oUsuarioPreencheOCampoFinalidadeComoOferta();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioArrastaATelaParaBaixo();
        sendCampoValor(arg8);
        sendCampoVenda(arg9);
        oUsuarioClicaEmSalvarEAvancar();
    }

    @And("O usuario preenche os dados do veiculo para nova avaliacao carro {string} {string} {string} {string}")
    public void oUsuarioPreencheOsDadosDoVeiculoParaNovaAvaliacaoCarro(String arg0,String arg1,String arg2,String arg3){
        sendAnoFab(arg0);
        anoLancamento(arg0);
        oUsuarioArrastaATelaParaBaixo();
        sendKM(arg1);
        oUsuarioPreencheAMarcaUtilizandoOFiltroPor(arg2);
        oUsuarioPreencheOModeloUtilizandoOFiltroPor(arg3);
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoVersao();
        oUsuarioArrastaATelaParaBaixo();
        oUsuarioPreencheOCampoCor();
        oUsuarioPreencheOCampoCombustivel();
        oUsuarioPreencheOCampoCambio();
        oUsuarioPreencheOCampoProcedenciaParaCarro();
        oUsuarioPreencheOCampoQuantidadeDePortasUtilizandoOFiltroPor("4");
    }
}
