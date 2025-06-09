package Day3;

public class singlelevel {
	void Message() {
		System.out.println("ALL IS WELL");
	}
		
}
class subclass extends singlelevel{
	void View() {
		System.out.println("Successfully Message Received");
	}
}
class Main{
	public static void main(String[] args) {
		
	subclass ref=new subclass();
		ref.Message();
		ref.View();
	}
}