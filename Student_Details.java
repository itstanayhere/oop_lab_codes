package JAVA.lab_pr;

import java.util.Scanner;

public class Student_Details 
{
    String name,college;
    int id;
    void displayinfo()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("College Name: "+college);
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the student's name, ID and college: ");
        Student_Details obj=new Student_Details();
        Scanner sc= new Scanner(System.in);
        obj.name=sc.nextLine();
        obj.id=sc.nextInt();
        sc.nextLine();//to clear the scanner buffer
        obj.college=sc.nextLine();
        obj.displayinfo();
        sc.close();
    }
}
