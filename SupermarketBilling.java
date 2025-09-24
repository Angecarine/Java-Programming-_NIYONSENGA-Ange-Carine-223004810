//on 17/09/2025
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
