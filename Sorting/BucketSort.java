package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    static void bucketSort(float[] arr){
        int  n = arr.length;
        // Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        // Create empty buckets
        for(int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }
        // Add elements into our buckets
        for (int i = 0; i < n; i++){
            int bucket_idx = (int) arr[i] * n;
            buckets[bucket_idx].add(arr[i]);
        }
        // Sort each bucket individually
        for (int i = 0; i < buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        // Merge all buckets to get final sorted array
        int idx = 0;
        for (int i = 0; i < buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++){
                arr[idx++] = currBucket.get(j);
            }
        }

    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        System.out.println("Sorted array (using Bucket Sort) is: ");
        bucketSort(arr);
        for(float val : arr){
            System.out.print(val + " ");
        }
    }
}
