
package exercise535;


public class Exercise535 {

    
    public static void main(String[] args) {
                double sum = 0;

        for (int i = 1; i <= 26; i++) {
            double product = 1;
            for (int j = 1; j <= i; j++) {
                product *= j;
            }
            sum += product;
        }

        System.out.println("The sum of the series is: " + sum);

    }
    
}
