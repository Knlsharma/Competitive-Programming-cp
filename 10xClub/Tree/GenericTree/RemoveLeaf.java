package Tree.GenericTree;

/**
 * @author Kunal Sharma at 18/03/22 1:44 PM
 */
public class RemoveLeaf {

//    Steps:-
//    1.) deletion code should be put in PRE ORDER becoz in POST it will remove all nodes
//    2.) loop should be run in reverse order

//    Note: 1st removal and 2nd is traversal

    public static void removeLeaf(Initialization.Node root) {
        // deletion in PRE-ORDER

        for (int i = root.children.size() - 1; i >= 0; i--) {
            Initialization.Node node = root.children.get(i);
            if (node.children.size() == 0) {
                node.children.remove(i);
            }
        }

        for (Initialization.Node child : root.children) {
            removeLeaf(child);
        }
    }


}
