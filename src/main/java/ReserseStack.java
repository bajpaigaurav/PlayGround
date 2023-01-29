import java.util.Stack;

public class ReserseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.toString());
        reverStack(stack);

        System.out.println(stack.toString());


    }

    static void reverStack(Stack<Integer> s) {
        if(s.size() == 0) {
            return;
        }
        int temp = s.pop();

        reverStack(s);
        insert(s,temp);
    }

    static void insert(Stack<Integer> s, int ele) {
        if(s.size() == 0) {
            s.push(ele);
            return;
        }
        int temp = s.pop();
        insert(s,ele);
        s.push(temp);
    }
}
