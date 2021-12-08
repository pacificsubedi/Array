package assignments;


import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr;
        arr = new int[5];

        for (int i=0;i< arr.length;i++) {
            System.out.println("Enter an elements for index" + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number");
        for (int i =0; i<arr.length;i++){

            if (arr[i]%2==0)
            System.out.println(arr[i]);

        }

    }
}
