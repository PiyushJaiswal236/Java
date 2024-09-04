package aug_6;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int table;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a the table number : ");
        table = sc.nextInt();
        System.out.println("Multiplication table of " + table);
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = " + table * i);
        }
    }
}
