import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rollno:"); //Input Taken from student Rollno
        int rollno = sc.nextInt();
        
        String clearedBuffer = sc.nextLine();
        System.out.println("Please entered the Name:");
        String str = sc.nextLine();

        System.out.println("You have enterd the Rollno:" +rollno);
        System.out.println("You have entered the name:"+str);
        
    }
    
}
