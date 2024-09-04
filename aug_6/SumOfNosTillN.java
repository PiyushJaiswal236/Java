package aug_6;

import java.util.Scanner;

/*write a program to diaplay sum of number accepted from user*/
public class SumOfNosTillN {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum+=i;
        }
        System.out.println("sum of numbers till "+num+" is "+sum);
    }
}
