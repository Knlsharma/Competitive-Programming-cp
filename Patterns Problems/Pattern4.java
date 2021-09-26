*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int spaces = 0;
        
        int star = n;
        
        for(int row = 1 ; row <= n ; row++)
        {
            
            for(int col = 1 ; col <= spaces ; col++)
            {
                System.out.print("\t");
            }
            
            for(int col = star; col >= 1 ; col--)
            {
                System.out.print("*\t");
            }
            
            star--;
            spaces++;
            
            System.out.println();
        }


    }
}
