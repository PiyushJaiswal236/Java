package july26;

import java.util.Scanner;

public class LinearSearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int item = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Element found");
        }

    }
}
