package Day2;

import java.util.Random;
import java.util.Scanner;

public class OTP{

   static int OTP() {
		Random ran = new Random();
		return 1000 + ran.nextInt(5000);
	}
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Number:");
		long num = in.nextLong();
		long a = 7806950961L;
		if (num==a) {
			int otp =OTP();
			System.out.println("one time password is"+ otp);
			
			System.out.println("Verified");
		} else {
			System.out.println("Invalid");
		}
		
	}
	
	
}


