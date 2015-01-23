/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.util.Scanner;

/**
 *
 * @author Shiftyllama
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Test2.class.getResourceAsStream("numbers.txt"));

        int average;
        int total = 0;
        int numNumbers = 0;
        int num1;

        while (sc.hasNext()) {
            num1 = sc.nextInt();
            if (num1 < 10 || num1 > 30) {
                total += num1;
                numNumbers++;
            }
        
        average = total / numNumbers;

        System.out.println("Average of numbers in range is " + average);
        }
    }

}
