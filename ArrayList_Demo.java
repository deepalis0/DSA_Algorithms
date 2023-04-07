import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo
{
    public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();
      System.out.println("The size of list is : "+list.size());

      list.add(12);// 12
      list.add(14);// 12 14
      list.add(13);// 12 14 13
      for(int i=0;i<list.size();i++)// i= 0 1 2
      {
        System.out.print(list.get(i)+" ");
      }
      System.out.println();



      //contains() true or false
      if(list.contains(12))//checks if 12(data) is present in the list
       {
            System.out.println("12 is present in ArrayList");
       }

    //Removal of DATA based on index
    System.out.println("Removing element at index 0: ");
    list.remove(0);// 0 is int, index is always in int


    //Removal on basis of DATA
    System.out.println("Removing element 13: ");
    //ArrayList always stores Objects!
    //dataType :Integer
    //we are converting int into Integer(Wrapper)
    list.remove(Integer.valueOf(13));//data

    System.out.println();
    System.out.println("Updating element at index 0 to 28: ");
   // list.set(0,Integer.valueOf(28));
    list.set(0,28);

    System.out.println("Adding new element at index 1 : ");
    list.add(1,16);
    list.add(10);

    for(int ele : list) // 12 14 15 16
    {
        System.out.print(ele+" ");
    }
    System.out.println();
    System.out.println("The max values is : "+ Collections.max(list));
    System.out.println("The min values is : "+ Collections.min(list));

    }
}
