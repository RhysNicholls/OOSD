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
public class Question3point8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new java.util.Scanner(System.in);

    // Enter three numbers
    System.out.print("Enter three integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();

    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    if (number2 > number3) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
    }

    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
  }
}