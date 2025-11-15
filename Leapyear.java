
package leapyear;

      import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year");
        int year = input.nextInt();
        Boolean isLeapYear =
         (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println(year + "is a LeapYear?" + isLeapYear);
               
    }
    
}
