package assignments;

import java.util.Scanner;

public class Accendingdecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = in.nextDouble();
        System.out.print("Input second number: ");
        double num2 = in.nextDouble();
        System.out.print("Input third number: ");
        double num3 = in.nextDouble();
        if (num1 < num2 && num2 < num3)
        {
            System.out.println("Increasing order");
        }
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println(" Decreasing order");
        }
        else
        {
            System.out.println("perfect");
        }
    }
}
