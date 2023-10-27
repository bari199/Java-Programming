/*convert centimeter to meter and kilometer*/
import java.util.Scanner;
class centimeter_to_meter
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length in centimeter");
		Float cm=sc.nextFloat();
		Float mtr = cm / 100;
		Float km = cm / 100000;
		System.out.println("Length in meter is "+mtr);
		System.out.println("Length in kilometer is "+km);

	}
}
