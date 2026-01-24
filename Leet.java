public class Leet {
    static boolean isSorted(int[] nums, int i){
        if(i == nums.length - 1) return true;
        if(nums[i] > nums[i+1]) return false;
        return isSorted(nums, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        System.out.println(isSorted(arr, 0));
    }
}
