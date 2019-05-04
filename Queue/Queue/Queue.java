class queue
{

int size,front,rear;

int x[] = new int[7];

public void enqueue (int data)
{
if(!isFull())
{
x[rear]=data;
rear =(rear + 1) % 7;
size++;
}

else
System.out.println("FULL");
}

public  void show()
{
for(int i=0;i<size;i++)
{
System.out.println("Element is" + x[(front+i)%7]);

}
}

public void dequeue ()
{

if(!isEmpty())
{
int data=x[front];
front =(front + 1) % 7;
System.out.println("deleted is" + x[(front)%7]);
size--;
}

else
{
System.out.println("empty");
}


}

public int getsize()
{
System.out.println("Size is" + size);
return size;
}


public boolean isEmpty()
{
return size==0;
}

public boolean isFull()
{
return size==5;
}


public static void main(String args[])
{


// enqueue - Insertion
// dequeue - Deletion


queue k =new queue();


k.enqueue(5);
k.enqueue(6);
k.enqueue(7);

k.enqueue(51);
k.enqueue(61);
k.enqueue(71);
k.dequeue();
k.dequeue();

k.show();
k.getsize();
System.out.println(k.isEmpty());
System.out.println(k.isFull());

}
}
