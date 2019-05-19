import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class tree
 {


    public static void inOrder(Node root) {

        if( root !=  null)

        {  
		inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

        }

    }
	
	  public static void preOrder(Node root) {

        if( root !=  null)

        {  
		
        System.out.print(root.data + " ");
        inOrder(root.left);
		inOrder(root.right);

        }

    }
	
	  public static void postOrder(Node root) {

        if( root !=  null)

        {  
		inOrder(root.left);
        inOrder(root.right);
		System.out.print(root.data + " ");
        

        }

    }
	
	public static boolean contains(Node root , int value) {
		
		if(root.data ==  data2) 
            return true;
	 	

         else if (value < data)
		 {
			 if( root.left == null)
			 {
				 return false ;
			 }
			  else
			  {
				 return root.left = contains(root ,value);
				  
			  }  
		 }
		 
		 
		  else
		  {
			  if( root.right == null)
			 {
				 return false ;
			 }
			  else
			  {
				 return root.right = contains(root ,value);		  
			  }
		  
	      }  		
		
		
}
	
	
	

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        inOrder(root);
		System.out.println("----------");
		preOrder(root);
		System.out.println("----------");
		postOrder(root);
		System.out.println("----------");
		contains(root , 56);
		
    }	
}