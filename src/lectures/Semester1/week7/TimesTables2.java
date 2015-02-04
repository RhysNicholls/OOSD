package lectures.Semester1.week7;

/**
 *
 * @author Julia
 */
public class TimesTables2 {

  public static void main(String[] args) {
    // tables up to 12 x 12
    for (int j = 1; j <= 12; j++) {
      System.out.printf( "(%2d)", j );
      for (int i = 1; i <= 12; i++) {
        System.out.printf("%4d ", j * i);
      }
      System.out.println("");
    }

  } // main
} // TimesTables1
