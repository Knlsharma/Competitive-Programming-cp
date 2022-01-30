package Sorting;

/**
 * @author Kunal Sharma at 29/01/22 9:40 PM
 */
//    https://leetcode.com/problems/sort-array-by-parity-ii/submissions/

public class SortByParity {

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;
        //i stands for even
        //j stands for odd
        while (i < n && j >= 0) {
            if (nums[i] % 2 == 0) i += 2;
            else if (nums[j] % 2 == 1) j -= 2;
            else swap(nums, i, j);
        }
        return nums;

    }

    public void swap(int[] cArr, int x, int y) {
        int t = cArr[x];
        cArr[x] = cArr[y];
        cArr[y] = t;
    }

}
