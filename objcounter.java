package JAVA.lab_pr;
import java.util.*;
class objcounter
{
    static int c=0;
    objcounter()
    {
        c++;
    }
    int count()
    {
        return c;
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        char c1='y';
        do
        {
            System.out.println("Create object (y/n)?");
            c1=sc.next().charAt(0);
            if(c1=='y')
            {
                objcounter obj=new objcounter();
                System.out.println("Total number of objects created: "+obj.count());
            }
        }while(c1=='y');
        sc.close();  
    }
}