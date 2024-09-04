package aug_19;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int power, n,ans=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        System.out.println("Enter the power");
        power = sc.nextInt();

        if (power == 0) {
            System.out.println("1");
        } else {
            int i = 1;
            while (i <= power) {
                ans*=n;
                i++;
            }
            System.out.println(ans);
        }
    }
}
