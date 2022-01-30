//// https://leetcode.com/problems/trapping-rain-water
//
//// Brute Force : for each index we calaculate left max and right max including
//// index then we subtract from current index to check how much watch can be
//// store
//
//// TC : O(N^2)
//// SC : O(1)
//
//class Solution {
//    public int trap(int[] a) {
//        // caclulate left Max and Right Max for current Ai
//
//        int total_water = 0;
//
//        for(int i = 0 ; i < a.length - 1 ; i++)
//        {
//            int left_max = Integer.MIN_VALUE;
//            int right_max = Integer.MIN_VALUE;
//
//            for(int j = i; j >= 0 ; j--)   // left max
//            {
//
//                left_max = Math.max(a[j], left_max);
//            }
//
//            for(int j = i; j < a.length  ; j++)  // right max
//            {
//                right_max = Math.max(a[j], right_max);
//            }
//
//
//            total_water+= Math.min(left_max, right_max) - a[i];
//        }
//        return total_water;
//
//    }
//}
//
//
//// Second approach : Maintaining left sum and right sum for an array index
//// TC : O(N)
//// SC : O(N)
//
//
//
//class Solution {
//    public int trap(int[] a) {
//              int[] lMaxArr = new int[a.length];
//        int[] rMaxArr = new int[a.length];
//
//        int left_max = a[0];
//        for(int i = 0 ; i < a.length ; i++)
//        {
//            left_max = Math.max(a[i], left_max);
//            lMaxArr[i] = left_max;
//        }
//
//        int right_max = a[a.length - 1];
//        for(int i = a.length - 1 ; i >= 0 ; i--)
//        {
//            right_max = Math.max(a[i], right_max);
//            rMaxArr[i] = right_max;
//        }
//
//
//        int total_water = 0;
//
//        for(int i = 0 ; i < a.length - 1 ; i++)
//        {
//        total_water+= Math.min(lMaxArr[i], rMaxArr[i]) - a[i];
//        }
//
//        return total_water;
//
//    }
//}
