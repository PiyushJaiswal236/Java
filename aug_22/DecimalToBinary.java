package aug_22;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n ,binary=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        while(n>0){
            if(n%2==0){
                binary=binary*10+0;
            }
            else{
                binary=binary*10+1;
            }
            System.out.println(binary);
            n/=2;
        }
        System.out.println("Binary : "+binary);

    }
}
