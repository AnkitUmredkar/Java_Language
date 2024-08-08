package ArrayList_HashSet_HashMap;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args){

        //todo Hashset is unordered collection of unique values
        //todo dynamic == Object
        HashSet<Object> hashSet = new HashSet<>();

        hashSet.add(25);
        hashSet.add(56);
        hashSet.add("Ankit");
        hashSet.add(49);
        hashSet.add(57);
        hashSet.add(62);
        hashSet.add(86);

//        System.out.println(hashSet);

        for(Object e : hashSet){
            System.out.println(e);
        }
    }
}
