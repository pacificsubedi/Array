package chapter4;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float principle,time;
        float rate;
        System.out.println("Enter the principle");
        principle = sc.nextFloat();
        System.out.println("Enter the time duration");
        time = sc.nextFloat();
        System.out.println("Enter the rate");
        rate = sc.nextFloat();
        float si = (principle*time*rate)/100;
        System.out.println("The si is :"+si);

    }
    public static  float simpleInterest(float principle,float rate,float time){
        float si = (principle*time*rate)/100;
        return si;
    }

}
