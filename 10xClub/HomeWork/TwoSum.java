//// https://leetcode.com/problems/two-sum/
//
//// TC : O(N)
//// SC : O(N)
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public int[] twoSum(int[] A, int sum) {
// Map<Integer, Integer> map = new HashMap<>();
//
//        // do for each element
//        for (int i = 0; i < A.length; i++)
//        {
//            // check if pair (A[i], sum-A[i]) exists
//
//            // if the difference is seen before, print the pair
//            if (map.containsKey(sum - A[i]))
//            {
//                System.out.println("Pair found at index " +
//                                map.get(sum - A[i]) + " and " + i);
//                return new int[] {map.get(sum - A[i]), i};
//            }
//
//            // store index of the current element in the map
//            map.put(A[i], i);
//        }
//    return new int[] {};
//    }
//}
//
//// TC : O(N)
//// SC : O(1)
//
// public int[] twoSum(int[] nums, int target) {
//   int start = 0 ;
//   int end  = nums.length - 1;
//   int[] result = new int[2];
//   while(start <= end)
//   {
//     if((nums[start] + nums[end]) > target)
//     {
//       end--;
//     }
//     else if((nums[start] + nums[end]) == target)
//     {
//       result[0] = start;
//       result[1] = end;
//     }
//     else
//     {
//       start++;
//     }
//
//   }
//   return result;
// }
