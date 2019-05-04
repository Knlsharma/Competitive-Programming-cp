class Node
{
	int data;
	Node next;

	}
class queueimpl
{
	static Node top;
	static int size;
	static Node front = null;
	static Node rear = null;
	static Node head;
	
	static void push(int data)
	{

	
	// 45 -> 65 -> 87 -> 69
	
	//	if (head = null || head.next == null)
		//	 return ;
	 
	   
		
		
				Node nw =new Node();
				nw.data =data;
				nw.next =null;
				
				 nw.next = rear;
				rear = nw;
				
		
		
		
	 
		
		 
		 size++;
	}
	static void display()
	{
		Node t = rear;
		while(t != null)
		{
			
			System.out.print(t.data + ",");
			t=t.next;
		
		
	}
	}
	
	static void pop()
	
	{        //  65->87->69
	    
		Node temp = rear;		
		
		if (temp.next != null) {
         temp = temp.next;
      System.out.println("Element deleted from queue is :" + front.data);
      front = null;
      front = temp;
   } else {
      System.out.println("Element deleted from queue is : " + front.data);
      front = null;
      front = null;
      rear = null;
   }
		
		
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
		push(45);
		push(65);
		push(87);
		push(69);
		// display();
		pop();
		// Top();
	//	Size();
		
		
		
		display();
		
	}
	
}
