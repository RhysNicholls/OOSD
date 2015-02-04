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
public class Question4point7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lower bound ");
        int lower = input.nextInt();

        System.out.println("Enter the upper bound ");
        int upper = input.nextInt();

        for (int i = lower; i < upper + 1; i++) {
            System.out.println(i);
        }

    }
}
