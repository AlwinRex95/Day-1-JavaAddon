package Day3;

public class Task3 {

	void payment(String Employees, int price) {
		System.out.println("No of Employees:"+Employees);
		System.out.println("Amount Paid:"+price);
	}
	void totalpayment(String Employees, double pay, double days) {
		double amount=  pay*days;
		System.out.println("Salary to be paid:"+amount);
	}
	
	public static void main(String[] args) {
		Task3 in=new Task3();
		in.payment("employee salary", 25000);
		in.totalpayment("Vicky",600, 1500);
	}

}
