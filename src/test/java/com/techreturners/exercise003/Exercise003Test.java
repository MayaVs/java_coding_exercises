package com.techreturners.exercise003;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Exercise003Test {

    private Exercise003 ex003;

    @Before
    public void setup() {
        ex003 = new Exercise003();
        Map<String, Integer> s = new LinkedHashMap<>();
        s.put("Pistachio", 0);
        s.put("Raspberry Ripple", 1);
        s.put("Vanilla", 2);
        s.put("Mint Chocolate Chip", 3);
        s.put("Chocolate", 4);
        s.put("Mango Sorbet", 5);
        ex003.setStock(s);

    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {
        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }


}
