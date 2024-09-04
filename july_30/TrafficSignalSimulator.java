package july_30;/*
* Write a program that simulates a traffic light.
* The program asks the user for the current color of the traffic
* light and then informs them of the appropriate action based on the color.
* */

import java.util.Scanner;

public class TrafficSignalSimulator {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter color of traffic light : ");
        System.out.println("Enter g for green, y for yellow, r for red");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if (ch == 'g') {
            System.out.println("Go");
        } else if (ch == 'y') {
            System.out.println("Wait");
        }else if (ch == 'r') {
            System.out.println("Stop");
        }
    }
}
