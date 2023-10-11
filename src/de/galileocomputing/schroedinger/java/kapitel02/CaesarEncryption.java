package de.galileocomputing.schroedinger.java.kapitel02;

public class CaesarEncryption {
    public static void main(String[] args) {
        char buchstabe = 'V';
        char alphabetStart = 'A';
        int rotation = 6;

        buchstabe -= alphabetStart;
        buchstabe += rotation;
        buchstabe %= 26;
        buchstabe += alphabetStart;
        System.out.println(buchstabe);
    }
}
