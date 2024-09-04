package aug_19;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n , t1 = 0, t2 = 1, t3 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of terms");
        n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(t3+" ");
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
            i++;
        }


    }
}
