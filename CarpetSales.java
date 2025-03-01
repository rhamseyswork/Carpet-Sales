// Ashton Pleickhardt, Rhamseys Garcia
// 2/26/2025
// Project 1
// Carpet Sales Calculator Program
// This program calculates the total sales for carpet purchases for three orders.

//import Scanner
import java.util.Scanner;

public class CarpetSales
{
	public static void main(String[] args) {
		
		// Create Scanner object for user input
		Scanner scanner = new Scanner(System.in);
		
		// Order #1 input
        System.out.println("Input the price per sq foot:");
        double pricePerSquareFoot1 = scanner.nextDouble()+ .19;
        System.out.println("Input the room width: ");
        double roomWidth1 = scanner.nextDouble();
        System.out.println("Input the room length:");
        double roomLength1 = scanner.nextDouble();
		
		
		// Order #2 input
        System.out.println("Input the price per sq foot:");
        double pricePerSquareFoot2 = scanner.nextDouble()+ .25;
        System.out.println("Input the room width:");
        double roomWidth2 = scanner.nextDouble();
        System.out.println("Input the room length:");
        double roomLength2 = scanner.nextDouble();
		
		// Order #3 input
        System.out.println("Input the price per sq foot:");
        double pricePerSquareFoot3 = scanner.nextDouble()+ .224;
        System.out.println("Input the room width:");
        double roomWidth3 = scanner.nextDouble();
        System.out.println("Input the room length:");
        double roomLength3 = scanner.nextDouble();

		        // Calculations and Outputs for Order #1
        double roomArea1 = roomWidth1 * roomLength1;
        double carpetCost1 = roomArea1 * pricePerSquareFoot1;
         double laborCost1 = roomArea1 * 0.75; // Assuming labor cost is $0.75 per sq. ft.
         double tax1 = (carpetCost1 + laborCost1) * 0.07; // Assuming 7% tax rate
         double totalCost1 = carpetCost1 + laborCost1 + tax1;
         
         System.out.println("Order #1");
         int roundedRoomArea1 = (int) roomArea1; // Casting to int
         System.out.println("Room: " + roundedRoomArea1 + " sq ft");
         
        // Formatting the currency values to two decimal places
        System.out.printf("Carpet: $%.2f%n", carpetCost1);
        System.out.printf("Labor: $%.2f%n", laborCost1);
        System.out.printf("Tax: $%.2f%n", tax1);
        System.out.printf("Cost: $%.2f%n", totalCost1);

		         // Calculations and Outputs for Order #2
         double roomArea2 = roomWidth2 * roomLength2; // Calculate room area
         double carpetCost2 = roomArea2 * pricePerSquareFoot2; // Corrected Carpet cost calculation
         double laborCost2 = roomArea2 * 0.75; // Assuming labor cost is $0.75 per sq. ft.
         double tax2 = (carpetCost2 + laborCost2) * 0.07; // Corrected 7% tax calculation
         double totalCost2 = carpetCost2 + laborCost2 + tax2; // Corrected total cost calculation
         
         System.out.println("\nOrder #2");
         int roundedRoomArea2 = (int) roomArea2; // Casting room area to int
         System.out.println("Room: " + roundedRoomArea2 + " sq ft");
         
         // Formatting and printing output with two decimal places
         System.out.printf("Carpet: $%.2f%n", carpetCost2);
         System.out.printf("Labor: $%.2f%n", laborCost2);
         System.out.printf("Tax: $%.2f%n", tax2);
         System.out.printf("Cost: $%.2f%n", totalCost2);

		          // Calculations and Outputs for Order #3
         double roomArea3 = roomWidth3 * roomLength3;
         double carpetCost3 = roomArea3 * pricePerSquareFoot3;
         double laborCost3 = roomArea3 * 0.75; // Assuming labor cost is $0.75 per sq. ft.
         double tax3 = (carpetCost3 + laborCost3) * 0.07; // Assuming 7% tax rate
         double totalCost3 = carpetCost3 + laborCost3 + tax3;
         
         System.out.println("\nOrder #3");
         int roundedRoomArea3 = (int) roomArea3; // Casting to int
         System.out.println("Room: " + roundedRoomArea3 + " sq ft");
         
        // Formatting the currency values to two decimal places
        System.out.printf("Carpet: $%.2f%n", carpetCost3);
        System.out.printf("Labor: $%.2f%n", laborCost3);
        System.out.printf("Tax: $%.2f%n", tax3);
        System.out.printf("Cost: $%.2f%n", totalCost3);

		// Output total sales
        double totalSales = totalCost1 + totalCost2 + totalCost3;
        System.out.println("\nTotal Sales: $" + String.format("%.2f", totalSales));
        // Close scanner
        scanner.close();
    }
}
