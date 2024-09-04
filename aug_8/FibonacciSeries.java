package aug_8;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        int t1 = 0;
        int t2 = 1;
        int t3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 1; i <= n; i++) {
                t3 = t1 + t2;
                System.out.println(t1 + "\t");
                t1 = t2;
                t2 = t3;
            }
        }

    }

}
