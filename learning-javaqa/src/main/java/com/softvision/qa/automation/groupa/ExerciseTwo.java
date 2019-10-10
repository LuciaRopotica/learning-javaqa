package com.softvision.qa.automation.groupa;

import java.util.Scanner;

public class ExerciseTwo {
    //Sa se implementeze o metoda care primeste ca parametru un numar natural N mai mare ca zero.
    // Sa se afiseze suma numerelor pare cuprinse intre zero si N,
    // si media numerelor impare cuprinse intre zero si N.
    static int n = 0;
    static int counterImpare = 0;
    static Double sumaPare = 0.0;
    static Double sumaImpare = 0.0;
    static Double mediaAritmetica = 0.0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Da o valoare lui n:");
        n = scan.nextInt();
        Calcul();
        scan.close();
    }

    public static void Calcul() {
        if (n < 0) {
            System.out.println("Valoarea lui n nu poate fi mai mica de 0.");
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    sumaPare = sumaPare + i;
                } else {
                    counterImpare = counterImpare + 1;
                    sumaImpare = sumaImpare + i;
                }
            }
            mediaAritmetica = sumaImpare / counterImpare;
            System.out.println("Suma numerelor pare cuprinse intre 0 si " + n + " este egala cu " + sumaPare);
            System.out.println("Media aritmetica a numerelor impare cuprinse intre 0 si " + n + " este egala cu " + mediaAritmetica);

        }
    }
}


