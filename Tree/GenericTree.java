

// on basis of edges (Not on basis of nodes)
  public static int height(Node node) {
    // write your code here
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
    // write your code here
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

  
  public static void levelOrderLinewise(Node node) {
        
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
