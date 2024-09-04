package july_30;/*
 * Write a program to read any digit and display it in the word
 * */

import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        int digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit between 0 - 9 : ");
        digit = sc.nextInt();

        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
