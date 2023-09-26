public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right && target >= arr[left] && target <= arr[right]) {
            // Calculate the probable position using interpolation formula
            int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);

            if (arr[pos] == target) {
                return pos; // Element found, return its index
            }

            if (arr[pos] < target) {
                left = pos + 1; // Target is in the right half
            } else {
                right = pos - 1; // Target is in the left half
            }
        }

        return -1; // Element not found, return -1
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int target = 40;

        int index = interpolationSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
