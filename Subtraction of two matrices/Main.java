import java.util.*;
class Main
{
  public static void main(String args[])
  {
Scanner o=new Scanner(System.in);
   int r=o.nextInt();
    int c=o.nextInt();
    int a[][]=new int[10][10];
     int b[][]=new int[10][10];
    int i,j;
    for(i=0;i<r;i++)
    {
    for(j=0;j<c;j++)
    {
    a[i][j]=o.nextInt();
    }
    }
    for(i=0;i<r;i++)
    {
    for(j=0;j<c;j++)
    {
    b[i][j]=o.nextInt();
    
    
    }
    
    }
for(i=0;i<r;i++)
    {
    for(j=0;j<c;j++)
    {
    System.out.print(a[i][j]-b[i][j]+" ");
    
    }System.out.println();
    
    }
  
  
  }
}
