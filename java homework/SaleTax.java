
package sale.tax;
   import java.util.Scanner;
public class SaleTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new
         Scanner(System.in);
      System.out.print("Enter purchase amount:");
      double amount = 
              input.nextDouble();
      double tax = amount * 0.6;
      System.out.printf("Sales tax is :%.2f%n"  , tax );
      
    }
    
}
