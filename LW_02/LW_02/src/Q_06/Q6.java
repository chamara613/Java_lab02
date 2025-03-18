package Q_06;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner born = new Scanner(System.in);
        System.out.print("Enter your born year :");
        int bornYear = born.nextInt();

        int curretYear = 2025;

        int age = -1 * (bornYear - curretYear);

        System.out.println("You Were born in "+ bornYear + "and will be (are) " + age + " this year.");

        born.close();
    }
}
