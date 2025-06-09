package Day3;

public class DefaultConstructor {
	//OOPS Concepts
	String language;
	String name;
	int year;
	DefaultConstructor(String name, int year,String lang ){
		this.name=name;
		this.year=year;
		this.language=lang;
		
	}
	//copy constructor
	DefaultConstructor(DefaultConstructor copy){
	this.name=copy.name;
	this.year=copy.year;
	this.language=copy.language;
	}
	void Display() {
		System.out.println("userdefine Constructor" + name +" "+ year+" "+language);
	}
	
	public static void main (String[] args) {
		
		//To create object
		//classname reference variable=new classname();
		System.out.println("Original Constructor");
		DefaultConstructor ref= new DefaultConstructor(" JAVA", 1995,"Programming");
		ref.Display();
		//reference to another object
		System.out.println("Copy Constructor");
		DefaultConstructor ref2= new DefaultConstructor(ref);
		ref2.Display();
	}

}
