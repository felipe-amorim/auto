package com.autoavaliar.support.convert;

import com.autoavaliar.intern.Instances;
import com.autoavaliar.support.convert.dates.Datter;
import org.apache.commons.lang.ArrayUtils;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Converter {

    public int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public int toInt(Object valor){
        int i = 0;
        try{
            i = Integer.parseInt(valor.toString().replaceAll("[^0-9]", ""));
        }catch (NumberFormatException e){
            throw new NullPointerException(Instances.getMessageNumberTooLong());
        }
        return i;
    }

    public List<String> objectToListString(Object input){
        if(input instanceof List){
            return (List<String>) input;
        }else {
            System.out.println("THE OBJECT IS NOT A LIST TYPE");
            return null;
        }
    }

    public long toLong(Object valor){
        return Long.parseLong(valor.toString().replaceAll("[^0-9]", ""));
    }

    public String toString(Object valor){
        return valor.toString();
    }

    public Date toDate(String data){
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Instances.setDateClassInstance(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public Datter getDate(){
        return Instances.getDatterClassInstance();
    }

    public List<String> listObjectToListString(List<Object> input){
        List<String> output = new ArrayList<>();
        for(Object o:input){
            output.add(o.toString().trim());
            System.out.println("ob: "+o.toString().trim());
        }
        return output;
    }

    public List<String> sortAlphabetically(List<String> input){
        return input.stream().sorted().collect(Collectors.toList());
    }

    public List<String> sortAlphabeticallyNumbersLast(List<String> input){
        List<String> output = new ArrayList<>();
        String myrules = "< a, A < b, B < c, C < d, D < e, E < f, F < g, G < h, H < i, I" +
                "< j, J < k, K < l, L < m, M < n, N < o, O < p, P < q, Q < r, R" +
                "< s, S < t, T < u, U < v, V < w, W < x, X < y, Y < z, Z" +
                "< 0 < 1 < 2 < 3 < 4 < 5 < 6 < 7 < 8 < 9";
        try {
            RuleBasedCollator myRuleBasedCollator = new RuleBasedCollator(myrules);
            input.sort(myRuleBasedCollator);
            output.addAll(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return output;
    }

}
