package JAVA.lab_pr;
import java.util.Scanner;
public class autobub 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Taking inputs for each primitive type
        System.out.print("Enter a byte value: ");
        byte byteVal = sc.nextByte();

        System.out.print("Enter a short value: ");
        short shortVal = sc.nextShort();

        System.out.print("Enter an int value: ");
        int intVal = sc.nextInt();

        System.out.print("Enter a long value: ");
        long longVal = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatVal = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleVal = sc.nextDouble();

        System.out.print("Enter a char value: ");
        char charVal = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean boolVal = sc.nextBoolean();

        // Autoboxing: converting primitives to wrapper classes
        Byte byteObj = byteVal;       // byte -> Byte
        Short shortObj = shortVal;    // short -> Short
        Integer intObj = intVal;      // int -> Integer
        Long longObj = longVal;       // long -> Long
        Float floatObj = floatVal;    // float -> Float
        Double doubleObj = doubleVal; // double -> Double
        Character charObj = charVal;  // char -> Character
        Boolean boolObj = boolVal;    // boolean -> Boolean

        // Unboxing: converting wrapper classes back to primitives
        byte unboxedByte = byteObj;
        short unboxedShort = shortObj;
        int unboxedInt = intObj;
        long unboxedLong = longObj;
        float unboxedFloat = floatObj;
        double unboxedDouble = doubleObj;
        char unboxedChar = charObj;
        boolean unboxedBool = boolObj;

        // Displaying the results of autoboxing
        System.out.println("\nAutoboxed values:");
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Short Object: " + shortObj);
        System.out.println("Integer Object: " + intObj);
        System.out.println("Long Object: " + longObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        // Displaying the results of unboxing
        System.out.println("\nUnboxed values:");
        System.out.println("byte value: " + unboxedByte);
        System.out.println("short value: " + unboxedShort);
        System.out.println("int value: " + unboxedInt);
        System.out.println("long value: " + unboxedLong);
        System.out.println("float value: " + unboxedFloat);
        System.out.println("double value: " + unboxedDouble);
        System.out.println("char value: " + unboxedChar);
        System.out.println("boolean value: " + unboxedBool);
        
        sc.close();
    }
}