class stack
{
static int top=0;
static int arr[]=new int[6];


public static void push(int data)
{

if(top==5)
{
System.out.println("Stack is full");
}
else
{
arr[top]=data;
top++;
}
}

static int pop()
{
if(isEmpty())
{
System.out.println("Underflow");
}

top--;
int data = arr[top];
arr[top]=0;
return data;

}


static int peek()
{
int data = arr[top-1];
return data;
}

static int size()
{
return top;
}

static boolean isEmpty()
{
return top<=0;

}




public static void main(String args[])
{

push(5);

push(66);
push(9);
push(9);
push(9);
push(9);

System.out.println(peek());


System.out.println(pop());
System.out.println(pop());
System.out.println(pop());
System.out.println(pop());
System.out.println(pop());

System.out.println("is this Empty "+ isEmpty());
System.out.println();

System.out.print("size is"+ size());

System.out.println(); 

for(int n : arr)
{
System.out.print(n + " ");
}

}
}
