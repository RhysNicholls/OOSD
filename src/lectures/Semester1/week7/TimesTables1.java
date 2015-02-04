package lectures.Semester1.week7;

/**
 *
 * @author Julia
 */
public class TimesTables1 {

  public static void main(String[] args) {
    // tables up to 12 x 12

    int j = 3;

    System.out.println(j + " times table");
    
    for (int i = 1; i <= 12; i++) {
      System.out.printf("%4d ", j * i);
    }
    System.out.println("");


  } // main
} // TimesTables1
