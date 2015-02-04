/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter3;

import java.util.Scanner;

/**
 *
 * @author Shiftyllama
 */
public class Question3point26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("Is " + number + " divisible by 3 and 7? " + (number % 3 == 0 && number % 7 == 0));
        System.out.println("Is " + number + " divisible by 3 or 7? " + (number % 3 == 0 || number % 7 == 0));
        System.out.println("Is " + number + " divisible by 3 or 7, but not both? " + ((number % 3 == 0) ^ (number % 7 == 0)));
    }    
    
}

