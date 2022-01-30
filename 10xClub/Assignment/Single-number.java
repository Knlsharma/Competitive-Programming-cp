//// https://leetcode.com/problems/single-number
//
//// TC : O(N)
//// SC : O(1)
//
//class Solution {
//    public int singleNumber(int[] nums) {
//        int result = 0;
//
//        for(int value : nums)
//        {
//            result = result ^ value;
//        }
//        return result;
//    }
//
//
//    /*
//
//    1 ^ 1 = 0
//    0 ^ 0 = 0
//    1 ^ 0 = 1
//    0 ^ 1 = 1
//
//    */
//}
//
//
//// Using extra Space
//// TC : O(N)
//// SC : O(1)
//
//
//import java.util.*;
//
//public class MyClass {
//    public static void main(String args[]) {
//
//      int result = 0;
//      int[] arr = new int[] {1,2,3,4,6,1,2,3,4,0,0,0};
//
//      if(arr.length == 1)
//       {
//           result =  arr[0];
//       }
//
//      int len = arr.length;
//
//      int[] map = new int[len];
//
//      for(int i = 0 ; i != len; i++)
//      {
//        //   int arr_value = arr[i];
//          map[arr[i]]++;
//
//
//      }
//      int foundAt = 0;
//      int index = 0;
//      for(int value : map)
//      {
//          if(value == 1)
//          {
//            result = value;
//            foundAt = index;
//          }
//          index++;
//
//      }
//      System.out.println("Index " +  foundAt + " with " + "Occurance "  + result);
//
//       System.out.println(Arrays.toString(map));
//    }
//}
