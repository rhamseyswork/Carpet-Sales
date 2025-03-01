Project One
Programming Fundamentals
Github: https://github.com/rhamseyswork/carpet-sales
Objectives of this lab: 
Learn some basics about computer systems
Learn about problem solving and programming
Design algorithms, flowcharts, and trace tables
Project Name: Project 1 Carpet Sales
Group Members: Ashton Pleickhardt, Rhamseys Garcia
Project Description: Carpet Sales 
Date: 02/13/2025


Task Scheduling




Completed by


Communication


Notes

Created Task Division Table




2/18/2025
N/A

Completed by:
Ashton Pleickhardt

Exercise 1.1 




Completed on 2/25/25



N/A
Completed by:
Ashton Pleickhardt

Exercise 1.2 



Completed on 2/25/25



N/A
Completed by:
Ashton Pleickhardt


Exercise 1.3 



Completed on 2/28/25

N/A
Assigned to:
Rhamseys Garcia
Part 2.1
Completed on 2/28/25
N/A
Assigned to:
Rhamseys Garcia
and Ashton Pleickhardt
Part 2.2
Completed on 2/27/25
N/A
Assigned to:
Ashton Pleickhardt 











Program Design Process
Problem solving is usually broken into two major phases: 
1) Problem solving phase, and 2) Implementation phase. 
Phase (1) - In the first phase, you will take three steps: 
Step I: You will define the problem that you want to solve, clearly. 
Step II: You will design an algorithm that is precise and very well thought to solve the problem, and 
Step III: You will test your algorithm on paper.  Your algorithm should work correctly, before you can write a program for it. 
Phase (2) -In this phase, you will take two steps: 
Step I: Translate your algorithm to Java language.  If you have a correct and precise algorithm, the translation should be almost line-by-line.  This translation must be correct and free of: 
A) Syntax errors, which are the errors resulted from incorrect use of the programming language syntax or violation of syntax rules.
B) Computations that are not possible, such as dividing by 0, and
C) Errors made by the programmer.  Such errors are those made by using wrong signs or arithmetic operators.
Step II: Test the program to make sure it produces the correct results.  Make sure your test cases are different.  The only way to correctly test a program is to have many different test cases. 











Part One: Algorithms and flowcharts
___________________________________________
Exercise 1.1  
In the following diagram write a question in the blank box that best fits the statements that have appeared after the box. Assume that just before the blank box you have read the values for x and y.










In the following diagram write an English statement in the blank box that best fits the statement that has appeared before the box. 

 
  

Exercise 1.2 
Kids of various ages may wish to play soccer. A soccer club may not have teams for kids 5 and under. 
One level of teams is listed as “Under 8” (or just U8), which is understood to mean just 7 or 6, but not 5 or younger.
Likewise, U10 means 9 and 8, and U12 means 11 or 10. 
No teams exist for ages 12 and over.
Design a flowchart to represent Input (ask the player to enter their age), then make a decision and output a message that reflects which team (level) they will join. If they cannot join any level print a message that explains why.



Include a screenshot of your flowchart here: (use any software of your choice)


Link to flowchart
Exercise 1.3
Write an algorithm in Pseudo Code that determines how many times a name occurs in a list of names. Refer to the algorithm examples from Ch. 1 slides.
For example:




The algorithm should find how many times the name Emma occurs in the list.
Note: use bullets and indent instructions that demonstrate repetition.
Initialize a counter to track occurrences of the name "Emma."
Loop through the list, starting at index 2:
Store the name at index 2 in a variable called initialName.
Create another nested loop to iterate over the remaining elements:
Start at index + 1 from initialName. 
Store each name in a variable called compareName. 
If initialName is equal to compareName:
Append the index of compareName to a list of duplicates.
Remove duplicate indices from the list after iteration.
Count occurrences of "Emma". 
Return the final count of "Emma".

Part Two: Simple Java Programs

A.CarpetSales.java


Write a program to calculate the cost for replacing carpet for a single room. Carpet is priced by square foot. Total cost includes carpet, labor and sales tax. Dollar values are output with two decimals. For example, System.out.printf("Cost: $%.2f", cost);

Note: This program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step but confirm progress.


Step 1. Read from input the carpet price per square foot (double), room width (int) and room length (int). Calculate the room area in square feet. Calculate the carpet price based on square feet with an additional 20% for waste. Output square feet and carpet cost. Submit for grading to confirm 1 test passes.


Ex: If the input is:
1.10 15 12
the output is:
Room: 180 sq ft
Carpet: $237.60


Step 2. Calculate the labor cost for installation ($0.75 per actual square foot). Output labor cost. Submit for grading to confirm 2 tests pass.

Ex: If the input is:
0.95 10 16
the output is:
Room: 160 sq ft
Carpet: $182.40
Labor: $120.00


Step 3. Calculate sales tax (7%) on carpet and labor cost. Total cost includes carpet, labor and sales tax. Output sales tax and total cost. Submit for grading to confirm 3 tests pass.


Ex: If the input is:
1.25 8 8
the output is:
Room: 64 sq ft
Carpet: $96.00
Labor: $48.00
Tax: $10.08
Cost: $154.08


Step 4. Repeat steps 1-3 including additional input for a second order (one order per line). Maintain total sales for both orders. Output information for each order with a heading and then total sales for both orders. Submit for grading to confirm 4 tests pass.


Ex: If the input is:


0.95 12 12
1.25 8 18
the output is:
Order #1
Room: 144 sq ft
Carpet: $164.16
Labor: $108.00
Tax: $19.05
Cost: $291.21


Order #2
Room: 144 sq ft
Carpet: $216.00
Labor: $108.00
Tax: $22.68
Cost: $346.68


Total Sales: $637.89


Step 5. Repeat steps 1-3 including additional input for a third order (one order per line). Maintain total sales for all orders. Output information for each order with a heading and then total sales for all orders. Submit for grading to confirm all tests pass.


Ex: If the input is:
0.95 12 12
1.25 8 18
1.12 10 17

the output is:
Order #1
Room: 144 sq ft
Carpet: $164.16
Labor: $108.00
Tax: $19.05
Cost: $291.21


Order #2
Room: 144 sq ft
Carpet: $216.00
Labor: $108.00
Tax: $22.68
Cost: $346.68


Order #3
Room: 170 sq ft
Carpet: $228.48
Labor: $127.50
Tax: $24.92
Cost: $380.90


Total Sales: $1018.79

1) Problem Definition: 
Create an algorithm to calculate the total cost by user Input of room area and cost of supplies and labor. 
2) Program Design - Algorithm 
Before we attempt to write the program, let's develop an algorithm for solving the problem. 
Exercise 2.1
Design the algorithm for this problem written in Pseudo Code.  Remember your algorithm must be precise. This algorithm must be translated to java code to obtain the program. 
Begin
CONSTANT WASTE_FEE = 0.20
CONSTANT LABOR_FEE = 0.75 
CONSTANT SALES_TAX = 0.07 
totalSales = 0
For orderNumber from 1 to 3:
print “Input the price per sq foot:”
Input pricePerSquareFoot
Print “Input the room width:”
input roomWidth
Print “Input the room length:”
input roomLength
roomArea = roomWidth x roomLength
subTotalCarpetPrice = pricePerSquareFoot x roomArea
taxCalculation = subTotalCarpetPrice x WASTE_FEE
totalCarpetPrice = subTotalCarpetPrice + taxCalculation
totalLaborCost = roomArea x LABOR_FEE
carpetSalesTax = totalCarpetPrice x SALES_TAX
laborSalesTax = totalLaborCost x SALES_TAX
totalSalesTax = carpetSalesTax + laborSalesTax
totalCost = totalCarpetPrice + totalLaborCost + totalSalesTax
totalSales = totalSales + totalCost
Print the Order number
Print the room area in sq ft
Print Carpet cost
Print the labor cost
Print tax cost
Print total cost of all those components added up
Print total sales in dollars

3) Desktop Testing- Trace Table
Now that you have the algorithm, create a Trace Table to test your algorithm and see if it works on paper. Remember, your table should have at least two columns, for the variables and for expected output.
1
Price per sq. foot = 1.10
pricePerSquareFoot
1.10
2
Room width = 15
roomWidth
15
3
Room length = 12
roomLength
12
4
Calculate Room Area
roomArea = 15 × 12
180 sq ft
5
Carpet Cost (Before Waste)
subTotalCarpetPrice = 1.10 × 180
198.00
6
Waste Calculation
taxCalculation = 198.00 × 0.20
39.60
7
Total Carpet Cost
totalCarpetPrice = 198.00 + 39.60
237.60
8
Labor Cost Calculation
totalLaborCost = 180 × 0.75
135.00
9
Sales Tax for Carpet
carpetSalesTax = 237.60 × 0.07
16.63
10
Sales Tax for Labor
laborSalesTax = 135.00 × 0.07
9.45
11
Total Sales Tax
totalSalesTax = 16.63 + 9.45
26.08
12
Total Cost Calculation
totalCost = 237.60 + 135.00 + 26.08
398.68
13
Final Output for Order #1
Room: 180 sq ft
Carpet: $237.60
Labor: $135.00
Tax: $26.08
Cost: $398.68



4) Implementing the Algorithm into Java Code 
Exercise 2.2
This is where you will translate the algorithm to Java Code.  Write a program called CarpetSales.java that is designed based on the algorithm that is given in the previous part. 

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

		//Prompt user / Input Order #1
		System.out.print("Input the price per sq foot: ");
		double pricePerSquareFoot = in.nextDouble();
		
		System.out.print("\nInput the room width: ");
		int roomWidth = in.nextInt();
		
		System.out.print("\nInput the room length: ");
		int roomLength = in.nextInt();


		//Prompt user / Input #Order 2

		System.out.print("\nInput the price per sq foot: ");
		double pricePerSquareFoot2 = in.nextDouble();
		
		System.out.print("\nInput the room width: ");
		int roomWidth2 = in.nextInt();
		
		System.out.print("\nInput the room length: ");
		int roomLength2 = in.nextInt(); 

		
		//Prompt user / Input #Order 3
		System.out.print("\nInput the price per sq foot: ");
		double pricePerSquareFoot3 = in.nextDouble();
		
		System.out.print("\nInput the room width: ");
		int roomWidth3 = in.nextInt();
		
		System.out.print("\nInput the room length: ");
		int roomLength3 = in.nextInt();


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
		
		System.out.printf("\nCost: $%.2f\n", totalCost1);

		//Order #2 
		
		//Processing 
		
		int roomArea2 = roomWidth2 * roomLength2;
		
		double subTotalCarpetPrice2 = (pricePerSquareFoot2 * roomArea2); 
		
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
		
		double totalSalesTax2 = carpetSalesTax2 + laborSalesTax2;
		
		
		
		//Output / print statements
		
		System.out.println("\nOrder #2");
		
		System.out.printf("Room: %d sq ft", roomArea2);
		
		System.out.printf("\nCarpet: $%.2f", totalCarpetPrice2);
		
		System.out.printf("\nLabor: $%.2f", totalLaborCost2);
		
		System.out.printf("\nTax: $%.2f", totalSalesTax2);
		
		System.out.printf("\nCost: $%.2f\n", totalCost2);


		//Order #3


		//Processing
		
		int roomArea3 = roomWidth3 * roomLength3;
		
		double subTotalCarpetPrice3 = (pricePerSquareFoot3 * roomArea3); 
		
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
		
		System.out.println("\nOrder #3");
		
		System.out.printf("Room: %d sq ft", roomArea3);
		
		System.out.printf("\nCarpet: $%.2f", totalCarpetPrice3);
		
		System.out.printf("\nLabor: $%.2f", totalLaborCost3);
		
		System.out.printf("\nTax: $%.2f", totalSalesTax3);
		
		System.out.printf("\nCost: $%.2f", totalCost3);


		//Total Cost of all 3 sales
		
		double totalSales = totalCost1 + totalCost2 + totalCost3;
		System.out.printf("\n\nTotal Sales: $%.2f", totalSales);
		
		
	}
}

4) Test the Program 
The last thing you need to do is to test the program to make sure it produces the correct results. 
                              

