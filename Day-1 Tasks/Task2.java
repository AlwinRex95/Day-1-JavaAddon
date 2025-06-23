package Day1Tasks;

public class Task2 {

	public static void main(String[] args) {
		 double principal = 1000; // principal amount
	        double rate = 5;         // interest rate
	        double time = 2;         // time in years

	        double interest = 0;

	        // Calculate interest only if values are positive
	        if (principal > 0 && rate > 0 && time > 0) {
	            interest = (principal * rate * time) / 100;
	            System.out.println("Simple Interest is: " + interest);
	        }
	}

}
