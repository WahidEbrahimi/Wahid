
package exercise533;


public class Exercise533 {

    
    public static void main(String[] args) {
                System.out.println("Perfect numbers up to 61000:");

        for (int number = 1; number <= 61000; number++) {
            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

       
            if (sum == number) {
                System.out.println(number);
            }
        }

    }
    
}
