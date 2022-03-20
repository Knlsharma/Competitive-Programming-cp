package FamousStackProblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kunal Sharma at 12/02/22 11:43 PM
 */
public class NextGreaterToLeft {

    public static void main(String[] args) {
        int[] ints = nextGreaterToLeft(new int[]{1, 2, 1, 2, 5});
        int[] ints1 = nextGreaterToLeftViaIndex(new int[]{1, 2, 1, 2, 5});
        System.out.println(Arrays.toString(ints1));
    }

    // 1  2  1  2  5
    // -1 -1 2 -1 -1

    private static int[] nextGreaterToLeft(int[] arr) {
        // front to back only via Value

        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(arr[0]);
        res[0] = -1;


        for (int i = 1; i < arr.length; i++) {

            while (stak.size() > 0 && arr[i] >= stak.peek()) {
                stak.pop(); // pop till there are smaller elements in stack
            }

            res[i] = stak.size() == 0 ? -1 : stak.peek();
            stak.push(arr[i]);
        }
        return res;
    }


    private static int[] nextGreaterToLeftViaIndex(int[] arr) {
        // back to front via index

        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (stak.size() > 0 && arr[i] >= arr[stak.peek()]) {
                Integer pop_index = stak.pop();
                res[pop_index] = arr[i];
            }
            stak.push(i);
        }

        while (stak.size() > 0) {
            Integer pop_Index = stak.pop();
            res[pop_Index] = -1;

        }

        return res;
    }
}

