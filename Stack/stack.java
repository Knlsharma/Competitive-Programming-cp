class stack
{
static int top=0;
static int arr[]=new int[12];
static int size=0;
public static void push(int data)
{

if(isFull())
{
System.out.println("Stack is full");
}
else
{
arr[top]=data;
top++;
size++;
}
}

static int pop()
{
if(isEmpty())
{
System.out.println("Underflow");
return 1;
}
else
{
top--;
int data = arr[top];
arr[top]=0;

size--;
System.out.println("The deleted element was " + data);
return data;

}
}


static int peek()
{
int data = arr[top-1];
return data;
}

static int size()
{
return size;
}

static boolean isEmpty()
{
return top<=0;

}

static void show()

{
    for( int k : arr) System.out.print(" "+ k);
}


static boolean isFull()
{
    if(size==top)
    {
       System.out.println("Its full");
       return false;
    }  
    else{
        return true;  
        
    }
}
static void pushMany(String var)
{
    String[] temp= var.split(" ");
    for(int l = 0; l < temp.length; l++)
    {
        push(Integer.parseInt(temp[l]));
}


}


public static void main(String args[])
{

push(5);

push(66);
push(9);
push(9);
push(9);
push(9);

pop();
pop();

    System.out.println("The size is "+ size());
  
    System.out.println();
    System.out.println(" The current top is " + (top-1)  + " And data is " + peek());
    
    pushMany("3 5 7 9");
    show();


}
}
