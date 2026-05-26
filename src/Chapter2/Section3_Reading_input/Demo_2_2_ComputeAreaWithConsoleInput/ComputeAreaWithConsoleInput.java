package Chapter2.Section3_Reading_input.Demo_2_2_ComputeAreaWithConsoleInput;

import java.text.DecimalFormat;     // import clas to format input
import java.util.Scanner;           // import class to enter input

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();     // read a double

        // Compute area
        double area = radius * radius * Math.PI;

        // Create a formatter of DecimalFormat class
        DecimalFormat formatter = new DecimalFormat("#,###.##");

        // Display results
        System.out.println("The area of circle with radius " + radius +
                " is: " + formatter.format(area));
    }
}
