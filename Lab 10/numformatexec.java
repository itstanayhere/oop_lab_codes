package JAVA.lab_pr;

import java.util.Scanner;

public class numformatexec 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str;    
        try {
            str=sc.next();
            int a=Integer.parseInt(str);
            System.out.println("Number: "+a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid conversion attempted");
        }
    }    
}
