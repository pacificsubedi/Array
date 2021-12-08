package chapter4;

import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class Functions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();
        int result = addTwoNumber(first, second);
        ;
        System.out.println("Sum is " + result);


    }

    public static int addTwoNumber(int first, int second) {
        int result = first + second;
        return result;
    }
}
