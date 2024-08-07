package OOPs.Polymorphism;

class India{
    public void wearing(){
        System.out.println("Dhoti-Kurta");
    }
}

class Pakistan extends India{
    @Override //todo not Compalsary
    public void wearing(){
        System.out.println("Pathani-Kurta");
        super.wearing();
    }
}

public class method_overriding {
    public static void main(String[] args){

        India aman = new Pakistan();
        aman.wearing();
        System.out.println(aman instanceof India);
    }
}
