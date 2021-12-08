import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a number");
        int num = sc.nextInt();

        while (num > 0) ;
        int digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }

}



