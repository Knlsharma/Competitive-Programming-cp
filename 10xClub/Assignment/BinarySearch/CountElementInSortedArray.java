package BinarySearch;

/**
 * @author Kunal Sharma at 22/01/22 12:00 PM
 */
public class CountElementInSortedArray {

        public static int searchForFirstOccur(int[] arr, int searchElement) {
            int foundAt = -1;

            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == searchElement)
                {
                    foundAt = mid;
                    System.out.println("First index found at " +  foundAt);
                    right = mid - 1;
                }
                if (arr[mid]  < searchElement) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return foundAt;

        }

        public static int searchForLastOccur(int[] arr, int searchElement) {
            int foundAt = -1;

            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == searchElement)
                {
                    foundAt = mid;
                    System.out.println("Last index found at " +  foundAt);
                    left = mid + 1;
                }
                if (arr[mid] <= searchElement) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return foundAt;

        }

    public static void main(String[] args) {
        int firstOccurIndex = searchForFirstOccur(new int[]{1, 2, 3, 3, 3, 4, 6}, 3);
          int lastOccurIndex = searchForLastOccur(new int[]{1, 2, 3, 3, 3, 4, 6}, 3);
        System.out.println((lastOccurIndex - firstOccurIndex) + 1);

        }
    }

