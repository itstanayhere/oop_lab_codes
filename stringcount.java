package JAVA.lab_pr;

import java.util.Scanner;

public class stringcount 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Number of characters: "+str.length());
        String word[]=str.split("\\s+");
        System.out.println("Number of words: "+word.length);
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='\n')
                c++;
        }
        System.out.println("Number of Lines= "+c);
        String vowels="aeiou";
        c=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(vowels.indexOf(str.charAt(i))!=-1)
                c++;
        }
        System.out.println("Number of vowels: "+c);
        sc.close();
    }
     
}
