package FamousStackProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Kunal Sharma at 05/03/22 11:23 AM
 */


public class MergeIntervals {


    public static void main(String[] args) throws Exception {

        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];


        for (int j = 0; j < n; j++) {

            String line = br.readLine();

            arr[j][0] = Integer.parseInt(line.split(" ")[0]);

            arr[j][1] = Integer.parseInt(line.split(" ")[1]);

        }


        mergeOverlappingIntervals(arr);

    }

    public static class Pair {

        int iv;

        int fv;


        Pair(int iv, int fv) {

            this.iv = iv;

            this.fv = fv;

        }

    }


    public static void mergeOverlappingIntervals(int[][] arr) {

        // merge overlapping intervals and print in increasing order of start time

        sortPair(arr);

        Stack<Pair> st = new Stack<Pair>();

        Pair p = new Pair(arr[0][0], arr[0][1]);

        st.push(p);


        for (int i = 1; i < arr.length; i++) {

            Pair top = new Pair(arr[i][0], arr[i][1]);

            Pair peek = st.peek();

            if (arr[i][0] > peek.fv) {


                st.push(top);

            } else {

                peek.fv = Math.max(top.fv, peek.fv);


            }

        }

        Stack<Pair> rs = new Stack<>();

        while (st.size() > 0) {

            rs.push(st.pop());

        }

        while (rs.size() > 0) {

            Pair rem = rs.pop();

            System.out.println(rem.iv + " " + rem.fv);

        }


    }

    public static void sortPair(int[][] arr) {

        Arrays.sort(arr,
                (entry1, entry2) -> {


                    if (entry1[0] != entry2[0])

                        return entry1[0] - entry2[0];

                    else

                        return entry1[1] - entry2[1];

                });

    }


}