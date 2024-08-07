package OOPs.Data_Abstraction;

// todo Multiple Inheritance only achieve by Interface
// todo Inheritance with Class -> extends
// todo Inheritance with interface -> implements

interface Auth{
    void login();
    void logout();
    void signup();
}

interface Theme{
    void lightTheme();
    void darkTheme();
}

class MyApp implements Auth,Theme{

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void signup() {

    }

    @Override
    public void lightTheme() {

    }

    @Override
    public void darkTheme() {

    }
}


public class interface_class {
    public static void main(String[] args){

//        Child vehicle = new Child();
        //todo Both can Access
        Vehicle vehicle = new Child();

        vehicle.upComingFeature();
        vehicle.display();

    }
}
