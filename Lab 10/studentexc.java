package JAVA.lab_pr;
import java.util.*;
public class studentexc 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);  
        try
        {
            System.out.println("Enter name of the student: ");
            String str=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter the marks in subject 1");
            int m1=sc.nextInt();
            System.out.println("Enter the marks in subject 2");
            int m2=sc.nextInt();
            System.out.println("Enter the marks in subject 3");
            int m3=sc.nextInt();
        }  
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }
    }    
}
