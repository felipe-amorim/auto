package com.autoavaliar.products.apps.objetos.portal.tabela_autoavaliar;

import java.util.LinkedHashMap;

public class TabelaAutoAvaliarMain {

    public static String urlPortalAutoAvaliar = "https://www.autoavaliar.com.br/";
    public static String menuTabelaAutoAvaliar = "//a[text()='Tabela Auto Avaliar']";
    public static String textVamosComecar = "//div[@class='field']//p[@class='title has-text-weight-normal has-text-centered']";
    public static String comboMarca = "//select[@id='carBrand']";
    public static String comboModelo = "//select[@id='carModel']";
    public static String botaoProximo = "//button[@id='button__next-one']";
    public static String logoMarcaVeiculo = "//img[@id='carImage2']";
    public static String textPasso2CompleteOsDados = "//div[@class='column is-5']//p[@class='title has-text-weight-normal has-text-centered is-hidden-mobile']";

    public static String permitirTodosCookies = "//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']";
    public static String btnLerPoliticaPrivacidade = "//*[@id='askNewPrivacy']/div/a";
    public static String btnEmAcordoPoliticasPrivacidade = "//*[@id='askNewPrivacyButton']";
    public static String btnCaptchaEuNaoSouRobo = "//*[@id='recaptcha-anchor']";
    public static String btnProximoPassoDois = "//*[@id='button__next-two']";


    public static class marcas {
        public static String valorMarcaAudi = "//*[@id='carBrand']/option[@value='1967 - AUDI']";
        public static String valorMarcaBMW = "//*[@id='carBrand']/option[@value='1973 - BMW']";
        public static String valorMarcaChery = "//*[@id='carBrand']/option[@value='1985 - CHERY']";
        public static String valorMarcaChevrolet = "//*[@id='carBrand']/option[@value='1986 - CHEVROLET']";
        public static String valorMarcaChrysler = "//*[@id='carBrand']/option[@value='1987 - CHRYSLER']";
        public static String valorMarcaCitroen = "//*[@id='carBrand']/option[@value='1988 - CITROEN']";
        public static String valorMarcaDodge = "//*[@id='carBrand']/option[@value='1998 - DODGE']";
        public static String valorMarcaFiat = "//*[@id='carBrand']/option[@value='2009 - FIAT']";
        public static String valorMarcaFord = "//*[@id='carBrand']/option[@value='2012 - FORD']";
        public static String valorMarcaGeely = "//*[@id='carBrand']/option[@value='2014 - GEELY']";
        public static String valorMarcaHonda = "//*[@id='carBrand']/option[@value='2023 - HONDA']";
        public static String valorMarcaHyundai= "//*[@id='carBrand']/option[@value='2026 - HYUNDAI']";
        public static String valorMarcaIveco = "//*[@id='carBrand']/option[@value='2031 - IVECO']";
        public static String valorMarcaJac = "//*[@id='carBrand']/option[@value='2032 - JAC']";
        public static String valorMarcaJaguar = "//*[@id='carBrand']/option[@value='2033 - JAGUAR']";
        public static String valorMarcaJeep = "//*[@id='carBrand']/option[@value='2034 - JEEP']";
        public static String valorMarcaKia = "//*[@id='carBrand']/option[@value='2040 - KIA']";
        public static String valorMarcaLandRover = "//*[@id='carBrand']/option[@value='2046 - LAND ROVER']";
        public static String valorMarcaLexus = "//*[@id='carBrand']/option[@value='2048 - LEXUS']";
        public static String valorMarcaLifan = "//*[@id='carBrand']/option[@value='2049 - LIFAN']";
        public static String valorMarcaMahindra = "//*[@id='carBrand']/option[@value='2054 - MAHINDRA']";
        public static String valorMarcaMercedesBenz = "//*[@id='carBrand']/option[@value='2063 - MERCEDES-BENZ']";
        public static String valorMarcaMini = "//*[@id='carBrand']/option[@value='2066 - MINI']";
        public static String valorMarcaMitsubishi = "//*[@id='carBrand']/option[@value='2067 - MITSUBISHI']";
        public static String valorMarcaMiura = "//*[@id='carBrand']/option[@value='2068 - MIURA']";
        public static String valorMarcaNissan = "//*[@id='carBrand']/option[@value='2073 - NISSAN']";
        public static String valorMarcaPeugeot = "//*[@id='carBrand']/option[@value='2079 - PEUGEOT']";
        public static String valorMarcaPorsche = "//*[@id='carBrand']/option[@value='2082 - PORSCHE']";
        public static String valorMarcaRenault = "//*[@id='carBrand']/option[@value='2086 - RENAULT']";
        public static String valorMarcaSmart = "//*[@id='carBrand']/option[@value='2102 - SMART']";
        public static String valorMarcaSsangyong = "//*[@id='carBrand']/option[@value='2104 - SSANGYONG']";
        public static String valorMarcaSubaru = "//*[@id='carBrand']/option[@value='2107 - SUBARU']";
        public static String valorMarcaSuzuki = "//*[@id='carBrand']/option[@value='2108 - SUZUKI']";
        public static String valorMarcaToyota = "//*[@id='carBrand']/option[@value='2111 - TOYOTA']";
        public static String valorMarcaTroller = "//*[@id='carBrand']/option[@value='2113 - TROLLER']";
        public static String valorMarcaVolkswagen = "//*[@id='carBrand']/option[@value='2115 - VOLKSWAGEN']";
        public static String valorMarcaVolvo = "//*[@id='carBrand']/option[@value='2116 - VOLVO']";
        public static String valorMarcaRam = "//*[@id='carBrand']/option[@value='2251 - RAM']";
    }

    public static class modelosAudi {
        public static String valorModeloA1 = "//*[@id='carModel']//option[@value='71031 - A1']";
        public static String valorModeloA3 = "//*[@id='carModel']//option[@value='71033 - A3']";
        public static String valorModeloA4 = "//*[@id='carModel']//option[@value='71034 - A4']";
        public static String valorModeloA5 = "//*[@id='carModel']//option[@value='71035 - A5']";
        public static String valorModeloA6 = "//*[@id='carModel']//option[@value='71036 - A6']";
        public static String valorModeloA7 = "//*[@id='carModel']//option[@value='71037 - A7']";
        public static String valorModeloQ3 = "//*[@id='carModel']//option[@value='71040 - Q3']";
        public static String valorModeloQ5 = "//*[@id='carModel']//option[@value='71041 - Q5']";
        public static String valorModeloQ7 = "//*[@id='carModel']//option[@value='71042 - Q7']";
        public static String valorModeloQ8 = "//*[@id='carModel']//option[@value='79950 - Q8']";
        public static String valorModeloRSQ3 = "//*[@id='carModel']//option[@value='71044 - RS Q3']";
        public static String valorModeloRS4 = "//*[@id='carModel']//option[@value='71047 - RS4']";
        public static String valorModeloRS6 = "//*[@id='carModel']//option[@value='71049 - RS6']";
        public static String valorModeloS3 = "//*[@id='carModel']//option[@value='71052 - S3']";
        public static String valorModeloSQ5 = "//*[@id='carModel']//option[@value='71058 - SQ5']";
        public static String valorModeloTT = "//*[@id='carModel']//option[@value='71059 - TT']";

        //Elementos do Passo2


    }

    public static class anoVeiculo {
        public static String comboAnoVeiculo = "//*[@id='year']";
        public static String valorAno2013 = "//*[@id='year']/option[@value='2013']";
        public static String valorAno2014 = "//*[@id='year']/option[@value='2014']";
        public static String valorAno2015 = "//*[@id='year']/option[@value='2015']";
        public static String valorAno2016 = "//*[@id='year']/option[@value='2016']";
        public static String valorAno2017 = "//*[@id='year']/option[@value='2017']";
        public static String valorAno2018 = "//*[@id='year']/option[@value='2018']";
        public static String valorAno2019 = "//*[@id='year']/option[@value='2019']";
        public static String valorAno2020 = "//*[@id='year']/option[@value='2020']";
        public static String valorAno2021 = "//*[@id='year']/option[@value='2021']";
    }

    public static class estadoUF {
        public static String comboUFVeiculo = "//*[@id='states']";

        public static String valorUfAcre = "//*[@id='states']/option[@value='AC']";
        public static String valorUfAlagoas = "//*[@id='states']/option[@value='AL']";
        public static String valorUfAmapa = "//*[@id='states']/option[@value='AP']";
        public static String valorUfAmazonas = "//*[@id='states']/option[@value='AM']";
        public static String valorUfBahia = "//*[@id='states']/option[@value='BA']";
        public static String valorUfCeara = "//*[@id='states']/option[@value='CE']";
        public static String valorUfDistritoFederal = "//*[@id='states']/option[@value='DF']";
        public static String valorUfEspiritoSanto = "//*[@id='states']/option[@value='ES']";
        public static String valorUfGoias = "//*[@id='states']/option[@value='GO']";
        public static String valorUfMaranhao = "//*[@id='states']/option[@value='MA']";
        public static String valorUfMatoGrosso = "//*[@id='states']/option[@value='MT']";
        public static String valorUfmatoGrossoSul = "//*[@id='states']/option[@value='MS']";
        public static String valorUfMinasGerais = "//*[@id='states']/option[@value='MG']";
        public static String valorUfParana = "//*[@id='states']/option[@value='PR']";
        public static String valorUfParaiba = "//*[@id='states']/option[@value='PB']";
        public static String valorUfPara = "//*[@id='states']/option[@value='PA']";
        public static String valorUfPernambuco = "//*[@id='states']/option[@value='PE']";
        public static String valorUfPiaui = "//*[@id='states']/option[@value='PI']";
        public static String valorUfRioGrandeNorte = "//*[@id='states']/option[@value='RN']";
        public static String valorUfRioGrandeSul = "//*[@id='states']/option[@value='RS']";
        public static String valorUfRioJaneiro = "//*[@id='states']/option[@value='RJ']";
        public static String valorUfRondonia = "//*[@id='states']/option[@value='RO']";
        public static String valorUfRoraima = "//*[@id='states']/option[@value='RR']";
        public static String valorUfSantaCatarina = "//*[@id='states']/option[@value='SC']";
        public static String valorUfSergipe = "//*[@id='states']/option[@value='SE']";
        public static String valorUfSaoPaulo = "//*[@id='states']/option[@value='SP']";
        public static String valorUfTocantins = "//*[@id='states']/option[@value='TO']";

    }

    public static class versoesAudi {

        public static String comboVersaoVeiculo = "//*[@id='carVersion']";

        public static String valorTFSIAtractionGasolina2PAuto = "//*[@id='carVersion']/option[@value='578 - 1.4 TFSI ATTRACTION 16V 122CV GASOLINA 2P AUTOMATICO']";
        public static String valorTFSIAtractionGasolina4PAuto = "//*[@id='carVersion']/option[@value='581 - 1.4 TFSI ATTRACTION 16V 122CV GASOLINA 4P AUTOMATICO']";
        public static String valorTFSISportBackGasolina4PAuto = "//*[@id='carVersion']/option[@value='586 - 1.4 TFSI SPORTBACK AMBITION 16V 185CV GASOLINA 4P AUTOMATICO']";
        public static String valorTFSISportBackAttractionGasolina4PStronic = "//*[@id='carVersion']/option[@value='589 - 1.4 TFSI SPORTBACK ATTRACTION 16V 122CV GASOLINA 4P S-TRONIC']";
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
        public static String valorModelo3281i = "//*[@id='carModel']//option[@value='71103 - 328I']";
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
        public static String valorModeloCamaro = "//*[@id='carModel']/option[@value='71229 - CAMARO']";
        public static String valorModeloCaptiva = "//*[@id='carModel']/option[@value='71231 - CAPTIVA']";
        public static String valorModeloCelta = "//*[@id='carModel']/option[@value='71234 - CELTA']";
        public static String valorModeloClassic = "//*[@id='carModel']/option[@value='71239 - CLASSIC']";
        public static String valorModeloCobalt = "//*[@id='carModel']/option[@value='71240 - COBALT']";
        public static String valorModeloCobaltSedan = "//*[@id='carModel']/option[@value='72909 - COBALT SEDAN']";
        public static String valorModeloCorsa = "//*[@id='carModel']/option[@value='71242 - CORSA']";
        public static String valorModeloCruze = "//*[@id='carModel']/option[@value='71247 - CRUZE']";
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

    public static LinkedHashMap<String, String> MapTabelaAutoAvaliarMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();

        // COMUNS
        ret.put(urlPortalAutoAvaliar, "Portal Auto Avaliar");
        ret.put(menuTabelaAutoAvaliar, "Tabela Auto Avaliar");
        ret.put(textVamosComecar, "Vamos Começar");
        ret.put(comboMarca, "Marca");
        ret.put(comboModelo, "Modelo");
        ret.put(permitirTodosCookies, "Cookies");
        ret.put(btnLerPoliticaPrivacidade, "Botão Politicas de Privacidade");
        ret.put(btnEmAcordoPoliticasPrivacidade, "Botão Estou de acordo com a politica de privacidade");
        ret.put(botaoProximo, "Botão Próximo");
        ret.put(btnCaptchaEuNaoSouRobo, "CheckBox Captcha eu Nao Sou Robô");
        ret.put(btnProximoPassoDois, "Botão Próximo Passo 2");

        // MARCAS DE VEICULOS
        ret.put(marcas.valorMarcaAudi, "Marca Audi");
        ret.put(marcas.valorMarcaBMW, "Marca BMW");
        ret.put(marcas.valorMarcaChery, "Marca Chery");
        ret.put(marcas.valorMarcaChevrolet, "Marca Chevrolet");
        ret.put(marcas.valorMarcaChrysler, "Marca Chrysler");
        ret.put(marcas.valorMarcaCitroen, "Marca Citroen");
        ret.put(marcas.valorMarcaDodge, "Marca Dodge");
        ret.put(marcas.valorMarcaFiat, "Marca Fiat");
        ret.put(marcas.valorMarcaFord, "Marca Ford");
        ret.put(marcas.valorMarcaGeely, "Marca Geely");
        ret.put(marcas.valorMarcaHonda, "Marca Honda");
        ret.put(marcas.valorMarcaHyundai, "Marca Hyundai");
        ret.put(marcas.valorMarcaIveco, "Marca Iveco");
        ret.put(marcas.valorMarcaJac, "Marca Jac");
        ret.put(marcas.valorMarcaJaguar, "Marca Jaguar");
        ret.put(marcas.valorMarcaJeep, "Marca Jeep");
        ret.put(marcas.valorMarcaKia, "Marca Kia");
        ret.put(marcas.valorMarcaLandRover, "Marca LandRover");
        ret.put(marcas.valorMarcaLexus, "Marca Lexus");
        ret.put(marcas.valorMarcaLifan, "Marca Lifan");
        ret.put(marcas.valorMarcaMahindra, "Marca Mahindra");
        ret.put(marcas.valorMarcaMercedesBenz, "Marca Mercedes Benz");
        ret.put(marcas.valorMarcaMini, "Marca Mini");
        ret.put(marcas.valorMarcaMitsubishi, "Marca Mitsubishi");
        ret.put(marcas.valorMarcaMiura, "Marca Miura");
        ret.put(marcas.valorMarcaNissan, "Marca Nissan");
        ret.put(marcas.valorMarcaPeugeot, "Marca Peugeot");
        ret.put(marcas.valorMarcaPorsche, "Marca Porsche");
        ret.put(marcas.valorMarcaRenault, "Marca Renault");
        ret.put(marcas.valorMarcaSmart, "Marca Smart");
        ret.put(marcas.valorMarcaSsangyong, "Marca Ssangyong");
        ret.put(marcas.valorMarcaSubaru, "Marca Suburu");
        ret.put(marcas.valorMarcaSuzuki, "Marca Suzuki");
        ret.put(marcas.valorMarcaToyota, "Marca Toyota");
        ret.put(marcas.valorMarcaTroller, "Marca Troller");
        ret.put(marcas.valorMarcaVolkswagen, "Marca Volkswagen");
        ret.put(marcas.valorMarcaVolvo, "Marca Volvo");
        ret.put(marcas.valorMarcaRam, "Marca Ram");

        // MODELOS DA AUDI
        ret.put(modelosAudi.valorModeloA1, "Modelo A1");
        ret.put(modelosAudi.valorModeloA3, "Modelo A3");
        ret.put(modelosAudi.valorModeloA4, "Modelo A4");
        ret.put(modelosAudi.valorModeloA5, "Modelo A5");
        ret.put(modelosAudi.valorModeloA6, "Modelo A6");
        ret.put(modelosAudi.valorModeloA7, "Modelo A7");
        ret.put(modelosAudi.valorModeloQ3, "Modelo Q3");
        ret.put(modelosAudi.valorModeloQ5, "Modelo Q5");
        ret.put(modelosAudi.valorModeloQ7, "Modelo Q7");
        ret.put(modelosAudi.valorModeloQ8, "Modelo Q8");
        ret.put(modelosAudi.valorModeloRSQ3, "Modelo RS Q3");
        ret.put(modelosAudi.valorModeloRS4, "Modelo RS4");
        ret.put(modelosAudi.valorModeloRS6, "Modelo RS6");
        ret.put(modelosAudi.valorModeloS3, "Modelo S3");
        ret.put(modelosAudi.valorModeloSQ5, "Modelo SQ5");
        ret.put(modelosAudi.valorModeloTT, "Modelo TT");

        //ANO DOS VEICULOS
        ret.put(anoVeiculo.comboAnoVeiculo, "Combobox Ano do Veiculo");
        ret.put(anoVeiculo.valorAno2013, "Ano 2013");
        ret.put(anoVeiculo.valorAno2014, "Ano 2014");
        ret.put(anoVeiculo.valorAno2015, "Ano 2015");
        ret.put(anoVeiculo.valorAno2016, "Ano 2016");
        ret.put(anoVeiculo.valorAno2017, "Ano 2017");
        ret.put(anoVeiculo.valorAno2018, "Ano 2018");
        ret.put(anoVeiculo.valorAno2019, "Ano 2019");
        ret.put(anoVeiculo.valorAno2020, "Ano 2020");
        ret.put(anoVeiculo.valorAno2021, "Ano 2021");

        // UNIDADES FEDERATIVAS

        ret.put(estadoUF.comboUFVeiculo, "Combobox: UF do Veiculo");

        ret.put(estadoUF.valorUfAcre, "Estado do Acre");
        ret.put(estadoUF.valorUfAlagoas, "Estado de Alagoas");
        ret.put(estadoUF.valorUfAmapa, "Estado do Amapá");
        ret.put(estadoUF.valorUfAmazonas, "Estado do Amazonas");
        ret.put(estadoUF.valorUfBahia, "Estado da Bahia");
        ret.put(estadoUF.valorUfCeara, "Estado do Ceará");
        ret.put(estadoUF.valorUfDistritoFederal, "Estado do Distrito Federal");
        ret.put(estadoUF.valorUfEspiritoSanto, "Estado do Espirito Santo");
        ret.put(estadoUF.valorUfGoias, "Estado de Goias");
        ret.put(estadoUF.valorUfMaranhao, "Estado do Maranhão");
        ret.put(estadoUF.valorUfMatoGrosso, "Estado do Mato Grosso");
        ret.put(estadoUF.valorUfmatoGrossoSul, "Estado do Mato Grosso do Sul");
        ret.put(estadoUF.valorUfMinasGerais, "Estado de Minas Gerais");
        ret.put(estadoUF.valorUfParana, "Estado do Paraná");
        ret.put(estadoUF.valorUfParaiba, "Estado da Paraiba");
        ret.put(estadoUF.valorUfPara, "Estado do Pará");
        ret.put(estadoUF.valorUfPernambuco, "Estado de Pernambuco");
        ret.put(estadoUF.valorUfPiaui, "Estado do Piaui");
        ret.put(estadoUF.valorUfRioGrandeNorte, "Estado do Rio Grande do Norte");
        ret.put(estadoUF.valorUfRioGrandeSul, "Estado do Rio Grande do Sul");
        ret.put(estadoUF.valorUfRioJaneiro, "Estado do Rio de Janeiro");
        ret.put(estadoUF.valorUfRondonia, "Estado de Rondônia");
        ret.put(estadoUF.valorUfRoraima, "Estado de Roraima");
        ret.put(estadoUF.valorUfSantaCatarina, "Estado de Santa Catarina");
        ret.put(estadoUF.valorUfSergipe, "Estado de Sergipe");
        ret.put(estadoUF.valorUfSaoPaulo, "Estado de São Paulo");
        ret.put(estadoUF.valorUfTocantins, "Estado de Tocantins");

        // VERSÔES DO VEICULO

        ret.put(versoesAudi.comboVersaoVeiculo, "Combobox: Versão do Veiculo");
        ret.put(versoesAudi.valorTFSIAtractionGasolina2PAuto, "Versão: 1.4 TFSI ATTRACTION 16V 122CV GASOLINA 2P AUTOMATICO");
        ret.put(versoesAudi.valorTFSIAtractionGasolina4PAuto, "Versão: 1.4 TFSI ATTRACTION 16V 122CV GASOLINA 4P AUTOMATICO");
        ret.put(versoesAudi.valorTFSISportBackGasolina4PAuto, "Versão: 1.4 TFSI SPORTBACK AMBITION 16V 185CV GASOLINA 4P AUTOMATICO");
        ret.put(versoesAudi.valorTFSISportBackAttractionGasolina4PStronic, "Versão: 1.4 TFSI SPORTBACK ATTRACTION 16V 122CV GASOLINA 4P S-TRONIC");



        // MODELOS DA BMW
        ret.put(modelosBMW.valorModelo116i, "Modelo 116I");
        ret.put(modelosBMW.valorModelo118i, "Modelo 118I");
        ret.put(modelosBMW.valorModelo120i, "Modelo 120I");
        ret.put(modelosBMW.valorModelo125i, "Modelo 125I");
        ret.put(modelosBMW.valorModelo130i, "Modelo 130I");
        ret.put(modelosBMW.valorModelo220i, "Modelo 220I");
        ret.put(modelosBMW.valorModelo225i, "Modelo 225I");
        ret.put(modelosBMW.valorModelo316i, "Modelo 316I");
        ret.put(modelosBMW.valorModelo318i , "Modelo 318I");
        ret.put(modelosBMW.valorModelo320i, "Modelo 320I");
        ret.put(modelosBMW.valorModelo325i, "Modelo 325I");
        ret.put(modelosBMW.valorModelo3281i, "Modelo 328I");
        ret.put(modelosBMW.valorModelo330i, "Modelo 330I");
        ret.put(modelosBMW.valorModelo335i, "Modelo 335I");
        ret.put(modelosBMW.valorModelo420i, "Modelo 420I");
        ret.put(modelosBMW.valorModelo428i, "Modelo 428I");
        ret.put(modelosBMW.valorModelo430i, "Modelo 430I");
        ret.put(modelosBMW.valorModelo435i, "Modelo 435I");
        ret.put(modelosBMW.valorModelo528i, "Modelo 528I");
        ret.put(modelosBMW.valorModelo530e, "Modelo 530E");
        ret.put(modelosBMW.valorModelo530i, "Modelo 530I");
        ret.put(modelosBMW.valorModelo535i, "Modelo 535I");
        ret.put(modelosBMW.valorModelo540i, "Modelo 540I");
        ret.put(modelosBMW.valorModelo550i, "Modelo 550I");
        ret.put(modelosBMW.valorModelo650i, "Modelo 650I");
        ret.put(modelosBMW.valorModeloi3, "Modelo I3");
        ret.put(modelosBMW.valorModeloM140i, "Modelo M 140I");
        ret.put(modelosBMW.valorModeloM240i, "Modelo M 240I");
        ret.put(modelosBMW.valorModeloM3, "Modelo M3");
        ret.put(modelosBMW.valorModeloM5, "Modelo M5");
        ret.put(modelosBMW.valorModeloM6, "Modelo M6");
        ret.put(modelosBMW.valorModeloR1200GsAdv, "Modelo R 1200 GS ADVENTURE");
        ret.put(modelosBMW.valorModeloS1000XR, "Modelo S 1000 XR");
        ret.put(modelosBMW.valorModeloX1, "Modelo X1");
        ret.put(modelosBMW.valorModeloX2, "Modelo X2");
        ret.put(modelosBMW.valorModeloX3, "Modelo X3");
        ret.put(modelosBMW.valorModeloX4, "Modelo X4");
        ret.put(modelosBMW.valorModeloX5, "Modelo X5");
        ret.put(modelosBMW.valorModeloX6, "Modelo X6");
        ret.put(modelosBMW.valorModeloZ4, "Modelo Z4");

        // MODELOS DA CHEVROLET
        ret.put(modelosChevrolet.valorModeloAgile, "Modelo Agile");
        ret.put(modelosChevrolet.valorModeloAstra, "Modelo Astra");
        ret.put(modelosChevrolet.valorModeloBlazer, "Modelo Blazer");
        ret.put(modelosChevrolet.valorModeloCamaro, "Modelo Camaro");
        ret.put(modelosChevrolet.valorModeloCaptiva, "Modelo Captiva");
        ret.put(modelosChevrolet.valorModeloCelta, "Modelo Celta");
        ret.put(modelosChevrolet.valorModeloClassic, "Modelo Classic");
        ret.put(modelosChevrolet.valorModeloCobalt, "Modelo Cobalt");
        ret.put(modelosChevrolet.valorModeloCobaltSedan, "Modelo Cobalt Sedan");
        ret.put(modelosChevrolet.valorModeloCorsa, "Modelo Corsa");
        ret.put(modelosChevrolet.valorModeloCruze, "Modelo Cruze");
        ret.put(modelosChevrolet.valorModeloEquinox, "Modelo Equinox");
        ret.put(modelosChevrolet.valorModeloJoy, "Modelo Joy");
        ret.put(modelosChevrolet.valorModeloKadett, "Modelo Kadett");
        ret.put(modelosChevrolet.valorModeloMalibu, "Modelo Malibu");
        ret.put(modelosChevrolet.valorModeloMeriva, "Modelo Meriva");
        ret.put(modelosChevrolet.valorModeloMontana, "Modelo Montana");
        ret.put(modelosChevrolet.valorModeloOmega, "Modelo Omega");
        ret.put(modelosChevrolet.valorModeloOnix, "Modelo Onix");
        ret.put(modelosChevrolet.valorModeloOnixHatch, "Modelo Onix Hatch");
        ret.put(modelosChevrolet.valorModeloPrisma, "Modelo Prisma");
        ret.put(modelosChevrolet.valorModeloS10, "Modelo S10");
        ret.put(modelosChevrolet.valorModeloSonic, "Modelo Sonic");
        ret.put(modelosChevrolet.valorModeloSonicHatch, "Modelo Sonic Hatch");
        ret.put(modelosChevrolet.valorModeloSonicSedan, "Modelo Sonic Sedan");
        ret.put(modelosChevrolet.valorModeloSpin, "Modelo Spin");
        ret.put(modelosChevrolet.valorModeloTracker, "Modelo Tracker");
        ret.put(modelosChevrolet.valorModeloTrailblazer, "Modelo TrailBlazer");
        ret.put(modelosChevrolet.valorModeloVectra, "Modelo Vectra");
        ret.put(modelosChevrolet.valorModeloZafira, "Modelo Zafira");

        return ret;

    }
}
