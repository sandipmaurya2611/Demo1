import java.util.Scanner;
public class Reverse1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number:");

        int n = sc.nextInt();
        System.out.println("Enter number N:");

        for(int i=n; i>=1; i--)
        {
            System.out.println("entered number are:"+i);
        }

    }
    
    
}
