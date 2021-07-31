
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
