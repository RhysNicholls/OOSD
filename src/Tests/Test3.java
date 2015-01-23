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
public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Test3.class.getResourceAsStream("accounts.txt"));

        int totalAbbie = 0;
        int totalRufus = 0;
        int totalZak = 0;
        int num1;
        String name;

        while (sc.hasNext()) {
            name = sc.next();
            if (name.equals("Abbie")) {
                num1 = sc.nextInt();
                totalAbbie += num1;
            } else if (name.equals("Rufus")) {
                num1 = sc.nextInt();
                totalRufus += num1;
            }else if (name.equals("Zack")) {
                num1 = sc.nextInt();
                totalZak += num1;
            }

            System.out.println("Balances");
            System.out.println("Abbie " + totalAbbie);
            System.out.println("Rufus " + totalRufus);
            System.out.println("Zack " + totalZak);
        }

    }

}
