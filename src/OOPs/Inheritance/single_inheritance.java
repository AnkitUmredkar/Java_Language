package OOPs.Inheritance;

import java.util.Scanner;

class A{
    public int a = 10;
    protected int b = 20;
    private int c = 30;
}

class B extends A{
    public int d = 40;
}

public class single_inheritance {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);

        A b1 = new B();

        System.out.println(b1.b);
        System.out.println(b1.a);
    }
}
