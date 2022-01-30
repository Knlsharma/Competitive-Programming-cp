package BinarySearch;

import java.util.Arrays;

/**
 * @author Kunal Sharma at 22/01/22 2:13 PM
 */
public class FindElementInRotatedSortedArray {

    // try to use min index concept: find min index element

    public static int getMinIndexOfArray(int[] arr) {
        int foundAt = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ( mid > 0 && mid < arr.length - 1 && (arr[mid] <= arr[mid + 1]) && (arr[mid] <= arr[mid - 1]))
            {
                foundAt = mid;
                System.out.println("Minimum index element  found at " +  foundAt);
                return mid;
            }
            if (arr[right] >= arr[mid]) {
                right = mid - 1;  // moving towards unsorted array for answer
            } else {
                left = mid + 1;
            }
        }
        return foundAt;

    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2, 3};
        int min_index = getMinIndexOfArray(arr);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, min_index)));
        int leftSearchResult = Arrays.binarySearch(Arrays.copyOfRange(arr, 0, min_index), 4);
        int rightSearchResult = Arrays.binarySearch(Arrays.copyOfRange(arr, min_index, arr.length), 4);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, min_index, arr.length)));
        System.out.println(leftSearchResult);
        System.out.println(rightSearchResult);
    }
}
