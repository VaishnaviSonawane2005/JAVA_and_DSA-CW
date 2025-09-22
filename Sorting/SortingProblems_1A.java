package Sorting;

public class SortingProblems_1A {
    static void Move_0s_atEnd(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;   //no swapping happened
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    //swap arr[j], arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;   //some swapping has happened
                }
            }
            if (!flag) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 0, 5, 9, 4, 0, 22};
        Move_0s_atEnd(arr, arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
