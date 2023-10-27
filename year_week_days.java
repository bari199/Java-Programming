/* convert days to years, weeks and days */
import java.util.Scanner;
class year_week_days
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Days");
		int days = sc.nextInt();
		int year =(days / 365);
		int week =(days % 365) / 7;
		System.out.println(year+ " "+"YEARS  :");
		System.out.println(week+ " "+"WEEKS  :");

	}
}