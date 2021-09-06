package com.techreturners.exercise005;

import java.util.HashMap;
import java.util.Map;

public class Exercise005 {

    public boolean isPangram(String input) {
        if(input.isEmpty()) return false;

        String checkStr = input.toLowerCase().replaceAll("[^a-z]", "");
        Map<Character, Boolean> checkMap = new HashMap<>();

        for (int i = 0; i < checkStr.length(); ++i) checkMap.put(checkStr.charAt(i), true);
        return checkMap.size() == 26;
    }

}
