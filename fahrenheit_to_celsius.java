/* convert temperature from Fahrenheit to Celsius */
import java.util.Scanner;
class fahrenheit_to_celsius
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");
		Double fahrenheit = sc.nextDouble();
		Double celsius = (fahrenheit-32)*5/9;
		System.out.println(fahrenheit+" "+"celsius ="+" "+celsius);

	}
}
