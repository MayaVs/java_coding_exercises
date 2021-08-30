package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+"."+lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = originalPrice+originalPrice*vatRate/100;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(vat));
    }

    public String reverse(String sentence) {
        if(sentence.length() == 1)
            return sentence;
        else
            return reverse(sentence.substring(1))+sentence.charAt(0);
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
