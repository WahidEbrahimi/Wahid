
package computeandinterpretbmi;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

    
    public static void main(String[] args) {
       Scanner input = new
            Scanner (System.in);
       System.out.print("Enter weight in kilograms:");
       double weight =
               input.nextDouble();
       System.out.print("Enter height in meters:");
       double height =
               input.nextDouble();
       double bmi =weight/(height*height);
       System.out.printf("YOur BMI is:%.2f%n",bmi);
       if (bmi < 18.5)
           System.out.println("Inter pretation :Under weight");
       else if (bmi<25)
           System.out.println("Inter pretation:Normsl");
       else if (bmi<30)
       System.out.println("Interpretation:overweight");
       else 
           System.out.print("Interpretation:Obese");
       
     
    
      
    }
    
}
