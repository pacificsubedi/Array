package chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        int temp=num;
        int reverse = 0;
        while(num>0){

            int rem = num%10;

            reverse = reverse*10+rem;
            num=num/10;
        }
        if(temp == reverse){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
