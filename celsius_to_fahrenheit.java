/* program to convert temperature from degree celsius to fahrenheit*/
import java.util.Scanner;
class celsius_to_fahrenheit
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius:");
		Double celsius = sc.nextDouble();
		Double fahrenheit=(celsius* 9 / 5)+32;
		System.out.println(celsius+" "+"celsius ="+" "+fahrenheit);

	}
}
