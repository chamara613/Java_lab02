package Q_07;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg:");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm:");
        double height = scanner.nextDouble();

        double heightM = height / 100.0;

        double BMI = weight /(heightM * heightM);


        System.out.printf( "Your BMI is:%.2f%n", BMI);
        scanner.close();

    }
}
