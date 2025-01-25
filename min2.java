import java.util.Stack;

class MinStack {
    Stack<Long> st = new Stack<>();
    Long mini;

    /** Initialize your data structure here. */
    public MinStack() {
        mini = Long.MAX_VALUE; // Set initial minimum to the maximum possible value.
    }

    public void push(int value) {
        Long val = Long.valueOf(value);
        if (st.isEmpty()) {
            mini = val; // If the stack is empty, the first value is the minimum.
            st.push(val);
        } else {
            if (val < mini) {
                st.push(2 * val - mini); // Store a special value to track the previous minimum.
                mini = val; // Update the minimum to the new value.
            } else {
                st.push(val); // Push the value as is if it's not the new minimum.
            }
        } 
    }

    public void pop() {
        if (st.isEmpty()) return;

        Long val = st.pop();
        if (val < mini) {
            mini = 2 * mini - val; // Retrieve the previous minimum.
        }
    }

    public int top() {
        Long val = st.peek();
        if (val < mini) {
            return mini.intValue(); // If the value is less than the current minimum, return the minimum.
        }
        return val.intValue(); // Otherwise, return the actual value.
    }

    public int getMin() {
        return mini.intValue(); // Return the current minimum value.
    }
}

public class min2{
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
