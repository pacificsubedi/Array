package chapter4;

import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int first = sc.nextInt();
        System.out.println("Enter the second number");
        int second = sc.nextInt();
        System.out.println("Enter the third number");
        int third = sc.nextInt();

        int heighest = findHighest(first,second,third);

        System.out.println("The higher number is :"+ heighest);
    }

    private static  int findHighest(int first,int second,int third){

        int heighest;
        if(first>second && first>third)
            heighest = first;
        else if(second>first && second>third)
            heighest = second;
        else
            heighest= third;
        return  heighest;
    }

}
