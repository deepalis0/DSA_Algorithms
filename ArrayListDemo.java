import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NodeD
{
    int data;
    int abc;
    public NodeD(int a,int b)
    {
        this.data = a;
        this.abc  = b;
    }

}
class Comparison implements Comparator<NodeD>
{
    @Override
    public int compare(NodeD n1, NodeD n2)
    {
        if(n1.data == n2.data)
        {
            return n2.abc - n1.abc;//notice the order change
        }
        return n2.data - n1.data;//notice the order change
    }

}

public class ArrayListDemo {
//https://www.baeldung.com/java-list-capacity-array-size
//https://www.geeksforgeeks.org/array-vs-arraylist-in-java/

    //Questions:
    //https://leetcode.com/problems/product-of-array-except-self/
    //https://leetcode.com/problems/pascals-triangle/
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList list = new ArrayList<Integer>();
        System.out.println("The size of list is : "+list.size());
     //   this will give Index out of bounds, as logical capacity is still 0
//        for(int i=0;i<10;i++)
//        {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
        //add will always append at the end of the list
        list.add(12);
        list.add(14);
        //  12  14

        for(int i=0;i<list.size();i++)// i= 0 1
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //contains() true or false
        if(list.contains(12))//checks if 12(data) is present in the list
        {
            System.out.println("12 is present in ArrayList");
        }

        list.add(13);//it converts 13 into a Integer
        list.add(15);
        System.out.println("Adding new integers to the list: ");
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }// 12 14 13 15
        System.out.println();

        System.out.println("The max values is : "+ Collections.max(list));
        System.out.println("The min values is : "+ Collections.min(list));

        //Removal of DATA based on index
        System.out.println("Removing element at index 0: ");
        list.remove(0);// 0 is int, index is always in int
        //14 13 15
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Removal on basis of DATA
        System.out.println("Removing element 13: ");
        //ArrayList always stores Objects!
        //dataType :Integer
        //we are converting int into Integer(Wrapper)
        list.remove(Integer.valueOf(13));
        //Integer.valueOf(int)
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("Updating element at index 0 to 28: ");
       // list.set(0,Integer.valueOf(28));
        list.set(0,28);
       // list.set(index,newdata)
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        System.out.println("Adding new element at index 1 : ");
        list.add(1,16);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

//        list = new ArrayList<NodeD>();
//        list.add(new NodeD(12,3));
//        list.add(new NodeD(3,2));
//        list.add(new NodeD(12,2));
//        list.add(new NodeD(4,7));
//        list.add(new NodeD(5,4));
//        Collections.sort(list, new Comparison());
//        for(int i=0;i<list.size();i++)
//        {
//            NodeD obj  = (NodeD) list.get(i);
//            System.out.println(obj.data+" "+obj.abc);
//        }
    }
}
