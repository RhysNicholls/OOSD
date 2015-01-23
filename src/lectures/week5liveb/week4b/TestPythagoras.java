package lectures.week5liveb.week4b;


/**
 * Good - now we almost ready to code BUT first lets write small program to check we
  can use Pythagoras .... using google gives hits like:
  http://www.purplemath.com/modules/distform.htm
 * @author Julia
 * Date: 11-Oct-2012
 */
public class TestPythagoras { 

    public static void main(String[] args) {
        // purplemath example says  for (–2, 1) and (1, 5) Length = 5
        double x1=-2.0, y1=1.0, x2=1.0, y2=5.0;
        double length;
        
        length = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
        
        System.out.println("Length is " + length);
        
        
    } //main

} //class
