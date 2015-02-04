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
public class Question3point10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 1000);
        int num2 = (int)(Math.random() * 1000);
        
        
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
           
        }
       double number1 = num1;
        double number2 = num2;
        System.out.print("What is " + num1 + " / " + num2 + " ? ");
        Scanner input  = new Scanner(System.in);
        double answer = input.nextDouble();
        
        if (number1 / number2 == answer)
            System.out.println("You are correct");
        else
            System.out.println("Your answer is wrong\n" + num1 +" / " + num2 + " is " + (number1 / number2));
    }
    
}
