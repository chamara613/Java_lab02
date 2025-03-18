package Q_05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner Fah = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = Fah.nextDouble();
        double celsius =(fahrenheit - 32)*(5.0/9.0);

        System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", fahrenheit, celsius);
        Fah.close();
    }
}
