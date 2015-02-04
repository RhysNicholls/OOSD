package tutorials.scannerstring;

import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////
// This week's practical will be about using Scanner with a string input so that
// you can read numbers and words from a String (often taken from an input file).
// The students should create a pseudo code example first AND THEN make sure
// their java code and p/code match. 
/////////////////////////////////////////////////////////////////////////////////
//
//
/////////////////////////////////////////////////////////////////////////////////
//                      ReadAsString
/////////////////////////////////////////////////////////////////////////////////
public class ReadAsString {

    public static void main(String[] args) {
///////////////////////////////////////////////////////////////////////
 Scanner sc = new Scanner(ReadAsString.class.getResourceAsStream("data.txt"));
 Scanner lineScan;
 double doubleTotal = 0.0;
 String line = "";
 String word = "";
 int intTotal =0 ;

           
        // LOOP while line of data available   
        while (sc.hasNextLine()) 
        {
            // GET next line from scanner
            lineScan = new Scanner(sc.nextLine());

            // FETCH next double from line
            // ADD to total
            doubleTotal += lineScan.nextDouble();

            // SKIP next character
            lineScan.next();

            // FETCH next word
            // ADD word to line of text
            line += lineScan.next() + " ";

            // SKIP next character
            lineScan.next();
            // FETCH next double from line
            // ADD to total
            intTotal += lineScan.nextInt();

            // FETCH next element of word
            // CONCATENATE element to word
            word += lineScan.next();          
        }
        // ENDLOOP
        
        // OUTPUT oubleTotal, intTotal, line and word
        System.out.println("Double = %4.2f", doubleTotal);
        System.out.println("Int = %d", intTotal);
        System.out.println("Line = %s",line);
        System.out.println("Word = %s",word);
      
    } //main

} //class

/*
12.9 ; I @ 13 jav
3.8 ; can @ 6 aru
4.0 ; read @ 109 les
*/
