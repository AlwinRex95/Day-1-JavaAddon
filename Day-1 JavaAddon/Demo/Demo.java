import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the age is valid
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote. You must be at least 18 years old.");
        }

        scanner.close();
    }
}
