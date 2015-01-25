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
public class Question2point5 {
        public static void main(String[] args) {

        double subTotal, gratuityRate, gratuity;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the subtotal and gratuity rate: ");
        subTotal = scan.nextDouble();
        gratuityRate = scan.nextDouble();
        gratuity = (subTotal / 100) * gratuityRate ;

     
        System.out.println("The gratuity is £" + gratuity + "and total is £" + (subTotal + gratuity)) ;
        System.out.println();
    
}
}