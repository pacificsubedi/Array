package assignments;

import java.util.Scanner;

public class Answer_5d {
    public static void main(String[] args) {

        int n = 5;
        for(int i=n;i>0;i--)
        {
            for(int k=i;k<n;k++)
                System.out.print("  ");
            for(int j=2*i;j>1;j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
