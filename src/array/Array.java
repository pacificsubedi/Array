package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[]arr;
        arr = new int[5];

        for (int i=0;i< arr.length;i++) {
            System.out.println("Enter an elements for index" + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are :: ");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);

        }


    }
}
