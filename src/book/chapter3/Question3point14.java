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
public class Question3point14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        int number = (int)(Math.random() * 2D);
        Scanner input = new Scanner(System.in);
        System.out.print("Guess head or tail? 0 for head and 1 for tail: ");
        int guess = input.nextInt();
        if(guess == number)
        {
            System.out.println("Correct guess");
        } else
        if(number == 0)
        {
            System.out.println("Sorry you are wrong. It was heads");
        } else
        {
            System.out.println("Sorry you are wrong. It was tails");
        }
    }
}
