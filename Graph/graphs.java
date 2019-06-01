import java.util.*;

class Main

{
   // public void straightMatch(int [] temp)
   // {
        
        
        
   // }
    
    
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);

int x = scan.nextInt();
int y = scan.nextInt();

int[][] arr=new char[x][y];

//printing 2D array  
for(int i=0;i<x;i++){  
 for(int j=0;j<y;j++){  
     
     arr[i][j]="-";
   System.out.print(arr[i][j]+" ");  
 } 
System.out.println(); 
}


//straightMatch(arr);

}
}
