//// https://leetcode.com/problems/minimum-absolute-difference/submissions/
//// TC : O(N)
//// SC : O(1)
//
//class Solution {
//  public List<List<Integer>> minimumAbsDifference(int[] arr) {
//
//    List<List<Integer>> result = new ArrayList<>();
//
//    int curr_max = Integer.MAX_VALUE;
//
//    Arrays.sort(arr);
//
//    for(int i = 0 ; i < arr.length - 1 ; i++)
//    {
//      int diff = arr[i+1] - arr[i];
//
//      if(diff < curr_max)
//      {
//        curr_max = diff;
//
//        result.clear();
//        result.add(Arrays.asList(arr[i], arr[i + 1]));
//      }
//      else if (diff == curr_max) {
//                result.add(Arrays.asList(arr[i], arr[i + 1]));
//            }
//    }
//
//    return result;
//  }
//}
