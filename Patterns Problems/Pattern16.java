
1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     
     int space = 2*n -3;
     int star = 1;
     int val = 1;
     for(int i = 1 ; i <= n ; i++)
     {
         for( int j = 1 ; j <= star ; j++)
         {
            System.out.print(val + "\t");
            val++;
         }
         
        for( int j = 1 ; j <= space ; j++)
        {
            System.out.print("\t");
        }
        if( i == n)
        {
            star--;
            val--; // extra decrement needed
        }
        for( int j = 1 ; j <= star ; j++)
        {
            val--;
            System.out.print(val + "\t");
            
        }
        
        star++;
        space-=2;
        System.out.println();
     }

 }
}
