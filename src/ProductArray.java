import java.util.Arrays;

public class ProductArray {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4,5};
        int[] output = productExceptSelf(input);
        System.out.println(Arrays.toString(output));
    }
}
