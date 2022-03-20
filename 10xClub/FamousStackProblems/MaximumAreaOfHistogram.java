package FamousStackProblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kunal Sharma at 13/02/22 1:05 PM
 */
public class MaximumAreaOfHistogram {

    public static void main(String[] args)
    {
        int[] inputArray = new int[]{6, 2, 5, 4, 5, 1, 6};
        int[] leftArr = nextSmallerToLeft(inputArray);
        int[] rightArr = nextSmallerToRight(inputArray);
        System.out.println(Arrays.toString(nextSmallerToLeft(inputArray)));
        System.out.println(Arrays.toString(nextSmallerToRight(inputArray)));

        int max_area= 0;

        for(int i = 0 ; i < inputArray.length ; i++)
        {
            int curr_area = (rightArr[i] - leftArr[i] - 1) * inputArray[i];
            max_area = Math.max(max_area, curr_area);
        }
        System.out.println(max_area);
    }
//       0 1 2 3 4 5 6
     // 6 2 5 4 5 1 6    arr
     // 1 5 3 5 5 7 7    right

    // -1 -1 1 1 3 -1 5

    private static int[] nextSmallerToRight(int[] arr) {
        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(arr.length - 1);   // index push
        res[arr.length - 1] = arr.length;


        for (int i = arr.length - 2; i >= 0; i--) {

            while (!stak.isEmpty() && arr[i] <= arr[stak.peek()]) {
                stak.pop(); // pop till there are bigger elements in stack
            }
            // and stops when smaller elemnts in stack

            res[i] = stak.size() == 0 ? arr.length : stak.peek();
            stak.push(i);

            System.out.println("Current stack after ith " + i + "  stak is" + stak);
        }
        return res;
    }

    private static int[] nextSmallerToLeft(int[] arr) {
        int[] res = new int[arr.length];

        Stack<Integer> stak = new Stack<>();
        stak.push(arr[0]);
        res[0] = -1;


        for (int i = 1; i < arr.length; i++) {


            while (stak.size() > 0 && arr[i] <= arr[stak.peek()]) {
                stak.pop(); // pop till there are smaller elements in stack
            }

            res[i] = stak.size() == 0 ? -1 : stak.peek();
            stak.push(i);

            System.out.println("Current stack after ith " + i + "  stak is" + stak);
        }
        return res;
    }
}
