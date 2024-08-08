package ArrayList_HashSet_HashMap;
import java.util.HashMap;
import java.util.Map;

class Book{
    private int id;
    private String title;
    private String author;

    Book(int id,String title,String author){
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public void getData(){
        System.out.println("Id : " + this.id + ", Title : " + this.title + ", Author : " + this.author);
    }
}

public class hashMap {
    public static void main(String[] args){
        HashMap<Integer, Object> hashMap = new HashMap<>();
        //------key Side Datatype, Value Type Datatype

        //todo HashMap is collection of multiple key-value pairs

        //todo dynamic == Object

        hashMap.put(1, "Rahul");
        hashMap.put(2, "Ankit");
        hashMap.put(3, 108);
        hashMap.put(4, "Parth");

//        System.out.println(hashMap);
//        System.out.println(hashMap.get(3));

        for(Map.Entry<Integer, Object> e : hashMap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

    }
}
