package lectures.Semester1.week6;

/**
 *
 * @author Julia
 */
public class StringSwitch {

  public static void main(String[] args) {
    
    // Since Java 7 we can switch on a string!
    // How do we know that we are using Java 7 ? 
    //System.out.println("Java Version is:  " 
    //           +System.getProperty("java.version"));
     
    
    String s = "Later";
    String s1 = s.toLowerCase();

    switch (s1) {
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
        System.out.println("Not found");
    }
  } // main
} // StringSwitch
