package Q_01;

public class Q1 {
    public static void main(String[] args) {
        double B = 3, A = 2, C = 5;
        double X = 4, Y =2;
        double r = 7;

        double result1 = Math.sqrt(Math.pow(B, 2)+ 4 * A * C);
        double result2 = Math.sqrt(X + 4 * Math.pow(Y, 3));
        double result3 = Math.cbrt(X * Y);
        double area = Math.PI * Math.pow(r, 2);



        System.out.println("Result 1:" +result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Circle Area: " + area);

    }
}
