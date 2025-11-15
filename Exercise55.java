
package exercise55;


public class Exercise55 {

    
    public static void main(String[] args) {
                System.out.println("Kilograms   Pounds     |     Pounds     Kilograms");
        System.out.println("-------------------------------------------------");

        int kg = 1;
        int lb = 20;

        for (; kg <= 199 && lb <= 515; kg += 2, lb += 5) {
            double toPound = kg * 2.2;
            double toKilogram = lb / 2.2;
            System.out.printf("%-10d%7.1f     |     %-11d%7.2f\n", kg, toPound, lb, toKilogram);
        }

    }
    
}
