package Searching;

public class Search_num_ArrWithDup {
    static boolean search(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end-st) / 2;
            if(arr[mid] == target)
                return true;

            if(arr[st] == arr[mid] && arr[end] == arr[mid]){
                st++;
                end--;
            }

            else if(arr[mid] <= arr[end]){      // mid to end is sorted
                if(target > arr[mid] && target <= arr[end]){
                    st = mid+1;
                }
                else         // st to mid is sorted
                    end = mid-1;
            }

            else{
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }
                else
                    st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 1, 1};
        int target = 2;
        System.out.println(search(arr, target));
    }
}
