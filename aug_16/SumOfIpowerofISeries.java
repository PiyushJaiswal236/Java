package aug_16;

import java.util.Scanner;

public class SumOfIpowerofISeries {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int pow=1;
             
            for (int j = 1; j <= i; j++) {
                pow*=i;
            }
            sum+=pow;
            System.out.println(i+"^"+i+" = "+pow);
        }
        System.out.println("Sum : "+sum);
    }
}
