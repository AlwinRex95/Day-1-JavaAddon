package Day3;

public class Laptop {
	String modelname;
	float  size;
	
	Laptop(String name, float size){
		this.modelname=name;
		this.size=size;
		
	}
	Laptop(Laptop copy){
		this.modelname=copy.modelname;
	    this.size=copy.size;
	}
	void Display() {
		System.out.println("Laptop" +modelname +" "+ size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HP Pavilion");
		Laptop ref=new Laptop("HP", 10);
		ref.Display();
		System.out.println("Copy");
		Laptop ref2=new Laptop("HP Pavilion",10);
		ref.Display();
	
		
	}

}
