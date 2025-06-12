package Day6;
import java.util.ArrayList;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<Object>arr=new ArrayList<Object>();
		arr.add("A");
		arr.add("Computer Technology");
		arr.add("3rd Year");
		arr.add("RVS");
		arr.add(1, "Alwin");
		//arr.remove(1);
		//arr.get(1);
		arr.add(2, "Rex");
		for (Object data:arr) {
			System.out.println(data);
		}
		
	}

}
