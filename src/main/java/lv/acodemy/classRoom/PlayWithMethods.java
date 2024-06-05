package lv.acodemy.classRoom;

public class PlayWithMethods {
    public static void main(String[] args) {
        String name = "Russ";
        greeting(name);
        System.out.println(add(10, 5));
        int testValue = 10;
        System.out.printf("Number %d is %s \n", testValue, isEven(testValue) ? "Even" : "Odd");
        System.out.println(findMax(2, 4));

    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int findMax(int a, int b) {
       return (a > b) ? a : b;
    }
}
