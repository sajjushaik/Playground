import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		
  		Scanner in = new Scanner(System.in);
  		int n;
      n=in.nextInt();
      int i,j,k=0;
      
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(k==0)
          {System.out.print("*");
          k=1;
          }
          else{
          System.out.print("#");
            k=0;
          }
          
        }System.out.println();}
    }
}