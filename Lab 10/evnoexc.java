package JAVA.lab_pr;

import java.util.Scanner;

class EvenNumberException extends Exception
{
    EvenNumberException(String str)
    {
        super(str);
    }
}
public class evnoexc 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        try
        {
            int num=sc.nextInt();
            if(num%2==0)
                throw new EvenNumberException("Even number entered");
            else
                System.out.println("Number entered: "+num);
        }    
        catch(EvenNumberException e)
        {
            System.out.println(e.getMessage());
        }
    }    
}
