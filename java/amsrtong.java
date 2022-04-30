import java.util.*;
import java.util.Scanner;
 // Compiler version JDK 11.0.2

 class amsrtong 
 {
   public static void main(String args[])
   { 
     int n1,n2;
     Scanner sc = new Scanner(System.in);
System.out.println("Enter your 1st limit");
   n1 = sc.nextInt();
System.out.println("Enter your 2st limit");
    n2 = sc.nextInt();

    System.out.println("entered 1st limit is :"+n1+"\n entered 2nd limit is :"+n2+"\n ");
   
   for(int i=n1;i<=n2;i++)
   {
     
     int num = i, number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            System.out.println(num );
      }
   }
 }