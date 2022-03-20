package Tree.GenericTree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Kunal Sharma at 17/03/22 10:20 PM
 */

public class LevelOrder {

    // using one queue
    public static void levelOrder(Initialization.Node root) {

        Queue<Initialization.Node> queue = new ArrayDeque<Initialization.Node>();

        queue.add(root);

        while (queue.size() > 0) {
            // R, P, A
            Initialization.Node temp = queue.remove();

            System.out.print(temp.data + " ");

            for (Initialization.Node child : temp.children) {
                queue.add(child);
            }
        }
        System.out.println(".");

    }
}
