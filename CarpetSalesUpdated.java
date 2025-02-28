// Ashton Pleickhardt
// 2/26/2025
// Project 1

//import Scanner
import java.util.Scanner;

public class CarpetSales
{
	public static void main(String[] args) {
		
		//Initialize Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt user / Input
		System.out.print("Enter the carpet price per square foot: ");
		double pricePerSquareFoot = in.nextDouble();
		
		System.out.print("Enter the room width: ");
		int roomWidth = in.nextInt();
		
		System.out.print("Enter the room length: ");
		int roomLength = in.nextInt(); 
		
		
		//Order #1
		
		//Processing
		
		int roomArea1 = roomWidth * roomLength;
		
		final double WASTE_FEE = .20;
		
		double subTotalCarpetPrice1 = (pricePerSquareFoot * roomArea1); 
		
		double taxCalculation1 = subTotalCarpetPrice1 * WASTE_FEE;
		
		double totalCarpetPrice1 = subTotalCarpetPrice1 + taxCalculation1;
		
		
		//Labor Cost calculation
		
		final double LABOR_FEE = 0.75;
		
		double totalLaborCost1 = roomArea1 * LABOR_FEE;
		
		
		//Sales tax for carpet
		
		final double SALES_TAX = 0.07;
		
		double carpetSalesTax = totalCarpetPrice1 * SALES_TAX;
		
		double totalCost1 = carpetSalesTax + totalCarpetPrice1;
		
		
		//Sales tax for labor
		
		double laborSalesTax = totalLaborCost1 * SALES_TAX;
		
		totalCost1 += laborSalesTax + totalLaborCost1;
		
		
		//Total sales tax calculation
		
		double totalSalesTax1 = carpetSalesTax + laborSalesTax;
		
		
		
		//Output / print statements
		
		System.out.println("\nOrder #1");
		
		System.out.printf("Room: %d sq ft", roomArea1);
		
		System.out.printf("\nCarpet: $%.2f", totalCarpetPrice1);
		
		System.out.printf("\nLabor: $%.2f", totalLaborCost1);
		
		System.out.printf("\nTax: $%.2f", totalSalesTax1);
		
		System.out.printf("\nCost: $%.2f", totalCost1);
		
		
		
		//Order #2 
		
		
		//Input 2 
		
		int roomArea2 = roomWidth * roomLength;
		
		double subTotalCarpetPrice2 = (pricePerSquareFoot * roomArea2); 
		
		double taxCalculation2 = subTotalCarpetPrice2 * WASTE_FEE;
		
		double totalCarpetPrice2 = subTotalCarpetPrice2 + taxCalculation2;
		
		
		//Labor Cost calculation
		
		double totalLaborCost2 = roomArea2 * LABOR_FEE;
		
		
		//Sales tax for carpet
		
		double carpetSalesTax2 = totalCarpetPrice2 * SALES_TAX;
		
		double totalCost2 = carpetSalesTax2 + totalCarpetPrice2;
		
		
		//Sales tax for labor
		
		double laborSalesTax2 = totalLaborCost2 * SALES_TAX;
		
		totalCost2 += laborSalesTax2 + totalLaborCost2;
		
		
		//Total sales tax calculation
		
		double totalSalesTax2 = carpetSalesTax + laborSalesTax2;
		
		
		
		//Output / print statements
		
		System.out.println("Order #2");
		
		System.out.printf("\nRoom: %d sq ft", roomArea2);
		
		System.out.printf("\nCarpet: $%.2f", totalCarpetPrice2);
		
		System.out.printf("\nLabor: $%.2f", totalLaborCost2);
		
		System.out.printf("\nTax: $%.2f", totalSalesTax2);
		
		System.out.printf("\nCost: $%.2f", totalCost2);	
		
		
		
		
		//Order #3
		
		
		//Processing
		
		int roomArea3 = roomWidth * roomLength;
		
		double subTotalCarpetPrice3 = (pricePerSquareFoot * roomArea3); 
		
		double taxCalculation3 = subTotalCarpetPrice3 * WASTE_FEE;
		
		double totalCarpetPrice3 = subTotalCarpetPrice3 + taxCalculation3;
		
		
		//Labor Cost calculation
		
		double totalLaborCost3 = roomArea3 * LABOR_FEE;
		
		
		//Sales tax for carpet
		
		double carpetSalesTax3 = totalCarpetPrice3 * SALES_TAX;
		
		double totalCost3 = carpetSalesTax3 + totalCarpetPrice3;
		
		
		//Sales tax for labor
		
		double laborSalesTax3 = totalLaborCost3 * SALES_TAX;
		
		totalCost3 += laborSalesTax3 + totalLaborCost3;
		
		
		//Total sales tax calculation
		
		double totalSalesTax3 = carpetSalesTax3 + laborSalesTax3;
		
		
		
		//Output / print statements
		
		System.out.println("\n\nOrder #3");
		
		System.out.printf("Room: %d sq ft", roomArea3);
		
		System.out.printf("\nCarpet: $%.2f", totalCarpetPrice3);
		
		System.out.printf("\nLabor: $%.2f", totalLaborCost3);
		
		System.out.printf("\nTax: $%.2f", totalSalesTax3);
		
		System.out.printf("\nCost: $%.2f", totalCost3);
		
		
		
		//Total Cost of all 3 sales
		
		double totalSales = totalCost1 + totalCost2 + totalCost3;
		System.out.printf("\nTotal sales: %.2f", totalSales);
		
		
	}
}
