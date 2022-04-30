import java.util.Scanner;

class reversesum
{
public static void main(String[] arg)
{
int a,res=0,n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
while(n!=0)
{
a=n%10;
res=(res*10)+a;
sum = sum + a;
n=n/10;
}
System.out.println("reverse of a number is "+res);
System.out.println("Sum of digits:"+sum);
}
}