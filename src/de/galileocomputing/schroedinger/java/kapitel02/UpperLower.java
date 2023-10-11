package de.galileocomputing.schroedinger.java.kapitel02;

public class UpperLower {
    public static void main(String[] args) {
        char zeichen = 'b';
        System.out.println("Buchstabe: " + Character.isLetter(zeichen));
        System.out.println("Großbuchstabe: " + Character.isUpperCase(zeichen));
    }
}
