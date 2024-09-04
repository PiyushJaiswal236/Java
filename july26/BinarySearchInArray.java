package july26;

import java.util.Scanner;

public class BinarySearchInArray {
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
        int start = 0, end = size - 1, mid = size / 2;
        //Arrays.sort(arr);
        




        while (start <= end) {
            if (arr[mid] == item) {
                flag = true;
                System.out.println("Element found at index " + mid);
                break;

            } else if (arr[mid] > item) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        if (flag) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
