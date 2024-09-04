package july_30;/*
* 34.	A company insures its drivers in the following cases
1.	If the driver is married
2.	If the driver is unmarried, male and above 30 years of age
3.	If the driver is unmarried, female and above 25 years of age
In all other cases, the driver is not insured. If the marital status, gender, age of the driver are the inputs,
write a program to determine whether the driver is insured or not. (use ‘nested-if’).
* */

import java.util.Scanner;

public class DriverInsurance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of The Driver :");
        int age = sc.nextInt();
        System.out.println("Enter Gender of The Driver (M,m for Male, F,f for Female) : ");
        char gender = sc.next().toLowerCase().charAt(0);
        System.out.println("Is Driver Married (True or False) : ");
        boolean isMarried = sc.nextBoolean();

        if(isMarried){
            System.out.println("Driver is Assured !");
        }else {
            if(gender=='m' && age>=30){
                System.out.println("Driver is Assured !");
            } else if (gender=='f'&& age>=25) {
                System.out.println("Driver is Assured !");
            }else {
                System.out.println("Driver is Not Assured !");
            }
        }

    }
}
