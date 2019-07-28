import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  int n;
    Scanner o=new Scanner(System.in);
    n=o.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=o.nextInt();
    }
 max(n,a);
 
  }  
public static void max(int n,int b[])
{  
int m=b[0];
int k=0,y=0;  
    for(int i=0;i<3;i++)
    {
      k=k+b[i];
      y++;
    }
  if(k==n){
 for(int i=3;i<6;i++)
    { k=0;
      k=k+b[i];
     y++;
    }
          }
  
if(y!=n)
System.out.println("Perfect Batch");
else
System.out.println("Not a Perfect Batch");


}
}
    
  
