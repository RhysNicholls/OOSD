package Tests;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author r24-nicholls
 */
public class Calculating {

    public static void main(String[] args) {

        int num1;
        int num3;
        String num2, name;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num1 = scan.nextInt();

        num2 = JOptionPane.showInputDialog("Enter a Number: ");
        num3 = Integer.parseInt(num2);

        name = JOptionPane.showInputDialog("Enter your Name: ");

        System.out.println(name +", your answer is " + num1 % num3);

       
    }

}
