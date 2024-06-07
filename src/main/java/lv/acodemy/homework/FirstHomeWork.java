package lv.acodemy.homework;

import java.util.InputMismatchException;
import java.util.Scanner;


public class FirstHomeWork {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int data;
        while (true) {

            System.out.println("Please enter some Integer value (except 0): ");
            try {
                data = scan.nextInt();
                if (data == 0) {
                    System.out.println("Please read rules more careful: you must enter Integer EXCEPT Zero.");
                    continue;
                }
                System.out.println("Let analysing...");
                System.out.printf("%d is %s\n", data, isEven(data) ? "Even" : "Odd");
                System.out.printf("%d is %s\n", data, isPositive(data) ? "Positive" : "Negative");


            } catch (InputMismatchException e) {
                System.out.println("Was number/character for this block ending");
                //e.printStackTrace();
                scan.nextLine();
                break;


            }
        }

        System.out.println("Lets play with years");
        while (true) {
            System.out.println("Please enter some Year (value must be > 0) ");
            System.out.println("or");
            System.out.println("Input age of somebody (value must be between 0-100): ");
            try {
                data = scan.nextInt();

                if (data == 0) {
                    System.out.println("Please read rules more careful: value must be > 0");
                    continue;
                }
                System.out.println("Let analysing...");
                if (data < 100) {
                    System.out.println("If entered value is age, that people is : " + (data <= 18 ? "Teenager" : "Adult"));
                    System.out.println("Otherwise you mean Year and ...");
                    System.out.printf("%d is %s\n", data, isLeapYear(data) ? "Leap year" : "not Leap year");

                } else {
                    System.out.printf("%d is %s\n", data, isLeapYear(data) ? "Leap year" : "not Leap year");
                }
                System.out.println("---");

            } catch (InputMismatchException e) {
                System.out.println("Was entered wrong number/character.");
                scan.nextLine();
                //e.printStackTrace();
                break;
            }

            try {
                System.out.println("Please input some Integer. If this will be Positive and Even, you will be informed");
                data = scan.nextInt();
                System.out.println((isPositiveAndEven(data) ? "Positive and Even" : ""));
            } catch (InputMismatchException e) {
                System.out.println("Was entered wrong number/character.");
                scan.nextLine();
            }
            try {
                System.out.println("Guess please, what kind of Integer we call \" Valid \" ?");
                System.out.println("Please input this number: ");
                data = scan.nextInt();
                System.out.println((isValid(data) ? "Valid !!!" : "... try again later."));
            } catch (InputMismatchException e) {
                System.out.println("Was entered wrong number/character");
                scan.nextLine();
            }

        }

    }


    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static boolean isPositive(int a) {
        return a > 0;

    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static boolean isPositiveAndEven(int a) {
        //return (a > 0 && a % 2 == 0);
        if (a > 0) {
            if (a % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int a) {
        return (isPositiveAndEven(a) && a < 100);
    }


}
