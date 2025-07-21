public class ExpressionEvaluator {

    public static int evaluateExpression(Object[] exp) {
        if (exp.length != 3) {
            throw new IllegalArgumentException("Invalid expression format");
        }

        int a = (int) exp[0];
        int b = (int) exp[1];
        String op = (String) exp[2];

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + op);
        }
    }

    public static void main(String[] args) {
        Object[] expression = {5, 3, "+"}; // Equivalent to 5 + 3
        System.out.println("Result: " + evaluateExpression(expression)); // Output: 8
    }
}