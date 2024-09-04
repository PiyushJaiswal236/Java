package aug_13;

import java.util.Scanner;

public class PrintPlus {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        if (n>2){
            if(n%2==0){
                for (int i=1;i<=n;i++){
                    for (int j=1;j<=n;j++){
                        if(j==n/2||j==(n/2)+1){
                            System.out.print("*");
                        }else if(i==n/2||i==(n/2)+1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }else {
                for (int i=1;i<=n;i++){
                    for (int j=1;j<=n;j++){
                        if(j==n/2+1){
                            System.out.print("*");
                        }else if(i==n/2+1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }else {
            System.out.println("Value must be greater than 2 !!");
        }
    }
}
