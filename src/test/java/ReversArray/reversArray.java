package ReversArray;

import java.util.Arrays;

public class reversArray {

    static int[] reverseArrayF(int[] values) {
        for (int i = 0; i < values.length / 2; i++) ;
        {
            int start = 0;
            int end = values.length - 1;
            while (start < end) {
                int temp = values[start];
                values[start] = values[end];
                values[end] = temp;
                start++;
                end--;
            }
            return values;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 0, 44, 78, 34, 1, 93, 7, 49, 88, 1090};
        reverseArrayF(arr);
        System.out.println(Arrays.toString(arr));
    }
}
