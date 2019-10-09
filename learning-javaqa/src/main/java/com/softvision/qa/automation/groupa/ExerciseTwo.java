package com.softvision.qa.automation.groupa;

public class ExerciseTwo {
    public static void main(String[] args) {
        int se = sumEven(10);
        System.out.println(se);
    }

    public static void printCount(int n) {
        for (int i = 0; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }

    public static int sumEven(int n) {
        int s = 0;
        for (int i = 0; i <= n; i = i + 2) {
            s = s + i;
        }
        return s;
    }
}


