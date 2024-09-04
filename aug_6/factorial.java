package aug_6;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = sc.nextInt();
        for (int i = n; i > 1; i--) {
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
