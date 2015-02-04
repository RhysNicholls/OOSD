package lectures.Semester1.week7;

/**
 *
 * @author Julia
 */
public class BreakOrContinue {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i < 6) {
        continue;
         //break;
      }
      System.out.println("Working on " + i);

    }
  } // main
} // BreakOrContinue
