package Chapter2.Section3_Reading_input.Demo_2_3_ComputeAverage;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double avg = (number1 + number2 + number3) / 3;
        System.out.println("Average = " + avg);
    }
}
