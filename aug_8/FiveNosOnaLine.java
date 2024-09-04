package aug_8;

import java.util.Scanner;

public class FiveNosOnaLine {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "	");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
