package OOPs.Inheritance;

import java.util.Scanner;

class C{
    public int a = 10;
    protected int b = 20;
    private int c = 30;
}

class D extends C{
    protected int d = 40;
}

class E extends D{
}

public class multilevel_inheritance {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);

        E e1 = new E();

        System.out.println(e1.a);
        System.out.println(e1.b);
        System.out.println(e1.d);
    }

}
