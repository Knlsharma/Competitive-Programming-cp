package FamousStackProblems;

import java.util.Stack;

/**
 * @author Kunal Sharma at 12/02/22 7:31 PM
 */

public class BalancedMultipleBracket {

    public static void main(String[] args) {

        String str = "((a + b))";
        str = " + {[((c + d))]}";
        System.out.println("Is Duplicate Bracket: " + balancedBracketCheck2(str));

    }

    private static boolean balancedBracketCheck2(String str) {
        Stack<Character> stak = new Stack<>();
        boolean isBalanced = true;
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stak.push(ch);
            } else {
                if (ch == ')') {
                    if (stak.size() == 0) {
                        isBalanced = false;
                        return isBalanced;
                    } else if (stak.peek() != '(') {
                        isBalanced = false;
                        return isBalanced;
                    } else {
                        stak.pop();
                    }
                }
                if (ch == '}') {
                    if (stak.size() == 0) {
                        isBalanced = false;
                        return isBalanced;
                    } else if (stak.peek() != '{') {
                        isBalanced = false;
                        return isBalanced;
                    } else {
                        stak.pop();
                    }
                }

                if (ch == ']') {
                    if (stak.size() == 0) {
                        isBalanced = false;
                        return isBalanced;
                    } else if (stak.peek() != '[') {
                        isBalanced = false;
                        return isBalanced;
                    } else {
                        stak.pop();
                    }
                }
            }
        }
        isBalanced = stak.size() == 0;
        return isBalanced;
    }

}
// (a + (b + (c + d))))