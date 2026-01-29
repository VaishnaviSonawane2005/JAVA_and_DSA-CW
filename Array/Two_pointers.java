package Array;

import java.util.Arrays;

public class Two_pointers {
    static int[] findtarget(int[] arr, int target){
        int	left = 0, right	= arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target)
                return new int[]{left, right};
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 10, 12};
        int target = 19;
            System.out.println(Arrays.toString(findtarget(arr, target)));
    }
}
