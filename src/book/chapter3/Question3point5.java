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
public class Question3point5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter todays day ");
        int day = input.nextInt();

        System.out.println("Enter the number of days elapsed since today ");
        int noDays = input.nextInt();

        int remainder = day + noDays % 7;

        String futureday = " ";

        if (remainder == 0) {
            futureday = "Sunday";
        }

        if (remainder == 1) {
            futureday = "Monday";
        }

        if (remainder == 2) {
            futureday = "Tuesday";
        }

        if (remainder == 3) {
            futureday = "Wednesday";
        }

        if (remainder == 4) {
            futureday = "Thursday";
        }

        if (remainder == 5) {
            futureday = "Friday";
        }

        if (remainder == 6) {
            futureday = "Saturday";
        }

        String today = " ";

        if (day == 0) {
            today = "Sunday";
        }

        if (day == 1) {
            today = "Monday";
        }

        if (day == 2) {
            today = "Tuesday";
        }

        if (day == 3) {
            today = "Wednesday";
        }

        if (day == 4) {
            today = "Thursday";
        }

        if (day == 5) {
            today = "Friday";
        }

        if (day == 6) {
            today = "Saturday";
        }

        System.out.println("Today is " + today + " and the future day is " + futureday);

    }

}
