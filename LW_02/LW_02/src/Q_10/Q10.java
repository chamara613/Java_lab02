package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amout :");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %) : ");
        double AnnuIn = scanner.nextDouble();

        System.out.print("Enter loan period (In years):");
        int loanP = scanner.nextInt();

        double monthlyIn = AnnuIn / 100.0 / 12;
        int numOfPayment = loanP * 12;

        double monthlyPayment = (loanAmount * monthlyIn)/(1-Math.pow(1 + monthlyIn, - numOfPayment));

        double totalPayment = monthlyPayment * numOfPayment;

        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", totalPayment);

        scanner.close();

    }
}
