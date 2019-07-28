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
   if(n1>n2&&n1>n3)
   {
   
   System.out.println(n1);}
    
   else if(n2>n1&&n2>n3)
   {
   
   System.out.println(n2);}
    
    else
    {
   System.out.println(n3);}
  }
      
      
      
      
      
	}
