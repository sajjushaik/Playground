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
int k=0;  
    for(int i=1;i<n;i++)
    {
    if(b[i]>m)
    {
    m=b[i];
      k=i;
    
    }
    }
System.out.println(k);


}
    
  
}