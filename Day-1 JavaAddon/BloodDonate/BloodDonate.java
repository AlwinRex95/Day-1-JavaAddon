import java.util.Scanner;

public class BloodDonate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

     
        System.out.print("Enter your weight: ");
        int weight = scanner.nextInt();

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to Donate Blood!");
            } else {
                System.out.println("You are not eligible to Donate Blood. Your weight must be at least 50kg.");
            }
        } else {
            System.out.println("You are not eligible to Donate Blood. You must be at least 18 years old.");
        }

        scanner.close();
    }
}

