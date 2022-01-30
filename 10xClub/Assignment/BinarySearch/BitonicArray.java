package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Kunal Sharma at 23/01/22 10:21 PM
 */
public class BitonicArray {
    // Maximum element in biotonic array == peak element
    // Biotonic means Monotonic Increasing  always increasing then decreasing with one peak only
    // arr[i] != arr[i+1]

    public static void main(String[] args) {
        System.out.println(getMaxBitonicElementIndex(new int[]{5, 10, 12, 8, 7}));
        System.out.println(searchElementIndexBitonicElementIndex(new int[]{5, 10, 12, 8, 7} , 8));
    }

    private static int searchElementIndexBitonicElementIndex(int[] arr, int key) {
        int peakElementIndex = getMaxBitonicElementIndex(arr);
        System.out.println(peakElementIndex);
//        int[] arr1 = Arrays.copyOfRange(arr, 0, peakElementIndex);
//        int[] arr2 = Arrays.copyOfRange(arr,peakElementIndex,arr.length);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        int ind1 = Arrays.binarySearch(arr,0 ,peakElementIndex+1, key);
        int ind2 = Arrays.binarySearch(arr, peakElementIndex,arr.length -1,key);

        if( ind2 > 0 ) return  ind2;
        return ind1;
    }

    private static int getMaxBitonicElementIndex(int[] arr) {
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
