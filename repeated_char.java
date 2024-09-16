package JAVA.lab_pr;

import java.util.Scanner;

public class repeated_char 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str=sc.next(),s="";
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            s+=ch;
        }
        System.out.println("String with repeating character only: "+s);
        sc.close();
    }    
}
