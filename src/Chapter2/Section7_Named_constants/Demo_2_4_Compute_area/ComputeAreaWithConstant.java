package Chapter2.Section7_Named_constants.Demo_2_4_Compute_area;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = PI * Math.pow(radius, 2);
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        System.out.println("The area for the circle of radius " +
                formatter.format(radius) + " is " + formatter.format(area));
    }
}
