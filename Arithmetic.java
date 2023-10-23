/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Changes made by @author Monika Skiba
 * October 23rd/2023
 */

import java.util.Scanner;

public class Arithmetic 
{
    public static void main(String[] args) 
    {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the first operand: ");
        double n = in.nextDouble(); // Input the first operand as a double
        
        System.out.print("Enter the second operand: ");
        double m = in.nextDouble(); // Input the second operand as a double
        
        System.out.print("Enter the arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operation = in.next(); // Input the arithmetic operation as a string
        
        double result = r.calculate(n, m, operation);
        System.out.println("Result: " + result); 
    }
}
