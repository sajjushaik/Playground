import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      
      
      int i,n,s=0;


   Scanner in = new Scanner(System.in);	
      n=in.nextInt();
   for(i=1;i<=n;i++){
   s=s+i;
   }
      System.out.println(s);
	}
}