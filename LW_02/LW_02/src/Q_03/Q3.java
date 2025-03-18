package Q_03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner cel = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius =cel.nextDouble();
        double fahrenheit = (1.8 * celsius) + 32;
        System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
        cel.close();
    }
}