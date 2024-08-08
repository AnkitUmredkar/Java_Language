package ArrayList_HashSet_HashMap;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){

        //todo Generics => A mechanism or an approach to limit a collection or an object to be a specific type

        //todo Collection must be a None-primitive type (Wrapper class)

        //todo ArrayList is ordered collection of multiple values

        //todo dynamic == Object

        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList list = new ArrayList();

        list1.add(10);
        list1.add(45);
        list1.add(38);
//        list.add("Java");
//        list.add(true);

        System.out.println(list1);


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(61);
        list2.add(48);
        list2.add(98);

        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(list1);
        list3.addAll(list2);

//        System.out.println(list3);

//        for(int i=0; i<list3.size(); i++){
//            System.out.println(list3.get(i));
//        }

        for(Integer e : list3){
            System.out.println(e);
        }
    }
}
