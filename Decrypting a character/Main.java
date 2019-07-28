import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner o=new Scanner(System.in);
      
    char ch = o.next().charAt(0);
    int k=o.nextInt();
    if((ch>='a'&&ch<='z'))
    {
    ch=(char)(ch+23);
    }
    else if(ch>='A'&&ch<='Z'){
    ch=(char)(ch-2);
    
    }
    System.out.println(ch);
  
  }
}