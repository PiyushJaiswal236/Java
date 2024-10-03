package sept_5;

import java.util.Scanner;

public class Function {
    static void pattern() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + j);
            }
            System.out.println();
        }
    }
    static void isPrime(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;
                }
        }
        if (flag) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
    static void  palindrom(){
        int n,rem,rev=0,temp,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        temp=n;
        while(temp>0){
            rem=temp%10;
            temp=temp/10;
            sum=(sum*10)+rem;
        }
        if(sum==n)
            System.out.println( "No is pal");
        else
            System.out.println(  "No is not pal");
    }

    public static void main(String[] args) {


    }
}
