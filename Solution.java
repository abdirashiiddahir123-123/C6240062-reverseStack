class ArrayStack {

    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {

        if (top == stack.length - 1) {
            expandCapacity();
        }

        stack[++top] = value;
    }

    public int pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void expandCapacity() {

        int[] newStack = new int[stack.length * 2];

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}

public class Solution {

    public static int[] reverseArray(int[] numbers) {

        // Create ArrayStack with capacity 2
        ArrayStack stack = new ArrayStack(2);

        // Push all numbers
        for (int num : numbers) {
            stack.push(num);
        }

        // Create reversed array
        int[] reversed = new int[numbers.length];

        // Pop elements into reversed array
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = stack.pop();
        }

        return reversed;
    }


    }

