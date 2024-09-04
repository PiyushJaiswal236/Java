package aug_6;

import java.util.Scanner;

public class MultiplicationTableWithoutAstrisOperator {
    public static void main(String[] args) {
        int table,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the table number : ");
        table = sc.nextInt();
        System.out.println("Multiplication table of " + table);
        for (int i = 1; i <= 10; i++) {
            sum+=table;
            System.out.println(table + " * " + i + " = " + sum);
        }

    }
}
