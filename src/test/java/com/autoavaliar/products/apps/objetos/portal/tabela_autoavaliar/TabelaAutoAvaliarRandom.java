package com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar;

import com.autoavaliar.support.tbi.Commons;

import java.util.LinkedHashMap;

public class TabelaAutoAvaliarRandom {

    public static String path = Commons.getProjectFolder()+"/src/test/resources/products/apps/massas/tabela_auto_avaliar/";

    public static String urlPortalAutoAvaliar = "https://www.autoavaliar.com.br/";
    public static String menuTabelaAutoAvaliar = "//a[text()='Tabela Auto Avaliar']";
    public static String textVamosComecar = "//div[@class='field']//p[@class='title has-text-weight-normal has-text-centered']";
    public static String textPasso1MarcaEModelo = "//span[@class='steps-marker has-text-weight-semibold']";
    public static String textPasso2AnoEstadoVersao = "//span[@class='steps-marker has-text-weight-semibold']";
    public static String comboMarca = "//select[@id='carBrand']";
    public static String comboModelo = "//select[@id='carModel']";
    public static String botaoProximo = "//button[@id='button__next-one']";
    public static String logoMarcaVeiculo = "//img[@id='carImage2']";
    public static String textPasso2CompleteOsDados = "//div[@class='column is-5']//p[@class='title has-text-weight-normal has-text-centered is-hidden-mobile']";
    public static String comboAnoVeiculo = "//*[@id='year']";
    public static String comboUFVeiculo = "//*[@id='states']";
    public static String comboVersaoVeiculo = "//*[@id='carVersion']";
    public static String checkRecaptcha = "//*[@id='recaptcha-anchor']";

    public static String permitirTodosCookies = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    public static String btnLerPoliticaPrivacidade = "//*[@id='askNewPrivacy']/div/a";
    public static String btnEmAcordoPoliticasPrivacidade = "//*[@id='askNewPrivacyButton']";
    public static String btnCaptchaEuNaoSouRobo = "//*[@id='recaptcha-anchor']";
    public static String btnProximoPassoDois = "//*[@id='button__next-two']";

    public static String TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA = "//html";
    public static String TABELA_AUTO_AVALIAR_TABELA = path+"tabela.png";
    public static String TABELA_AUTO_AVALIAR_ANO = path+"ano.png";
    public static String TABELA_AUTO_AVALIAR_MARCA = path+"marca.png";
    public static String TABELA_AUTO_AVALIAR_MODELO = path+"modelo.png";
    public static String TABELA_AUTO_AVALIAR_LOGIN = path+"login.png";

    public static class principaisMarcas {
        public static String valorMarcaAudi = "//*[@id='carBrand']/option[@value='1967 - AUDI']";
        public static String valorMarcaBMW = "//*[@id='carBrand']/option[@value='1973 - BMW']";
        public static String valorMarcaChevrolet = "//*[@id='carBrand']/option[@value='1986 - CHEVROLET']";
        public static String valorMarcaCitroen = "//*[@id='carBrand']/option[@value='1988 - CITROEN']";
        public static String valorMarcaFiat = "//*[@id='carBrand']/option[@value='2009 - FIAT']";
        public static String valorMarcaFord = "//*[@id='carBrand']/option[@value='2012 - FORD']";
        public static String valorMarcaHonda = "//*[@id='carBrand']/option[@value='2023 - HONDA']";
        public static String valorMarcaHyundai= "//*[@id='carBrand']/option[@value='2026 - HYUNDAI']";
        public static String valorMarcaJeep = "//*[@id='carBrand']/option[@value='2034 - JEEP']";
        public static String valorMarcaKia = "//*[@id='carBrand']/option[@value='2040 - KIA']";
        public static String valorMarcaMercedesBenz = "//*[@id='carBrand']/option[@value='2063 - MERCEDES-BENZ']";
        public static String valorMarcaMitsubishi = "//*[@id='carBrand']/option[@value='2067 - MITSUBISHI']";
        public static String valorMarcaNissan = "//*[@id='carBrand']/option[@value='2073 - NISSAN']";
        public static String valorMarcaPeugeot = "//*[@id='carBrand']/option[@value='2079 - PEUGEOT']";
        public static String valorMarcaRenault = "//*[@id='carBrand']/option[@value='2086 - RENAULT']";
        public static String valorMarcaToyota = "//*[@id='carBrand']/option[@value='2111 - TOYOTA']";
        public static String valorMarcaVolkswagen = "//*[@id='carBrand']/option[@value='2115 - VOLKSWAGEN']";
    }

    public static class modelosBMW {
        public static String valorModelo116i = "//*[@id='carModel']//option[@value='71074 - 116I']";
        public static String valorModelo118i = "//*[@id='carModel']//option[@value='71075 - 118I']";
        public static String valorModelo120i = "//*[@id='carModel']//option[@value='71076 - 120I']";
        public static String valorModelo125i = "//*[@id='carModel']//option[@value='71077 - 125I']";
        public static String valorModelo130i = "//*[@id='carModel']//option[@value='71078 - 130I']";
        public static String valorModelo220i = "//*[@id='carModel']//option[@value='75270 - 220I']";
        public static String valorModelo225i = "//*[@id='carModel']//option[@value='71087 - 225I']";
        public static String valorModelo316i = "//*[@id='carModel']//option[@value='71091 - 316I']";
        public static String valorModelo318i = "//*[@id='carModel']//option[@value='71092 - 318I']";
        public static String valorModelo320i = "//*[@id='carModel']//option[@value='71096 - 320I']";
        public static String valorModelo325i = "//*[@id='carModel']//option[@value='71101 - 325I']";
        public static String valorModelo328i = "//*[@id='carModel']//option[@value='71103 - 328I']";
        public static String valorModelo330i = "//*[@id='carModel']//option[@value='71105 - 330I']";
        public static String valorModelo335i = "//*[@id='carModel']//option[@value='71107 - 335I']";
        public static String valorModelo420i = "//*[@id='carModel']//option[@value='71108 - 420I']";
        public static String valorModelo428i = "//*[@id='carModel']//option[@value='71109 - 428I']";
        public static String valorModelo430i = "//*[@id='carModel']//option[@value='76875 - 430I']";
        public static String valorModelo435i = "//*[@id='carModel']//option[@value='71110 - 435I']";
        public static String valorModelo528i = "//*[@id='carModel']//option[@value='71113 - 528I']";
        public static String valorModelo530e = "//*[@id='carModel']//option[@value='79923 - 530E']";
        public static String valorModelo530i = "//*[@id='carModel']//option[@value='71115 - 530I']";
        public static String valorModelo535i = "//*[@id='carModel']//option[@value='71116 - 535I']";
        public static String valorModelo540i = "//*[@id='carModel']//option[@value='71117 - 540I']";
        public static String valorModelo550i = "//*[@id='carModel']//option[@value='71119 - 550I']";
        public static String valorModelo650i = "//*[@id='carModel']//option[@value='71124 - 650I']";
        public static String valorModeloi3 = "//*[@id='carModel']//option[@value='71137 - I3']";
        public static String valorModeloM140i = "//*[@id='carModel']//option[@value='76876 - M 140I']";
        public static String valorModeloM240i = "//*[@id='carModel']//option[@value='76877 - M 240I']";
        public static String valorModeloM3 = "//*[@id='carModel']//option[@value='71142 - M3']";
        public static String valorModeloM5 = "//*[@id='carModel']//option[@value='71144 - M5']";
        public static String valorModeloM6 = "//*[@id='carModel']//option[@value='71145 - M6']";
        public static String valorModeloR1200GsAdv = "//*[@id='carModel']//option[@value='75437 - R 1200 GS ADVENTURE']";
        public static String valorModeloS1000XR = "//*[@id='carModel']//option[@value='75453 - S 1000 XR']";
        public static String valorModeloX1 = "//*[@id='carModel']//option[@value='71147 - X1']";
        public static String valorModeloX2 = "//*[@id='carModel']//option[@value='78303 - X2']";
        public static String valorModeloX3 = "//*[@id='carModel']//option[@value='71148 - X3']";
        public static String valorModeloX4 = "//*[@id='carModel']//option[@value='71149 - X4']";
        public static String valorModeloX5 = "//*[@id='carModel']//option[@value='71150 - X5']";
        public static String valorModeloX6 = "//*[@id='carModel']//option[@value='71151 - X6']";
        public static String valorModeloZ4 = "//*[@id='carModel']//option[@value='71154 - Z4']";


    }

    public static class modelosChevrolet {
        public static String valorModeloAgile = "//*[@id='carModel']/option[@value='71212 - AGILE']";
        public static String valorModeloAstra = "//*[@id='carModel']/option[@value='71214 - ASTRA']";
        public static String valorModeloBlazer = "//*[@id='carModel']/option[@value='71219 - BLAZER']";
        public static String valorModeloCaptiva = "//*[@id='carModel']/option[@value='71231 - CAPTIVA']";
        public static String valorModeloCelta = "//*[@id='carModel']/option[@value='71234 - CELTA']";
        public static String valorModeloClassic = "//*[@id='carModel']/option[@value='71239 - CLASSIC']";
        public static String valorModeloCobalt = "//*[@id='carModel']/option[@value='71240 - COBALT']";
        public static String valorModeloCobaltSedan = "//*[@id='carModel']/option[@value='72909 - COBALT SEDAN']";
        public static String valorModeloEquinox = "//*[@id='carModel']/option[@value='71253 - EQUINOX']";
        public static String valorModeloJoy = "//*[@id='carModel']/option[@value='9999906 - JOY']";
        public static String valorModeloKadett = "//*[@id='carModel']/option[@value='71261 - KADETT']";
        public static String valorModeloMalibu = "//*[@id='carModel']/option[@value='71263 - MALIBU']";
        public static String valorModeloMeriva = "//*[@id='carModel']/option[@value='71266 - MERIVA']";
        public static String valorModeloMontana = "//*[@id='carModel']/option[@value='71267 - MONTANA']";
        public static String valorModeloOmega = "//*[@id='carModel']/option[@value='71270 - OMEGA']";
        public static String valorModeloOnix = "//*[@id='carModel']/option[@value='71271 - ONIX']";
        public static String valorModeloOnixHatch = "//*[@id='carModel']/option[@value='72940 - ONIX HATCH']";
        public static String valorModeloPrisma = "//*[@id='carModel']/option[@value='71274 - PRISMA']";
        public static String valorModeloS10 = "//*[@id='carModel']/option[@value='71276 - S10']";
        public static String valorModeloSonic = "//*[@id='carModel']/option[@value='71279 - SONIC']";
        public static String valorModeloSonicHatch = "//*[@id='carModel']/option[@value='72950 - SONIC HATCH']";
        public static String valorModeloSonicSedan = "//*[@id='carModel']/option[@value='72951 - SONIC SEDAN']";
        public static String valorModeloSpin = "//*[@id='carModel']/option[@value='71281 - SPIN']";
        public static String valorModeloTracker = "//*[@id='carModel']/option[@value='71292 - TRACKER']";
        public static String valorModeloTrailblazer = "//*[@id='carModel']/option[@value='71294 - TRAILBLAZER']";
        public static String valorModeloVectra = "//*[@id='carModel']/option[@value='71297 - VECTRA']";
        public static String valorModeloZafira = "//*[@id='carModel']/option[@value='71300 - ZAFIRA']";

    }

    public static LinkedHashMap<String, String> MapTabelaAutoAvaliarRandom = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(TABELA_AUTO_AVALIAR_RAIZ_DA_PAGINA, "Raiz da pagina");

        // COMUNS
        ret.put(urlPortalAutoAvaliar, "Portal Auto Avaliar");
        ret.put(menuTabelaAutoAvaliar, "Tabela Auto Avaliar");
        ret.put(textVamosComecar, "Vamos Começar");
        ret.put(textPasso1MarcaEModelo, "Passo 1 Marca/Modelo");
        ret.put(comboMarca, "Marca");
        ret.put(comboModelo, "Modelo");
        ret.put(permitirTodosCookies, "Cookies");
        ret.put(btnLerPoliticaPrivacidade, "Botão Politicas de Privacidade");
        ret.put(btnEmAcordoPoliticasPrivacidade, "Botão Estou de acordo com a politica de privacidade");
        ret.put(botaoProximo, "Botão Próximo");
        ret.put(btnCaptchaEuNaoSouRobo, "CheckBox Captcha eu Nao Sou Robô");
        ret.put(btnProximoPassoDois, "Botão Próximo Passo 2");

        ret.put(comboAnoVeiculo, "Combobox Ano do Veiculo");
        ret.put(comboUFVeiculo, "Combobox: UF do Veiculo");
        ret.put(comboVersaoVeiculo, "Combobox: Versão do Veiculo");
        ret.put(checkRecaptcha, "Check Recaptcha");



        // PRINCIAPAIS MARCAS DE VEICULOS
        ret.put(principaisMarcas.valorMarcaAudi, "Marca Audi");
        ret.put(principaisMarcas.valorMarcaBMW, "Marca BMW");
        ret.put(principaisMarcas.valorMarcaChevrolet, "Marca Chevrolet");
        ret.put(principaisMarcas.valorMarcaCitroen, "Marca Citroen");
        ret.put(principaisMarcas.valorMarcaFiat, "Marca Fiat");
        ret.put(principaisMarcas.valorMarcaFord, "Marca Ford");
        ret.put(principaisMarcas.valorMarcaHonda, "Marca Honda");
        ret.put(principaisMarcas.valorMarcaHyundai, "Marca Hyundai");
        ret.put(principaisMarcas.valorMarcaJeep, "Marca Jeep");
        ret.put(principaisMarcas.valorMarcaKia, "Marca Kia");
        ret.put(principaisMarcas.valorMarcaMercedesBenz, "Marca Mercedes Benz");
        ret.put(principaisMarcas.valorMarcaMitsubishi, "Marca Mitsubishi");
        ret.put(principaisMarcas.valorMarcaNissan, "Marca Nissan");
        ret.put(principaisMarcas.valorMarcaPeugeot, "Marca Peugeot");
        ret.put(principaisMarcas.valorMarcaRenault, "Marca Renault");
        ret.put(principaisMarcas.valorMarcaToyota, "Marca Toyota");
        ret.put(principaisMarcas.valorMarcaVolkswagen, "Marca Volkswagen");

        return ret;
    }

}


