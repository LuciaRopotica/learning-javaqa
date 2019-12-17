package com.softvision.qa.automation.groupa;
//Sa se implimenteze o metoda care primeste ca parametru 2 liste de numere si returneaza numerele comune celor doua liste.

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;


public class ExerciseFour {
    public static void main(String[] args) {

 List<Integer> a1 = Arrays.asList(2,3,4,9,7,2,4);
 List<Integer> a2 = Arrays.asList(8,2,4);

        Set<Integer> result = intersectList(a1, a2);

        System.out.println(result);
    }

    private static boolean findInSet(Integer e, Set<Integer>set) {
        for (Integer elem: set) {
            if (e.equals(elem)) {
                return true;
            }
        }

        return false;
    }

    private static Set<Integer> intersectList(List<Integer> a1, List<Integer> a2) {
        HashSet<Integer> result = new HashSet<>();
        Set<Integer> s1 = new HashSet<Integer>(a1);
        Set<Integer> s2 = new HashSet<Integer>(a2);
        for (Integer elem : s1) {
            if (findInSet(elem, s2)) {
                result.add(elem);
            }
        }

        return result;
    }
}
