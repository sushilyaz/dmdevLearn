package com.suhoi.collections.hw2;

import java.util.*;

public class WordUtil {
    private static final String EMPTY = "";
    public static String calcWordFrequency(String text) {
        text = text.replace(".", EMPTY)
        .replace(",", EMPTY)
        .replace("!", EMPTY);
        List<String> textArray = List.of(text.split(" "));
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : textArray) {
            if (wordFreq.containsKey(word)) {
                wordFreq.put(word, wordFreq.get(word) + 1);
            } else {
                wordFreq.put(word, 1);
            }
        }
        return wordFreq.toString();
    }
}
