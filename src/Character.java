import java.util.Scanner;

public class Character {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Ennter the gender");//f for female m for male
        char gender=sc.next().charAt(0);
        switch (gender)
        {
            case 'm':
                System.out.print("Male");
                        break;
            case 'f':
                System.out.print("Female");
                break;

        }
    }
}
