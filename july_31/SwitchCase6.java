/*
1:first no is between Secod no and third no
2:min from 3 numbers
3:max from 3 numbers
4:ATKT
5:traingle
6:Blood donation
7:Aptitude exam
* */

package july_31;

import java.util.Scanner;

public class SwitchCase6 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1:first no is between Secod no and third no\n2:min from 3 numbers\n3:max from 3 numbers\n4:ATKT\n5:traingle\n6:Blood donation\n7:Aptitude exam");

            System.out.println("enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    firstNoIsBetweenSecondNoAndThirdNo();
                    break;
                case 2:
                    minFrom3();
                    break;
                case 3:
                    maxFrom3();
                    break;
                case 4:
                    atkt();
                    break;
                case 5:
                    traingle();
                    break;
                case 6:
                    bloodDonation();
                    break;
                case 7:
                    aptitudeExam();
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice <= 7);
    }

    private static void aptitudeExam() {
        int t10, t12, l1, total;
        double per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3");
        t10 = sc.nextInt();
        t12 = sc.nextInt();
        l1 = sc.nextInt();
        total = t10 + t12 + l1;
        per = (double) total / 3;
        System.out.println("Total=" + total + " Per=" + per);
        if (per >= 60) {
            System.out.println("eligible for aptitude");
        }
        else {
            System.out.println("not eligible");
        }
    }

    private static void bloodDonation() {
        double wt, age, hb;
        Scanner sc = new Scanner(System.in);
        wt = sc.nextDouble();//weight
        age = sc.nextDouble();
        hb = sc.nextDouble();//hemoglobin
        if (wt >= 55) {
            if (age >= 18) {
                if (hb >= 12) {
                    System.out.println("eligible for blood donation");
                } else {
                    System.out.println("not eligible hb is low");
                }
            } else {
                //wt valid but age is not valid
                System.out.println("not eligible age is low");
            }
        } else {
            //wt is not valid
            System.out.println("not eligible weight is low");
        }


    }

    private static void traingle() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3  number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a * a) + (b * b) == (c * c) || (b * b) + (c * c) == (a * a) || (c * c) + (a * a) == (b * b)) {
            System.out.println(":Right angled triangle");
        } else if ((a == b) && (b == c)) {
            System.out.println("Equilateral triangle");
        } else if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Isosceles triangle");
        }
    }

    private static void atkt() {
        int m1, m2, m3, total;
        double per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        total = m1 + m2 + m3;
        per = (double) total / 3;
        System.out.println("Total=" + total + "\nPer=" + per);
        if (per >= 70 && per <= 100) {
            System.out.println("Distinction");
        } else if (per >= 60 && per < 70) {
            System.out.println(" First class");
        } else if (per >= 55 && per < 60) {
            System.out.println(" Higher");
        } else if (per >= 50 && per < 55) {
            System.out.println(" Second");
        } else if (per >= 40 && per < 50) {
            System.out.println(" Pass");
        } else {
            System.out.println("Fail");
        }
    }

    private static void maxFrom3() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3  number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is max");
        } else if (b > a && b > c) {
            System.out.println(b + " is max");
        } else if (c > a && c > b) {
            System.out.println(c + " is max");
        } else if (a == b && a > c) {
            System.out.println(a + " and " + b + " is max & equals");
        } else if (a == c && c > b) {
            System.out.println(a + " and " + c + " is max & equals");
        } else if (c == b && b > a) {
            System.out.println(c + " and " + b + " is max & equals");
        } else {
            System.out.println("All are equals");
        }

    }

    private static void minFrom3() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3  number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println(a + " is min");
        } else if (b < a && b < c) {
            System.out.println(b + " is min");
        } else if (c < a && c < b) {
            System.out.println(c + " is min");
        } else if (a == b && a < c) {
            System.out.println(a + " and " + b + " is min & equals");
        } else if (a == c && a < b) {
            System.out.println(a + " and " + c + " is min & equals");
        } else if (c == b && c < a) {
            System.out.println(c + " and " + b + " is min & equals");
        } else {
            System.out.println("All are equals");
        }
    }

    private static void firstNoIsBetweenSecondNoAndThirdNo() {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3  number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((a > b && a < c)) {
            System.out.println(a + " is between " + b + " and " + c);
        } else {
            System.out.println(a + " is not between" + b + " and " + c);
        }
    }
}
