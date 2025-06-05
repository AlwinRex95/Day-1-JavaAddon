import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter your PIN:");
        int pin = ref.nextInt();

        if (pin == 1234) {
            System.out.println("Enter your amount:");
            int amount = ref.nextInt();

            if (amount <= 5000) {
                System.out.println("Withdrawal successful. Dispensed: ₹" + amount);
            } else {
                System.out.println("Insufficient balance. Transaction failed.");
            }

        } else {
            System.out.println("Invalid PIN. Access denied.");
        }

        ref.close();
    }
}
