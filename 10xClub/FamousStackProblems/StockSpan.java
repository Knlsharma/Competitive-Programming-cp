package FamousStackProblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kunal Sharma at 12/02/22 10:50 PM
 */
public class StockSpan {

    public static void main(String[] args) {
        leftSpan(new int[]{100, 80, 60, 70, 60, 75, 85});
        int[] ints = WithOutUsingPair(new int[]{10, 12, 16, 11, 7, 3, 8,12,20,17,11,19});  // need to check
        int[] ints1 = UsingNextGreaterleftIndex(new int[]{10, 12, 16, 11, 7, 3, 8,12,20,17,11,19});
        System.out.println(Arrays.toString(ints1));
    }

    private static int[] UsingNextGreaterleftIndex(int[] arr) {
        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(arr.length - 1);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (stak.size() > 0 && arr[i] > arr[stak.peek()]) {
                Integer pop_index = stak.pop();
                res[pop_index] = pop_index - i;  // value who is popping
            }
            stak.push(i);

        }
        while (stak.size() > 0) {
            Integer pop_index = stak.pop();
            res[pop_index] = pop_index + 1;
        }

        return res;
    }

    private static int[] WithOutUsingPair(int[] arr) {

        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(0);
        res[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (!stak.isEmpty() && arr[i] >= arr[stak.peek()]) {
                stak.pop();
            }

            res[i] = stak.size() == 0 ? i :  stak.peek() - i;
            stak.push(i); // pushing array index
        }
        return res;
    }

    static class Pair {
        int val;
        int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }


    private static int[] leftSpan(int[] ints) {

        int[] res = new int[ints.length];

        Stack<Pair> stak = new Stack<>();
        stak.push(new Pair(ints[0], 0));
        res[0] = 1;

        for (int i = 1; i < ints.length; i++) {

            Pair pair = new Pair(ints[i], i);

            while (stak.size() > 0 && pair.val > stak.peek().val) {
                stak.pop(); // pop till there are smaller elements in stack
            }

            res[i] = stak.size() == 0 ? i + 1 : i - stak.peek().index;
            stak.push(pair);
        }
        return res;
    }
}
