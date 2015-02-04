package lectures.Semester1.week4live;

import javax.swing.JOptionPane;

/* @author je-dawson  */
public class Jopt {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Enter number");
        
        double d = Double.parseDouble(s);
        
        System.out.println("Double = " + d);
    } // main

} // class
