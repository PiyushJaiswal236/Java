package july_30;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
*Write a program to read a 3 digit number and find whether the middle digit is
* numerically equal to the sum of the other Two digits and prints an appropriate response?
 * */
public class MiddleDigitNumberSum {
    public static void main(String[] args) {
        System.out.println("Enter 3 digit whole number : ");
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
            if (num >= 100 && num <= 999) {
                int a = num / 100;
                int b = (num / 10) % 10;
                int c = num % 10;

                int sum = a + c;
                if (b == sum) {
                    System.out.println(a + " + " + c + " = " + sum + " ie = Middle Number");
                } else {
                    System.out.println(a + " + " + c + " = " + sum + " ie != Middle Number");
                }
            } else {
                System.out.println("enter valid number");
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid Input! Please enter Integer Value !");
        }
    }
}
