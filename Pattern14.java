
like x * 1 ...10 = x, 2x , 3x ...10x
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int x = scn.nextInt();
        
        for( int i = 1 ; i <= 10 ; i++)
        {
            int ans  = x * i;
            System.out.println(x + " * " + i + " = " + ans);
        }

    }
}
