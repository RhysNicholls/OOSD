package lectures.Semester1.week9;

/**
 *
 * @author Julia
 */
public class Scoper {

  public static void main(String[] args) {
    //int i = 2311;
    {
      int i = 6;
      System.out.println("i is " + i);
    }
    {
      int i = 798;
      System.out.println("i is " + i);
    }
    
    int i = 2311;
    System.out.println("i is " + i);
  } // main

  private static void nowt() {
    int i = 66790;
    System.out.println("i is " + i);
  }

} // Scoper
