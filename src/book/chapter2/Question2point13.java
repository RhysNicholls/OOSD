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
public class Question2point13 {

    public static void main(String[] args) {

        double heightInches, weightPounds, heightMetres, weightKg;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weightPounds = scan.nextDouble();
        weightKg = weightPounds * 0.45359237;

        System.out.print("Enter height in inches: ");
        heightInches = scan.nextDouble();
        heightMetres = heightInches * 0.0254;
        

        System.out.println("BMI is " + weightKg / (heightMetres * heightMetres));
        System.out.println();
    }
}
