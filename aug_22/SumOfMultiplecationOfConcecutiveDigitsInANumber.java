package aug_22;

import java.util.Scanner;

public class SumOfMultiplecationOfConcecutiveDigitsInANumber {
    public static void main(String[] args) {
        int n, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (n > 0) {
            temp = n % 10;
            sum += temp;
            n /= 10;
        }
    }

}
