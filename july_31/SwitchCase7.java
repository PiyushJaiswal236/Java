/*
* 1:Max 2no
2:loss or profit
3:quadrant
4:Bank money(ATM)
* */

package july_31;

import java.util.Scanner;

public class SwitchCase7 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1:Max 2no \n2:loss or profit \n3:quadrant \n4:Bank money(ATM)");
            System.out.println("enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    maxFrom2();
                    break;
                case 2:
                    lossOrProfit();
                    break;
                case 3:
                    quadrant();
                    break;
                case 4:
                    bankMoneyATM();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }

        } while (choice <= 4);
    }

    private static void bankMoneyATM() {
        int pin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin");
        pin = sc.nextInt();
        if (pin == 1234) {
            System.out.println("valid pin");
        } else {
            System.out.println("invalid pin");
        }

    }

    private static void quadrant() {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2  number");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x>0&&y>0) {
            System.out.println("1st Quadrant");
        }else if (x<0&&y>0) {
            System.out.println("2nd Quadrant");
        }else if (x<0&&y<0) {
            System.out.println("3rd Quadrant");
        }else if (x>0&&y<0) {
            System.out.println("4th Quadrant");
        }else if (x==0&&y==0) {
            System.out.println("On origin");
        }else if (x==0&&y>0) {
            System.out.println("On positive y-axis");
        }else if (x>0&&y==0) {
            System.out.println("On positive x-axis");
        }else if (x<0&&y==0) {
            System.out.println("on negative x-axis");
        }else if (x==0&&y<0) {
            System.out.println("on negative y-axis");
        }

    }

    private static void lossOrProfit() {
        double cp, sp, amt, disc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  cp & sp");
        cp = sc.nextDouble();
        sp = sc.nextDouble();
        if (cp > sp) {
            amt = cp - sp;
            disc = (amt / cp) * 100;
            System.out.println("loss=" + amt + "Percentage=" + disc);
        }
        if (sp > cp) {
            amt = sp - cp;
            disc = (amt / cp) * 100;
            System.out.println("profit=" + amt + "Percentage=" + disc);
        }
        if (cp == sp) {
            System.out.println("no profit no loss");
        }

    }

    private static void maxFrom2() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2  number");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is max");
        } else if (b > a) {
            System.out.println(b + " is max");
        } else {
            System.out.println("Both are equals");
        }
    }
}
