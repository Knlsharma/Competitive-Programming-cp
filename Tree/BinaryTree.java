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

    /**
     * print binary tree
     * 
     */ 

    public static void displayNode(Node node)
    {
        if(node == null)
        {
            return;
        }
        String str = "";

        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> " +;
        str += node.right == null ? "." : node.right.data + "";

        System.out.println(str);
        displayNode(node.left);
        displayNode(node.right);
    }	

      public static int size(Node node) {
      if(node == null)
      {
          return 0;
      }
    
    int leftSize = size(node.left);
    int rightSize = size(node.right);
    int totalSize = leftSize + rightSize + 1;
    return totalsize;
  }

  public static int sum(Node node) {
    if(node == null)
      {
          return 0;
      }
    
    int leftSum = sum(node.left);
    int rightSum = sum(node.right);
    int totalSum = leftSize + rightSize + node.data;
    return totalSum;
  }

  public static int max(Node node) {
    if(node == null)
      {
          return Integer.MIN_VALUE;
      }
    
      
      int leftMax = max(node.left);
      int rightMax = max(node.right);
      int totalMax =  left < right ? right : left;
      int finalMax = node.data < totalMax ? totalMax : node.data;
      return finalMax;
    
  }

  public static int height(Node node) {
    if(node == null)
      {
          return 0;   // -1 for edges , 0 for nodes
      }
      
      int leftht = height(node.left);
      int rightht = height(node.right);
      int totalht = 1 + Math.max(leftht, rightht);
      return totalht;
    
  }
/*
Levelorder Traversal Of Binary Tree
*/
  // rpa : remove, print , add
  // using queue
  public static void levelOrder(Node node) {
    Queue<Node> mq = new ArrayDeque<>();
    mq.add(node);

    while (mq.size() > 0)
    {
      int count = mq.size();
      for (int i = 0 ; i < count ; i++)
      {
        node = mq.remove();
        System.out.print(node.data + " ");

        if (node.left != null)
        {
          mq.add(node.left);
        }

        if (node.right != null)
        {
          mq.add(node.right);
        }
      }
        System.out.println();
    }

  }


// Iterative Pre, Post And Inorder Traversals Of Binary Tree
  // using stack
    // using pair class and states
  /**
   * 1 -> preorder then s++ then left 
   * 2 -> indorder then s++ then right
   * 3 -> postorder then pop
   */
   
  public static void iterativePrePostInTraversal(Node node) {
      Stack<Pair> st = new Stack<>();
      Pair rootpair = new Pair(node, 1);
      st.push(rootpair);
      
      String pre = "";
      String in = "";
      String post = "";
      
      while(st.size() > 0)
      {
          Pair top = st.peek();
          
          if(top.state == 1)   // pre , s++ , left
          {
              pre += top.node.data + " ";
              top.state++;
              
              if(top.node.left != null)
              {
                  Pair pairR = new Pair(top.node.left,1);
                  st.push(pairR);
              }
          }
          else if(top.state == 2)   // in , s++ , right
          {
               in += top.node.data + " ";
               top.state++;
            if(top.node.right != null)
              {
                  Pair pairR = new Pair(top.node.right,1);
                  st.push(pairR);
              }
          }
          else
          {
               post += top.node.data + " ";   // post, pop
               st.pop();
          }
      }
      System.out.println(pre);
      System.out.println(in);
      System.out.println(post);
  }

  // find and add in list 

  static ArrayList<Integer> path;
  public static boolean find(Node node, int data) {
      if(node == null) // base
      {
          return false;
      }
      
      if(node.data == data)  // self
      {
          path.add(node.data);
          return true;
      }
      
     boolean presentInLeft = find(node.left , data);
     
     if(presentInLeft)  // left
     {
         path.add(node.data);
         return true;
     }
     
     boolean presentInRight = find(node.right , data);
     
     if(presentInRight)  // right
     {
         path.add(node.data);
         return true;
     }
     return false;  // not found 
  }

  // Print K Levels Down

  public static void printKLevelsDown(Node node, int k){
      if(node == null || k < 0)
      {
          return;
      }
      if(k == 0)
      {
          System.out.println(node.data);
      }
      
     printKLevelsDown(node.left,k-1);
     printKLevelsDown(node.right,k-1);
  }


// Print Nodes K Distance Away

}