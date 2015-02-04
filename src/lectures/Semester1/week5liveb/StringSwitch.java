package lectures.Semester1.week5liveb;

/**
 *
 * @author Julia
 */
public class StringSwitch {

  public static void main(String[] args) {
    
    // Since Java 7 we can switch on a string!
    String s = "now";

    switch (s) {
      case "later":
        System.out.println("Relax");
        break;
      case "now":
        System.out.println("Hurry!");
        break;
      case "earlier":
        System.out.println("Too Late");
        break;
      default:
        System.out.println("Not found ");
    }
  } // main
} // StringSwitch
