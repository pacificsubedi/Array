package assignments;

import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {
        float BMI;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the weight of the person: ");
        float weight= sc.nextFloat();
        System.out.println("enter the weight of the person: ");
        float height= sc.nextFloat();
        BMI=(weight/(height*height));
        System.out.println("the BMI of the person is "+BMI+"kg/m sqr");

    }
}
