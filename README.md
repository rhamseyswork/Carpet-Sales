# Carpet Sales Project

## Project Overview
**Project Name:** Carpet Sales  
**Group Members:** Ashton Pleickhardt, Rhamseys Garcia  
**Date:** 02/13/2025 - 02/28/2025
**GitHub Repository:** [Carpet Sales](https://github.com/rhamseyswork/carpet-sales)

**Google Docs:** [ProjectOneJava](https://docs.google.com/document/d/1mI1WKLQS4KWPrDbSo-LX8kHscxcWK1j4/edit?usp=sharing&ouid=111319674295437682510&rtpof=true&sd=true)

## Objectives
- Learn fundamentals of computer systems and programming.  
- Understand problem-solving techniques and algorithm design.  
- Create flowcharts and trace tables for logical clarity.  
- Implement a Java program to calculate the cost of carpet sales.

---
## Project Breakdown

### **Task Scheduling**
| Task | Completion Date | Completed By |
|------|----------------|--------------|
| Created Task Division Table | 2/18/2025 | Ashton Pleickhardt |
| Exercise 1.1 | 2/25/2025 | Ashton Pleickhardt |
| Exercise 1.2 | 2/25/2025 | Ashton Pleickhardt |
| Exercise 1.3 | 2/28/2025 | Rhamseys Garcia |
| Part 2.1 | 2/28/2025 | Rhamseys Garcia, Ashton Pleickhardt |
| Part 2.2 | 2/27/2025 | Ashton Pleickhardt |

---
## **Program Design Process**
### **Phase 1: Problem Solving**
1. **Define the Problem** - Create an algorithm to calculate total cost based on user input for room area, carpet cost, and labor expenses.
2. **Design the Algorithm** - Develop a precise and well-structured algorithm to ensure accuracy.
3. **Test on Paper** - Validate the algorithm using test cases before coding.

### **Phase 2: Implementation**
1. **Translate Algorithm to Java** - Convert the tested algorithm into Java code.
2. **Test the Program** - Run multiple test cases to verify accuracy and correctness.

---
## **Algorithm and Flowcharts**
### **Exercise 1.3: Algorithm (Pseudo Code)**
```pseudo
Begin
    CONSTANT WASTE_FEE = 0.20
    CONSTANT LABOR_FEE = 0.75
    CONSTANT SALES_TAX = 0.07
    totalSales = 0
    For orderNumber from 1 to 3:
        Print "Input the price per sq foot:"
        Input pricePerSquareFoot
        Print "Input the room width:"
        Input roomWidth
        Print "Input the room length:"
        Input roomLength
        roomArea = roomWidth × roomLength
        subTotalCarpetPrice = pricePerSquareFoot × roomArea
        taxCalculation = subTotalCarpetPrice × WASTE_FEE
        totalCarpetPrice = subTotalCarpetPrice + taxCalculation
        totalLaborCost = roomArea × LABOR_FEE
        carpetSalesTax = totalCarpetPrice × SALES_TAX
        laborSalesTax = totalLaborCost × SALES_TAX
        totalSalesTax = carpetSalesTax + laborSalesTax
        totalCost = totalCarpetPrice + totalLaborCost + totalSalesTax
        totalSales = totalSales + totalCost
        Print Order number, Room Area, Carpet Cost, Labor Cost, Tax, and Total Cost
    Print Total Sales
End
```

### **Exercise 2.1: Trace Table**
| Step | Input | Computation | Output |
|------|-------|-------------|---------|
| 1 | Price per sq. foot = 1.10 | pricePerSquareFoot = 1.10 | - |
| 2 | Room width = 15 | roomWidth = 15 | - |
| 3 | Room length = 12 | roomLength = 12 | - |
| 4 | Calculate Room Area | roomArea = 15 × 12 | 180 sq ft |
| 5 | Carpet Cost (Before Waste) | subTotalCarpetPrice = 1.10 × 180 | 198.00 |
| 6 | Waste Calculation | taxCalculation = 198.00 × 0.20 | 39.60 |
| 7 | Total Carpet Cost | totalCarpetPrice = 198.00 + 39.60 | 237.60 |
| 8 | Labor Cost Calculation | totalLaborCost = 180 × 0.75 | 135.00 |
| 9 | Sales Tax for Carpet | carpetSalesTax = 237.60 × 0.07 | 16.63 |
| 10 | Sales Tax for Labor | laborSalesTax = 135.00 × 0.07 | 9.45 |
| 11 | Total Sales Tax | totalSalesTax = 16.63 + 9.45 | 26.08 |
| 12 | Total Cost Calculation | totalCost = 237.60 + 135.00 + 26.08 | 398.68 |
| 13 | Final Output for Order #1 | - | Room: 180 sq ft, Carpet: $237.60, Labor: $135.00, Tax: $26.08, Cost: $398.68 |

---
## **Implementation - Java Code**

The Java program calculates carpet costs by considering room dimensions, carpet price, labor cost, and tax. The program supports up to three orders.

**Example Output:**
```
Order #1
Room: 180 sq ft
Carpet: $237.60
Labor: $135.00
Tax: $26.08
Cost: $398.68

Order #2
Room: 144 sq ft
Carpet: $216.00
Labor: $108.00
Tax: $22.68
Cost: $346.68

Total Sales: $744.36
```

**Key Features:**
- Uses `Scanner` for user input.
- Constants for `WASTE_FEE`, `LABOR_FEE`, and `SALES_TAX`.
- Iterates through three orders.
- Ensures output is formatted to two decimal places.

---
## **Testing & Validation**
- The program has been tested with multiple test cases.
- Edge cases (zero input, large numbers) were considered.
- The output matches expected calculations.

---
## **Future Enhancements**
- Add GUI for better user interaction.
- Store order data in a file or database.
- Support dynamic order entry instead of a fixed number.

---
## **Contributors**
- **Ashton Pleickhardt** - Algorithm design, Java implementation, testing.
- **Rhamseys Garcia** - Flowchart, algorithm validation, documentation.

---
## **License**
This project is open-source under the MIT & GNU License.

---
## **Contact Information**
For questions, reach out to **Ashton Pleickhardt** or **Rhamseys Garcia** via the GitHub repository.

[GitHub Repository](https://github.com/rhamseyswork/carpet-sales)
