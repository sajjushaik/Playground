import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    
    int i,s=1;
    for(i=1;i<=n;i++)
    {s=s*i;
    }
      System.out.print(s);
}
}