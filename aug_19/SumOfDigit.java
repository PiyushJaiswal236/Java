package aug_19;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits : "+sum);
    }
}
