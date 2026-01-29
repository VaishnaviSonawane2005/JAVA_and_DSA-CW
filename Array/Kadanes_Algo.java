package Array;

import java.util.Arrays;

public class Kadanes_Algo {

    static int[] largest_sumofsubarray(int[] arr) {

        int maxS = arr[0];
        int maxEnd = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            // Start a new subarray or continue the previous one
            if (arr[i] > maxEnd + arr[i]) {
                maxEnd = arr[i];
                tempStart = i;
            } else {
                maxEnd += arr[i];
            }

            // Update maximum sum and indices
            if (maxEnd > maxS) {
                maxS = maxEnd;
                start = tempStart;
                end = i;
            }
        }

        // Create result array
        int[] ans = new int[end - start + 1];

        for (int i = start; i <= end; i++) {
            ans[i - start] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int[] result = largest_sumofsubarray(arr);

        System.out.println(Arrays.toString(result));
    }
}