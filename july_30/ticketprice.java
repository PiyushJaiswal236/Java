package july_30;

import java.util.Scanner;

/*
*2)Write a program that calculates the ticket price for a movie based
*  on the age of the customer. Children under 12 get a discount, while
*  seniors over 65 also get discount.
* */
public class ticketprice {
    public static void main(String args[]){
        int age;
        double price;
        System.out.println("Enter age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age<=12&&age>=0) {
            System.out.println("you got discount of 10%");
        }

            if (age<=65) {
                System.out.println("you got discount of 15%");
            }
    }
}
