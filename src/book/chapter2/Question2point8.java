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
public class Question2point8 {

    public static void main(String[] args) {

        String firstName, middleName, lastName;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        firstName = scan.next();

        System.out.print("Enter your Middle Name: ");
        middleName = scan.next();

        System.out.print("Enter your Last Name: ");
        lastName = scan.next();

        System.out.println("the name entered is " + firstName + " " + middleName + " " + lastName);

    }
}
