package lectures.Semester1.week10;

/**
 * @author JuliaD  *
 * Using Command Line arguments example enter numbers and add them 
 * Set the default program + Arguments 1. 
 * Right click on the project node (the coffee cup) 
 * -> Properties -> Run -> Main Class (Browse) 2. Enter Arguments
 *
 * Run project (NOT file)
 *
 */
public class ShowCommandLine {

  public static void main(String[] args) {
    
    int total = 0;
    System.out.println("Hello");
    
    // try using an enhanced for loop
    for (int i = 0; i < args.length; i++) {
      // System.out.println("Arg: " + args[i]);
      // Convert arg to number and add to total
      total += Integer.parseInt(args[i]);
    }
    System.out.println("Total is " + total);
    System.out.println("Bye");
  } //main

} //class
