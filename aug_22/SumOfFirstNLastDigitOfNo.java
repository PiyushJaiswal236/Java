package aug_22;

import java.util.Scanner;

public class SumOfFirstNLastDigitOfNo {
    public static void main(String[] args) {
        int n, sum = 0,first=0,last = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        first=n%10;
        while(n>0){
            if(n<10){
                last=n;
            }
            n/=10;
        }
        sum=first+last;
        System.out.println("Sum of first and last digit : "+sum);
    }
}
