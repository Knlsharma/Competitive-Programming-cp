// singly linked list 

class Node
{
int data;
Node next;
}


class linkedlist
{
static Node head;

public static void insertAtEnd(int data)
{


Node node= new Node();
node.data=data;
node.next=null;

if(head==null)
{
head = node;
}
else
{
Node n = head;
while(n.next!=null)
{
n = n.next;
}
n.next =  node;

}

}


public static void show()
{

Node node = head;	
while(node.next!=null)
{
System.out.println(node.data);
node = node.next;
}
System.out.println(node.data);
}

public static void insertAtStart(int data)
{
Node node= new Node();
if(head==null)
{
Node head = node;
}

node.data=data;
node.next=null;
node.next=head;
head=node;
}


public static void insertInBetween(int data, int index)
{

Node node= new Node();

node.data=data;
node.next=null;
if(index==0)
{
insertAtStart(data);
}
else
{
Node n=head;
for(int i=0;i<index-1;i++)
{
n=n.next;
}
node.next=n.next;
n.next=node;
}
}

public static void deleteAt(int index)
{
if(index==0)
{
head = head.next;
}
else
{
Node n = head;
Node n1 = null;
for(int i=0;i<index-1;i++)
{
n = n.next;
}
n1 = n.next;
n.next = n1.next;
System.out.println("n1 " + n1.data);
n1 = null;
		}
	}
	
public static void deleteFromEnd()
{
Node n=head;
while(n.next!=null)
{ 
System.out.println(n.data);
n=n.next;
}
System.out.println(n.data);
}

public static void main(String args[])
{

	insertAtEnd(18); // 0th object
	insertAtEnd(45);
	insertAtEnd(12);
	insertAtEnd(45);
	insertAtEnd(76);
	insertAtStart(4556);
        insertInBetween(65,1);
	deleteAt(3);
	deleteFromEnd();
	 // deleteFromStart();
         show();

}
}


