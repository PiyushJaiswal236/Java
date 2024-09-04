package aug_16;

import java.util.Scanner;

public class SumOfOddNoSeriesIntoX {
    public static void main(String[] args) {
        int n, x, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Iterations");
        n = sc.nextInt();
        System.out.println("Enter a X ");
        x = sc.nextInt();
        for (int i = 1; i <= n*2; i += 2) {
            sum += (i * x);
            System.out.println(i + " * " + x + " = " + (i * x));
        }
        System.out.println("Sum : " + sum);
    }
}
