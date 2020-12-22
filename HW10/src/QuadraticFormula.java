import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        System.out.print("Enter a parameter: \n a = ");
        Scanner aScan = new Scanner(System.in);
        double a = aScan.nextDouble();
        System.out.print("Enter b parameter: \n b = ");
        Scanner bScan = new Scanner(System.in);
        double b = bScan.nextDouble();
        System.out.print("Enter a parameter: \n c = ");
        Scanner cScan = new Scanner(System.in);
        double c = aScan.nextDouble();
        double x1;
        double x2;
        double temp = Math.pow(b, 2) - 4 * a * c;

        if (temp >= 0) {
            x1 = (-b + temp) / (2 * a);
            x2 = (-b - temp) / (2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else {
            System.out.println("There are no real square roots in an equation.");

        }
    }

}
