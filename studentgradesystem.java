package studentGrading.system;
import java.util.Scanner;

public class studentgradesystem {

	
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int totalStudents = 0;
		        int passes = 0;
		        int fails = 0;

		        while (true) {
		            System.out.print("Enter student marks (0–100) or -1 to stop: ");
		            int marks = sc.nextInt();

		            // check for sentinel value
		            if (marks == -1) {
		                break;
		            }

		            // validate marks
		            if (marks < 0 || marks > 100) {
		                System.out.println("Invalid marks! Please enter between 0 and 100.");
		                continue; // skip invalid input
		            }

		            totalStudents++;

		            // determine grade
		            char grade;
		            if (marks >= 80) {
		                grade = 'A';
		            } else if (marks >= 70) {
		                grade = 'B';
		            } else if (marks >= 60) {
		                grade = 'C';
		            } else if (marks >= 50) {
		                grade = 'D';
		            } else {
		                grade = 'F';
		            }

		            // print grade
		            System.out.println("Student Grade: " + grade);

		            // pass/fail count
		            if (marks >= 50) {
		                passes++;
		            } else {
		                fails++;
		            }
		        }

		        // summary report
		        System.out.println("\n========== CLASS SUMMARY ==========");
		        System.out.println("Total Students: " + totalStudents);
		        System.out.println("Passed: " + passes);
		        System.out.println("Failed: " + fails);

		        if (totalStudents > 0) {
		            double passRate = (passes * 100.0) / totalStudents;
		            System.out.print(passRate);
		        } else {
		            System.out.println("No student data entered.");
		        }
		        System.out.println("===================================");

		        sc.close();
		    }
		


	}


