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
public class Question2point2 {

    public static void main(String[] args) {

        double length, breadth;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        length = scan.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        breadth = scan.nextDouble();
        
        System.out.println("The area of the rectangle is " + length * breadth);
        System.out.println("The perimeter of the rectangle is " + 2 * (length + breadth));
        System.out.println();
    }
}
