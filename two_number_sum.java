/*write a programe in java two number of sum*/
import java.util.Scanner;
class two_number_sum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first numbers: ");
		int a = sc.nextInt();
		System.out.println("Enter the second numbers: ");
		int b = sc.nextInt();
		int add =a+b;
		System.out.println("The total number of sum is : "+add);
	}
}