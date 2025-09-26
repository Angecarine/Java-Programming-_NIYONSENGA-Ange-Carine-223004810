
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

