package JAVA.lab_pr;

import java.util.Scanner;

public class Base
{
    int regno,age;
    String name;
    Base(String s, int r,int a)
    {
        name=s;
        regno=r;
        age=a;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Registration Number:"+regno);
        System.out.println("Age:"+age);
    }
}
public class UG extends Base
{
    int semester,fees;
    static int ugc=0;
    UG(String s,int r,int a, int sem,int f)
    {
        super(s, r, a);
        semester=sem;
        fees=f;
        ugc++;
    }
    void display()
    {
        super.display();
        System.out.println("Semester:"+semester);
        System.out.println("Fees:"+fees);
        System.out.println("Total number of UG Students:"+ugc);
    }
}
public class PG extends Base
{
    int semester,fees;
    static int pgc=0;
    PG(String s,int r,int a, int sem,int f)
    {
        super(s, r, a);
        semester=sem;
        fees=f;
        pgc++;
    }
    void display()
    {
        super.display();
        System.out.println("Semester:"+semester);
        System.out.println("Fees:"+fees);
        System.out.println("Total number of PG Students:"+pgc);
    }
}
public class Student
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int ch=0;
        char c='y';
        String str;
        int regno,ag,fee,sem;
        do
        {
            System.out.println("UG or PG Student (1/2):");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the name, registration number, age, semester and fees of the student:");
                    str=sc.nextLine();
                    regno=sc.nextInt();
                    ag=sc.nextInt();
                    fee=sc.nextInt();
                    sem=sc.nextInt();
                    UG obj=new UG(str, regno, ag, sem, fee);
                    obj.display();
                    break;
                case 2:
                    System.out.println("Enter the name, registration number, age, semester and fees of the student:");
                    str=sc.nextLine();
                    regno=sc.nextInt();
                    ag=sc.nextInt();
                    fee=sc.nextInt();
                    sem=sc.nextInt();
                    PG ob=new PG(str, regno, ag, sem, fee);
                    ob.display();
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
            System.out.println("Run Again (y/n)?");
            c=sc.next().charAt(0);
        }while(c=='y');
    }
}