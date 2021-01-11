package com.autoavaliar.support.tbi;

//import org.testng.annotations.Test;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Random;

public class GeradorCPF {
    public static String geraCPF(){

        int digito1 = 0, digito2 = 0, resto = 0;
        String numeroGerado;

        Random numeroAleatorio = new Random();


        //numeros gerados
        int n1 = numeroAleatorio.nextInt(10);
        int n2 = numeroAleatorio.nextInt(10);
        int n3 = numeroAleatorio.nextInt(10);
        int n4 = numeroAleatorio.nextInt(10);
        int n5 = numeroAleatorio.nextInt(10);
        int n6 = numeroAleatorio.nextInt(10);
        int n7 = numeroAleatorio.nextInt(10);
        int n8 = numeroAleatorio.nextInt(10);
        int n9 = numeroAleatorio.nextInt(10);


        int soma = n9*2 + n8*3 + n7*4 + n6*5 + n5*6 + n4*7 + n3*8 + n2*9 + n1*10;

        int valor = (soma / 11)*11;

        digito1 = soma-valor;

        //Primeiro resto da divisão por 11.
        resto = (digito1 % 11);

        if(digito1 < 2){
            digito1 = 0;
        }
        else {
            digito1 = 11-resto;
        }

        int soma2 = digito1 * 2 + n9*3 + n8*4 + n7*5 + n6*6 + n5*7 + n4*8 + n3*9 + n2*10 + n1*11;

        int valor2 = (soma2 / 11)*11;

        digito2 = soma2-valor2;

        //Primeiro resto da divisão por 11.
        resto = (digito2 % 11);

        if(digito2 < 2){
            digito2 = 0;
        }
        else {
            digito2 = 11-resto;
        }

        //Conctenando os numeros
        numeroGerado = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + String.valueOf(n4) +
                String.valueOf(n5) + String.valueOf(n6) + String.valueOf(n7) +String.valueOf(n8)  +
                String.valueOf(n9)+ String.valueOf(digito1) + String.valueOf(digito2);

        String cpf ="";
        try {
            MaskFormatter mf = new MaskFormatter("###########");
            mf.setValueContainsLiteralCharacters(false);
            cpf = mf.valueToString(numeroGerado);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return cpf;
    }

    public static String geraCPFPendente(){
        String cpf = "";
        do {
            cpf = geraCPF();
        } while (!cpf.endsWith("4"));
        return cpf;
    }

    public static String geraCPFSemPendenciaNovo(){
        String cpf = "";
        do {
            cpf = geraCPF();
        } while (!cpf.endsWith("0"));
        return cpf;
    }

    public static String geraCPFSemPendencia(){
        String cpf = "";
        do {
            cpf = geraCPF();
        } while (cpf.endsWith("4")||cpf.endsWith("3")||cpf.endsWith("8"));
        return cpf;
    }
}
