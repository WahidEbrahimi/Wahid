
package lottryusingstring;
import java.util.Scanner;

public class LottryUsingString {

    
    public static void main(String[] args) {
        
        
        
        
        Scanner input = new Scanner(System.in);
        String lottery = " " + (int)(Math.random()*10)+(int)(Math.random()*10);
        System.out.println("Enter two lottery digit:");
        String Guess = input.nextLine();
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);
        
        char GuessDigit1 = Guess.charAt(0);
        char GuessDigit2 = Guess.charAt(1);
        System.out.println("The lottery number is " + lottery);
        
        if(Guess == lottery) System.out.println("you are exactly correct you won 10000$.");
        
        else if(GuessDigit1 == lotteryDigit2  &&  GuessDigit2 == lotteryDigit1)System.out.println("Match all digit:you won 3000$");
        
        else if (GuessDigit1 == lotteryDigit1 || GuessDigit1 == lotteryDigit2 || GuessDigit2 == lotteryDigit1 || GuessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you won 1000$");
        else System.out.println("Sorry: No match");
                       
        
        
    
    


    }
}