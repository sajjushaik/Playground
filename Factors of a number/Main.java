import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner o=new Scanner(System.in);
      int n,i;
      n=o.nextInt();
      for(i=1;i<=n;i++)
      {
      if(n%i==0)
      {
      System.out.println(i);
      }
      }
      
      
      
      
	}
}