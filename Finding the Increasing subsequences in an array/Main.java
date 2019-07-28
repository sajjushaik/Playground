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
   int k;
    for(i=0;i<n;i++){
    for(j=1;j<n;j++)
    {
      if(a[i]<a[j]){
     
        System.out.println(a[i]+","+a[j]);

      }
   }}
    
        
  }
}