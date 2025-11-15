
package exercise56;


public class Exercise56 {

   
    public static void main(String[] args) {
                System.out.println("Miles     Kilometers");
        System.out.println("--------------------");

        for (int mile = 1; mile <= 10; mile++) {
            double km = mile * 1.609;
            System.out.printf("%-10d%.3f\n", mile , km);
        }
    }


    
    
}
