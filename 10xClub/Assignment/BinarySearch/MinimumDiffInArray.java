package BinarySearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * @author Kunal Sharma at 23/01/22 1:25 AM
 */
public class MinimumDiffInArray {

    public static String isValid(String s) {
        // Write your code here

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                map.put(ch, val+1);
            } else {
                map.put(ch, 1);
            }
        }
        int min = Collections.min(map.values());


        String result = "YES";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), entry.getValue() - min);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 1) {
                map.put(entry.getKey(), entry.getValue() - 1);
                break;
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet())
            {
                if (entry.getValue() >= 1) {
                    {
                        result = "NO";
                        break;
                    }
                }
            }

        return result;
    }
    public static void main(String[] args) {
//        getMinimumDiff(new int[] {} )
        System.out.println(isValid("aabbccddeefghi"));
    }
}
