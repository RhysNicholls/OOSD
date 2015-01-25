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
public class Question2point11 {
      public static void main(String[] args) {

        double totalSales, percentage;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total sales of the company: ");
        totalSales = scan.nextDouble();

        System.out.print("Enter the sales percentage of the central zone: ");
        percentage = scan.nextDouble();

        System.out.println("Central zone sales  " + totalSales * percentage );
    
}
}
