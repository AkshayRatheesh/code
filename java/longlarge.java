import java.util.Scanner;
public class longlarge
{
    public static void main(String[] args) 
    {
        int n, temp,ak;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-1]);
        System.out.println("Smallest:"+a[0]);
ak=a.length;
        System.out.println("Largest:"+a[ak-1]);

    }
}