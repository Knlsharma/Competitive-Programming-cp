package FamousStackProblems;

import java.util.Stack;

/**
 * @author Kunal Sharma at 12/02/22 7:09 PM
 */
public class BalancedBrackets {

    public static void main(String[] args) {

        String str = "((a + b))";
         str = "((a + b))";
        System.out.println("Is Duplicate Bracket: " + balancedBracketCheck(str));

    }

    private static boolean balancedBracketCheck(String str) {
        Stack<Character> stak = new Stack();
        boolean isDuplicate = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                if (stak.peek() == '(') {
                    isDuplicate = true;
                    break;
                } else {
                    while (stak.size() > 0 && stak.peek() != '(') {  // check size and till you opening bracket
                        stak.pop();
                    }
                    stak.pop(); // extra pop for opening bracket removal
                }
            } else {
                stak.push(ch);
            }
        }
        return isDuplicate;
    }


}
