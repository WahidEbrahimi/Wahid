package ordertwocityes;

import java.util.Scanner;
public class OrderTwoCityes {

    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); 
        System.out.println("Enetr the first city:");
        String City1 = input.nextLine();
        System.out.println("Enetr the secound city:");
        String City2 =input.nextLine();
        if (City1.compareTo(City2) < 0){
            System.out.println("The cityes in alphbatical order is " + City1 + " and " + City2);
        }
        else{
            System.out.println(" The cities in alphabetical order are " + City2 + " and " + City1);
        }
    }
    
}
