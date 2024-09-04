package aug_19;

import java.util.Scanner;

public class PrimeNoUsingWhile {
    public static void main(String[] args){
        int n,i=2;
        boolean isPrime=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(i<n/2){
            if(n%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }

    }
}
