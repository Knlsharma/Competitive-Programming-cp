//// https://www.interviewbit.com/problems/repeat-and-missing-number-array/
//
//// TC : O(N)
//
//import java.util.*;
//
//class ArrayNumber {
//    public static void main(String[] args) {
//        int [] arr = new int [] {3, 1, 3};
//        int n = arr.length;
//
//        int miss = 0, repeat = 0;
//        for (int i = 0; i < n; ++i) {
//            if (arr[Math.abs(arr[i]) - 1] > 0)
//                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
//
//            else
//                repeat = Math.abs(arr[i]);
//        }
//
//        for (int i = 0; i < n; ++i) {
//            if (arr[i] > 0)
//                miss = i + 1;
//        }
//        System.out.println("Missing: " + miss + " Repeating: " + repeat);
//    }
//}
//
//// Optimized way using 2 equations
//// TC : O(N)
//// SC : O(1)
//
//public class Solution {
//    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
//    public int[] repeatedNumber(final int[] A) {
//
//        long N = A.length;
//
//        long sumOfNumbers = (N * (N + 1))/2;
//        long sumOfSquares = (N * (N + 1) * (2 * N  + 1))/6;
//
//        long actualSumOfNumbers = 0;
//        long actualSumOfSquares = 0;
//        for (int i = 0; i < N; ++i) {
//            actualSumOfNumbers += (long)A[i];
//            actualSumOfSquares += (long)A[i]*(long)A[i];
//        }
//
//        long diffOfNumbers = sumOfNumbers - actualSumOfNumbers;
//        long diffOfSquares = sumOfSquares - actualSumOfSquares;
//
//        long temp = diffOfSquares / diffOfNumbers;
//
//        int repeatedNumber = (int)(Math.abs(diffOfNumbers - temp)/2);
//        int missingNumber = (int)((diffOfNumbers + temp)/2);
//
//        return new int[] {repeatedNumber, missingNumber};
//    }
//}
//
//
//// Swap Sort:
//// TC : O(N)
//// SC : O(1)
//
//public static void swapSort(int[] arr)
//	{
//		// I/p : 2, 3, 1, 5, 1
//
//		int i = 0;
//		int len = arr.length;
//		while(i < len)
//		{
//			int value = arr[i];
//			int correctIndexToBe = value - 1;
//			if((i + 1) != value)
//			{
//				if(arr[i] == arr[value - 1])   // in case of duplicate value
//				{
//					i++;      // just increase 'i' forward
//					continue;
//				}
//				swap(arr, i , correctIndexToBe);
//			}
//			else
//			{
//				i++;
//			}
//		}
//		// O/p : 1, 2, 3, 1, 5
//
//  for(int i = 0 ; i < arr.length ; i++)
//		{
//			if((i+1) != arr[i])
//			{
//                System.out.println("Missing number " + (i+1));
//				System.out.println("Duplicate number " + arr[i]);
//
//			}
//		}
//  // Missing number 4
//  // Duplicate number 1
//
//  }
//
//		public static void swap(int[] arr, int i , int j)
//		{
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		//   System.out.println(Arrays.toString(arr));
//		}
//
//
