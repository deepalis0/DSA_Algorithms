
   class DLL
   {
      int data;
       DLL next, prev;
   };

public class InsertIntoSortedDLL {


    static DLL sortedInsertion(DLL head, DLL newDLLNode)
    {
        if(head==null)
        {
            return newDLLNode;
        }
        else if(newDLLNode.data<=head.data)//Case 1
        {
           newDLLNode.next = head;
           head.prev = newDLLNode;
           return newDLLNode;
        }
        else //case 2 and case 3
        {
            DLL cur = head;
            while(cur.next!=null && cur.next.data < newDLLNode.data)
            {
                cur = cur.next;
            }
            newDLLNode.next = cur.next;
            cur.next.prev = newDLLNode;
            if(cur.next!=null)
            {
                cur.next.prev = newDLLNode;
            }
            newDLLNode.prev = cur;
            return head;
        }

    }


}






