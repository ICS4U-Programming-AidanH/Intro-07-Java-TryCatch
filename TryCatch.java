
/***

 Previous program with the addition of Try..catch

* @author  Aidan.

* @version 1.0

* @since   02-23-2024

*/
import java.util.Scanner;
//Imports the scanner

public class TryCatch {

    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);
        //Creates a new scanner object to be used for user input
        System.out.println("Please enter the radius of a sphere (in CM):");
        //Prompts the user to enter the value for a radius
        double sphereRadius = sc.nextDouble();
        //Allows the user to input the radius of their sphere
        if (sphereRadius == 0d) {
            System.out.println("Please enter a valid (Positive) integer.");
            //Asks the user to input a valid number
        }
            else if (sphereRadius < 0d) {
            System.out.println("Please enter a valid (Positive) integer.");
            //Prompts the user to input a valid number
        }
        else {
            double volume = 4.0 / 3.0 * Math.PI * Math.pow(sphereRadius, 3);
            //This will run the calculations for the volume of the sphere
            System.out.println("The volume of the Sphere is: " + (Math.round(volume*100.0))/100.0);
            //Prints the calculated volume of the sphere
        }

        


        sc.close();

    } catch (Exception e) {
        System.out.println("Invalid Radius Input. Please input a valid integer.");
    }

    }
    
}
