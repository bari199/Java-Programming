/*perimeter of rectangle*/
import java.util.Scanner;
class perimeter_of_rectangle
{
	public static void main (String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		Float length =sc.nextFloat();
		System.out.println("Enter width of rectangle: ");
		Float width =sc.nextFloat();
		Float perimeter=2*(length+width);
		System.out.println("The perimeter of rectangle is :"+perimeter);

	}
}
