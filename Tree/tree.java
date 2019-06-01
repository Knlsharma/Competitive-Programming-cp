import java.util.*;  

class Node 
{
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
        preOrder(root.left);
		preOrder(root.right);

        }

    }
	
	  public static void postOrder(Node root) {

        if( root !=  null)

        {  
		postOrder(root.left);
        postOrder(root.right);
		System.out.print(root.data + " ");
        

        }

    }
	
	 public static boolean flag = false; 
	
	 public static void searchNode(Node root, int value){  
        //Check whether tree is empty  
        if(root == null){  
          System.out.println("Tree is empty");  
        }  
        else{  
          //If value is found in the given binary tree then, set the flag to true  
          if(root.data == value){  
            flag = true;  
               return;  
          }  
          //Search in left subtree  
          if(flag == false && root.left != null){  
             searchNode(root.left, value);  
          }  
          //Search in right subtree  
          if(flag == false && root.right != null){  
             searchNode(root.right, value);  
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
		System.out.println("---------->>  INORER");
		preOrder(root);
		System.out.println("---------->>  PREORDER");
		postOrder(root);
		System.out.println("---------->>  POSTORDER");
		searchNode(root , 56);
		
		 if(flag)  
          System.out.println("Element is present in the binary tree");  
        else  
          System.out.println("Element is not present in the binary tree");   

	     
	   
		
    }	
}