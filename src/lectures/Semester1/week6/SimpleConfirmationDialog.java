package lectures.Semester1.week6;

import javax.swing.JOptionPane;

/**
 * @author JuliaD
 */
public class SimpleConfirmationDialog {

  public static void main(String[] args) {
    int answer = JOptionPane.showConfirmDialog(
        null, "Would you like to continue?");

    if (answer == JOptionPane.YES_OPTION) {
      System.out.println("You said YES");
    } else if (answer == JOptionPane.NO_OPTION) {
      System.out.println("You chose NO");
    } else {
      System.out.println("You made no choice");
    }
  } //main

} //class
