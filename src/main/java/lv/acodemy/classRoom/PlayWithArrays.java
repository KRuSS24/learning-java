package lv.acodemy.classRoom;

import java.util.Arrays;

public class PlayWithArrays {
    public static void main(String[] args) {
        int[] intArray;
        intArray= new int[10];
        System.out.println(Arrays.toString(intArray));

        for(int i=1; i< intArray.length; i++){
            intArray[i]=++i;
        }
        System.out.println(Arrays.toString(intArray));
        int[] aaa = {1,2,3,4,5,6,7,8};
        String[] names = {"Alfa", "Bravo", "Charlie"};
        String[] fruits = {"Apple", "Banana", "Kiwi", "Orange", "Tomato"};
         for(String element: fruits)
            System.out.println(element);
        System.out.println(Arrays.toString(names));



    }
}
