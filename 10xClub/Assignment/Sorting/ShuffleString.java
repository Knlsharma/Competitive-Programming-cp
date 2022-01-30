package Sorting;

/**
 * @author Kunal Sharma at 29/01/22 4:29 PM
 */

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        StringBuilder t = new StringBuilder(s);

        for (int i = 0; i < indices.length; i++) {
            t.setCharAt(indices[i], s.charAt(i));
        }

        return t.toString();
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
}
