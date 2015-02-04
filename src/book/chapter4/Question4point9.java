/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.chapter4;

import java.util.Scanner;

/**
 *
 * @author Shiftyllama
 */
public class Question4point9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter a student name: ");
        String student1 = input.next();
        System.out.print("Enter a student score: ");
        double score1 = input.nextDouble();
        System.out.print("Enter a student name: ");
        String student2 = input.next();
        System.out.print("Enter a student score: ");
        double score2 = input.nextDouble();
        if(score1 < score2)
        {
            String tempString = student1;
            double tempScore = score1;
            student1 = student2;
            score1 = score2;
            student2 = tempString;
            score2 = tempScore;
        }
        for(int i = 0; i < numberOfStudents - 2; i++)
        {
            System.out.print("Enter a student name: ");
            String student3 = input.next();
            System.out.print("Enter a student score: ");
            double score3 = input.nextDouble();
            if(score3 > score1)
            {
                student1 = student3;
                score1 = score3;
                
            } else
            if(score3 < score2)
            {
                student2 = student3;
                score2 = score3;
            }
        }

        System.out.println("Sudent with the heighest score is:");
        System.out.println(student1 + ". Their score was " + score1);
        System.out.println("Sudent with the lowest score was ");
        System.out.println(student2 + ". Their score was " + score2);
    }
}
