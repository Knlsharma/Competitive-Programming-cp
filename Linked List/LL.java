// Simple Linked list Implementation with different inbuilt function calls

import java.util.LinkedList;
import java.util.Iterator;  

public class LL
{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  

System.out.println(al);

al.add(1, "Gaurav");

 LinkedList<String> al2=new LinkedList<String>();  
           al2.add("Sonoo");  
           al2.add("Hanumat"); 

  al.addAll(al2);

// Iterator<String> itr=al.descendingIterator();   for descending iteration 

    Iterator<String> itr=al.iterator();   //  for ascending iteration
  while(itr.hasNext())
{  
   System.out.print(" "+ itr.next());

   }
System.out.println();   
System.out.println("First elemment is "+ al.getFirst()); 
System.out.println("Last elemment is "+ al.getLast());
System.out.println();
al.add(1,"22");
al.pop();
al.remove("22");
System.out.println(al.peekFirst());
System.out.println(al.peekLast());
al.add(0,"Sonoo");

System.out.println(al);


 }  
}  