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
public class Question2point1 {

    public static void main(String[] args) {

        double km;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of kilometer: ");

        km = scan.nextDouble();

        System.out.print(km + " kilometers is " + km / 1.609 + " miles" );
        System.out.println();
    }
}
