import java.util.Scanner;

public class Userinpur {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        //taking input from user......
        System.out.println("You entered the String:");
        String name = input.nextLine();
        

        //taking input age from user
        System.out.println("Enter the age:");
        int age = input.nextInt();

        // taking percentage from user
        System.out.println("Enter the percentage:");
        float percentage = input.nextFloat();

        // taking income of the user
        System.out.println("enter the income:");
        double income = input.nextDouble();
    }
    
}
