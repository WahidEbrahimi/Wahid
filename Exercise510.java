
package exercise510;


public class Exercise510 {

    
    public static void main(String[] args) {
        int count = 0;

        System.out.println("These numbers are divisible by 5, 6 and 10");
        for (int num = 100; num <= 1000; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

    
    }
    
}
