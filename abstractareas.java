package JAVA.lab_pr;

import java.util.Scanner;

abstract class area
{
    abstract void display();
    abstract double calculate();
}
class rectangle extends area
{
    double len,br,area;
    rectangle(double l,double b)
    {
        len=l;
        br=b;
    }
    double calculate()
    {
        area=len*br;
        return area;
    }
    void display()
    {
        System.out.println("Area of the rectange: "+calculate());
    }
}
class circle extends area
{
    double area,radius;
    circle(double r)
    {
        radius=r;
    }
    double calculate()
    {
        area=Math.PI*radius*radius;
        return area;
    }
    void display()
    {
        System.out.println("Area of the circle: "+calculate());
    }
}
class abstractareas
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Area of rectangle or circle (1/2) ?");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the length and breadth of the rectangle:");
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                rectangle obj =new rectangle(l,b);
                obj.display();
                break;
            case 2:
                System.out.println("Enter the radius of the circle: ");
                double r=sc.nextDouble();
                circle ob =new circle(r);
                ob.display();
                break;
            default:
                System.out.println("Invalid Input!");
        }
        sc.close();
    }
}