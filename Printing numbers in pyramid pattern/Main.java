import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner scanner = new Scanner(System.in);
      
              int n = scanner.nextInt();

      int l=0;
      for (int i = 1; i < n+1; i++) 
      {
        
        for (int j = 0; j < n - i; j++)
      { System.out.print(" "); }
       for ( int k = 1; k <= i; k++) 
       {  l++;
         System.out.print(l + " "); 
      
       } 
       System.out.println(); }

    }    
}