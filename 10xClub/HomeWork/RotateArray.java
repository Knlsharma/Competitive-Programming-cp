//// https://leetcode.com/problems/rotate-array
//
//class Solution {
//public void rotate(int[] nums, int k) {
//// speed up the rotation
//k %= nums.length;
//int temp, previous;
//for (int i = 0; i < k; i++) {
//previous = nums[nums.length - 1];
//for (int j = 0; j < nums.length; j++) {
//temp = nums[j];
//nums[j] = previous;
//previous = temp;
//}
//}
//}
//}
//// Time Complexity = O(n*k)
//// Space Complexity = O(1)
//
////Using Extra Array
//class Solution {
//public void rotate(int[] nums, int k) {
//int[] a = new int[nums.length];
//for (int i = 0; i < nums.length; i++) {
//a[(i + k) % nums.length] = nums[i];
//}
//for (int i = 0; i < nums.length; i++) {
//nums[i] = a[i];
//}
//}
//}
//
//// Time Complexity = O(n)
//// Space Complexity = O(n)
//
//// Using reverse method
//
//class Solution {
//public void rotate(int[] nums, int k) {
//k %= nums.length;
//reverse(nums, 0, nums.length - 1);
//reverse(nums, 0, k - 1);
//reverse(nums, k, nums.length - 1);
//}
//public void reverse(int[] nums, int start, int end) {
//while (start < end) {
//int temp = nums[start];
//nums[start] = nums[end];
//nums[end] = temp;
//start++;
//end--;
//}
//}
//}
//
//// Time complexity: O(n). n elements are reversed a total of three times.
//
////Space complexity: O(1). No extra space is used.
