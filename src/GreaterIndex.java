import java.util.Stack;

public class GreaterIndex {
    private int[] nextGreater;

    public GreaterIndex(int[] arr) {
        nextGreater = new int[arr.length];
        preprocess(arr);
    }

    private void preprocess(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements smaller than or equal to current
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // Set next greater index or -1 if not found
            nextGreater[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current index to stack
            stack.push(i);
        }
    }

    public int getNextGreaterIndex(int i) {
        if (i < 0 || i >= nextGreater.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return nextGreater[i];
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 6};
        GreaterIndex ng = new GreaterIndex(arr);

//        for (int i = 0; i < arr.length; i++) {
        int idx = ng.getNextGreaterIndex(0);
        if (idx != -1) {
            System.out.println("Next greater for " + arr[0] + " is " + arr[idx] + " at index " + idx);
        } else {
            System.out.println("Next greater for " + arr[0] + " does not exist.");
        }
//        }
    }
}

