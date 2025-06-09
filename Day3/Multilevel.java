package Day3;

class superclass{
	 void method1(){
		 System.out.println("Multilevel");
		 }
}
//subclass1
class subclass1 extends superclass{
	 void method2(){
		 System.out.println("Multilevel");
		 }
}
//subclass2
class subclass2 extends superclass{
	 void method3(){
		 System.out.println("Multilevel");
		 }
}
public class Multilevel {
	public static void main(String[] args) {
	subclass2 ref=new subclass2();
	ref.method1();
	ref.method3();
	subclass1 ref2=new subclass1();
	ref2.method2();
	}
}
