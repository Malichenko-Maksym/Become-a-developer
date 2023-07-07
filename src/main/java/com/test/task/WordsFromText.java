package com.test.task;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsFromText {
    public static String[] get(String textFrom){
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[_a-zA-Z0-9а-яА-Я`'()+-]+");
        Matcher matcher = pattern.matcher(textFrom);
        while (matcher.find()) {
            String str = matcher.group();
            words.add(str);
        }

        String[] result = new String[words.size()];
        return  words.toArray(result);
    }
}
