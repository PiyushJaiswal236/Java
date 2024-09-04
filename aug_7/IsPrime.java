package aug_7;

import java.util.Scanner;

public class IsPrime {
    public static   void main(String [] args){
        int i,n, div=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        for (i=2;i<=(n/2);i++){
            if(n%i==0){
                div = 1;
                break;
            }
        }
        if(div==0){
            System.out.println("No is Prime");
        }else{
            System.out.println("No is not23 Prime");
        }

    }
}
