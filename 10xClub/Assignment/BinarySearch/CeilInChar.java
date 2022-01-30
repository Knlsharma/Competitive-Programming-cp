package BinarySearch;

/**
 * @author Kunal Sharma at 23/01/22 12:37 AM
 */
public class CeilInChar {

    public static void main(String[] args) {
        System.out.println(getCeilInCharArray(new char[] { 'a','b','c', 'e'},'d'));
    }

    private static int getCeilInCharArray(char[] arr, char element) {
        int ceilResult = -1;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == element) {
                left = mid + 1;
            }
            if (element < arr[mid]) {
                ceilResult = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Found in right side for ceil chars " + ceilResult);
        return ceilResult;
    }
}
