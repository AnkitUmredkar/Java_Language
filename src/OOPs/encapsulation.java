package OOPs;

import java.util.Scanner;

class Student{
    private int id,age;
    private String name;
    public static String college = "RNW";
    //todo Create in RAM only one time, Even though we make multiple objects
    // todo static variable is common for class's all object but other variable create every time when we create object

//    public void setData(int id,int age,String name){
//        this.age = age;
//        this.id = id;
//        this.name = name;
//    }

//    public void getData(){
//        System.out.println("ID : " + this.id);
//        System.out.println("Name : " + this.name);
//        System.out.println("Age : " + this.age);
//    }

    Student(int id,int age,String name){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

public class encapsulation {
    public static void main(String[] args){

        Scanner sin = new Scanner(System.in);

        Student s1 = new Student(1,2,"ankit");
        Student s2 = new Student(3,4,"Kartik");

//        s1.setData(1,2,"ankit");
//        s2.setData(3,4,"Kartik");

//        s1.getData();
//        s2.getData();

        System.out.println(s2.getID());
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        System.out.println("\nThis is Static Variable : " + Student.college);// todo static variable can access using class name

    }
}
