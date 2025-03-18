package Q_04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        System.out.print("Enter the weight in kg : ");
        double bodyweight =weight.nextDouble();
        double calories = bodyweight * 19;
        System.out.printf("%.2f bodyWeight = %.2f calories%n", bodyweight, calories);
        weight.close();
    }
}
