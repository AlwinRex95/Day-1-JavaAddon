package Day5;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[]MyNumbers= {1,2,3};
			System.out.println(MyNumbers[10]);
			} 
		catch(Exception  e) {
			// TODO: handle exception
			System.out.println("ERROR CHECKED");
		}
		finally {
			System.out.println("try catch is finished");
		}
	}

}
