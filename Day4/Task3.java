package Day4;

import java.util.Scanner;

class StudentManagementSystem {
    private String Name;
    private int marks;      
    private int TotalMarks; 

    StudentManagementSystem(String Name, int marks, int TotalMarks) {
        this.Name = Name;
        this.marks = marks;
        this.TotalMarks = TotalMarks;
    }

    public String getName() {
        return Name;
    }

    public int getmarks() {
        return marks;
    }

    public int getTotalMarks() {
        return TotalMarks;
    }

    public void displayMarkSheet() {
        System.out.println("********* STUDENT MARKSHEET ********");
        System.out.println("Student Name: " + Name);
        System.out.println("Total Marks Obtained: " + marks + " out of " + TotalMarks);
        if (TotalMarks > 225) {
			System.out.println("*****Pass Successfully****");
		} else {
			System.out.println("*******Fail******");
		}
    }
}

public class Task3 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("********* STUDENT MARKSHEET ********");
        System.out.print("Enter the Student Name: ");
        String studentName = an.nextLine();

        int totalMark =  600;

        int sumMarks = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int totalMarks = an.nextInt();
            sumMarks += totalMarks;
        }

        StudentManagementSystem student = new StudentManagementSystem(studentName, sumMarks, totalMark);

        System.out.println();
        student.displayMarkSheet();

        an.close();
    }
}


