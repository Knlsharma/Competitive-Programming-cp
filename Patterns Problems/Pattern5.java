		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	




import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int spaces = n/2;
        
        int star = 1;
        
        for(int row = 1 ; row <= n ; row++)
        {
            
            for(int col = 1 ; col <= spaces ; col++)
            {
                System.out.print("\t");
            }
            
            for(int col = 1; col <= star ; col++)
            {
                System.out.print("*\t");
            }
            
            if(row <= n/2)
            {
            star+=2;
            spaces--;   
            }
            else
            {
            star-=2;
            spaces++; 
            }
            
            System.out.println();
        }
        
        

    }
}
