/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter4;

import java.util.Scanner;

/**
 *
 * @author Shiftyllama
 */
public class Question4point5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, sum;
        boolean Continue;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter any number : ");
            num1 = scan.nextInt();
            System.out.print("Enter any number : ");
            num2 = scan.nextInt();
            sum = num1 + num2;
            System.out.println("Their sum is " + sum);
            System.out.println("Continue(Y/N)");
            Continue = scan.getlnBoolean();
        } while (Continue == true);

}
}

   
