import java.util.Scanner;

public class triangle {
	private static Scanner sc;

	public static void main(String[] args) {
		
		double side1, side2, side3;
		sc = new Scanner(System.in);	
		
		System.out.println("Please Enter Three sides of triangle ");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		
		if(side1 == side2 && side2 == side3) 
		{
			System.out.println("It is an Equilateral triangle");
		}	
		else if(side1 == side2 || side2 == side3 || side1 == side3) 
		{
			System.out.println("It is an Isosceles triangle");
		} 
		else 
		{
			System.out.println("It is a Scalene triangle");
		}
	}
}
