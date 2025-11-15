
package exercise546;

import java.util.Scanner;
public class Exercise546 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("The reversed string is " + reversed);

        input.close();

    }
    
}
