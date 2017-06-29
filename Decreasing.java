import java.util.Arrays;
import java.util.Scanner;

public class Decreasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		float a[]=new float[n];
		System.out.println("Enter the number of elements in array");
		for(int i=0;i<n;i++){
		a[i]=sc.nextFloat();
		}
		Arrays.sort(a);
		System.out.println("Sorted array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}
}
