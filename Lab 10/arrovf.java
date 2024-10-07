package JAVA.lab_pr;
import java.util.*;

class ArrayOverflowException extends Exception 
{
    public ArrayOverflowException(String message) 
    {
        super(message);
    }
}

public class arrovf 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int k = 0;
        
        try 
        {
            while (k <= size) 
            {
                if (k >= size) 
            {
                throw new ArrayOverflowException("More elements than array can handle");
            }
                System.out.println("Enter an element: ");
                arr[k++] = sc.nextInt();
                System.out.println("Number of elements: " + k);
            }
            
        } 
        catch (ArrayOverflowException e) 
        {
            System.out.println(e.getMessage());
        }
    }    
}
