package chapter3;

import java.util.Locale;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        char choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int first = sc.nextInt();
            System.out.println("Enter second number : ");
            int second = sc.nextInt();

            int result = first + second;
            System.out.print("Sum is " + result);
            System.out.println("Do you want to continue(Y/N) : ");
            choice = sc.next().toLowerCase().charAt(0);
        }while(choice=='y');

}
}

