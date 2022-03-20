package Tree.GenericTree;

import java.util.LinkedList;

/**
 * @author Kunal Sharma at 18/03/22 10:27 AM
 */
public class LevelOrderZigZag {

    // using two queue
    public static void levelOrderLinewiseZZUsing2Que(Initialization.Node node){

        LinkedList<Initialization.Node> que = new LinkedList<>(); // addLast, removeFirst

        LinkedList<Initialization.Node> st = new LinkedList<>();  // addFirst, removeFirst



        que.addLast(node);

        int level = 0;

        while(que.size() != 0){

            int currSize = que.size();

            while(currSize-->0){

                Initialization.Node rnode = que.removeFirst();

                System.out.print(rnode.data + " ");

                if(level % 2 == 0){

                    for(int i = 0; i < rnode.children.size();i++)

                        st.addFirst(rnode.children.get(i));

                }else{

                    for(int i = rnode.children.size() - 1; i >= 0; i--)

                        st.addFirst(rnode.children.get(i));

                }

            }

            level++;

            System.out.println();

            LinkedList<Initialization.Node> temp = que;

            que = st;

            st= temp;

        }

    }
}
