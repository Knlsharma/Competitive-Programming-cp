package FamousStackProblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Kunal Sharma at 15/03/22 1:31 PM
 */
public class MergeInterval {

    public static class Interval implements Comparable<Interval> {
        int st;
        int et;

        public Interval(int st, int et) {
            this.st = st;
            this.et = et;
        }

        public int compareTo(Interval other) {
            if (this.st != other.st) {
                return this.st - other.st;  // basis of start time
            } else {
                return this.et - other.et; // basis of end time
            }
        }
    }

    public static void checkAndPrintRoomInOverlap(int[][] arr) {
        
        Interval[] Intervals = new Interval[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Intervals[i] = new Interval(arr[i][0], arr[i][1]);
        }
        Arrays.sort(Intervals);

        Stack<Interval> st = new Stack<>();
        for (int i = 0; i < Intervals.length; i++) {
            if (i == 0) {
                st.push(Intervals[i]);   // empty stack condition for 1st entry
            } else {
                Interval top = st.peek();        // recent entry get
                Interval curr = Intervals[i];

                if (curr.st > top.et) {        // checking whether greater or not
                    st.push(curr);
                } else {
                    top.et = Math.max(top.et, Intervals[i].et);  // else update Top
                }
            }
        }

        Stack<Interval> rs = new Stack<>();
        while (st.size() > 0) {
            rs.push(st.pop());
        }
        int number_of_room = 0;

        while (rs.size() > 0) {
            Interval p = rs.pop();
            number_of_room++;
        }


        System.out.println("Number of room needed for un-overlapped meeting " + number_of_room);
    }

}
