package lectures.week6;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Julia
 */
public class AppendToHomeFile {

  public static void main(String[] args)
      throws FileNotFoundException, IOException {

    PrintWriter pw = new PrintWriter(new FileWriter(
        System.getProperty("user.home")
        + "/My Documents/outTester.txt", true));

    pw.println("2 Add This line");
    pw.println("2 AlsoThis line");

    pw.flush();

  } // main
} // AppendToHomeFile
