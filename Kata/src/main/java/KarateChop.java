package main.java;

import java.util.Arrays;

public class KarateChop {

    public int chop(int i, int[] values) {
        for (int index = 0; index < values.length;){
            if(i == values[index]) return index;
        }
        return -1;
    }

    public int chopValues(int i, int[] values) {
        int top [], bottom[];
        int n = values.length;
        top = Arrays.copyOfRange(values, 0, (n + 1)/2);
        bottom = Arrays.copyOfRange(values, (n + 1)/2, n);

        if (searchArray(top, i) == i) {
            return searchArray(top, i);
        }
        else {
            return searchArray(bottom, i);
        }
    }

    private int searchArray(int[] array, int x) {
        for(int index = 0 ; index < array.length;){
            if(x == array[index]) return index;
        }
        return -1;
    }
}
