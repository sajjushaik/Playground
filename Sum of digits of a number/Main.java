import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int r, n, rev = 0, fd, ld;
      Scanner o=new Scanner(System.in);
	n=o.nextInt();
int s=0;
        while (n > 0) {
            r = n % 10;
          s=s+r;
           n=n/10; 
          
                 } 
      
      System.out.println(s);
	}
}