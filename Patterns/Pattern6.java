*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int space = 1;
        
        int star = n/2 + 1;
        
        for(int row = 1 ; row <= n ; row++)
        {
        
            for(int col = 1; col <= star ; col++)
            {
                System.out.print("*\t");
            }
            
            for(int col = 1 ; col <= space ; col++)
            {
                System.out.print("\t");
            }
            
            for(int col = 1; col <= star ; col++)
            {
                System.out.print("*\t");
            }
            
            if(row <= n/2)
            {
                star--;
                space+=2;
            }
            else
            {
                star++;
                space-=2;
            }
            
            System.out.println();
        }

    }
}
