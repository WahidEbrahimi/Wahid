
package exercise513;


public class Exercise513 {

    
    public static void main(String[] args) {
                int n = 1;

        while (n * n * n < 12000) {
            n++;
        }

        System.out.println("The largest n such that n*n*n < 12000 is: " + (n - 1));

    }
    
}
