package com.softvision.qa.automation.groupa;
//Sa se implimenteze o metoda care primeste ca parametru 2 liste de numere si returneaza numerele comune celor doua liste.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseFour {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(4, 7, 8, 2, 9);
        List<Integer> l2 = Arrays.asList(3, 7, 9, 6, 10);

        List<Integer> result = intersectList(l1, l2);

        System.out.println(result);
    }

    private static boolean findInList(Integer e, List<Integer> list) {
        for (Integer elem: list) {
            if (e.equals(elem)) {
                return true;
            }
        }

        return false;
    }

    private static List<Integer> intersectList(List<Integer> l1, List<Integer> l2) {
        List<Integer> result = new ArrayList<>();

        for (Integer elem : l1) {
            if (findInList(elem, l2)) {
                result.add(elem);
            }
        }

        return result;
    }
}
