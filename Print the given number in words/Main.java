import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    int i;
      Scanner o=new Scanner(System.in);
      i=o.nextInt();
      switch(i)
      {
        case 5:
          System.out.println("Five");
       break;
        case 1:
          System.out.println("Four");
       break;
        case 2:
          System.out.println("Two");
       break;
      case 3:
          System.out.println("Three");
       break;
	case 4:
          System.out.println("Four");
       break;
      
      default:          System.out.println("Invalid");
      }
}}