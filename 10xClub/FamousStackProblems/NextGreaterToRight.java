package FamousStackProblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kunal Sharma at 12/02/22 8:01 PM
 */
public class NextGreaterToRight {

    public static void main(String[] args) {
        int[] ints = nextGreater(new int[]{5, 3, 8, -2, 7});
        int[] ints1 = nextGreaterBasedOnIndex(new int[]{5, 3, 8, -2, 7});
        System.out.println(Arrays.toString(ints1));
    }

    private static int[] nextGreaterBasedOnIndex(int[] ints) {
        // using front to back via Index approach

        int[] res = new int[ints.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(0);

        for (int i = 1; i < ints.length; i++) {
            while (stak.size() > 0 && ints[i] >= ints[stak.peek()]) {
                Integer pop_indx = stak.pop();
                res[pop_indx] = ints[i];
            }
            stak.push(i);
        }
        while (stak.size() > 0) {
            Integer pop_index = stak.pop();
            res[pop_index] = -1;
        }

        return res;
    }

    // using reverse loop
    private static int[] nextGreater(int[] ints) {

        int[] res = new int[ints.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(ints[ints.length - 1]);
        res[ints.length - 1] = -1;

        for (int i = ints.length - 2; i >= 0; i--) {
            while (stak.size() > 0 && ints[i] > stak.peek()) {
                stak.pop(); // pop till there are smaller elements in stack
            }

            res[i] = stak.size() == 0 ? -1 : stak.peek();
            stak.push(ints[i]);
        }
        return res;
    }


}


