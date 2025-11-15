
package exercise512;


public class Exercise512 {

    
    public static void main(String[] args) {
                int n = 1;

        while (n * n <= 12000) {
            n++;
        }

        System.out.println("The smallest n such that n*n > 12000 is: " + n);

    }
    
}
