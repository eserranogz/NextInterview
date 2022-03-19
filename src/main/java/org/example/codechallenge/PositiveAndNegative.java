package org.example.codechallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PositiveAndNegative {
    public static void main(String[] args) {

        int[] arr = new int[]{5,-5,2,6,9,-6,-2,1,-1,1};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.containsKey(-i)){
                map.put(-i,i);
            } else {
                map.put(i,null);
            }
        }

        Object[] array = map.entrySet().stream()
                .filter(e -> e.getValue() != null)
                .map(e -> Math.abs(e.getValue()))
                .toArray();

        System.out.println("array = " + Arrays.toString(array));

    }
}
