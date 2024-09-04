package aug_8;

import java.util.Scanner;

public class WriteYourNameNTimes {
    public static void main(String[] args) {
        int n;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter the number of times you want to print your name");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(name);
        }
    }


}
