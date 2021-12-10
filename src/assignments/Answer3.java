package assignments;

import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many names do you want to print in alphabetical order");
        int n= sc.nextInt();
        String[]names=new String[n];
        System.out.println("enter the names: ");
        for(int i=0;i<n;i++){
            names[i]=sc.nextLine();
        }
        String temp;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(names[i].compareTo(names[j])>0){
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println(" In Alphabetical  order ");
        for(int i=0;i<n-1;i++){
            System.out.println(names[i]);
        }
        System.out.println(names[n-1]);
        sc.close();
    }
}
