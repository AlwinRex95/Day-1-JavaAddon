package Day3Tasks;

public class Task1 {
	void fulltime(double salary) {
		System.out.println("Salary of full time employee:"+salary);
		}
		void parttime(double amount,int hours) {

		double psalary=amount*hours;
		System.out.println("Salary of parttime employee:"+psalary);
		}
		void freelancer(double amount,int hours,double bonus) {
		double fsalary=amount*hours+bonus;
		System.out.println("Salary of Freelancer employee:"+fsalary);
		}
		public static void main(String[] args) {
		Task1 in=new Task1();

		in.fulltime(100000);

		in.parttime(100,80);

		in.freelancer(1000, 10, 1000);
		}

}
