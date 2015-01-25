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
public class Question2point7 {

    public static void main(String[] args) {

        int numberOfSeconds, numberOfDays, secondsRemaining, minutesRemaining;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        numberOfSeconds = scan.nextInt();

        numberOfDays = numberOfSeconds / 86400;
        secondsRemaining = numberOfSeconds % 86400;
        minutesRemaining = secondsRemaining / 60;

        System.out.println(numberOfSeconds + " is approximately " + numberOfDays + " days and " + minutesRemaining + " minutes");
    }
}

