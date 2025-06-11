package Day5;
import java.io.FileWriter;
import java.io.IOException;
public class Task3 {

	public static void main(String[] args) {
	try {
		FileWriter myWriter =new FileWriter("C:\\Users\\TEMP.KGISLEDU.000\\Documents\\Task3.txt");
		myWriter.write("Files in Java might be tricky,but it is fun enough");
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	}catch (IOException e) {
		System.out.println("File not exist");
	}
	}

}
