import java.util.Scanner;
class Main{
	public static void main (String[] args){
      
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();
        int k=n;
      int m=n+1;
      
        for (int i = n; i>=1; i--){k=--m;;
        for(int j=1;j<=i;j++){
            
                System.out.print(k);k--;
        }    System.out.println();
        }
      
      
	   
	}
}