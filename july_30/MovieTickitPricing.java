package july_30;/*
* Movie Ticket Pricing
  •Children (under 13 years): Rs. 100 on weekdays, Rs. 120 on weekends.
  •Adults (13 to 64 years): Rs. 150 on weekdays, Rs. 180 on weekends.
  •Seniors (65 years and above): Rs. 130 on weekdays, Rs. 150 on weekends.
* */

import java.util.Scanner;

public class MovieTickitPricing {
    public  static  void main(String args[]){
        Boolean isWeekend;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        age = sc.nextInt();
        System.out.println("Enter isWeekend : ");
        isWeekend = sc.nextBoolean();

        if (age < 13&& age > 0) {
            if (isWeekend) {
                System.out.println("price = 120");
            }else{
                System.out.println("price = 100");
            }
        }else if (age >= 13 && age <= 64) {
            if (isWeekend) {
                System.out.println("price = 180");
            }else{
                System.out.println("price = 150");
            }
        }else if (age > 64) {
            if (isWeekend) {
                System.out.println("price = 150");
            }else{
                System.out.println("price = 130");
            }
        }


    }
}
