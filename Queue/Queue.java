class queue
{

static int size,front,rear;

int[] x = new int[5];

public static void enqueue (int data)
{
x[rear]=data;
rear++;
size++;
}

public static void show()
{
for(int i=0;i<size;i++)
{
System.out.println("Element is" + x[i]);

}
}


public static void main(String args[])
{


// enqueue - Insertion
// dequeue - Deletion





enqueue(5);
enqueue(6);
enqueue(7);

show();


}
}
