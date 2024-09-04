package aug_8;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int n, power, ans = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        System.out.print("Enter Power : ");
        power = sc.nextInt();
        for (int i = 1; i <= power; i++) {
            ans *= n;
        }
        System.out.println(n + " ^ " + power + " = " + ans);
    }


}
