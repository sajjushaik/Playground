import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      
      int a[]=new int[16];
      Scanner o=new Scanner(System.in);
      int n=o.nextInt();
      int i,j;
      for(i=0;i<n;i++){
      a[i]=o.nextInt();
      }
      int k=o.nextInt();
     int t; 
      int max=a[0];
      for(i=0;i<n-1;i++){
     for(j=0;j<n-i-1;j++)
     {
     if(a[j]<a[j+1]){
     t=a[j];
       a[j]=a[j+1];
       a[j+1]=t;   }}}
      
    
     System.out.println(a[k-1]); 
     
      
      
      
    }   
}
