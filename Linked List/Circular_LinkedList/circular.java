class Node
{
int data;
Node next;
}


class circular
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
System.out.println("," + node.data);
node = node.next;
}
System.out.println("," + node.data);
}


public static void circularcall()
{
Node node = head;
while(node.next!=null)
{
node=node.next;
}
head.next=node;

}


public static void main(String args[])
{

	insertAtEnd(18); // 0th object
	insertAtEnd(45);  // 1st object
	insertAtEnd(12);    // 2nd object
	insertAtEnd(45);      // 3rd object
        show();
       System.out.println("befor circular "); 
        circularcall();
          show();
       

}
}