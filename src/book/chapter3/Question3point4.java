/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shiftyllama
 */
public class Question3point4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        
       Scanner input = new Scanner(System.in);

        System.out.print("What is " + num1 + " * " + num2 + " ?");
        int answer = input.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + answer + " is " +(num1 * num2 == answer));

    }
}
