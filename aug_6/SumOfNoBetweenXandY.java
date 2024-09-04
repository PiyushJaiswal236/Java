package aug_6;

import java.util.Scanner;

public class SumOfNoBetweenXandY {
    public static void main(String[] args) {
        int x, y, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        System.out.print("x : ");
        x = sc.nextInt();
        System.out.print("y : ");
        y = sc.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers between " + x + " and " + y + " is " + sum);
    }
}
