package aug_8;

import java.util.Scanner;

public class Pronic {
    public static void main(String[] args) {
        int n;
        boolean isPronic = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();

        for (int i = 1; i <= (n / 2); i++) {
            if (n % i == 0) {
                if ((i * (i + 1)) == n) {
                    isPronic = true;
                    break;
                }
            }
        }

        if (isPronic) {
            System.out.println(n + " is a pronic number");
        } else {
            System.out.println(n + " is not a pronic number");
        }
    }
}
