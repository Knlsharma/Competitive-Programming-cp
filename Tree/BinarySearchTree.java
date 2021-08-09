
class BST {

class Node
{
	int data;
	Node left;
	Node right;

	public Node(int data, Node left, right)
	{
		this.data = data;
		this.left = left;
		this.right = right;
	}	
}

public static Node construct(int[] arr, int lo, int hi) {

	if( lo > hi)
	{
		return null;
	}
	int mid = (lo + hi) / 2;

	int data = arr[mid];

	Node lc = construct(arr, lo, mid-1);
	Node rc = construct(arr, mid+1, hi);

	Node newNode = new Node(data, lc, rc);
	return newNode

}

 public static int size(Node node) {
    if (node == null)
    {
      return 0;
    }

    int leftSize = size(node.left);
    int rightSize = size(node.right);
    return leftSize + rightSize + 1;
  }

  public static int sum(Node node) {
    if (node == null)
    {
      return 0;
    }

    int leftSum = sum(node.left);
    int rightSum = sum(node.right);
    return leftSum + rightSum + node.data;
  }

  public static int max(Node node) {
    if (node.right != null)
    {
      return max(node.right);
    }
    else
    {
      return node.data;
    }
  }

  public static int min(Node node) {
    if (node.left != null)
    {
      return min(node.left);
    }
    else
    {
      return node.data;
    }
  }

  
  public static boolean find(Node node, int data) {
   if(node == null)
   {
       return false;
   }
   
   if(data > node.data)
   {
      return find(node.right, data);
   }
   else if(data < node.data)
   {
       return find(node.left, data);
   }
   else
   {
       return true;
   }
  }

  // Add Node To Bst
    public static Node add(Node node, int data) {
   if(node == null)
   {
       return new Node(data, null, null);
   }
   
   if(data > node.data)
   {
      node.right =  add(node.right, data);
   }
   else if(data < node.data)
   {
     node.left =  add(node.left, data);
   }
   else
   {
       // nothing to do
   }
   return node;
  }


// Remove Node From Bst
    public static Node remove(Node node, int data) {
    if (node == null)
    {
      return null;
    }

    if (data > node.data)
    {
      node.right = remove(node.right, data);
    }
    else if (data < node.data)
    {
      node.left = remove(node.left, data);
    }
    else
    {
      if (node.left != null && node.right != null)
      {
        int lmax = max(node.left);
        node.data = lmax;
        node.left = remove(node.left, lmax);
        return node;
      }
      else if (node.left != null)
      {
        return node.left;
      }
      else if (node.right != null)
      {
        return node.right;
      }
      else
      {
        return null;
      }
    }
    return node;
  }

  // Replace With Sum Of Larger
    // reverese in order
  // travel and change property
  static int sum = 0;
  public static void rwsol(Node node){
      
      if(node == null)
      {
          return;
      }
      rwsol(node.right);
      int od = node.data;
      node.data = sum;
      sum += od;
      rwsol(node.left);
  }

  // Lca Of Bst

  public static int lca(Node node, int d1, int d2) {
      if(d1 < node.data && d2 < node.data)
      {
          return lca(node.left, d1, d2);
      }
      else if(d1 > node.data && d2 > node.data)
      {
          return lca(node.right, d1, d2);
      }
      else
      {
          return node.data;
      }
  }


// Print In Range
  public static void pir(Node node, int d1, int d2) {

    if (node == null)
    {
      return;
    }
    if (d1 < node.data && d2 < node.data)
    {
      pir(node.left, d1, d2);
    }
    else if (d1 > node.data && d2 > node.data)
    {
      pir(node.right, d1, d2);
    }
    else
    {
      pir(node.left, d1, d2);
      System.out.println(node.data);
      pir(node.right, d1, d2);;
    }
  }

  //   Target Sum Pair In Bst - approach1
  // O(nlogn)
   public static void travelAndPrint(Node root ,Node node , int target)
   {
       
       if(node == null) {
           return;
       }
       
       travelAndPrint(root, node.left, target);
       int comp =  target - node.data;
       if(node.data < comp)
       {
       if(find(root, comp))   //O(logn)
       {
           System.out.println(node.data + " " + comp);
       }    
       }
       
       travelAndPrint(root, node.right, target);
       
   }

   // 2 pointer apporach using array   - approach2
  // T : O(n) + o(n) : return list + 2 pointer iterative approach == O(n)
   public static ArrayList<Integer> travelAndPrint2(Node root , ArrayList<Integer> list)
   {
       
       if(node == null) {
           return;
       }
       
       travelAndPrint2(node.left, list);
       list.add(node.data);
       travelAndPrint2(node.right, list);

       return list;
       
   }


}