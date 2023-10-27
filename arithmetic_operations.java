/*perform all arithmetic operations*/
import java.util.Scanner;
class arithmetic_operations
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first numbers: ");
		int a =sc.nextInt();
		System.out.println("Enter the Second numbers: ");
		int b =sc.nextInt();
		int add=a+b;
		int mul=a*b;
		int sub=a-b;
		int div=a/b;
		int mod=a%b;
		System.out.println(" addition is  :"+add );
		System.out.println(" multipication is:"+mul);
		System.out.println(" substraction is:"+sub);
		System.out.println(" division is:"+div);
		System.out.println(" modulus is:"+mod);
	}
}