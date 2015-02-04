package lectures.Semester1.week6;

/**
 *
 * @author Julia
 */
public class InfiniteLoopOrIsIt {

  public static void main(String[] args) {
    
    // Def. looks like an infinite for loop .. but is it?  
    for  (int i = 0; i > -3; i++) {
      
    }
    
    //Humm - we cant print i here because it is "out of scope"
    System.out.println("Done");
    
   
    
//    // This really is an infinite loop
//    while (true) {
//     
//    }
    
  } // main 
} // InfiniteLoopOrIsIt
