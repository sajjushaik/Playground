import java.util.Scanner;
class Main{
    public static void main(String args[]){
      
      int n1,n2,n;
      Scanner o=new Scanner(System.in);
      n=o.nextInt();
        int a[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
      a[i]=o.nextInt();
      }
      int m=a[0];
      for(int i=1;i<n;i++)
      {
      if(m<a[i])
        
      {
      m=a[i];}
      }
      
      
      
      
      
      
      
      
      System.out.println(m);
      
      
      
      
      
    }}