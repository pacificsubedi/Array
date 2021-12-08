import java.util.Scanner;

public class Answer1 {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");

        int num = sc.nextInt();

        int rem = num % 10;
        int quot = num / 10;
        int result = rem * 10 + quot;

        if (num == result) {
            System.out.println("Palindrome");

        } else {
            System.out.print("Not palindrome");
        }

    }




}
