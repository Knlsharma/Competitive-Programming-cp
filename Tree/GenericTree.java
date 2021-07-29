
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

