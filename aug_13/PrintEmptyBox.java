package aug_13;

import java.util.Scanner;

public class PrintEmptyBox {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    if (j == 1 || j == n) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    if (j == 1 || j == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print(((j - 1) > 9) ? (((j % 10) - 1) + " ") : ((j - 1) + " "));
                    }
                }
            }
            System.out.println();

        }
    }
}
