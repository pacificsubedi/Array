package assignments;

import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println("the integer are: ");
        int sum=0 ;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("the sum of number is :: ");
        for (int i = 1; i < n; i++) {
            sum= sum+i;

        }
        System.out.println(sum);

    }
}
