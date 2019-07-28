import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
int n;
      Scanner o=new Scanner(System.in);
      n=o.nextInt();
      int s=square(n);
      System.out.println(s);
	} 
  
  public static int square(int n)
  {
  int n1=n,i=1,s=0;
  while(i<=n1)
  {
  s=s+i;
    i++;
  }return s;
  }
}