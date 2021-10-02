1	
2	3	
4	5	6	
7	8	9	10	
11 12 13 14	15	


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        int val = 1;
        
        for(int row = 1 ; row <= n ; row++)
        {
            for(int col = 1 ; col <= row ; col++)
            {
                System.out.print(val +"\t");
                val++;
            }
             System.out.println();
        }

    }
}
