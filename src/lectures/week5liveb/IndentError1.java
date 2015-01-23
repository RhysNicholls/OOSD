package lectures.week5liveb;

/**
 *
 * @author Julia
 */
public class IndentError1 {

    public static void main(String[] args) {
        int i=1, j=2, k=3;
        
        // we wanted to see B printed if i is not > j)
        
        if (i > j)
          if (i > k)
            System.out.println("A");
        else
            System.out.println("B");
    } // main

} // IndentError1
