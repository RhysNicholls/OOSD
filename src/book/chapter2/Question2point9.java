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
public class Question2point9 {
     public static void main(String[] args) {

        double principleAmount, rateOfInterest, timeDuration, simpleInterest;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Principle Amount: ");
        principleAmount = scan.nextInt();

        System.out.print("Enter the Rate of Interest: ");
        rateOfInterest = scan.nextInt();

        System.out.print("Enter the Time Duration: ");
        timeDuration = scan.nextInt();
        
        simpleInterest = (principleAmount * rateOfInterest * timeDuration) / 100;

        System.out.println("For Principle Amount: " + principleAmount + " with rate of Interest: " + rateOfInterest + " and Duration of " + timeDuration+ " . The simple interest is: " + simpleInterest);
}
}