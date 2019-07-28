import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner o=new Scanner(System.in);
    
    String s=o.nextLine();
    int l=s.length();
  
    int m=(l/2);
    
    int i,j,k;
    for(i=1;i<=l;i++)
    {
    for(j=0;j<l-i;j++)
    {
    System.out.print(" ");
    
    }int c=0;
      int l1=l;
      
    for(k=1;k<=i;k++)
    {
      if(m<l){
    System.out.print(s.charAt(m));
    m++;
    }
      else{
      m=0;
        System.out.print(s.charAt(m));
      m++;
      }
      
    }m=l/2;
      
      System.out.println();
    }
    
  }
}