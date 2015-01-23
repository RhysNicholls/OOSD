package TestPractice;

import javax.swing.JOptionPane;

/**
 *
 * @author Shiftyllama
 */
public class InputBoxesStringToInt {
    
    public static void main(String[] args) {
    
    String breadth;
    String height;
    Double area;
    
    
    
    breadth = JOptionPane.showInputDialog("Please input the breadth");
    
    height = JOptionPane.showInputDialog("Please input the height");
    
    area = Double.parseDouble( breadth ) * Double.parseDouble( height );
     
    


    
    JOptionPane.showMessageDialog(null, "Answer = " + area);
    System.exit(0);

    }
}
