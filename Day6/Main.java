package Day6;

public class Main {
	public void run() {
	
		for(int i=1;i<=10;i++) {
			System.out.println("Hai Thread");
		}
	}
	
class Execute{
	

public static void main(String[] args) {
	Main m=new Main();
	m.run();
}
}
}