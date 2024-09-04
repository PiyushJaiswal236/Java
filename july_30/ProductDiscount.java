package july_30;/*
* Product Category Discount.
   •Electronics: 10% discount.
   •Clothing: 15% discount, but 20% if the purchase amount is over Rs. 5000.
   •Food: No discount, unless the purchase amount is over Rs. 1000, then 5% discount.

* */

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        char category;
        double amount;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product category : ");
        System.out.println("A. Electronics B.Clothing C.Food");
        category = sc.next().charAt(0);

        System.out.println("Enter purchase amount : ");
        amount = sc.nextDouble();

        if (category == 'A') {
            System.out.println("10% discount");
        }else if (category == 'B') {
            if (amount > 5000){
                System.out.println("20% discount");
            }else{
                System.out.println("15% discount");
            }
        }else if (category == 'C') {
            if (amount > 1000){
                System.out.println("5% discount");
            }
            System.out.println("no discount");
        }
    }
}
