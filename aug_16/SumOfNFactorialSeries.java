package aug_16;

import java.util.Scanner;

public class SumOfNFactorialSeries {
    public static void main(String[] args) {
        long n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a N ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            long fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += fact;
            System.out.println(i+" ! = "+fact);
        }
        System.out.println("Sum : "+sum);
    }
}
