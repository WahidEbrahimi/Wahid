
package exercise548;
import java.util.Scanner;

public class Exercise548 {

    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                result += text.charAt(i);
            }
        }

        System.out.println(result);
        input.close();

    }
    
}
