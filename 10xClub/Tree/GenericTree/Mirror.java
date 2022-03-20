package Tree.GenericTree;

import java.util.Collections;

/**
 * @author Kunal Sharma at 18/03/22 1:31 PM
 */
public class Mirror {

    public static void mirror(Initialization.Node root)
    {
        // pre-area

        for( Initialization.Node child : root.children)
        {
           mirror(child);
        }

        // post-area here we are reversing
        Collections.reverse(root.children);
    }
}
