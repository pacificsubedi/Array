package chapter3;

import java.util.Scanner;

public class Identity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter true for male & false for female");
        boolean male = sc.nextBoolean();

        System.out.print("Enter the age");
        age = sc.nextInt();


        if (male) {
            if (age > 20) {
                System.out.print("Man");
            } else {
                System.out.print("Boy");
            }
        }
            else{
                    if (age > 20) {
                        System.out.print("Women");
                    } else {
                        System.out.print("Girl");
                    }
                }



        }
    }

