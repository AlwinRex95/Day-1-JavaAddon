package Day4;

interface studentone{
	abstract void m1();
}
interface studenttwo{
	abstract void m2();
}
class Execute implements studentone, studenttwo{
	
	public void m1() {
		System.out.println("********GBU*******");
	}
	public void m2() {
		System.out.println("welcome to the MarkAntony maamey");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Execute e=new Execute();
		e.m1();
		e.m2();
	}

}
