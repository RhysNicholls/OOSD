package lectures.week5liveb.week4b;

/**
 * @author Julia Date: 11-Oct-2012
 */
public class TriangleArea1 {

  public static void main(String[] args) {
    // Prototype with hardcoded points
    double x1 = 1.5, y1 = -3.4, x2 = 4.6, y2 = 5.0, x3 = 9.5, y3 = -3.4;
    double side1, side2, side3, s, area;

    side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
    side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

    s = (side1 + side2 + side3) / 2;
    area = Math.sqrt(s* (s - side1) * (s - side2) * (s - side3));
    System.out.println("Area is " + area);
    
  } //main
} //class
