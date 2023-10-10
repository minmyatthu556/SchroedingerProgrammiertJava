package de.galileocomputing.schroedinger.java.kapitel02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaOperations {
    public static void main(String[] args) {
        BigDecimal zehn = new BigDecimal("10");
        BigDecimal drei = new BigDecimal("3");
        BigDecimal ergebnis = zehn.divide(drei, 16, RoundingMode.HALF_UP);
        System.out.println(ergebnis);
    }
}
