package BinarySearch;

/**
 * @author Kunal Sharma at 23/01/22 9:47 PM
 */

public class PeakElementIndex {
    public static void main(String[] args) {
        System.out.println(getPeakElementIndex(new int[]{5, 10, 50, 90}));
    }

    private static int getPeakElementIndex(int[] arr) {
        int left = 0, right = arr.length - 1;

        int foundAt = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && mid < arr.length - 1) {
                if (((arr[mid] > arr[mid + 1]) && (arr[mid] > arr[mid - 1]))) return mid;
                else if (arr[mid + 1] > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (mid == 0) {
                foundAt = arr[0] > arr[1] ? 0 : 1;
                break;
            } else if (mid == arr.length - 1) {
                foundAt = arr[arr.length - 1] > arr[arr.length - 2] ? arr.length - 1 : arr.length - 2;
                break;
            }
        }
        return foundAt;
    }

}
