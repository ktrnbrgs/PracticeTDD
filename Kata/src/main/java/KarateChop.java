package main.java;

public class KarateChop {

    public int chop(int i, int[] values) {
        for (int index = 0; index < values.length;){
            if(i == values[index]) return index;
        }
        return -1;
    }
}
