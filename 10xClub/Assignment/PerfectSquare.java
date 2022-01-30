// https://leetcode.com/problems/valid-perfect-square/submissions/


// Time Complexity : O(log n)
// Space Complexity : O(1)

class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
         int left = 1, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2; // to avoid overflow incase (left+right)>2147483647
            int res = num / mid, remain = num % mid;
            if (res == mid && remain == 0) return true; // check if mid * mid == num
            if (res > mid) { // mid is small -> go right to increase mid
                left = mid + 1;
            } else {
                right = mid - 1; // mid is large -> to left to decrease mid
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(49));
    }
}