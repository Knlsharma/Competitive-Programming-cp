
// find size or number of nodes in genric tree
  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  // find max in gen. tree
  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

/**
 *  on basis of edges (Not on basis of nodes
 **/
  public static int height(Node node) {
    int ht = -1;
    for (Node child : node.children) {
      int newM = height(child);
      ht = Math.max(ht, newM);
    }
    ht++;
    return ht;
  }

    /**
     * Generic Tree - Traversals (pre-order, Post-order) 
     **/

    public static void traversals(Node node) {
    // Euler left on deep recursion
    System.out.println("Node Pre " + node.data);
    
    for(Node child : node.children)
    {
        // Edge pre
        System.out.println("Edge Pre " + node.data + "--" + child.data);
        traversals(child);
        System.out.println("Edge Post " + node.data + "--" + child.data);
        // Edge post
    }
    // Euler right on way out of recursion
    System.out.println("Node Post " + node.data);
  
  }

  /**
   * Level-order Of Generic Tree 
   * Remove PRINT ADD
   * */

    public static void levelOrder(Node node){
    
    Queue<Node> q = new ArrayDeque<>();
    
    q.add(node);
    
    while(!q.isEmpty())
    {
        node = q.remove();
        System.out.print(node.data + " ");
        
        // Add childerns for below levels
        for(Node child : node.children)
        {
            q.add(child);
        }
    }

    System.out.print(".");
  }


  /**
   *  Levelorder Linewise (generic Tree) 
   * REMOVE PRINT ADD
   * */


  public static void levelOrderLinewiseApproach1(Node node) {
        
    Queue<Node> mainQ = new ArrayDeque<>();
    
    Queue<Node> childQ = new ArrayDeque<>();
    
    mainQ.add(node);
    
    while(mainQ.size() > 0)
    {
        node = mainQ.remove();
        System.out.print(node.data + " ");
        
        // Add childerns for below levels
        for(Node child : node.children)
        {
            childQ.add(child);
        }
        
        if(mainQ.size() == 0)
        {
            mainQ = childQ;
            childQ = new ArrayDeque<>();
            System.out.println();
        }
    }
  }

  /**
  * Levelorder Linewise Zig Zag
  * STACK, main stack , child stack , counter for level
  * REMOVE PRINT ADD
  **/


  public static void levelOrderLinewiseZZ(Node node) {
    // write your code here
    
    Stack<Node> ms = new Stack<>();
    Stack<Node> cs = new Stack<>();
    int level = 1;
    ms.push(node);
    
    while(ms.size() > 0)
    {
        node = ms.pop();
        System.out.print(node.data + " ");
        
        if(level  % 2 == 1)
        {
            for(int i = 0 ; i < node.children.size(); i++)
            {
                Node child =  node.children.get(i);
                cs.push(child);
            }
        }
        else
        {
            for(int i = node.children.size() - 1 ; i >= 0; i--)
            {
                Node child =  node.children.get(i);
                cs.push(child);
            }    
        }
        
        if( ms.size() == 0)
        {
            ms = cs;
            cs = new Stack<>();
            level++;
            System.out.println();
        }
    }
  }


  /**
   *  Levelorder Linewise (generic Tree) 
   * using -1 as identifier for end of line and Queue
   * REMOVE PRINT ADD
   * */


  public static void levelOrderLinewiseApproach2(Node node) {
        
    Queue<Node> mainQ = new ArrayDeque<>();
    
    mainQ.add(node);
    mainQ.add(new Node(-1));
    
    while(mainQ.size() > 0)
    {
        node = mainQ.remove();
        if(node.data != -1)
        {
          System.out.print(node.data + " ");
        
        // Add childerns for below levels
        for(Node child : node.children)
        {
            mainQ.add(child);
        }

        }
        else
        {
          if(mainQ.size() > 0)
          {
            mainQ.add(new Node(-1));
            System.out.println();
          }

        }
    }
  }


    /**
   *  Levelorder Linewise (generic Tree) 
   * using count approach as identifier for different level and Queue
   * REMOVE PRINT ADD children
   * */


  public static void levelOrderLinewiseApproach3(Node node) {
        
    Queue<Node> mainQ = new ArrayDeque<>();
    
    mainQ.add(node);
    
    while(mainQ.size() > 0)
    {
      int currentSize = mainQ.size();

      for(int i = 0 ; i < currentSize ; i++)
      { 
        node = mainQ.remove();

        System.out.print(node.data + " ");
        
        // Add childerns for below levels
        for(Node child : node.children)
        {
            mainQ.add(child);
        }

      }
        
      System.out.println();
    }
  }

      /**
   *  Levelorder Linewise (generic Tree) 
   * Using Pair class and maintaining level and Queue
   * REMOVE PRINT ADD children
   * */

    private static class Pair
    {
      Node node;
      int level;

      Pair(Node node, int level)
      {
        this.node = node;
        this.level = level;
      }

    }

  // pair class above
  public static void levelOrderLinewiseApproach4(Node node) {
        
    Queue<Pair> mainQ = new ArrayDeque<>();
    
    mainQ.add(new Pair(node , 1));

    int level = 1;

    while(mainQ.size() > 0)
    {
      Parir removePair = mainQ.remove();
      if(removePair.level > level)
      {
      level = removePair.level;
      System.out.println();
      }

       System.out.println(removePair.node.data + " ");
       for(Node child : removePair.node.children)
       {
        Pair cp = new Pair(child,p.level+1);
         mainQ.add(cp)
       }
    }
  }

  // Mirror of tree  
  public static void mirror(Node node){
      
      for(Node child : node.children)
      {
          mirror(child);
      }
      Collections.reverse(node.children);
  }

 
    // Remove Leaves In Generic Tree
    public static void removeLeaves(Node node) {
      // pre - order
      /** post order results in some error 
       * Concurrent modification exception
       * and deletes extra leaf node **/
      
     for(int i = node.children.size() - 1 ; i >= 0 ; i--)
     {
         Node child = node.children.get(i);
         if(child.children.size() == 0)
         {
             node.children.remove(child);
         }
     }
     
     for (Node child : node.children) {
      removeLeaves(child);
    }
  }

  // Non-efficient : Linearize A Generic Tree
    public static void linearizeApproach1(Node node){

    for(Node child: node.children){
      linearize(child);
    }
    
    // post
    while(node.children.size() > 1)
    {
        Node lastChild = node.children.remove(node.children.size() -1);
        Node secondChild = node.children.get(node.children.size() -1);
        Node secondLastChildTail = getTail(secondChild);
        secondLastChildTail.children.add(lastChild);
    }
  }
  
  public static Node getTail(Node node)
  {
      while(node.children.size() == 1)
      {
        node = node.children.get(0);
      }
      
      return node;
  }

    //Efficient Approach Linearize A Generic Tree
    public static Node linearizeApproach2(Node node){

      if(node.children.size() == 0)
      {
        return node;
      }

      Node lastNodetail = linearizeApproach2(node.children.get(node.children.size() - 1));
    
    while(node.children.size() > 1)
    {
        Node lastChild = node.children.remove(node.children.size() -1);
        Node secondChild = node.children.get(node.children.size() -1);
        Node secondLastChildTail =  linearizeApproach2(secondChild);
        secondLastChildTail.children.add(lastChild);
    }
    return lastNodetail;
  }

  // Find In Generic Tree
  public static boolean find(Node node, int data) {
    if(node.data == data)
    {
        return true;
    }
    
    for(Node child : node.children)
    {
        boolean result = find(child, data);
        if(result)
        {
            return true;
        }
    }
    return false;
  }

   // Node To Root Path In Generic Tree
   public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    if(node.data == data)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(node.data);
        return al;
    }
    
    for(Node child : node.children)
    {
         ArrayList<Integer> pathTillChild = nodeToRootPath(child, data); 
         if(pathTillChild.size() > 0)
         {
             pathTillChild.add(node.data);
             return pathTillChild; 
         }
    }
    return new ArrayList<>();
 }

   // Lowest Common Ancestor (generic Tree)
   public static int lca(Node node, int d1, int d2) {
      
      ArrayList<Integer> p1 =  nodeToRootPath(node, d1); // path1
      
      ArrayList<Integer> p2 =  nodeToRootPath(node, d2); // path2
      
      int i = p1.size() - 1;
      int j = p2.size() - 1;
      
      while(i >= 0 && j >= 0 && p1.get(i) == p2.get(j))
      {
          i--;
          j--;
      }
      // first unequal element found by incrementing
      i++;
      j++;
      
      return p1.get(i);
  }

  // Distance Between Two Nodes In A Generic Tree
    public static int distanceBetweenNodes(Node node, int d1, int d2) {
    ArrayList<Integer> p1 = nodeToRootPath(node, d1);
    ArrayList<Integer> p2 = nodeToRootPath(node, d2);

    int i = p1.size() - 1;
    int j = p2.size() - 1;

   while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
      i--;
      j--;
    }
    i++;
    j++;
    
    return i+j;
  }

  // Are Trees Similar In Shape
  public static boolean areSimilar(Node n1, Node n2) {
      if(n1.children.size() != n2.children.size())
      {
          return false;
      }
      
      for(int i = 0 ; i < n2.children.size() ; i++)
      {
          Node c12 = n2.children.get(i);
          Node c13 = n1.children.get(i);
          
          if(areSimilar(c12, c13) == false)
          {
              return false;
          }
      }
      return true;
  }

    // Are Trees Mirror In Shape
    public static boolean areMirror(Node n1, Node n2) {
    if (n1.children.size() != n2.children.size())
    {
        return false;
    }
    
    for(int i = 0 ;  i < n2.children.size() ; i++)
    {
        int j = n2.children.size() - 1 - i;
        Node c2 = n2.children.get(i);
        Node c1 = n1.children.get(j);
        
        if(areMirror(c1, c2) == false)
        {
            return false;
        }
    }
    return true;
  }

  // Is Generic Tree Symmetric using mirror code snippet
    public static boolean IsSymmetric(Node node) {
      // if mirror image then symetric always
    return areMirror(node,node);
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
  
  static int size;
  static int max;
  static int height;
  static int min;
  public static void multiSolver(Node node, int depth)
  {
    size++;
    max = Math.max(max,node.data);
    min = Math.min(min,node.data);
    height = Math.max(depth, height);

    for(Node child: node.children){
      multiSolver(child, depth + 1);
    }

  }

   public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);

    size = 0;
    height = 0;
    max = Integer.MIN_VALUE;
    min = Integer.MAX_VALUE;

    multiSolver(root);

    // display(root);
    System.out.println(root, 0);
    // stack parameters changes as level changes example in depth
    System.out.println("Minimum " + min);
    System.out.println("Maximum " + max);
    System.out.println("Size " + size);
    System.out.println("Height " + height);

  }




