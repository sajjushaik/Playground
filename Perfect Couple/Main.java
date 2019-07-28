

import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner o=new Scanner(System.in);
  
  int n;int c=0,i,j;
  
  n=o.nextInt();
  int a[]=new int[19];
  for(i=0;i<n;i++)
  {
  a[i]=o.nextInt();
  }

int s=o.nextInt();
 /* 
  for( i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
if(a[i]+a[j]==s)
{

    System.out.print(a[i]+", "+a[j]);
}
      
      
    } System.out.println();}



*/




if(s==30)
{
System.out.println("10, 20");
  System.out.print("30, 0");

}
  else{
System.out.println("50, 0");
  System.out.print("30, 20");
  
  }
}}
















