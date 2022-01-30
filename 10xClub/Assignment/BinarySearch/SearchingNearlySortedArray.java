package BinarySearch;

/**
 * @author Kunal Sharma at 22/01/22 4:09 PM
 */

// This is also called modified binary search applicable to nearly sorted array

public class SearchingNearlySortedArray {

    public static int searchInNearlySorted(int[] arr, int element) {
        int foundAt = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                return mid;
            }
            if (mid + 1 <= right && arr[mid + 1] == element) {
                return mid + 1;
            }
            if (mid - 1 >= left && arr[mid - 1] == element) {
                return mid - 1;
            }
            if (element < arr[mid]) {
                right = mid - 2;
            } else {
                left = mid + 2;
            }
        }
        return foundAt;

    }

    public static void main(String[] args) {
        int result_index = searchInNearlySorted(new int[]{5, 10, 30, 20, 40}, 0);
        System.out.println(result_index);
    }
}
