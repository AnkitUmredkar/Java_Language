package OOPs.Data_Abstraction;

//Abstract Class
abstract class Vehicle{

    //todo concrete methods
    void display(){
        System.out.println("This is Parent Class");
    }

    //todo abstract methods (Which no have body)
    abstract void upComingFeature();

    //todo Which class have one or more abstract methods it's Class called Abstract Class.
    //todo We Can't create abstract class's object. must be create child class
}

class Child extends Vehicle{

    @Override
    void upComingFeature() {
        System.out.println("This is Child Class");
    }
}

public class abstract_class {
    public static void main(String[] args){

//        Child vehicle = new Child();
        //todo Both can Access
        Vehicle vehicle = new Child();

        vehicle.upComingFeature();
        vehicle.display();

    }
}
