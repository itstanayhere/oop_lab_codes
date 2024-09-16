package JAVA.lab_pr;

import java.util.Scanner;

interface area
{
    abstract void display();
    abstract double calculate();
}
class rectangle implements area
{
    double l,b,area;
    rectangle(double len,double br)
    {
        l=len;
        b=br;
    }
    @Override
    public double calculate() 
    {
        area=l*b;
        return area;
    }
    @Override
    public void display() 
    {
        System.out.println("Area of the rectangle: "+calculate());    
    }
}
class circle implements area
{
    double r,area;
    circle(double radius)
    {
        r=radius;
    }
    @Override
    public double calculate() 
    {
        area=Math.PI*r*r;
        return area;
    }
    @Override
    public void display() 
    {
        System.out.println("Area of the circle: "+calculate());    
    }
}
class interfaceareas
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Area of a rectangle or a circle (1/2) ?");
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
