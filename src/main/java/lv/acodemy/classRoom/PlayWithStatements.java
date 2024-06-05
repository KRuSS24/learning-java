package lv.acodemy.classRoom;

import lv.acodemy.Main;

import java.util.Random;

public class PlayWithStatements {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] temperatura = new int[10];
        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = rnd.nextInt(50)- rnd.nextInt(20);
        }

        for (int temp : temperatura) {
            if (temp < -10) {
                System.out.println("Very Cold: " + temp);
            } else if (temp >= -10 && temp < 0) {
                System.out.println("Just Cold: " + temp);
            } else if (temp >= 0 && temp < 10) {
                System.out.println("Little bit Cold: " + temp);
            } else if (temp >= 10 && temp < 20) {
                System.out.println("Warm: " + temp);
            } else if (temp >= 20 && temp < 30) {
                System.out.println("Hot: " + temp);
            } else {
                System.out.println("Very Hot: " + temp);
            }
        }
    }
}
