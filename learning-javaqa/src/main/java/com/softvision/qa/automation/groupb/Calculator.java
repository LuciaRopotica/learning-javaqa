package com.softvision.qa.automation.groupb;
//Sa se implementeze un calculator ce citeste de la tastatura operatiile si returneaza rezultatul acestora.
//Operatii suportate: adunare, scadere, impartire, inmultire, ridicare la putere(^)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Type obj = new Type(argument)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        double number1 = scanner.nextInt();

        System.out.print("Enter Number2: ");
        double number2 = scanner.nextInt();

        System.out.println("Choices available are  ");
        System.out.println("1 - Add");
        System.out.println("2 - Substract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply");
        System.out.println("5 - Pow");


        System.out.print("Enter Choice ");
        int choice = scanner.nextInt();

        System.out.println("Your Choices are");
        System.out.println("Number1 " + number1);
        System.out.println("Number1 " + number2);
        System.out.println("Choice " + choice);

        performOperationUsingSwitch(number1, number2, choice);
    }

    private static void performOperationUsingNestedIfElse(double number1, double number2, int choice) {
        if (choice == 1) {
            System.out.println("Result " + (number1 + number2));
        } else if (choice == 2) {
            System.out.println("Result " + (number1 - number2));
        } else if (choice == 3) {
            System.out.println("Result " + (number1 / number2));
        } else if (choice == 4) {
            System.out.println("Result " + (number1 * number2));
        } else if (choice == 5) {
            System.out.println("Result " + Math.pow(number1, number2));
        } else {
            System.out.println("Invalid operation");
        }

    }



    private static void performOperationUsingSwitch(double number1, double number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result " + (number1 / number2));
                break;
            case 4:
                System.out.println("Result " + (number1 * number2));
                break;
            case 5:
                System.out.println("Result " + Math.pow(number1, number2));
                break;
            default:
                System.out.println("Invalid operation");

        }

    }
}
