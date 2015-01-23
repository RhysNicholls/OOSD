package lectures.week5liveb.week4b;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 15
 * See TriangleAreaSUDO.txt
 * @author Julia Date: 11-Oct-2012
 */
public class TriangleArea {

  public static void main(String[] args) {
    // Full version with scanner
    // Put test values here so can copy and paste!
    // 1.5 -3.4 4.6 5.0 9.5  -3.4
    Scanner scan = new Scanner(System.in);
    double x1, x2, x3, y1, y2, y3;
    double side1, side2, side3, s, area;

    // Input 3 x,y points
    System.out.print("Please enter 3 points (x and y): ");
    x1 = scan.nextDouble();
    y1 = scan.nextDouble();
    x2 = scan.nextDouble();
    y2 = scan.nextDouble();
    x3 = scan.nextDouble();
    y3 = scan.nextDouble();

    // Calculate the lengths of sides
    side1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
    side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

    // Calculate area and output solution
    s = (side1 + side2 + side3) / 2;
    area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    System.out.println("Area is " + area);

  } //main
} //class
