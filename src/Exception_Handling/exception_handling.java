package Exception_Handling;

//todo other things in 1.3 lecture

public class exception_handling {
    public static void main(String[] args){
        int a=5,b=0;
        String name = null;
        String value = "hello";
        int arr[] = {1,2,3,4,5};
        String surname = "Umredkar";

        try{
//            System.out.println(a/b); //todo ArithmeticException
//            System.out.println(name.length()); //todo NullPointerException
//            System.out.println(Integer.parseInt(value)); //todo NumberFormatException
//            System.out.println(arr[8]); //todo ArrayIndexOutOfBoundsException
            System.out.println(surname.charAt(7)); //todo ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Always executes...");
        }
    }
}
