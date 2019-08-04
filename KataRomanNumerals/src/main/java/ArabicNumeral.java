package main.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class ArabicNumeral {
    HashMap<String, Integer> romanNumeral = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);

        }
    };

    public int getArabicValue(String s) {
        int sum = 0;
        int len = s.length() - 1;
        for (int i = 0; i < len; i++) {
            if (romanNumeral.get(s.charAt(i)) < romanNumeral.get(s.charAt(i + 1))) {
                sum -= romanNumeral.get(s.charAt(i));
            } else {
                sum += romanNumeral.get(s.charAt(i));
            }
        }
        return sum += romanNumeral.get(s.charAt(len));
    }
}
