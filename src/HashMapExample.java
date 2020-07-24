import com.google.gson.Gson;

import java.util.HashMap;

public class HashMapExample {
public static void  main(String[] args){
    HashMap<String,Integer> phonebook = new HashMap(4,0.75f); //loadfactor states that it will only increase if it 75% full
    phonebook.put("Kevin",234);
    phonebook.put("John",12);
    //phonebook.put("Andrew",34356);
    //if(phonebook.containsKey("John")){
   //     phonebook.remove("Kevin");
 //   }
//    System.out.println(phonebook);
    Gson gson = new Gson();
    String Hashmap = gson.toJson(phonebook);

    System.out.println(Hashmap);
}
}
