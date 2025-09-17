# Java-Programming-_NIYONSENGA-Ange-Carine-223004810
case study 1:
package Supermarkets.bills;
import java.util.Scanner;

public class SupermarketBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask cashier how many items the customer bought
        System.out.print("Enter number of different items: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store item details
        String[] itemNames = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] subtotals = new double[n];

        double grandTotal = 0;

        // Input details for each item
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for item " + (i + 1) + ":");

            System.out.print("Item name: ");
            itemNames[i] = sc.nextLine();

            System.out.print("Price per unit: ");
            prices[i] = sc.nextDouble();

            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // consume newline

            // Calculate subtitle for this item
            subtotals[i] = prices[i] * quantities[i];
            grandTotal += subtotals[i];
        }

        // Apply discount if applicable
        double discount = 0;
        if (grandTotal > 50000) {
            discount = grandTotal * 0.05; // 5% discount
        }
        double finalAmount = grandTotal - discount;

        // Print receipt
        System.out.println("\n========== SUPERMARKET RECEIPT ==========");
        System.out.print("%-15s %-10s %-10s %-10s\n");
        for (int i = 0; i < n; i++) {
            System.out.print(quantities[i]);
        }
        System.out.println("-----------------------------------------");
        System.out.print(grandTotal);
        System.out.print(discount);
        System.out.print(finalAmount);
        System.out.println("=========================================");

        sc.close();
    }
}
case study 2:
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

case study 3
package classattendence.tracker
import java.util.Scanner;

public class classattendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for total students
        System.out.print("Enter total number of students in the class: ");
        int classSize = input.nextInt();

        int[] attendance = new int[10]; // max 10 days
        int days = 0;
        String choice;

        // Record attendance using do-while
        do {
            System.out.print("Enter number of students present on day " + (days + 1) + ": ");
            attendance[days] = input.nextInt();
            days++;

            System.out.print("Do you want to enter attendance for another day? (yes/no): ");
            choice = input.next();
        } while (choice.equalsIgnoreCase("yes") && days < 10);

        // Calculate average
        int totalPresent = 0, lowDays = 0;
        for (int i = 0; i < days; i++) {
            totalPresent += attendance[i];
            if (attendance[i] < classSize / 2) {
                lowDays++;
            }
        }
        double average = (double) totalPresent / days;

        // Print report
        System.out.println("\n===== ATTENDANCE REPORT =====");
        for (int i = 0; i < days; i++) {
            System.out.println("Day " + (i + 1) + "  " + attendance[i] + " present");
        }
        System.out.println("------------------------------");
        System.out.println("Average attendance: " + average);
        System.out.println("Days below 50% attendance: " + lowDays);
        double percentLow = (lowDays * 100.0) / days;
        System.out.println("Percentage of low attendance days: " + percentLow + "%");
    }
}
