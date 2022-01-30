package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kunal Sharma at 30/01/22 10:44 AM
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        ArrayList<List<Integer>> sol = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return sol;
        }
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 1; i++) {

            int remaining = target - nums[i];
            int front = i + 1;
            int back = nums.length - 1;

            while (front < back) {
                int twoSum = nums[front] + nums[back];
                if (twoSum < remaining) front++;
                else if (twoSum > remaining) back--;
                else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[front]);
                    triplet.add(nums[back]);
                    sol.add(triplet);

                    while (front < back && nums[front] == triplet.get(1)) front++;
                    while (front < back && nums[back] == triplet.get(2)) back--;
                }
            }
            while (i + 1 <= nums.length - 1 && nums[i] == nums[i + 1]) i++;
        }
        return sol;
    }


    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
