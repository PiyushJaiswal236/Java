package aug_22;

import java.util.Scanner;

public class NoOfEvenOddAndZeroDigitsInNumber {
    public static void main(String[] args) {
        int n, even = 0, odd = 0, zero = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n > 0) {
            temp = n % 10;
            if (temp == 0) {
                zero++;
            } else if (temp % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        System.out.println("Zero : " + zero);
    }
}
