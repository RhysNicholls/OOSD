package lectures.Semester1.week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Julia
 */
public class WriteToHomeFile {

  public static void main(String[] args) throws FileNotFoundException {
    PrintWriter pw=new PrintWriter(new File(System.getProperty("user.home") 
        + "/My Documents/outTester.txt"));

    pw.println("Add This line");
    pw.println("AlsoThis line");

    pw.flush();

  } // main
} // WriteToHomeFile
