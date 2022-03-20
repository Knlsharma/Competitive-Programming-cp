package FamousStackProblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kunal Sharma at 13/02/22 11:14 AM
 */
public class NextSmallerToRight {

    public static void main(String[] args) {
//        int[] ints = nextSmallerToRight(new int[]{4, 5, 2, 10, 8});
        int[] ints1 = nextSmallerToRightViaIndex(new int[]{4, 5, 2, 10, 8});
        System.out.println(Arrays.toString(ints1));
    }

//    4 5  2  10  8
//    2 2 -1  8  -1

    private static int[] nextSmallerToRight(int[] arr) {

        // right to left

        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(arr[arr.length - 1]);
        res[arr.length - 1] = -1;


        for (int i = arr.length - 2; i >= 0; i--) {

            while (!stak.isEmpty() && arr[i] < stak.peek()) {
                stak.pop(); // pop till there are smaller elements in stack
            }

            res[i] = stak.size() == 0 ? -1 : stak.peek();
            stak.push(arr[i]);

            System.out.println("Current stack after ith " + i + "  stak is" + stak);
        }
        return res;
    }

    private static int[] nextSmallerToRightViaIndex(int[] arr) {

        // back to front via index

        int[] res = new int[arr.length];
        Stack<Integer> stak = new Stack<>();

        stak.push(0);

        for(int i = 1 ; i < arr.length ; i++)
        {
            while(stak.size() > 0 && arr[i] < arr[stak.peek()])
            {
                Integer pop_index = stak.pop();
                res[pop_index] = arr[i];
            }

            stak.push(i);

        }

        while (stak.size() > 0) {
            Integer pop_index = stak.pop();
            res[pop_index] = -1;
        }
        return res;
    }
}
