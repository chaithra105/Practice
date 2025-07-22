import java.util.Arrays;

public class DutchFlag1 {

    public static void dutchFlagSort(int[] arr) {
        int n = arr.length;

        int[] result = new int[n];
        int left = 0;
        int right = n - 1;

        for (int value : arr) {
            if (value == 0) {
                result[left++] = 0;
            } else if (value == 2) {
                result[right--] = 2;
            }
        }

        while (left <= right) {
            result[left++] = 1;
        }

        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] colors = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting: " + Arrays.toString(colors));
        dutchFlagSort(colors);
        System.out.println("After sorting:  " + Arrays.toString(colors));
    }
}

