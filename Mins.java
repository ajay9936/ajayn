import java.util.Scanner;

public class Mins {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Time 1 in hrs");
		int time1=t.nextInt();
		System.out.println("Time 2 hrs");
		int time2=t.nextInt();
		int n=time1-time2;
		int mins=n*60;
		int a=Math.abs(mins);
		System.out.println("mins are: "+a);
		t.close();
	}
}
