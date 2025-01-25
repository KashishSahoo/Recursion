import java.util.Stack;

class Pair {
    int x, y; // x is the value, y is the minimum at this state.
    
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MinStack {
    Stack<Pair> st; // Stack of pairs to track values and minimums.

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int x) {
        int min;
        if (st.isEmpty()) {
            min = x; // If stack is empty, the first element is the minimum.
        } else {
            min = Math.min(st.peek().y, x); // Compare with current minimum.
        }
        st.push(new Pair(x, min)); // Push value and minimum as a pair.
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek().x; // Return the value at the top of the stack.
        }
        throw new IllegalStateException("Stack is empty");
    }

    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek().y; // Return the minimum stored at the top of the stack.
        }
        throw new IllegalStateException("Stack is empty");
    }
}

public class min {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        // Operations
        minStack.push(12);
        minStack.push(15);
        minStack.push(10);
        System.out.println("getMin: " + minStack.getMin()); // Output: 10
        minStack.pop();
        System.out.println("top: " + minStack.top());       // Output: 15
        System.out.println("getMin: " + minStack.getMin()); // Output: 12
    }
}
