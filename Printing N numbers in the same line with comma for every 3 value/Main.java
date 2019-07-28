import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner o=new Scanner(System.in);
    int n,i;
    n=o.nextInt();
    for(i=1;i<=n;i++)
    {if(i%3==0)
    {
    
System.out.print(i+",");
    }else
System.out.print(i);}
    
  }
}