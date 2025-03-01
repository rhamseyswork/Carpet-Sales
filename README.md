# Carpet-Sales
Co-Developer Ashton P. Carpet Sales Project Data Analytics for Java 1


Project One
Programming Fundamentals
Objectives of this lab: 
	•	Learn some basics about computer systems
	•	Learn about problem solving and programming
	•	Design algorithms, flowcharts, and trace tables

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



Complete by 2/26/25
incomplete

N/A
Assigned to:
Rhamseys Garcia
Part 2 
Completed by 2/27/25

N/A
Completed by:
Ashton Pleickhardt
Part 2.1 and 2.2
Incomplete
N/A
Assigned to:
Rhamseys Garcia







Program Design Process
Problem solving is usually broken into two major phases:  1) Problem solving phase, and 2) Implementation phase. 
Phase (1) - In the first phase, you will take three steps:  Step I: You will define the problem that you want to solve, clearly.  Step II: You will design an algorithm that is precise and very well thought to solve the problem, and  Step III: You will test your algorithm on paper.  Your algorithm should work correctly, before you can write a program for it. 
Phase (2) -In this phase, you will take two steps:  Step I: Translate your algorithm to Java language.  If you have a correct and precise algorithm, the translation should be almost line-by-line.  This translation must be correct and free of: 
	•	A) Syntax errors, which are the errors resulted from incorrect use of the programming language syntax or violation of syntax rules.
	•	B) Computations that are not possible, such as dividing by 0, and
	•	C) Errors made by the programmer.  Such errors are those made by using wrong signs or arithmetic operators.
Step II: Test the program to make sure it produces the correct results.  Make sure your test cases are different.  The only way to correctly test a program is to have many different test cases. 











Part One: Algorithms and flowcharts
___________________________________________
Exercise 1.1  
In the following diagram write a question in the blank box that best fits the statements that have appeared after the box. Assume that just before the blank box you have read the values for x and y.










In the following diagram write an English statement in the blank box that best fits the statement that has appeared before the box. 

    

Exercise 1.2  Kids of various ages may wish to play soccer. A soccer club may not have teams for kids 5 and under. 
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



Part Two: Simple Java Programs



A.CarpetSales.java 
Write a program to calculate the cost for replacing carpet for a single room. Carpet is priced by square foot. Total cost includes carpet, labor and sales tax. Dollar values are output with two decimals. For example, System.out.printf("Cost: $%.2f", cost);  Note: This program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step but confirm progress.


Step 1. Read from input the carpet price per square foot (double), room width (int) and room length (int). Calculate the room area in square feet. Calculate the carpet price based on square feet with an additional 20% for waste. Output square feet and carpet cost. Submit for grading to confirm 1 test passes.


Ex: If the input is:
1.10 15 12
the output is:
Room: 180 sq ft
Carpet: $237.60


Step 2. Calculate the labor cost for installation ($0.75 per actual square foot). Output labor cost. Submit for grading to confirm 2 tests pass.

Ex: If the input is:
0.95 10 16
the output is:
Room: 160 sq ft
Carpet: $182.40
Labor: $120.00


Step 3. Calculate sales tax (7%) on carpet and labor cost. Total cost includes carpet, labor and sales tax. Output sales tax and total cost. Submit for grading to confirm 3 tests pass.


Ex: If the input is:
1.25 8 8
the output is:
Room: 64 sq ft
Carpet: $96.00
Labor: $48.00
Tax: $10.08
Cost: $154.08


Step 4. Repeat steps 1-3 including additional input for a second order (one order per line). Maintain total sales for both orders. Output information for each order with a heading and then total sales for both orders. Submit for grading to confirm 4 tests pass.


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


Step 5. Repeat steps 1-3 including additional input for a third order (one order per line). Maintain total sales for all orders. Output information for each order with a heading and then total sales for all orders. Submit for grading to confirm all tests pass.


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
2) Program Design - Algorithm  Before we attempt to write the program, let's develop an algorithm for solving the problem. 
Exercise 2.1 Design the algorithm for this problem written in Pseudo Code.  Remember your algorithm must be precise. This algorithm must be translated to java code to obtain the program. 

3) Desktop Testing- Trace Table Now that you have the algorithm, create a Trace Table to test your algorithm and see if it works on paper. Remember, your table should have at least two columns, for the variables and for expected output.








4) Implementing the Algorithm into Java Code 
Exercise 2.2 This is where you will translate the algorithm to Java Code.  Write a program called CarpetSales.java that is designed based on the algorithm that is given in the previous part. 

……… (include your Java code here)
Sample:
// This Java Program will compute carpet sales
 public class CarpetSales
{      public static void main(String []  args )        {               }
}

4) Test the Program  The last thing you need to do is to test the program to make sure it produces the correct results. 
   ……… (include your test results here)                               


