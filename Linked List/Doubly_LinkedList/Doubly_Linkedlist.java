// Doubly Linked List Implementation Full code

class Node
{

int data;
Node next;
Node prev;
}
 
 class Doubly_LinkedList
 {
 
 static Node head;
 
 static void insertAtHead(int data)
 {
 Node x =new Node();
 x.data=data;
 x.next=null;
 x.prev=null;
 
 if(head == null)
   {  head = x;
   }
   else
   { 
head.prev=x;
x.next=head;
head=x;   
   
   }
 }
 
 static void showAll()
 {
 Node n = head;
 while(n.next!=null)
 {
 System.out.print( " " + n.data);
 n=n.next;
 
 }
 System.out.print(","+ n.data);
 System.out.println();
 System.out.print("Reverse path is");
 
 while( n!=null)
	 
	 {
		  System.out.print(" ," + n.data);
		  n=n.prev;
		 
	 }
	 
 }
 
	 
	 static void insertAtLast(int data)
 {
 Node x =new Node();
 x.data=data;
 x.next=null;
 x.prev=null;
 
 if(head == null)
   {  head = x;
   }
   else
   { 
	 Node n = head;
	 while(n.next!=null)
	 {
		n=n.next;
				 
	 }
	 
	 n.next=x;
	 x.prev=n;
	 x.next=null;
	 
 
   } 
 }
  static void insertAtPos(int data,int pos)
 
 {
	 
	
	 
      Node x =new Node();
 x.data=data;
  x.next=null;
  x.prev=null;
 
 if(head == null)
   {  insertAtHead(data);
   }
   else
   { 	

Node n = head;
for(int i=0; i < pos-1;i++)
{
	n=n.next;
	
}
      
     x.next=n.next;
	n.next=x;
	x.prev=n;
	 if(x.next!=null)
	 {
	 x.next.prev=x;
	 }
	 
 }
 
 }
 
 
 
 
 
 
 
 public static void main(String args[])
 {
  insertAtHead(45);
 insertAtHead(56);
  insertAtHead(55);
   insertAtHead(66);
    insertAtHead(455);
insertAtLast(653);     // 653
insertAtLast(6556);   //  653-> 6556 
insertAtLast(577);	 // 653-> 6556 -> 577
insertAtPos(12,1);
insertAtPos(16,3);


 showAll();
 
 
 
 
 }
 
 
 }
 