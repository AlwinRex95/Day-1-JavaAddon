import java.util.*;

class EvenNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the starting value:");
        int a = in.nextInt();

        System.out.println("Enter the ending value:");
        int b = in.nextInt();

        System.out.println("Even numbers between " + a + " and " + b + " are:");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        in.close();
    }
}
