import java.util.*;
class hashing{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion in map 
        map.put("India",120);
        map.put("USA",30);
        map.put("China", 110);

        System.out.println(map);
        
        //Check Existing key

        if(map.containsKey("China"))
            System.out.println("Key present in the Map");
        else    
            System.out.println("Key Absent in the Map");

        if(map.containsKey("Indonesia"))
            System.out.println("Key present in the Map");
        else    
            System.out.println("Key Absent in the Map");



        //How to get the value from the key
        System.out.println(map.get("India"));
        System.err.println(map.get("Indonesia"));



        //Iteration in HashMap
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.err.println(e.getValue());
        }


        //Remove key&value
        map.remove("China");
        System.out.println(map);
            
    }
}