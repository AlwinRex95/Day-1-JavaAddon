package Day5;

import java.io.*;
public class Main {

	public static void main(String[] args) {
		String filename="D:\\Program Files\\eclipse-jee-2024-09-R-win32-x86_64\\eclipse\\Placement\\src\\Day1\\ATM.java";
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
		String Line;
				if((Line = br.readLine())!=null) {
					System.out.println(Line);
				}
	
	}
	catch(Exception e) {
		System.out.println("File not Found");
	}

}
}