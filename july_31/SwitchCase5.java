/*
* 5)
1:even/odd
2:divisible by 17
3:divisible by 5 & 7
4:divisible by 5 or 7
5:leap year or not
6:pos/neg
7:Calculate electricity bill
8:age
10:pin
* */

package july_31;

import java.util.Scanner;

public class SwitchCase5 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1:Even Odd \n2:divisible by 17\n3:divisible by 5 & 7\n4:divisible by 5 or 7\n5:leap year or not\n6:pos/neg\n7:Calculate electricity bill\n7:Calculate electricity bill\n8:age\n9:Discount\n10:pin" );

            System.out.println("enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    evenOdd();
                    break;
                case 2:
                    divisibleBy17();
                    break;
                case 3:
                    divisibleBy5And7();
                    break;
                case 4:
                    divisibleBy50Or7();
                    break;
                case 5:
                    leapYear();
                    break;
                case 6:
                    posOrNeg();
                    break;
                case 7:
                    electricityBill();
                    break;
                case 8:
                    age();
                    break;
                case 9:
                    discount();
                    break;
                case 10:
                    pin();
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice <= 10);
    }

    private static void divisibleBy50Or7() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n % 5 == 0 || n % 7 == 0) {
            System.out.println(n + " is divisible by 5 or 7");
        } else {
            System.out.println(n + " is not divisible by 5 or 7");
        }
    }

    private static void pin() {
        int pin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin");
        pin = sc.nextInt();
        if (pin == 1234) {
            System.out.println("Valid pin");
        } else {
            System.out.println("Invalid pin");
        }
    }

    private static void discount() {
        double amt, disc, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        amt = sc.nextDouble();
        if (amt < 10000) {
            System.out.println("No disc");
        } else if (amt >= 10000 && amt < 20000) {
            disc = amt * 0.05;
            total = amt - disc;
            System.out.println("Disc amt=" + disc + " Total= " + total);
        } else if (amt >= 20000 && amt < 50000) {
            disc = amt * 0.07;
            total = amt - disc;
            System.out.println("Disc amt=" + disc + " Total= " + total);
        } else {
            disc = amt * 0.10;
            total = amt - disc;
            System.out.println("Disc amt=" + disc + " Total= " + total);
        }
    }

    private static void age() {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not Eligible for voting");
        }
    }

    private static void electricityBill() {
        int unit;
        double UC, ElectricityCharge = 0.0, EC, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units");
        unit = sc.nextInt();
        if (unit <= 100) {
            ElectricityCharge = unit * 3.44;
            System.out.println("Electricity charge :" + ElectricityCharge);
        } else if (unit >= 101 && unit <= 300) {
            ElectricityCharge = unit * 7.34;
            System.out.println("Electricity charge :" + ElectricityCharge);
        } else if (unit >= 301 && unit <= 500) {
            ElectricityCharge = unit * 10.36;
            System.out.println("Electricity charge :" + ElectricityCharge);
        } else if (unit >= 501 && unit <= 1000) {
            ElectricityCharge = unit * 11.82;

            System.out.println("Electricity charge :" + ElectricityCharge);
        } else {
            ElectricityCharge = unit * 11.92;
            System.out.println("Electricity charge :" + ElectricityCharge);
        }
        UC = unit * 1.38;
        EC = ((102 + ElectricityCharge + UC) * 0.16);
        total = 102 + ElectricityCharge + UC + EC;
        System.out.println("Unit Charge=" + UC);
        System.out.println("tax=" + EC);
        System.out.println("Total bill=" + total);

    }

    private static void posOrNeg() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1  number");
        n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is positive");
        } else if (n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println(n + " is Zero");
        }
    }

    private static void leapYear() {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }

    private static void divisibleBy5And7() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n % 5 == 0 && n % 7 == 0) {
            System.out.println(n + " is divisible by 5 and 7");
        } else {
            System.out.println(n + " is not divisible by 5 or 7");
        }
    }

    private static void divisibleBy17() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        n = sc.nextInt();
        if (n % 17 == 0) {
            System.out.println(n + " is divisible by 17");
        } else {
            System.out.println(n + " is not divisible by 17");
        }
    }

    private static void evenOdd() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is Even");

        } else {
            System.out.println(n + " is Odd");
        }


    }
}


