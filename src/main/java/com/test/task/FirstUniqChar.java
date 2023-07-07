package com.test.task;

import java.util.*;

public class FirstUniqChar {
    public static Optional<Character> find(String wordFrom){

        Map<Character,Integer> frequency = new LinkedHashMap<>();

        for (int index=0; index<wordFrom.length(); index+=1){
            Character charAt = wordFrom.charAt(index);
            frequency.put(charAt, frequency.getOrDefault(charAt,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: frequency.entrySet()){
            Integer value = entry.getValue();
            if(value==1){
                 return  Optional.of(entry.getKey());
            }
        }

        return  Optional.empty();
    }
}
