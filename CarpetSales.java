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
		
		
		//Processing order 
		
		int roomArea = roomWidth * roomLength;
		
		final double WASTE_FEE = .20;
		
		double subTotalCarpetPrice = (pricePerSquareFoot * roomArea); 
		
		double taxCalculation = subTotalCarpetPrice * WASTE_FEE;
		
		double totalCarpetPrice = subTotalCarpetPrice + taxCalculation;
		
		
		//Labor Cost calculation
		
		final double LABOR_FEE = 0.75;
		
		double totalLaborCost = roomArea * LABOR_FEE;
		
		
		//Sales tax for carpet
		
		final double SALES_TAX = 0.07;
		
		double carpetSalesTax = totalCarpetPrice * SALES_TAX;
		
		double totalCost = carpetSalesTax + totalCarpetPrice;
		
		
		//Sales tax for labor
		
		double laborSalesTax = totalLaborCost * SALES_TAX;
		
		totalCost += laborSalesTax + totalLaborCost;
		
		
		//Total sales tax calculation
		
		double totalSalesTax = carpetSalesTax + laborSalesTax;
		
		
		
		//Output / print statements
		
		System.out.printf("\nRoom: %d sq ft", roomArea);
		
		System.out.printf("\nCarpet: $%.2f", totalCarpetPrice);
		
		System.out.printf("\nLabor: $%.2f", totalLaborCost);
		
		System.out.printf("\nTax: $%.2f", totalSalesTax);
		
		System.out.printf("\nCost: $%.2f", totalCost);
	}
}
