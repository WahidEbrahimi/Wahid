
package exercise511;


public class Exercise511 {

   
    public static void main(String[] args) {
                int count = 0;

        System.out.println("These numbers are divisible by 5 or 6 but not both");
                for (int num = 100; num <= 200; num++) {
            if ((num % 5 == 0) ^ (num % 6 == 0)) { // XOR
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
    
}
