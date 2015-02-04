package lectures.Semester1.week7;

/**
 *
 * @author Julia
 */
public class LotteryThreeDigit {

  // Liang Exercise 3.15 LotteryThreeDigit
  public static void main(String[] args) {

    // PROTOTYPE: Hard code lottery number for guessing
    int lot = 748;

    // Hard code guesses for testing
    int guess = 812;

    String guessStr = Integer.toString(guess);
    String lotStr = Integer.toString(lot);

    // Convert these ifs into if/else for final version
    // 1. are numbers equal?
    if (guess == lot) {
      System.out.println("Exactly! - top prize $10000");
    }

    //2. are all numbers contained
    if (guessStr.contains(lotStr.substring(0, 1))
        && guessStr.contains(lotStr.substring(1, 2))
        && guessStr.contains(lotStr.substring(2, 3))) {
      System.out.println("Got all numbers - win $3000");
    }

    // 3. Are any numbers correct?
    if (lotStr.contains(guessStr.substring(0, 1))
        || lotStr.contains(guessStr.substring(1, 2))
        || lotStr.contains(guessStr.substring(2, 3))) {
      System.out.println("Got at least 1 number - win $1000");
    }

  } // main
} // LotteryThreeDigit
