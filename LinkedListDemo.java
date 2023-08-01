public class LinkedListDemo {

    static class Node
    {
        int data; //(integer data) 0  data[0]
        Node next; //(reference - className) null

        Node(int data)
        {
            this.data = data;
            next = null;
        }


    }

    public static void main(String[] args) {
   // 12 -->15--> 16
        //Node head = null
        Node firstNode = new Node(12);  // A1-[12 null]
        Node secondNode = new Node(15);// A7-[15 null]
        Node thirdNode = new Node(16); //  A-10[16 null]

        firstNode.next = secondNode; // A1-[12 A7]
        secondNode.next = thirdNode;// A7-[15 A10]
        //A-10[16 null]

       Node head = firstNode;
       while(head!=null)
       {
           System.out.print(head.data + " ");
           head = head.next;
       }

    }

}



