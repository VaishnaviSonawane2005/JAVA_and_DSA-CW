package Sorting;

// using Selection Sort

public class SortingProblems_1B {
    static void Sort_using_LexicographicalOrder(String[] fruits){
        // Lexicographical Order : Alphabetical or numerical order just like dictionary
        int n = fruits.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (fruits[j].compareTo(fruits[min_idx]) < 0){
                    min_idx = j;
                }
            }
            // swap fruits[min_idx], fruits[i]
            String  temp = fruits[i];
            fruits[i] = fruits[min_idx];
            fruits[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"kivi", "apple", "papaya", "mango"};
        Sort_using_LexicographicalOrder(fruits);
        for (String val : fruits){
            System.out.print(val+" ");
        }
    }
}
