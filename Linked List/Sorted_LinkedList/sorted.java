		class sorted
		{
			
		static class Node
		{

		int data;
		Node next;

		}

		static Node head;

		static void insert(int data)
	{
		Node nw = new Node();
		nw.data = data;
		nw.next = null;
		
		 
		 if(head == null || head.data >= nw.data)
		 {
			 
			 nw.next = head;
			 head = nw;
		 }
		
		 else 
		 {
			 Node  n = head;
			 while (n.next != null && n.next.data <= nw.data)
			 {
				   n = n.next;
			 }
			 
			 nw.next = n.next;
			 n.next = nw;
	 
		 }
		 
		
		
	}

    static void display()
	{
		Node t = head;
		while ( t != null)
		{
			System.out.print("," + t.data);
			t=t.next;
			
		}
		
	}
	
	static void deleteAtBeg()
	{
		Node p = head;
		head = head.next;
		p = null;
		
	}
	
	static void deleteAtEnd()
	{
		Node k = head;
		while(k.next.next != null)
		{
			k =k.next;
			
		}
		
		k.next =null;
		display();
		
		
	}
	



public static void main(String args[])
 {
	 insert(54);
	 insert(14);
	 insert(64);
	 insert(34);
	 insert(24);
	 display();
	 deleteAtBeg();
	 //   deleteAtEnd();
	 System.out.println();
	 display();
	 System.out.println();
	 deleteAtEnd();
 }
}
