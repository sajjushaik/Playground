

import java.util.Scanner;
class Main
{
 public static void main(String args[])  
 {int n0,n1;
 Scanner o=new Scanner(System.in);
   n0=o.nextInt();

 b(n0);

 }
 public static void b(int n1)
 {int c=0;
 for(int i=2;i<=n1;i++)
   {c=0;
 for(int j=1;j<=n1;j++)
 {
   if(i%j==0)
   {
     c++;
   }
 } if(c==2)
 {System.out.println( i);}
 
  }
 
 }
  
}
 
 
 
