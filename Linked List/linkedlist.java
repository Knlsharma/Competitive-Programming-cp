// singly linked list 

class linkedlist
{
int data;

Node head,node,next;



public void insert(int data)
{


Node n= new Node();
n.data=data;
n.next=null;

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


public void show()
{

Node node = head;	
while(node.next!=null)
{
System.out.println(node.data);
node = node.next;
}
System.out.println(node.data);
}


public static void main(String args[])
{

	insert(18);
	insert(45);
	insert(12);
         show();

}
}

