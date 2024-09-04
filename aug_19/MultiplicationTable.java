package aug_19;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }
    }
}
