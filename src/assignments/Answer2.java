package assignments;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the string ");
        String str= sc.next();
        String reverse="";
        for(int i=str.length()-1; i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("it is palindrome");
        }else {
            System.out.println("it is palindrome");

        }
    }
}
