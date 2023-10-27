/*Program to find angles of a triangle*/
import java.util.Scanner;
class angles_of_triangle
{
	public static void main(String[]args)
	{
		System.out.println("Find angles of a triangle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First angles is :");
		int a=sc.nextInt();
		System.out.println("Enter the Second angles is :");
		int b=sc.nextInt();
		int triangle = 180 - (a+b);
		System.out.println("the third angles is :"+triangle);

	}
}