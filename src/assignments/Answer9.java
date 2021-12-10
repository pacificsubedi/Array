package assignments;

import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance in meter: ");
        float distance= sc.nextFloat();
        System.out.println("enter the time in hour minute and second respectively: ");
        float hour= sc.nextFloat();
        float minute= sc.nextFloat();
        float second= sc.nextFloat();
        float time=(hour*60*60)+(minute*60)+second;
        float distance1=distance/1000;
        float time2=hour+(minute/60)+(second/3600);
        float distance3=distance/1609;
        System.out.println("the speed is "+distance/time+"m/s");
        System.out.println("the speed is "+distance1/time2+"km/h");
        System.out.println("the speed is "+distance3/time2+"miles/h");
    }
}
