public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        
        if (n <= 1) {
            return; // Already sorted or empty
        }
        
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        
        // Split the original array into two subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        
        // Recursively sort the two subarrays
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted subarrays
        merge(arr, left, right);
    }
    
    public static void merge(int[] arr, int[] left, int[] right) {
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;
        
        // Merge elements from left and right into arr in ascending order
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copy remaining elements from left, if any
        while (i < n1) {
            arr[k++] = left[i++];
        }
        
        // Copy remaining elements from right, if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nSorted Array (Ascending Order):");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
