
/**
 *
 * @author kunal sharma
 * Ide Netbeans
 */

public class Producer_consumer

{
    public static void main(String args[])
            
    {
        Queue Queue = new Queue ();      // Object creation 
        new Producer(Queue);             //  Producer Initialization
        new Consumer(Queue);             //  Consumer Initialization
        
    }
} 


 class Queue {
    
    int num ;                                   // Variable declare
    boolean vset = false;
    public synchronized void put(int num) 	// put method for setting the value
    {
     while(vset)
         
     {
         try
         {
             wait();			        // Waiting for a specific time 
         }
         catch(Exception e)
         {
             
         }
     }
     
         System.out.println("Put " + num);
         this.num=num;
         vset=true;
         notify();			         // Notify thread to comeback from wait
     }
    
    public synchronized void get(int num)        // get method for return the value
    {
     while(!vset)
         
     {
         try
         {
             wait();          		       // Waiting for a specific time 
         }
         catch(Exception e)
         {
             
         }
     }
     
         System.out.println("Get " + num);
         this.num=num;
         vset=false;
         notify();
     }
         
    }
    
class Producer implements Runnable     // Here we are producing the values
{
   Queue Queue;
   public Producer(Queue Queue)
           
   {
       this.Queue=Queue;
       Thread t = new Thread(this, "Producer");
               t.start();
   }
   public void run()
   {
       int i = 0;
       while(true)
       {
           Queue.put(i++);
           try
           {
               Thread.sleep(100);              // 100ms producing
           }
               catch(Exception e)
               {
                   
               }
       
   }
    
}
}
class Consumer implements Runnable      // Here we are consuming the values
{
      Queue Queue;
   public Consumer(Queue Queue)
           
   {
       this.Queue=Queue;
       Thread t = new Thread(this, "Consumer");
               t.start();
   }
   public void run()
   {
       int i = 0;
       while(true)
       {
           Queue.get(i++);
           try
           {
               Thread.sleep(150);                // 150ms Consuming
           }
               catch(Exception e)                   
               {
                   
               }
       
   }
    																	   
}
}
/* You can change time as per requirement
 it will does fall in infinite loop
it will does fall in infinite loop .
* /
