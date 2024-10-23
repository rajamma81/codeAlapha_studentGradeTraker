package JAVATASKS;
import java.util.Scanner;

import java.util.ArrayList;

public class StudentGradeTracker {

	public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = scanner.nextInt();
	        
	        ArrayList<Integer> grades = new ArrayList<>();

	        System.out.println("Enter the grades for the students: ");
	        for (int i = 0; i < numberOfStudents; i++)
	        {
	            System.out.print("Grade for student " + (i + 1) + ": ");
	            int grade = scanner.nextInt();
	            grades.add(grade); 
	        }

	        int sum = 0;
	        int highest = grades.get(0);
	        int lowest = grades.get(0);

	        for (int grade : grades) 
	        {
	            sum += grade;

	            if (grade > highest) 
	            {
	                highest = grade;
	            }
	            if (grade < lowest) 
	            {
	                lowest = grade;
	            }
	        }

	        double average = (double) sum / numberOfStudents;

	        System.out.println("\nGrade Summary:");
	        System.out.println("Average Grade: " + average);
	        
	        System.out.println("Highest Grade: " + highest);
	        System.out.println("Lowest Grade: " + lowest);
	        
	        
	        scanner.close();
	}
}
