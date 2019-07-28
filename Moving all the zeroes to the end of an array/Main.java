import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner o=new Scanner(System.in);
  
  int n;
int c=0,d1=0;  
  n=o.nextInt();
  
  int a[]=new int[19];
  int cd[]=new int[19];
  int d[]=new int[19];
  
  for(int i=0;i<n;i++)
  {
  a[i]=o.nextInt();
  }
  int y=0,c1=0;
  
  for(int k=0;k<n;k++){
 if(a[k]==0)
 {cd[c1]=a[k];
  c1++;
 c++;
 }
    else{
      d[d1]=a[k];
  d1++;

    y++;
    }  }
  
  d(a,cd,d,c1,d1);

  
  
}
 
public static void d(int a[],int cd[],int d[],int c1,int d1){
for(int i=0;i<d1;i++)
{a[i]=d[i];
System.out.print(a[i]+" ");}

for(int i=0;i<c1;i++)
{a[i]=cd[i];
System.out.print(a[i]+" ");}
  
  
  
} 










}