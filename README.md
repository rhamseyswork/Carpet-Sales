# Carpet Sales Project

## Project Overview

**Project Name:** Carpet Sales  
**Group Members:** Ashton Pleickhardt, Rhamseys Garcia  
**Date:** 02/13/2025  

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

| Task                        | Completion Date | Completed By                        |
| --------------------------- | --------------- | ----------------------------------- |
| Created Task Division Table | 2/18/2025       | Ashton Pleickhardt                  |
| Exercise 1.1                | 2/25/2025       | Ashton Pleickhardt                  |
| Exercise 1.2                | 2/25/2025       | Ashton Pleickhardt                  |
| Exercise 1.3                | 2/28/2025       | Rhamseys Garcia                     |
| Part 2.1                    | 2/28/2025       | Rhamseys Garcia, Ashton Pleickhardt |
| Part 2.2                    | 2/27/2025       | Ashton Pleickhardt                  |

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

