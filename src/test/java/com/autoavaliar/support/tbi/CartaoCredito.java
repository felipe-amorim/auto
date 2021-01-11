package com.autoavaliar.support.tbi;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CartaoCredito {

        private static final String[] VISA_PREFIX_LIST = new String[] { "4539",
                "4556", "4916", "4532", "4929", "40240071", "4485", "4716", "4" };

        private static final String[] MASTERCARD_PREFIX_LIST = new String[] { "51",
                "52", "53", "54", "55" };

        private static final String[] AMEX_PREFIX_LIST = new String[] { "34", "37" };

        private static final String[] DISCOVER_PREFIX_LIST = new String[] { "6011" };

        private static final String[] DINERS_PREFIX_LIST = new String[] { "300",
                "301", "302", "303", "36", "38" };

        private static final String[] ENROUTE_PREFIX_LIST = new String[] { "2014",
                "2149" };

        private static final String[] JCB_16_PREFIX_LIST = new String[] { "3088",
                "3096", "3112", "3158", "3337", "3528" };

        private static final String[] JCB_15_PREFIX_LIST = new String[] { "2100",
                "1800" };

        private static final String[] VOYAGER_PREFIX_LIST = new String[] { "8699" };

        private static Label LABEL;

        private static enum Label{VISA, MASTER, AMEX, DINERS;
            private static Label getLabel(final String label) {
                if(label.toUpperCase().equals("VISA")) return VISA;
                if(label.toUpperCase().equals("MASTER")) return MASTER;
                if(label.toUpperCase().equals("AMEX")) return AMEX;
                if(label.toUpperCase().equals("DINERS")) return DINERS;
                throw new IllegalArgumentException("Unknown Label: ["+ label +"]");
            }
        }

        private static String strrev(String str) {
            if (str == null)
                return "";
            String revstr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                revstr += str.charAt(i);
            }

            return revstr;
        }
        private static String completed_number(String prefix, int length) {

            String ccnumber = prefix;

            while (ccnumber.length() < (length - 1)) {
                ccnumber += new Double(Math.floor(Math.random() * 10)).intValue();
            }
            String reversedCCnumberString = strrev(ccnumber);

            List<Integer> reversedCCnumberList = new Vector<Integer>();
            for (int i = 0; i < reversedCCnumberString.length(); i++) {
                reversedCCnumberList.add(new Integer(String
                        .valueOf(reversedCCnumberString.charAt(i))));
            }
            int sum = 0;
            int pos = 0;

            Integer[] reversedCCnumber = reversedCCnumberList
                    .toArray(new Integer[reversedCCnumberList.size()]);
            while (pos < length - 1) {

                int odd = reversedCCnumber[pos] * 2;
                if (odd > 9) {
                    odd -= 9;
                }

                sum += odd;

                if (pos != (length - 2)) {
                    sum += reversedCCnumber[pos + 1];
                }
                pos += 2;
            }
            int checkdigit = new Double(
                    ((Math.floor(sum / 10) + 1) * 10 - sum) % 10).intValue();
            ccnumber += checkdigit;

            return ccnumber;

        }

        private static String[] credit_card_number(String[] prefixList, int length,
                                                   int howMany) {

            Stack<String> result = new Stack<String>();
            for (int i = 0; i < howMany; i++) {
                int randomArrayIndex = (int) Math.floor(Math.random()
                        * prefixList.length);
                String ccnumber = prefixList[randomArrayIndex];
                result.push(completed_number(ccnumber, length));
            }

            return result.toArray(new String[result.size()]);
        }

        private static String[] generateCardNumbers(int howMany) {
            return credit_card_number(getPrefixList(), 16, howMany);
        }

        private static String generateCardNumber() {
            return credit_card_number(getPrefixList(), 16, 1)[0];
        }

        private static String[] getPrefixList(){
            if(Label.VISA.equals(LABEL)) return VISA_PREFIX_LIST;
            if(Label.MASTER.equals(LABEL)) return MASTERCARD_PREFIX_LIST;
            if(Label.AMEX.equals(LABEL)) return AMEX_PREFIX_LIST;
            if(Label.DINERS.equals(LABEL)) return DINERS_PREFIX_LIST;
            return null;
        }
        
    
    public static String getCartaoCreditoRandom(){
        switch ((int)(Math.random() * 4 + 1)){
            case 1:
                LABEL = Label.getLabel("VISA");
                break;
            case 2:
                LABEL = Label.getLabel("MASTER");
                break;
            case 3:
                LABEL = Label.getLabel("AMEX");
                break;
            case 4:
                LABEL = Label.getLabel("DINERS");
                break;
        }
            return generateCardNumber();
    }

    public static String getCartaoCreditoVisa(){
        LABEL = Label.getLabel("VISA");
        return generateCardNumber();
    }
    public static String getCartaoCreditoMaster(){
        LABEL = Label.getLabel("DINERS");
        return generateCardNumber();
    }
    public static String getCartaoCreditoAmex(){
        LABEL = Label.getLabel("AMEX");
        return generateCardNumber();
    }
    public static String getCartaoCreditoDiners(){
        LABEL = Label.getLabel("DINERS");
        return generateCardNumber();
    }


}