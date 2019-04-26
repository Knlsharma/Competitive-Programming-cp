// singly linked list 

class Node
{
int data;
Node next;
}


class linkedlist
{
static Node head,prev;
static int size;

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
size++;
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
size++;
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
size++;
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
size--;
}
	}
	
public static void deleteFromEnd()
{
Node n=head;

while(n.next!=null)
{ 
prev=n;
System.out.println("prev is" + prev.data);
System.out.println(n.data);
n=n.next;
}

prev.next=null;
// n.next=null;
System.out.println("deleted node is" + n.data);
size--;
}




public static  void size()
{

System.out.println("The size is" + size);


}


public static void search(int x)
{
Node n =head;

while(n.data!=x)
{
n=n.next;
}

System.out.println("data found at" + n.data);

}


public static void reversedTraversal()
{
Node prevt=null;
Node next1;
Node cur = head;
while(cur!=null)
{

next1=cur.next;
cur.next=prevt;
prevt=cur;
cur=next1;
}
head=prevt; 
show();
}



public static void sort()
{
    Node ptr ,pt2;
    
    for (ptr = head; ptr.next != null; ptr = ptr.next)
    
    {
        for( pt2=ptr.next;pt2!=null;pt2=pt2.next)
        
        {
            if(pt2.data < ptr.data)
             {
             int temp=ptr.data;
             ptr.data=pt2.data;
             pt2.data=temp;
             }
        }
    }
}



public static void main(String args[])
{

	insertAtEnd(18); // 0th object
	insertAtEnd(45);  // 1st object
	insertAtEnd(12);    // 2nd object
	insertAtEnd(45);      // 3rd object
	insertAtEnd(76);         // 4th object
	insertAtStart(4556);        // 5th object
 /*       insertInBetween(65,1);         // 6th object
	deleteAt(3);                      // 7th object
	deleteFromEnd();                     // 8th object
	 // deleteFromStart();                 
         show();
	size();
	search(45);
	reversedTraversal(); */
		sort();
	show();
	

}
}


