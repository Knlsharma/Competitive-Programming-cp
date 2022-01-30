package BinarySearch;

/**
 * @author Kunal Sharma at 22/01/22 11:18 AM
 */

public class DescendingBinarySearch {

    public static boolean searchForElementInDescending(int[] arr, int searchElement) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // to avoid overflow incase (left+right)>2147483647

            if (arr[mid] == searchElement) return true;
            if (searchElement < mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(searchForElementInDescending(new int[] {6,5,4,3,2,1,0} , 1));
    }
//    Index =>  0 1 2 3 4 5 6
//    Value =>  6 5 4 3 2 1 0

}
