import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  int n1,n2,n3;
      Scanner o=new Scanner(System.in);
      n1=o.nextInt();
       n2=o.nextInt();
       n3=o.nextInt();
     big(n1,n2,n3); 
    }
      
      public static void big(int n1,int n2,int n3)
  {
        int min=0;  int g=0;    
   if(n1<n2&&n1<n3)
       {
   
min=n1; }
    
   else if(n2<n1&&n2<n3)
     {
   
   min=n2;
    }
    
    else
        {
 min=n3;}
  
   
 while(min>=1)
   
 {
 if((n1%min==0)&&(n2%min==0)&&(n3%min==0))
 {
   g=min;
   System.out.println(g); 
   break;
 }
 
 min--;
 }
    
  
  
  
  
  
  
  
  
      
}}