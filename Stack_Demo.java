import java.util.Stack;
public class Stack_Demo {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(4);
        st.push(30);
        System.out.println("The size of stack: "+ st.size());
        System.out.println("The top of stack is: "+st.peek());
        System.out.println("Removing data from stack: "+st.pop());
        System.out.println("Is stack empty? "+ st.empty());

    }
}
