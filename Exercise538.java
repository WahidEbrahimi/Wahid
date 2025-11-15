
package exercise538;

import java.util.Scanner;
public class Exercise538 {

    
    public static void main(String[] args) {
        
                                                // Dicimal to Octal.
        
    Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        if (decimal == 0) {
            System.out.println("Octal: 0");
            return;
        }

        String octal = "";
        int number = decimal;

        while (number > 0) {
            int remainder = number % 8;
            octal = remainder + octal; 
            number = number / 8;
        }

        System.out.println("Octal: " + octal);
        input.close();

}
}