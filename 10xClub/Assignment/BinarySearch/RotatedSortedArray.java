package BinarySearch;

/**
 * @author Kunal Sharma at 22/01/22 12:12 PM
 */

public class RotatedSortedArray {
// try to use min index concept: find min index element
//    No of times array rotated  = index of min element


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
        System.out.println(getMinIndexOfArray(new int[]{3, 3, 4, 6 , 1, 2, 3}));
    }
//    int minIndexOfArray = getMinIndexOfArray(new int[]{3, 3, 4, 6 , 1, 2, 3});
}
