package lectures.Semester1.week7;

/**
 * @author JuliaD * See:
 * http://java.about.com/b/2009/06/06/java-term-of-the-week-ternary-operator.htm
 */
public class TernaryOperator {

  public static void main(String[] args) {
    // The ternary operator (? : ) in action
    // boolean expression ? value1 : value2 
    
    // Example 
    int i = 57;
    System.out.printf("%d is %s\n", i , (i%2 ==0?"even":"odd"));

    boolean isHappy = true;
    String mood;

    // This way ...
    if (isHappy) {
      mood = "I'm Happy!";
    } else {
      mood = "I'm Sad!";
    }

    // OR ...
    mood = (isHappy) ? "I'm Happy!" : "I'm Sad!";
  } //main

} //class
