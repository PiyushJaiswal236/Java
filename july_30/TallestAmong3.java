package july_30;/*
* .Find the tallest student among 3 students.

 * */

import java.util.Scanner;

public class TallestAmong3 {
    public static void main(String[] args){
        double height1, height2, height3;
        System.out.println("Enter 3 heights : ");
        Scanner sc = new Scanner(System.in);
        height1 = sc.nextDouble();
        height2 = sc.nextDouble();
        height3 = sc.nextDouble();
        if (height1 > height2) {
            if (height1 > height3) {
                System.out.println("1st is tallest");
            } else {
                System.out.println("3rd is tallest");
            }
        } else {
            if (height2 > height3) {
                System.out.println("2nd is tallest");
            } else {
                System.out.println("3rd is tallest");
            }
        }

    }
}