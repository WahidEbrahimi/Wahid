
package exercise58;

import java.util.Scanner;
public class Exercise58 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);    
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String bestStudent = "";
        double bestScore = 0.0;

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter student name: ");
            String name = input.next();

            System.out.println("Enter student score: ");
            double score = input.nextDouble();

            if (score > bestScore) {
                bestScore = score;
                bestStudent = name;
            }
        }

        System.out.println("Top student is " + bestStudent + " with a score of " + bestScore);

    }
    
    
}
