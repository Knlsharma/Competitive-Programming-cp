package FamousStackProblems;

import java.io.*;
import java.util.Stack;

/**
 * @author Kunal Sharma at 06/03/22 10:46 AM
 */

public class Celebrity {


    public static void main(String[] args) throws Exception {

        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];


        for (int j = 0; j < n; j++) {

            String line = br.readLine();

            for (int k = 0; k < n; k++) {

                arr[j][k] = line.charAt(k) - '0';

            }

        }

        findCelebrity(arr);


    }


    public static void findCelebrity(int[][] arr) {

        // if a celebrity is there print it''s index (not position), if there is not then

        // print "none"


        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            st.push(i);

        }


        while (st.size() != 1) {

            int i = st.pop();

            int j = st.pop();


            if (arr[i][j] == 1) { // i knows j, so i can't be celebrity

                st.push(j);

            } else {

                // i doesn't know j, j can't be celebrity

                st.push(i);

            }

        }


        int pot = st.pop();

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {

            if (i != pot) {

                if (arr[i][pot] == 0 || arr[pot][i] == 1) {

                    flag = false;

                    break;

                }

            }

        }


        if (flag == true) {

            System.out.println(pot);

        } else {

            System.out.println("none");

        }

    }


}