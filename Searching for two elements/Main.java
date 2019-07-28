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
      n1=o.nextInt();
        n2=o.nextInt();
      int y=0;int z=0,c=0,j=0,k=0,i;
      for( i=0;i<5;i++)
        
      {
      if(a[i]==n1) {j=i;
 c++;    
      }
      
      else if(n2==a[i]){
  z++;   k=i;}
   
      }if((c>0)&&(z==0))
      {
      System.out.println(j);
 System.out.println("-1");
   
    }
      else{
        
   System.out.println(j);
 System.out.println(k);
        
        
      }
    
    
    }
      
      
      
      
    }
