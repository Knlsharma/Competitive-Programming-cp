package BinarySearch;

/**
 * @author Kunal Sharma at 22/01/22 4:53 PM
 */
public class FindFloorAndCeilInArray {


    public static void getfloorAndCeilInSOrtedArray(int[] arr, int element) {
        int floorResult = -1;
        int ceilResult = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                // found and return direct from here
            }
            if (element < arr[mid]) {
                right = mid - 1;
                floorResult = right;
            } else {
                left = mid + 1;
                ceilResult = left;
            }
        }
        System.out.println("Found in left side of greatest " + floorResult);
        System.out.println("Found in right side of smallest " + ceilResult);

    }

    public static void main(String[] args) {
        getfloorAndCeilInSOrtedArray(new int[]{1, 2, 3, 4, 8, 10, 11}, 9);
    }


}
