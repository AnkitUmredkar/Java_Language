package Operators;
import java.util.Scanner;

// Arithmetic Operators
public class operator{
    public static void main(String[] args){
//        int a = 10,b = 20;
//
//        System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
//        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
//        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
//        System.out.println("Division of " + b + " and " + a + " is : " + (b / a));

        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        int b = sin.nextInt();

        System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
        System.out.println("Subtraction of " + a + " and " + b + " is : " + (a - b));
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
        System.out.println("Division of " + b + " and " + a + " is : " + (b / a));
    }
}
