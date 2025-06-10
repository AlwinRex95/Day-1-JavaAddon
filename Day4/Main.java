package Day4;


class Laptop{
	void Os() {
		System.out.println("Windows 10");
	}
}
class Update extends Laptop{
void Os() {
	System.out.println("Windows 11");
}
}
public class Main {

	public static void main(String[] args) {
		Update u=new Update();
		u.Os();
	}
}
