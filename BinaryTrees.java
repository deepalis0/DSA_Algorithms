public class BinaryTrees
{
    public static void main(String args[])
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println("The root node has value : "+ root.data);
        System.out.println("The left child has value : "+ root.left.data);
        System.out.println("The right child has value : "+ root.right.data);

        //Array representation
        int[] tree = new int[4];
        //we start with index 1,thus root node is at index 1
        tree[1] = 1;
        tree[2] = 2;//for parent at i,left child stored at index  2*i
        tree[3] = 3;//for parent at i,right child stored at index 2*i + 1

    }

}

class Node
{
    Node left;
    Node right;
    int data;
    public Node(int data)
    {
        this.data = data;
    }
}
