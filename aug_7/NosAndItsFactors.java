package aug_7;

import java.util.Scanner;

public class NosAndItsFactors {
    public static void main(String[] args) {
        int num, fact;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        for (int i = 1; i <= (num/2); i++) {
            if(num%1==0){
                System.out.println(i+"\t");
            }
        }


    }
}
