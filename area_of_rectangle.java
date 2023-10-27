/*Program to find area of rectangle*/
import java.util.Scanner;
class  area_of_rectangle
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of rectangle: ");
		Float length = sc.nextFloat();
		System.out.println("enter the width of rectangle: ");
		Float width = sc.nextFloat();
		Float area = length*width;
		System.out.println("enter the width of rectangle: " +area);
	}
}