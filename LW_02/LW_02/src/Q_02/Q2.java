package Q_02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double inch = 2.54;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cm: ");
        double centimeter = scanner.nextDouble();

        double inches = centimeter / inch;
        double feet = inches / 12;


        System.out.printf("%.2f cm = %.2f feet and %.2f inches%n", centimeter, feet, inches % 12);

        scanner.close();
    }
}
