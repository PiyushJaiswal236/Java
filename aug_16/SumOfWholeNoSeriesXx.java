package aug_16;

import java.util.Scanner;

public class SumOfWholeNoSeriesXx {
    public static void main(String[] args) {
        int n, x, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No of Iterations");
        n = sc.nextInt();
        System.out.println("Enter a X ");
        x = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += (i * x);
            System.out.println(i + " * " + x + " = " + (i * x));
        }
        System.out.println("Sum : " + sum);

    }
}
