/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter2;

import java.util.Scanner;

/**
 *
 * @author Shiftyllama
 */
public class Question2point4 {
    
    public static void main(String[] args) {

        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        num1 = scan.nextInt();

        System.out.print("Enter the Second Number: ");
        num2 = scan.nextInt();
        
        System.out.println( num1 + " * " + num2 + " is " + num1 * num2);
        System.out.println();
}
}