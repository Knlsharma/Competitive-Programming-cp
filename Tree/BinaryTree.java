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

  public static void printKLevelsDownWithBlocker(Node node, int k, Node blocker){
      if(node == null || k < 0 || node == blocker)
      {
          return;
      }
      if(k == 0)
      {
          System.out.println(node.data);
      }
      
     printKLevelsDownWithBlocker(node.left,k-1,blocker);
     printKLevelsDownWithBlocker(node.right,k-1,blocker);
  }

// Print Nodes K Distance Away
  public static void printKNodesFar(Node node, int data, int k) {
    path = new ArrayList<>(); 
    find(node, data);
    for(int i = 0 ; i < path.size(); i++)
    {
    printKLevelsDownWithBlocker(path.get(i), k - i , i == 0 ? null : path.get(i-1));
        
    }
  }


// Path To Leaf From Root In Range
  public static void pathToLeafFromRoot(Node node, String path, int sum, int lo, int hi){
      if(node == null)
      {
          return;
      }
      if(node.left == null && node.right == null)
      {
          sum += node.data;
          if(sum >= lo && sum <= hi)
          {
              System.out.println(path + node.data);
          }
          return;
      }
      pathToLeafFromRoot(node.left , path + node.data + " ", sum + node.data, lo , hi);
      pathToLeafFromRoot(node.right,path + node.data + " ", sum + node.data, lo , hi);
  }


// Transform To Left-cloned Tree
    public static Node createLeftCloneTree(Node node){
      if(node == null)
      {
          return null;
      }
      
     Node lcr =  createLeftCloneTree(node.left);
     Node rcr =  createLeftCloneTree(node.right);
     
     Node newNode = new Node(node.data,lcr, null);
     node.left = newNode;
     node.right = rcr;
     return node;
     
  }

// Transform To Normal From Left-cloned Tree
    public static Node transBackFromLeftClonedTree(Node node){
    if(node == null)
     {
          return null;
      }
    Node lcr = transBackFromLeftClonedTree(node.left.left);
    Node rcr = transBackFromLeftClonedTree(node.right);
    
    node.left = lcr;
    node.right = rcr;
    
    return node;
    
  }

  // Print Single Child Nodes
  public static void printSingleChildNodes(Node node, Node parent){
   if(node == null)
   {
       return;
   }
   
  if(parent != null && parent.left == node && parent.right == null)
  {
      System.out.println(node.data);
  }
  else if(parent != null && parent.right == node && parent.left == null)
  {
      System.out.println(node.data);      
  }
   
   printSingleChildNodes(node.left, node);
   printSingleChildNodes(node.right, node);
   
  }

  // Remove Leaves In Binary Tree
    public static Node removeLeaves(Node node){
     if(node == null)   // single child
     {
          return null;
     }
      
     if(node.left == null && node.right == null)
     {
         return null;
     }
      
     Node NewleftRoot = removeLeaves(node.left);
     Node NewrightRoot = removeLeaves(node.right);
      
     node.left = NewleftRoot;
     node.right = NewrightRoot;
     
     return node;
      
  }

  // Diameter Of A Binary Tree
  // O(n^2)
    public static int diameter1(Node node) { 
      if(node == null)
      {
          return 0;
      }
      
      int leftDia = diameter1(node.left); // max deepest in left tree b/w two node in left side
      int rightDia = diameter1(node.right); // max deepest in right tree b/w two node in left side
      
      // max distance b/w left deepest and right deepest.
      
     int f = height(node.left) + height(node.right) + 2;
     
     int dia = Math.max(Math.max(leftDia, rightDia), f);
     return dia;
      
  }

    // Diameter Of A Binary Tree
  // O(n)

  static class DiaPair
  {
    int ht;
    int dia;
  }

  public static DiaPair diameter2(Node node) {
    if (node == null)
    {
      DiaPair basePair = new DiaPair();
      basePair.ht = -1;
      basePair.dia = 0;
      return basePair;
    }

    DiaPair leftPair = diameter2(node.left); // max deepest in left tree b/w two node in left side
    DiaPair rightPair = diameter2(node.right); // max deepest in right tree b/w two node in left side

    DiaPair newPair = new DiaPair();
    newPair.ht = Math.max(leftPair.ht, rightPair.ht) + 1;
    int fes = leftPair.ht + rightPair.ht + 2;
    newPair.dia = Math.max(Math.max(leftPair.dia, rightPair.dia), fes);

    return newPair;
  }


// Tilt Of Binary Tree
// return sum
// change tilt
// based on travel and change strategy

  static int tilt = 0;
  public static int tilt(Node node) {

    if ( node == null)
    {
      return 0;
    }

    int ls = tilt(node.left);  // will return left sum and change tilt left side
    int rs = tilt(node.right);  // will return right sum and change tilt right side

    int loclTilt = Math.abs(ls - rs);
    tilt += loclTilt;

    int totalSum = ls + rs + node.data;
    return totalSum;

  }

}