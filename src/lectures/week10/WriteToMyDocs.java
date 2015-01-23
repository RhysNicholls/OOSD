package lectures.week10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* @author je-dawson  
 Enter a file name on the command line 
 Create and write something to this file 

For Help see Useful Links and Advice in BB

 */
public class WriteToMyDocs {

  public static void main(String[] args) throws IOException {
    //String fileName = "delFile.txt";
    String fileName = args[0]; 
    
    System.out.println("Writing to output file ...");
    PrintWriter pw = new PrintWriter(new FileWriter(
      System.getProperty("user.home") + "/My Documents/" + fileName, true));

    pw.println("Write This line");

    pw.flush();
  } // main

} // class
