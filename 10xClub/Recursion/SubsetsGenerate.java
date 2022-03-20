package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kunal Sharma at 11/02/22 11:09 PM
 */

public class SubsetsGenerate {

    static List<List<String>> result = new ArrayList<>();

    public static void subsets(String nums, String pathSoFar) {
        if(nums.length() == 0)
        {
            System.out.println(pathSoFar);
            return;
        }

        subsets(nums.substring(1),pathSoFar + nums.charAt(0));
        subsets(nums,pathSoFar + "");

    }

    public static void main(String[] args) {
        subsets("abc", "");
    }
}



