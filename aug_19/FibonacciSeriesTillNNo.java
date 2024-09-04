package aug_19;

import java.util.Scanner;

public class FibonacciSeriesTillNNo {
    public static void main(String[] args) {
        int n, t1 = 0, t2 = 1, t3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n >= t3) {
            System.out.print(t3+" ");
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
        }

    }

}
