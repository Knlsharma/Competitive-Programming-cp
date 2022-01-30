package BinarySearch;

import java.util.Arrays;

/**
 * @author Kunal Sharma at 23/01/22 1:01 AM
 */
public class InfiniteBinarySearchAlgo {

    public static void main(String[] args) {
        System.out.println(findInSortedStreamOfArray(new int[] {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,}, 1));
    }

    private static int findInSortedStreamOfArray(int[] arr, int element) {
        int foundAt = -1;

        int first = 0 , second = 1;

        while(arr[second] < element)
        {
            first = second;
            second = second * 2;
        }


        int left = first, right = second;


        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == element)
            {
                foundAt = mid;
                right = mid - 1;
            }
            else if (element > arr[mid]) {
                left = mid + 1;
            } else {
                foundAt = mid;
                right = mid - 1;
            }
        }
        return foundAt;

    }
}
