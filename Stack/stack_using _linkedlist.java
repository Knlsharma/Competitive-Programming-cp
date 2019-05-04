class Node
{
	int data;
	Node next;
	

	
}
class stack_using_linkedlist
{
	static int top;
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
		 
		 
	}
	static void display()
	{
		Node t = head;
		while(t)
		{
			
			System.out,print(t.data + ",");
			t=t.next;
		
		
	}
	
	
	
	
	
	public static void main(String args [])
	{
		insert(45);
		insert(65);
		insert(87);
		display();
		
		
		
	}
	
}
