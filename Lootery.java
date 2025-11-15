
package lootery;
import java.util.Scanner;
public class Lootery {

    
    public static void main(String[] args) {
       int lottery = (int)(Math.random()  * 100);
       Scanner input = new Scanner (System.in);
       System.out.print("Enter your lottery pick (to digits): ");
       int guess = input.nextInt();
       int lotterydigit1 = lottery / 10;
       int lotterydigit2 = lottery % 10;
       int guessdigit1 = guess / 10;
       int guessdigit2 = guess % 10;
       System.out.println("The lottery number is" +lottery);
       if (guess==lottery)
           System.out.println("Exact match:you win $10000");
       else if (guessdigit2 == lotterydigit1 && guessdigit1 == lotterydigit2)
           System.out.println("Match all digits: you win $3000");
       else if (guessdigit1 == lotterydigit1
               || guessdigit1 == lotterydigit2
               || guessdigit2 == lotterydigit1
               || guessdigit2 == lotterydigit2)
           System.out.println("Match one digit: you win $1000");
       else
           System.out.println("Sorry , no match");
    }
    
}
