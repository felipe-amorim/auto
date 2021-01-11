package com.autoavaliar.products.apps.objetos.hg;

public class HGGeo {
    public static String hgGeoGetCountriesPost = "{\n" +
            "  \"lang\":\"pt-BR\"\n" +
            "}";

    public static String hgGeoGetCitiesPost = "{\n" +
            "  \"stateId\":arg0\n" +
            "}";

    public static String hgGeoGetByZipPost = "{\n" +
            "  \"zipCode\":\"arg1\",\n" +
            "  \"countryId\":arg0\n" +
            "}";


    public static String hgGeoGetCountriesPostResponse = "\"payload\":[{\"name\":\"ARGENTINA\",\"id\":\"32\",\"lang\":\"es-AR\"},{\"name\":\"BRASIL\",\"id\":\"76\",\"lang\":\"pt-BR\"},{\"name\":\"CHILE\",\"id\":\"152\",\"lang\":\"es-CL\"}]";

    public static String hgGeoGetStatesPostResponse = "\"payload\":[{\"initials\":\"AC\",\"name\":\"Acre\",\"id\":\"1\"},{\"initials\":\"AL\",\"name\":\"Alagoas\",\"id\":\"2\"},{\"initials\":\"AP\",\"name\":\"Amapá\",\"id\":\"3\"},{\"initials\":\"AM\",\"name\":\"Amazonas\",\"id\":\"4\"},{\"initials\":\"BA\",\"name\":\"Bahia\",\"id\":\"5\"},{\"initials\":\"CE\",\"name\":\"Ceará\",\"id\":\"6\"},{\"initials\":\"DF\",\"name\":\"Distrito Federal\",\"id\":\"7\"},{\"initials\":\"ES\",\"name\":\"Espirito Santo\",\"id\":\"8\"},{\"initials\":\"GO\",\"name\":\"Goias\",\"id\":\"9\"},{\"initials\":\"MA\",\"name\":\"Maranhão\",\"id\":\"10\"},{\"initials\":\"MT\",\"name\":\"Mato Grosso\",\"id\":\"11\"},{\"initials\":\"MS\",\"name\":\"Mato Grosso do Sul\",\"id\":\"12\"},{\"initials\":\"MG\",\"name\":\"Minas Gerais\",\"id\":\"13\"},{\"initials\":\"PR\",\"name\":\"Paraná\",\"id\":\"16\"},{\"initials\":\"PB\",\"name\":\"Paraíba\",\"id\":\"15\"},{\"initials\":\"PA\",\"name\":\"Pará\",\"id\":\"14\"},{\"initials\":\"PE\",\"name\":\"Pernambuco\",\"id\":\"17\"},{\"initials\":\"PI\",\"name\":\"Piauí\",\"id\":\"18\"},{\"initials\":\"RN\",\"name\":\"Rio Grande do Norte\",\"id\":\"20\"},{\"initials\":\"RS\",\"name\":\"Rio Grande do Sul\",\"id\":\"21\"},{\"initials\":\"RJ\",\"name\":\"Rio de Janeiro\",\"id\":\"19\"},{\"initials\":\"RO\",\"name\":\"Rondônia\",\"id\":\"22\"},{\"initials\":\"RR\",\"name\":\"Roraima\",\"id\":\"23\"},{\"initials\":\"SC\",\"name\":\"Santa Catarina\",\"id\":\"24\"},{\"initials\":\"SE\",\"name\":\"Sergipe\",\"id\":\"26\"},{\"initials\":\"SP\",\"name\":\"São Paulo\",\"id\":\"25\"},{\"initials\":\"TO\",\"name\":\"Tocantins\",\"id\":\"27\"}]";

    public static String hgGeoGetCitiesPostResponseAcre = "\"payload\":[{\"name\":\"Acrelândia\",\"id\":\"54\"},{\"name\":\"Assis Brasil\",\"id\":\"55\"},{\"name\":\"Brasiléia\",\"id\":\"56\"},{\"name\":\"Bujari\",\"id\":\"57\"},{\"name\":\"Capixaba\",\"id\":\"58\"},{\"name\":\"Cruzeiro do Sul\",\"id\":\"59\"},{\"name\":\"Epitaciolândia\",\"id\":\"60\"},{\"name\":\"Feijó\",\"id\":\"61\"},{\"name\":\"Jordão\",\"id\":\"62\"},{\"name\":\"Manoel Urbano\",\"id\":\"64\"},{\"name\":\"Marechal Thaumaturgo\",\"id\":\"65\"},{\"name\":\"Mâncio Lima\",\"id\":\"63\"},{\"name\":\"Plácido de Castro\",\"id\":\"66\"},{\"name\":\"Porto Acre\",\"id\":\"75\"},{\"name\":\"Porto Walter\",\"id\":\"67\"},{\"name\":\"Rio Branco\",\"id\":\"68\"},{\"name\":\"Rodrigues Alves\",\"id\":\"69\"},{\"name\":\"Santa Rosa do Purus\",\"id\":\"70\"},{\"name\":\"Sena Madureira\",\"id\":\"72\"},{\"name\":\"Senador Guiomard\",\"id\":\"71\"},{\"name\":\"Tarauacá\",\"id\":\"73\"},{\"name\":\"Xapuri\",\"id\":\"74\"}]";

    public static String hgGeoGetByZipPostResponse13184140 = "\"payload\":{\"zip\":\"13184140\",\"country\":{\"name\":\"BRASIL\",\"id\":\"76\"},\"address\":\"Rua Vergínia Lázaro Barbarini\",\"town\":\"Parque Ortolândia\",\"city\":{\"name\":\"Hortolândia\",\"id\":\"3485\"},\"id\":\"13650\",\"state\":{\"initials\":\"SP\",\"name\":\"São Paulo\",\"id\":\"25\"}}";
}
