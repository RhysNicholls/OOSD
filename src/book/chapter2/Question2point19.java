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
public class Question2point19 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5D);

        System.out.println("The distance between the two points is " + distance);

    }
}
