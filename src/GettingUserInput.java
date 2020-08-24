import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        String firstName, lastName;
        int age;

        System.out.println("Please enter your first name: ");

        firstName = keybd.nextLine();

        System.out.println("Hi, " + firstName + "\nNow enter your age: ");

        // at this point, user types 26, and then hits enter
        // 26\n

        age =keybd.nextInt(); //age = 26 \n
        keybd.nextLine(); //the Scanner moves past the \n

        System.out.println("Your are "+ age + " years old!");

        System.out.println("What is your last name?");

        lastName = keybd.nextLine(); // lastName = whatever user types

        System.out.println("Your last name is " + lastName);

    }

}
