package main.java;
import java.util.*;

public class RomanNumeral {

    TreeMap<Integer, String> romanNumeral = new TreeMap<Integer, String>(Collections.reverseOrder()){
        {
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(10, "X");
            put(50, "L");
            put(100, "C");
            put(500, "D");
            put(1000, "M");

        }
    };

    public String getRomanValue(int num) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> entry : romanNumeral.entrySet()) {
            for (int j = 1; j <= num / entry.getKey(); j++) {
                sb.append(romanNumeral.get(entry.getKey()));
            }
            num %= entry.getKey();
        }
        return sb.toString();
    }

 /*   public int getArabicValue(String s) {
        int sum = 0;
        int len = s.length() - 1;
        for (int i = 0; i < len; i++) {
            if (romanNumeral.get(s.charAt(i)) < romanNumeral.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum += map.get(s.charAt(len));
    }*/
}


  /* while (num >= entry.getKey()) {
                if (num == entry.getKey()) sb.append(entry.getValue());
                num = num % entry.getKey();
                sb.append(entry.getValue());
                if (num != 0) getRomanValue(num);
            }
        }*/

/*public String getRomanValue(int num) {
        String value = null;
        while(num > 0){
            value = romanValue(num);
        }

        return value;
    }
  /* public String romanValue(int num){
        List<String> romanNum = new ArrayList();
        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Integer, String> entry: romanNumeral.entrySet()){
            while(num >= entry.getKey()){
                if(num == entry.getKey()) return entry.getValue();

                num = num % entry.getKey();
                sb.append(entry.getValue());

/*    String convert(int arabic) {
        String roman = "";
        for (int i = 0; i < ARABIC_DIGITS.length; i++) {
            while (arabic >= ARABIC_DIGITS[i]) {
                roman += ROMAN_DIGITS[i];
                arabic -= ARABIC_DIGITS[i];
            }
        }
        return roman;
    }


class Roman{
    public static String IntegerToRoman(int n){
        String roman="";
        int repeat;
        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        repeat=n/1;
        for(int x=0; n>0; x++){
            repeat=n/magnitude[x];
            for(int i=1; i<=repeat; i++){
                roman=roman + symbol[x];
            }
            n=n%magnitude[x];
        }
        return roman;
    }

    public static void main(String args[]){
        System.out.println("12: "+IntegerToRoman(12));
        System.out.println("999: "+IntegerToRoman(999));
    }
}*/
