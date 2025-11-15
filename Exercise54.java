
package exercise5.pkg4;


public class Exercise54 {

    
    public static void main(String[] args) {
                System.out.println("Inches     Centimeters");
        System.out.println("");

        for (int inch = 1; inch <= 10; inch++) {
            double cm = inch * 2.54;
            System.out.printf("%-10d%.2f\n", inch, cm);
        }

    }
    
}
