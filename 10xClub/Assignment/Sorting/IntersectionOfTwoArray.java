package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author Kunal Sharma at 29/01/22 9:52 PM
 */

/*https://leetcode.com/problems/intersection-of-two-arrays-ii/*/

public class IntersectionOfTwoArray {


    // using Map 1st Approach

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                Integer count = map.get(nums1[i]);
                map.put(nums1[i], count + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                if (map.get(nums2[i]) > 0) {
                    res.add(nums2[i]);
                    Integer count = map.get(nums2[i]);
                    map.put(nums2[i], count - 1);
                }
            }
        }
        int[] r = new int[res.size()];
        int index = 0;
        for (int i : res) {
            r[index++] = i;
        }
        return r;
    }

    // using array sort

    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            int a = nums1[i], b = nums2[j];
            if (a == b) {
                list.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }
        int[] ret = new int[list.size()];
        for (int k = 0; k < list.size(); k++) ret[k] = list.get(k);
        return ret;
    }

}
