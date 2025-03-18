package Q_08;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);

        System.out.print("Enter radius value:");
        double radius = r.nextDouble();

        double volume =(4.0/3.0)* Math.PI * Math.pow(radius, 3);

        System.out.println("The volume :" + volume);


    }
}

