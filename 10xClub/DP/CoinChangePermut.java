package DP;

/**
 * @author Kunal Sharma at 04/03/22 2:27 PM
 */

import java.io.*;

import java.util.*;



public class CoinChangePermut {

    public static int coinChangePermutation(int[] coins, int tar) {

        int[] dp = new int[tar + 1];

        dp[0] = 1;

        for (int t = 1; t <= tar; t++) {

            for (int coin : coins) {

                if (t - coin >= 0)

                    dp[t] += dp[t - coin];

            }

        }



        return dp[tar];

    }





    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] coins = new int[n];



        for (int i = 0; i < n; i++) {

            coins[i] = Integer.parseInt(br.readLine());

        }



        int amt = Integer.parseInt(br.readLine());



        System.out.println(coinChangePermutation(coins,amt));

    }

}
