	  1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int spaces = n / 2;
        int stars = 1;
        int val = 1;
        for(int i = 1 ; i <= n ; i++)
        {
    
        
        for( int j = 1 ; j <= spaces ; j++)
        {
           System.out.print("\t");
        }

        int cval = val;
       for( int j = 1 ; j <= stars ; j++)
        {
           System.out.print(cval + "\t");
        //   cval++;
           
           if(j <= cval /2)
           {
             cval++;  
           }
           else
           {
               cval--;
           }
           
        }
        
        
        if( i <= n / 2)
        {
          stars+=2;
          spaces--;
          val++;
        }
        else
        {
          stars-=2;
          spaces++;
          val--;
        }
        
        System.out.println();
        }
        
    }
}
