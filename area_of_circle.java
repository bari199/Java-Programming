/*area of circle*/
import java.util.Scanner;
class area_of_circle
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		Float r= sc.nextFloat();
		Float pi=3.14f;
		Float area=(pi*r*r);
		System.out.println("The area_of_circle is :"+area);
	}
}