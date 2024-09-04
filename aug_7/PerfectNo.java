package aug_7;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        System.out.print("Factors of " + n + " are : ");
        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                System.out.print(i + "\t");
                sum += i;
            }
        }
        System.out.println();
        if (sum == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}
