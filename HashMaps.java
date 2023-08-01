import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args)
    {

         HashMap<String,Integer> colourMap = new HashMap<>();
         colourMap.put("RED",3);
         colourMap.put("BLUE",5);
         colourMap.put("GREY",8);

         if(colourMap.containsKey("GREY"))
         {
             System.out.println(colourMap.get("GREY"));
         }
         else {
             System.out.println("NO ,key is not present");
         }

         //updating the value for the KEY
         colourMap.put("RED",5);
         System.out.println("The size of HashMAp :  " + colourMap.size());



         System.out.println(colourMap);



//        map.put("Deepali",1);
//        map.put("Kedar",2);
//        map.put("Komal",3);
//        System.out.println(map);
//
//        System.out.println(map.get("Komal"));
//
//        System.out.println(map.get("Vivir"));
//
//        System.out.println(map.containsKey("Vivir"));
//        System.out.println(map.containsValue(2));
//
//        map.remove("Komal");
//        System.out.println(map);
//
//        //add data  - put putIfAbsent
//        //retrive - get  getOrDefault
//        //remove   - remove(key)
//        //containsKey
//        //keySet()
//        //size()
//
//        for(String name : map.keySet())
//        {
//            System.out.println(name +" :" +map.get(name));
//        }
//




    }
}
