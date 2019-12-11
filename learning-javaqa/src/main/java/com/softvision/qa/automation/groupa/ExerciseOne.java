package com.softvision.qa.automation.groupa;

public class ExerciseOne {
    //Sa se implementeze o metoda care primeste ca parametru o lista de stringuri si
    // sa se afiseze pentru fiecare lungimea si numarul de spatii.

    public static void main (String[] args) {
    String[] toppings = {"Blue cheese", "Pepperoni", "Mushrooms", "Black  Olives"};
    printInfo(toppings);
}

    private static void printInfo(String[] toppings) {
        for (int i = 0; i < toppings.length; i++) {
            int numberOfSpaces = 0;

            for (int j = 0; j < toppings[i].length(); j++) {
                if (toppings[i].charAt(j) == ' ') {
                    numberOfSpaces = numberOfSpaces + 1;
                }
            }

            System.out.println(toppings[i] + " " + toppings[i].length() + " " + numberOfSpaces);
        }
    }
}