import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      
int i,n,sum=0;


   Scanner in = new Scanner(System.in);	
      n=in.nextInt();
   for(i=1;i<=n;i++)

   {
     System.out.println (2*i-1);
     sum+=2*i-1;
   }
    
      
	}
}