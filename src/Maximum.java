import java.util.Scanner;
class Maximum {
    public static void main(String[]args) {
        System.out.println("Menu Driven Program");
        System.out.println("---------------------");
        System.out.println("1. Add two numbers");
        System.out.println("2. Palindrome number");
        System.out.println("3. Simple Interest");
        System.out.println("4. Even and Odd ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice(1,2,3,4) : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter first no : ");
                int first = sc.nextInt();
                System.out.println("Enter second no : ");
                int second = sc.nextInt();
                int result = first + second;
                System.out.println("The total sum is : " + result);
                break;

            }
            case 2: {
                System.out.println("Enter a number : ");
                int num = sc.nextInt();
                int rem = num % 10;
                int quot = num / 10;
                int result = rem * 10 + quot;
                if (num == result) {
                    System.out.println("Palindrome number");
                } else {
                    System.out.println("Not a Palindrome number");
                }
                break;

            }
            case 3: {


                System.out.println("Enter the principle amount : ");
                double principle = sc.nextDouble();
                System.out.println("Enter the time : ");
                double time = sc.nextDouble();
                System.out.println("Enter the rate : ");
                double rate = sc.nextDouble();
                double total = (principle * time * rate) / 100;
                System.out.println("Simple Interest = " + total);

                break;

            }
                        }


    }
    }