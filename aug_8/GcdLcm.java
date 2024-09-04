package aug_8;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        int n1, n2, gcd = 0, lcm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        int n;
        if (n1 > n2) {
            n = n2;
        } else {
            n = n1;
        }
        for (int i = 1; i <= n; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            lcm = (n1 * n2) / gcd;
        }
        System.out.println("GCD : " + gcd);
        System.out.println("LCM : " + lcm);

    }
}
