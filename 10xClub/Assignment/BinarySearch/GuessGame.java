package BinarySearch;

/**
 * @author Kunal Sharma at 23/01/22 12:34 PM
 */

//https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessGame {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int l=0, h=n;
            int mid=0;

            //Binary Search.
            while(l<=h)
            {
                mid= l + (h-l)/2;

                if(guess(mid) == -1)
                    h=mid-1;
                else if(guess(mid) == 1)
                    l=mid+1;
                else
                    break;
            }
            return mid;

        }

        private int guess(int mid) {
            return 0;
        }
    }
}