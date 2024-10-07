package JAVA.lab_pr;
import java.util.*;
class InvalidNumberException extends Exception
{
    InvalidNumberException(String str)
    {
        super(str);
    }
}
public class negnumroot 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        try
        {
            int num=sc.nextInt();
            if(num<0)
            {
                throw new InvalidNumberException("Negative number entered");
            }
            else
            {
                System.out.println("Square root: "+Math.sqrt(num));
            }
        }
        catch(InvalidNumberException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
