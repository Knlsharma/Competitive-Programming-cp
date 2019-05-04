class Node
{
	int data;
	Node next;
	

	
}
class stackimpl
{
	static Node top;
	static int size;
	static Node head;
	
	static void insert(int data)
	{
	Node nw =new Node();
	nw.data =data;
	nw.next =null;
	
	// 45 -> 65 -> 87 
	
	//	if (head = null || head.next == null)
		//	 return ;
	 
	
	 
		 nw.next = head;
		 head = nw;
		 
		 size++;
	}
	static void display()
	{
		Node t = head;
		while(t != null)
		{
			
			System.out.print(t.data + ",");
			t=t.next;
		
		
	}
	}
	
	static void pop()
	
	{
		Node n = head;
		head = head.next;
		System.out.println(n.data);
		n = null ;
		size--;
		
		
	}
	
	static void Top()
	
	{
		top = head ;
		
		System.out.println("The top element is " +  top.data);
		
		
	}
	
	static void Size()
	
	{
		System.out.println("The top current size is " +  size);
		
	}
	
	
	
	
	public static void main(String args [])
	{
		insert(45);
		insert(65);
		insert(87);
		// display();
		pop();
		Top();
		Size();
		
		
		
		display();
		
	}
	
}
