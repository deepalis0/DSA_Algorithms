import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashing {

    public static void main(String []args)
    {

       HashMap<String,Integer> colorMap = new HashMap<>();

       colorMap.put("RED",1);
       colorMap.put("YELLOW",2);
       colorMap.put("BLUE",3);



       //update the color code of RED
       colorMap.put("RED",4);


       System.out.println("The code for BLUE is "+ colorMap.get("BLUE"));
       System.out.println("The code for RED is "+ colorMap.get("RED"));

       if(colorMap.containsKey("GREEN"))
         System.out.println("The code for GREEN is "+ colorMap.get("GREEN"));

       int codeGREEN = colorMap.getOrDefault("GREEN",0);
       int codeRED   = colorMap.getOrDefault("RED",0);
       System.out.println(codeGREEN+" "+codeRED);

       //If code for a colour DOES NOT exist, please provide default value = 0
//       int x = colorMap.get("GREEN"); -->ERROR as NPE
//       int y =x+3;
//       System.out.println(x);

        //ITERATION
        /*
        Iterating over array:
            int[] arr = new int[]{1,2,3,4};
            for(int a : arr)
            {
                System.out.println(a);
            }
         */
         colorMap.remove("BLUE");
         colorMap.remove("RED",4);//removal of an entry


        //row in a HashMap  KEY VALUE  -- ENTRY in a HASHMAP
        //entry - KEY and VALUE
        for (Map.Entry<String,Integer> entry : colorMap.entrySet()) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        // using keySet() for iteration over keys
        for (String Colorname : colorMap.keySet())
            System.out.println("key: " + Colorname);

        // using values() for iteration over values
        for (Integer code : colorMap.values())
            System.out.println("value: " + code);

        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(14);
        for(int a : set)
        {
            System.out.print(a+" ");
        }
        System.out.println("Trying to add duplicate: ");
        set.add(12);
        for(int a : set)
        {
            System.out.print(a+" ");
        }
        if(set.contains(13))
        {
            System.out.println("   PRESENT") ;
        }
        else {
            System.out.println("   NOT PRESENT") ;
        }
        System.out.println("Printing..."+set);
        set.add(15);
        set.add(18);
        System.out.println("Before Removal..."+set);
        set.remove(12);
        System.out.println("After removal..."+set);



    }

}
