package Tree.GenericTree;

/**
 * @author Kunal Sharma at 17/03/22 10:11 PM
 */

import java.util.*;


public class Initialization {

    public static class Node {

        int data;

        ArrayList<Node> children = new ArrayList<>(); // bhoolna matt


        Node(int data) {

            this.data = data;

        }

        public Node() {

        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);


        Node twenty = new Node(20);

        root.children.add(twenty);


        Node thirty = new Node(30);

        root.children.add(thirty);


        Node forty = new Node(40);

        root.children.add(forty);


        Node fifty = new Node(50);

        twenty.children.add(fifty);


        Node sixty = new Node(60);

        twenty.children.add(sixty);


        Node seventy = new Node(70);

        thirty.children.add(seventy);


        Node eighty = new Node(80);

        thirty.children.add(eighty);


        Node ninety = new Node(90);

        thirty.children.add(ninety);


        Node hundred = new Node(100);

        forty.children.add(hundred);


        Node hundredten = new Node(110);

        eighty.children.add(hundredten);


        Node hundredtwenty = new Node(120);

        eighty.children.add(hundredtwenty);


        System.out.println("----------------------------------");
//        levelOrderLinewise(root);

    }

    public static int height(Node node) {

        int height = -1;

        for(Node child : node.children){

            int recAns = height(child);

            height = Math.max(recAns, height);

        }
        return height + 1;

    }


    public static int max(Node node) {

        int m = Integer.MIN_VALUE;

        for (Node child : node.children) {

            int cm = max(child);

            m = Math.max(m, cm);

        }

        m = Math.max(m, node.data);
        return m;

    }

    public static int size2(Node node){

        int size = 0;

        for(Node child : node.children){

            size += size2(child);

        }

        return size + 1;

    }


    public static int size(Node node) {
        int s = 0;

        for (Node child : node.children) {
            s += size(child);
        }

        s += 1;
        return s;
    }


    public static Node construct(int[] arr) {

        Node root = null;



        Stack<Node> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {

                st.pop();

            } else {

                Node t = new Node();

                t.data = arr[i];



                if (st.size() > 0) {

                    st.peek().children.add(t);

                } else {

                    root = t;

                }



                st.push(t);

            }

        }

        return root;

    }

    public static void display(Node node) {

        String str = node.data + " -> ";

        for (Node child : node.children) {

            str += child.data + ", ";

        }

        str += ".";

        System.out.println(str);



        for (Node child : node.children) {

            display(child);

        }

    }





}