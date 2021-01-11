package com.autoavaliar.products.apps.objetos.hg;

public class HgParticipant {
    public static String hgParticipantCpfExistsPost = "{\n" +
            "   \"cpf\":\"arg0\"\n" +
            "}";
    public static String hgParticipantEmailExists = "{\n" +
            "   \"email\":\"arg0\"\n" +
            "}";

    public static String hgParticipantCnpjExists = "{\n" +
            "   \"cnpj\":\"arg0\",\n" +
            "   \"countryId\" : arg1\n" +
            "}";
}
