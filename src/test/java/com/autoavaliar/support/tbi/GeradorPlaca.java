package com.autoavaliar.support.tbi;

import com.autoavaliar.support.convert.Converter;

public class GeradorPlaca {
    public static String gerarPlaca(){
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Converter converter = new Converter();
        int indexPrimeiraLetra = converter.getRandomNumber(0, 25);
        int indexSegundaLetra = converter.getRandomNumber(0, 25);
        int indexTerceiraLetra = converter.getRandomNumber(0, 25);
        char primeiraLetra = alfabeto[indexPrimeiraLetra];
        char segundaLetra = alfabeto[indexSegundaLetra];
        char terceiraLetra = alfabeto[indexTerceiraLetra];
        int primeiroNumero = converter.getRandomNumber(0,9);
        int segundoNumero = converter.getRandomNumber(0,9);
        int terceiroNumero = converter.getRandomNumber(0,9);
        int quartoNumero = converter.getRandomNumber(0,9);
        return "" + primeiraLetra + segundaLetra + terceiraLetra + primeiroNumero + segundoNumero + terceiroNumero + quartoNumero;
    }
}
