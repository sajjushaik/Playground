import java.util.Scanner;
class Main{
   public static void main (String[] args) {
   int n;
   Scanner o=new Scanner(System.in);
   n=o.nextInt();
   int rev=0,d1,d3,r;
	   while(n>0) {
	    	  r=n%10;
	    	  rev=rev*10+r;
	    	  n=n/10;
	      }
	      
	      d1=rev%10;                //first digit
	      d3=((rev/100)%10);       //third digit
	      System.out.println(d3+d1);
		
	}
}
