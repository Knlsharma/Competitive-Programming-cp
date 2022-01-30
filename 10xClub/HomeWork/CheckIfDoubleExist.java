//// https://leetcode.com/problems/check-if-n-and-its-double-exist/
//// Brute force
//// TC : O(N ^ 2)
//
//class Solution {
//    public boolean checkIfExist(int[] arr) {
//
//        int len = arr.length;
//
//        for(int i = 0 ; i < len ; i++)
//        {
//            for(int j = 0 ; j < len ; j++)
//            {
//                if(i != j && arr[i]  == (2 * arr[j]))
//                {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//}
//
//
//// Optimized way
//
//
//public boolean checkIfExist(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (set.contains(2 * arr[i]) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
//                return true;
//            }
//            set.add(arr[i]);
//        }
//        return false;
//    }
