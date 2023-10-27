/*Program to find total, average and percentage*/
import java.util.Scanner;
class percentage
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of five subjects:");
		int eng =sc.nextInt();
		int phy =sc.nextInt();
		int chem =sc.nextInt();
		int math =sc.nextInt();
		int bio =sc.nextInt();
		int total =(eng+phy+chem+math+bio);
		int avg = total / 5;
		int percnt = ((total / 500) * 100);
		System.out.println("The total marks "+total);
		System.out.println("Avg marks:"+avg);
		System.out.println("percentage of total subjects:"+percnt);
	}
}