import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n;
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the number of elements in array");
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(a[i]+a[j]==0)
		System.out.println("elements are "+a[i]+"\t"+a[j]);
		}
		}
		sc.close();
	}

}
