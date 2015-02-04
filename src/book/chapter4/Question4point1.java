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
public class Question4point1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
 int answer = 0;
 int input;
 
        Scanner scan = new Scanner(System.in);

     System.out.println("Enter a postive non zero integer");
     input = scan.nextInt();
     
     
     for (int i =0; i <= input; i++)
     { 
         answer += i;
     
     }
     
  System.out.println("The sum of all integer between 1 and " +input + " is " + answer);
         
         

}
}
