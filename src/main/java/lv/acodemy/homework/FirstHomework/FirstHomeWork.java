package lv.acodemy.homework.FirstHomework;

import java.util.InputMismatchException;
import java.util.Scanner;


public class FirstHomeWork {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int data;
        String letter;

// Ineger: Positive-Negative, Even-Odd
        while (true) {

            System.out.println("Please enter some Integer value except 0 (to exit input any letter): ");
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


// Leap Year & Age
        System.out.println("Lets play with years (to quit please input any letter)");
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
        }


// Positive & Even
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

        scan.nextLine();

// Vowel Char
        System.out.println("Lets play with character");
        try {
            System.out.println("Please input some Char: ");
            letter = scan.nextLine();
            charAnalyser(letter);


        } catch (InputMismatchException e) {
            System.out.println("Was entered wrong character.");
            scan.nextLine();
        }

// BMI Check
        System.out.println("BMI (Body Mass Index)");
        double weight = doubleInput("weight");
        double height = doubleInput("height(in cm)") / 100.0;
        double bmi = weight / (height * height);
        System.out.printf("BMI = %.2f\n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else if (bmi < 35.0) {
            System.out.println("Obesity 1st degree");
        } else if (bmi < 40.0) {
            System.out.println("Obesity 2nd degree");
        } else {
            System.out.println("Obesity 3rd degree");
        }

// Student Grade
        double mathScore = doubleInput("Math Score");
        double scienceScore = doubleInput("Science Score");
        double englishScore = doubleInput("English Score");

        double averageScore = (mathScore + scienceScore + englishScore) / 3.0;
        System.out.printf("Grade %.0f \n",averageScore);
        if (averageScore > 90) {
            System.out.println("Grade A");
        } else if (averageScore > 80) {
            System.out.println("Grade B");
        } else if (averageScore > 70) {
            System.out.println("Grade C");
        } else if (averageScore > 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }

// File extension checker
        System.out.println("PLease input File name with extension");
        String fileName = scan.nextLine();
        filenameAnalyser(fileName);


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

    public static void charAnalyser(String letter) {
        if (letter.length() == 1) {
            deepCharAnalyser(letter);
        } else {
            System.out.printf("We ask to input only ONE letter. But you input %d. Sorry Game Is Over !\n", letter.length());
        }
    }

    public static void deepCharAnalyser(String letter) {
        char[] myLetter = letter.toUpperCase().toCharArray();
        if (myLetter[0] == 'A' || myLetter[0] == 'O' || myLetter[0] == 'U' || myLetter[0] == 'E' || myLetter[0] == 'I') {
            System.out.println("Vowel !!!");
        }
    }

    public static double doubleInput(String msg) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("Please input %s : \n", msg);
            return scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Was entered wrong number/character.");
            scan.nextLine();
            return 1.0;
        }
    }

    public static void filenameAnalyser(String fileName) {
        String[] splittedName = fileName.split("\\.");
        if (splittedName.length > 1) {
            if (splittedName[splittedName.length - 1].equals("txt") ||
                    splittedName[splittedName.length - 1].equals("doc") ||
                    splittedName[splittedName.length - 1].equals("pdf")) {
                System.out.printf("File extension %s\n", splittedName[splittedName.length - 1]);
                System.out.println("Valid file extension");

            } else {
                System.out.println("Invalid file extension");
            }
        } else {
            System.out.println("Invalid file extension");
        }
    }


}
