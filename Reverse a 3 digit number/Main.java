import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
int n,n1,n2,n3;
    Scanner o=new Scanner(System.in);
    n=o.nextInt();
    n1=n;
    n2=n;
    n3=n;
    n1=n1/100;
    n2=((n2%100)/10);
  n3=n3%10;
    int n4=(n3*100)+(n2*10)+n1;
    System.out.println(n4);
  }
}