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
public class Question2point3 {

    public static void main(String[] args) {

        double bits;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of bits: ");
        bits = scan.nextDouble();

        System.out.println( bits + " is " + bits / 8.0 + " bytes");
        System.out.println();

    }
}