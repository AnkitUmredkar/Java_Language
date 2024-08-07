package OOPs.Polymorphism;

class Vehicle{
    public void truck(){
        System.out.println("Empty Truck is running...");
    }

    public void truck(int n){
        System.out.println("Truck is running with " + n + " passengers");
    }

    public void truck(double n){
        System.out.println("Truck is running with " + n + " goods");
    }

    public void truck(int n1,double n2){
        System.out.println("Truck is running with " + n1 + " passengers and with " + n2 + " employees");
    }
}

public class method_overloading {
    public static void main(String[] args){

        Vehicle vehicle = new Vehicle();

        vehicle.truck();
        vehicle.truck(10);
        vehicle.truck(45.67);
        vehicle.truck(30,40);
    }
}
