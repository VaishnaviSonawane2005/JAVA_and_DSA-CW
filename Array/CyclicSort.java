package Array;

public class CyclicSort {

    static int findMissing(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;

            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else {
                i++;
            }
        }

        // Find missing number
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 1, 5, 6};

        System.out.println(findMissing(arr));
    }
}