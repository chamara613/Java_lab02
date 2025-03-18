package Q_09;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter initial investment amount (P): ");
        double P = scanner.nextDouble();

        System.out.print("Enter annual interest rate (R) in percentage: ");
        double R = scanner.nextDouble();

        System.out.print("Enter number of years (N): ");
        int N = scanner.nextInt();

        double finalAmount = P * Math.pow(1 + (R / 100), N);

        System.out.printf("The investment will grow to: %.2f%n", finalAmount);

        scanner.close();

    }
}
