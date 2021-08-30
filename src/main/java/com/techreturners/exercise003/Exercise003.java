package com.techreturners.exercise003;

import java.util.*;

public class Exercise003 {

    public Map<String, Integer> stock = new LinkedHashMap<>();

    public void setStock(Map<String, Integer> input){
        stock.putAll(input);
    }

    int getIceCreamCode(String iceCreamFlavour) {
        return stock.get(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return stock.keySet().toArray(new String[0]);
    }
}
