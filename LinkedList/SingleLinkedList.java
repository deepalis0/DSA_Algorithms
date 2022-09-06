package LinkedList;
public class SingleLinkedList {
    public static void main(String[] args)
    {
      MySingleLinkedList singleLinkedList = new MySingleLinkedList();
      singleLinkedList.addAtTail(12);
      singleLinkedList.addAtTail(21);
      singleLinkedList.addAtTail(15);
      singleLinkedList.printLinkedList();

      singleLinkedList.addAtHead(100);
      singleLinkedList.printLinkedList();

      singleLinkedList.addAtIndex(1,18);
      singleLinkedList.printLinkedList();

      System.out.println(singleLinkedList.get(2));

      System.out.println("The length of LL is :" + singleLinkedList.getLength());
      singleLinkedList.deleteAtIndex(3);
      singleLinkedList.printLinkedList();
      System.out.println("The length of LL is :" + singleLinkedList.getLength());

    }
}
class MySingleLinkedList
{

    static class Node
    {
        Node next;
        int val;
        public Node(int val)
        {
            this.val = val;
        }
        public Node(int val,Node next)
        {
            this.val = val;
            this.next = next;
        }
        public Node()
        {

        }

    }
    private Node head;
    public MySingleLinkedList()
    {
        head = null;
    }

    /** Traverse the linked list to get element by index.

    /** Helper function to return the index-th node in the linked list. */
    private Node getNode(int index) {
        Node cur = head;
        for (int i = 0; i < index && cur != null; ++i) {
            cur = cur.next;
        }
        return cur;
    }
    /** Helper function to return the last node in the linked list. */
    private Node getTail() {
        Node cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node cur = getNode(index);
        return cur == null ? -1 : cur.val;
    }

    /** Add a new node.

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node cur = new Node(val);
        cur.next = head;
        head = cur;
        return;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node prev = getTail();
        Node cur = new Node(val);
        prev.next = cur;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node prev = getNode(index - 1);
        if (prev == null) {
            return;
        }
        Node cur = new Node(val);
        Node next = prev.next;
        cur.next = next;
        prev.next = cur;
    }

    /**  Delete a node.

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node cur = getNode(index);
        if (cur == null) {
            return;
        }
        Node next = cur.next;
        if (index == 0) {
            // modify head when deleting the first node.
            head = next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = next;
        }
    }



    public void printLinkedList()
    {
        Node cur = head;
        if(cur==null)
        {
            System.out.println("Linked List is Empty!");
            return;
        }
        while(cur!=null)
        {
            System.out.print(cur.val +" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int getLength()
    {
        Node cur = head;
        int len = 0;
        if(cur==null)
        {
            return len;
        }
        while(cur!=null)
        {
            len++;
            cur = cur.next;
        }
     return len;

    }


}

