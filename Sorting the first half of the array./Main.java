import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    
    int a[]=new int[100];
    Scanner o=new Scanner(System.in);
    int n=o.nextInt();
    int i,j;
    for(i=0;i<n;i++)
    {
    a[i]=o.nextInt();
    }
   
    for(i=0;i<n;i++){
    for(j=i+1;j<=(n/2)-1;j++)
    {
      if(a[i]>a[j]){
    int t=a[i];
      a[i]=a[j];
      a[j]=t;
    }
   }}
    
    for(i=0;i<n;i++){
      
      
      System.out.print(a[i]+" ");
      }
    
  }
}