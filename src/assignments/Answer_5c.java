package assignments;


public class Answer_5c {
    public static void main(String[] args) {
        int n = 6;
        for(int i=0;i<n;i++)
        {
            for(int k=i;k<n;k++)
                System.out.print("  ");
            for(int j=0;j<=2*i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    }

