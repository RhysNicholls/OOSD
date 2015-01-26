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
public class Question2point12 {

    public static void main(String[] args) {

        double speed, acceleration, runwayLength;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        speed = scan.nextDouble();
        acceleration = scan.nextDouble();
        
        runwayLength = (speed * speed) / (2 * acceleration);

        System.out.println("The minimun runway length for this aeroplane is " + runwayLength);
        System.out.println();
    }
}   
