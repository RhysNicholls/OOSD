/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPractice;
import javax.swing.JOptionPane;

/**
 *
 * @author Shiftyllama
 */
public class InputBoxesString {
    public static void main(String[] args) {
    
    String first_name;
    first_name = JOptionPane.showInputDialog("Please input your first name");
    
    String second_name;
    second_name = JOptionPane.showInputDialog("Please input your second name");
    
    String full_name;
    full_name = "You are " + first_name + " " + second_name;
    
    JOptionPane.showMessageDialog(null, full_name);
    System.exit(0);

    }
}
