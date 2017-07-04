import java.util.Arrays;
import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter "+num+" register numbers");
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<num;i++)
		{
			if(a[i]==a[(i+1)%num])
				System.out.println("Dupicate number is "+a[i]);
		}
		sc.close();
	}
}
