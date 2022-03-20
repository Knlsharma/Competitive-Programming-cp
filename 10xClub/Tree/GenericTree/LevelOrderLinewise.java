package Tree.GenericTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kunal Sharma at 18/03/22 10:19 AM
 */

public class LevelOrderLinewise {


    // using single queue
    public static void levelOrderLinewiseSingleQue(Initialization.Node node) {

        LinkedList<Initialization.Node> que = new LinkedList<>();

        que.addLast(node);
        while (que.size() != 0) {

            int currSize = que.size();


            while (currSize-- > 0) {

                Initialization.Node rnode = que.removeFirst();

                System.out.print(rnode.data + " ");


                for (Initialization.Node child : rnode.children) {

                    que.addLast(child);

                }

            }

            System.out.println();

        }
    }


    // using two queue
    public static void levelOrderLinewiseUsing2Que(Initialization.Node root) {
        Queue<Initialization.Node> queue = new ArrayDeque<Initialization.Node>();
        Queue<Initialization.Node> cqueue = new ArrayDeque<Initialization.Node>();
        queue.add(root);

        while (queue.size() > 0) {
            Initialization.Node temp = queue.remove();
            System.out.print(temp.data + " ");

            for (Initialization.Node child : temp.children) {
                cqueue.add(child);
            }

            if (queue.size() == 0) {
                queue = cqueue;
                cqueue = new ArrayDeque<>();
                System.out.println(".");
            }
        }
    }


}
