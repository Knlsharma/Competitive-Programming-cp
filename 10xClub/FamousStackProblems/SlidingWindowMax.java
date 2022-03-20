package FamousStackProblems;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Kunal Sharma at 06/03/22 1:56 PM
 */
public class SlidingWindowMax {

    public static void main(String[] args) {
        //                                  0 1 2 3 4 5 6 7 8  : Index
        findMinInWindowUsingStack(new int[]{2, 1, 3, 8, 0, 1, 5, 3, 4}, 9, 3);
        // 1 1 4 4 4 5 7 : o/p
    }

    private static void findMinInWindowUsingStack(int[] arr, int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        // first => min , last => max

        for (int i = 0; i < arr.length; i++) {
            // popFront of deque while element index < (i - k + 1)   remove outside window element
            while (!dq.isEmpty() && dq.peekFirst() < (i - k + 1)) dq.pollFirst();
            // maintain ascending order of element;
            while (!dq.isEmpty() && arr[dq.peekLast()] > arr[i]) dq.pollLast();
            dq.offerLast(i);
            if (i >= k - 1)  // when window size become more then current i so start print
                System.out.print(dq.peekFirst() + " ");
        }

    }
}
