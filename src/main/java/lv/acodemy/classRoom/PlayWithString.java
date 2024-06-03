package lv.acodemy.classRoom;

public class PlayWithString {
    public static void main(String[] args) {
        String firstName = "Ruslan";
        String lastName = "Koshelev";

        String myText = "Concatenated Name" + firstName + " " + lastName;
        System.out.println();
        System.out.println(myText);
        System.out.println();

        int age = 51;

        String city = "Zolik";
        System.out.println("Concatenated text:  " + firstName + " " + lastName + " " + age + "years old and lives in " + city);
        System.out.printf("Using Interpolation: %s %s is %d years old and lives in %s\n", firstName, lastName, age, city);


    }
}
