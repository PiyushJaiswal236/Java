package aug_7;

import java.util.Scanner;

public class CharacterAndRange {

    public static void main(String[] args) {
        char ch;
        int range;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        ch = sc.next().charAt(0);
        System.out.println("Enter the range");
        range = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= range; i++) {
            System.out.print((ch++)+"\t");
        }
    }

}
