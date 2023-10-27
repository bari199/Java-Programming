/*Program to find area of a triangle*/
import java.util.Scanner;
class area_of_triangle
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of triangle ");
		int base=sc.nextInt();
		System.out.println("Enter height of triangle ");
		int height=sc.nextInt();
		int area =(base * height) / 2;
		System.out.println("Area of the triangle = " +area);
	}
}