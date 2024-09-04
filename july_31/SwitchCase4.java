package july_31;

import java.util.Scanner;

public class SwitchCase4 {
    public static void main(String[] args) {
        int ch;
        double r, A, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1:Area of circle \n 2:Area of  traingle\n3:Area of rectangle\n4:Kinetic Energy");
            System.out.println("5:Am & HM");
            System.out.println("enter u r choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter r");
                    r = sc.nextDouble();
                    A = 3.14 * r * r;
                    System.out.println("Area=" + A);

                    break;
                case 2:
                    System.out.println("enter b & h");
                    b = sc.nextDouble();
                    double h = sc.nextDouble();
                    A = 0.5 * b * h;
                    System.out.println("Area of triangle=" + A);

                    break;
                case 3:
                    System.out.println("enter b & l");
                    b = sc.nextDouble();
                    double l = sc.nextDouble();
                    A = l * b;
                    System.out.println("Area of Rect=" + A);

                    break;
                case 4:
                    System.out.println("enter m & v");
                    double m = sc.nextDouble();
                    double v = sc.nextDouble();
                    A = 0.5 * m * v;
                    System.out.println("KE=" + A);
                    break;
                case 5:
                    System.out.println("enter a & b");
                    double a = sc.nextDouble();
                    b = sc.nextDouble();
                    double am = (a + b) / 2;
                    System.out.println("AM=" + am);
                    break;
                // add 3 extra cases
                default:
                    System.out.println("invalid choice");
                    ;
            }
        } while (ch <= 5);
    }
}
