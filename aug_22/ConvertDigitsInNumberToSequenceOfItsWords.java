package aug_22;

import java.util.Scanner;

public class ConvertDigitsInNumberToSequenceOfItsWords {
    public static void main(String[] args) {
        int n,temp,reverse=0,rem;
        String word="",rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n>0){
            rem=n%10;
            switch (rem){
                case 0:
                    System.out.print("Zero ");
                    word+="Zero ";
                    rev="Zero "+rev;
                    break;
                case 1:
                    System.out.print("One ");
                    word+="One ";
                    rev="One "+rev;
                    break;
                case 2:
                    System.out.print("Two ");
                    word+="Two ";
                    rev="Two "+rev;
                    break;
                case 3:
                    System.out.print("Three ");
                    word+="Three ";
                    rev="Three "+rev;
                    break;
                case 4:
                    System.out.print("Four ");
                    word+="Four ";
                    rev="Four "+rev;
                    break;
                case 5:
                    System.out.print("Five ");
                    word+="Five ";
                    rev="Five "+rev;
                    break;
                case 6:
                    System.out.print("Six ");
                    word+="Six ";
                    rev="Six "+rev;
                    break;
                case 7:
                    System.out.print("Seven ");
                    word+="Seven ";
                    rev="Seven "+rev;
                    break;
                case 8:
                    System.out.print("Eight ");
                    word+="Eight ";
                    rev="Eight "+rev;
                    break;
                case 9:
                    System.out.print("Nine ");
                    word+="Nine ";
                    rev="Nine "+rev;
                    break;
            }
            n/=10;
        }
        System.out.println("rev :"+rev);
        System.out.println("word :"+word);
    }
}
