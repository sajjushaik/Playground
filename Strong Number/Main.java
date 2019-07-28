
import java.util.Scanner;
class Main{
	public static void main (String[] args){

         Scanner o=new Scanner(System.in);
      int n,ne,i,f=1;
      n=o.nextInt();
      ne=n;
      int x,s=0;
      while(n>0)
      {f=1;
       x=n%10;
            for(i=1;i<=x;i++)
      {f=f*i;
      }s=s+f;
        n=n/10;}
               
      if(ne==s)
        System.out.println("Yes");
    else
        System.out.println("No");
        
        
      }
      
	}
