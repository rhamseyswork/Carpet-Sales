// Rhamseys Garcia, Ashton Pleickhardt
// 2/26/2025 - 2/2_/25
// Project 1

//import Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class CarpetSales {
	final static double WASTE_FEE = .20;
	final static double LABOR_FEE = 0.75;
	final static double SALES_TAX = 0.07;
	
	public static ArrayList<Double> do_calc(double squareFootPrice, int width, int length){
		//Processing order 
		int area = width * length;
		double grossCarpetPrice = squareFootPrice * area;
		double taxCalc = grossCarpetPrice * WASTE_FEE;
		double totalPrice = grossCarpetPrice + taxCalc;
		
		//Labor Cost calculation
		double laborCost = area * LABOR_FEE;
		
		//Sales tax for carpet
		double carpetTax = totalPrice * SALES_TAX;
		double totalCost = carpetTax + totalPrice;
		
		//Sales tax for labor
		double laborTax = laborCost * SALES_TAX;
		totalCost += laborTax + laborCost;
		
		//Total sales tax calculation
		double totalTax = carpetTax + laborTax;

		ArrayList<Double> list = new ArrayList<>();

		// Creating an ArrayList to store the calculated values
        ArrayList<Double> resultList = new ArrayList<>();
        resultList.add((double) area);        
        resultList.add(totalPrice);           
        resultList.add(laborCost);            
        resultList.add(totalTax);            
        resultList.add(totalCost);            

        return resultList;
	}

	public static  void print_calc(ArrayList<Double> results){
		//Output / print statements
		System.out.printf("\nRoom: %d sq ft", results.get(0));
		System.out.printf("\nCarpet: $%.2f", results.get(1));
		System.out.printf("\nLabor: $%.2f", results.get(2));
		System.out.printf("\nTax: $%.2f", results.get(3));
		System.out.printf("\nCost: $%.2f", results.get(4));
	}
	public static void main(String[] args) {
			//Prompt user / Input
			try (Scanner scan = new Scanner(System.in)){
				while (true) {
					try{
						System.out.print("Enter the carpet price per square foot: ");
						double pricePerSquareFoot = scan.nextDouble();

						System.out.print("Enter the room width: ");
						int roomWidth = scan.nextInt();

						System.out.print("Enter the room length: ");
						int roomLength = scan.nextInt();

						// If inputs are valid, exit the loop
						if (pricePerSquareFoot > 0 && roomWidth > 0 && roomLength > 0) {
							ArrayList<Double> temp = do_calc(pricePerSquareFoot, roomWidth, roomLength);
							System.out.print(temp);
							print_calc(temp);
						} 
						else if(Double.toString(pricePerSquareFoot) == "exit" || Double.toString(roomWidth) == "exit" || Double.toString(roomLength) == "exit"){
							System.exit(200);
						} else {
							System.out.println("Invalid input. All values must be positive.");
						}
					} catch (Exception e) {
						System.out.println("Invalid input. Please enter numeric values.");
				}
			}
		}
	}
}
