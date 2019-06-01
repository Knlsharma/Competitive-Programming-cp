import java.util.*;

class Main

{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

int x = scan.nextInt();
int y = scan.nextInt();

int[][] arr=new int[x][y];

//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 } 

}
}
}
