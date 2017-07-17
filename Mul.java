import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find seed");
		int num=sc.nextInt();
		int c=num;
		int s=1;
		while(num!=0)
		{
			int a=num%10;
			s=s*a;
			num=num/10;
		}
		int b=c*s;
		System.out.println(c+" is a seed of "+b);
	}
}
