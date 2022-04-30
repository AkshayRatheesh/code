import java.util.*;
import java.util.Scanner;

 
 
class fibonacci{
  public static void main(String[] args) {

    int n = 10, a = 0, b = 1 ,c=0;
    
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the limit");
      n= sc.nextInt();
    
    System.out.println("Fibonacci Series  " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(a + ", ");

    
      c = a + b;
      a = b;
      b = c;
    }
  }
}