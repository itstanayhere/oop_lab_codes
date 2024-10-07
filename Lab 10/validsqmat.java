package JAVA.lab_pr;
import java.util.*;
class InvalidMatrixException extends Exception
{
    InvalidMatrixException(String str)
    {
        super(str);
    }
} 
public class validsqmat 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the matrix: ");
        int row=sc.nextInt();
        System.out.println("Enter the height of the matrix: ");
        int col=sc.nextInt();
        try
        {
            if(row!=col)
            {
                sc.close();
                throw new InvalidMatrixException("Not a square matrix");
            }
            else
            {
                System.out.println("Valid square matrix");
            }
        }
        catch(InvalidMatrixException e)
        {
            System.out.println(e);
        }
        sc.close();
    }    
}