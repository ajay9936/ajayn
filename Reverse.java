import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner String=new Scanner(System.in);
		String str=String.next();
		StringBuilder s=new StringBuilder(str);
		s.reverse();
		System.out.println(s.toString());
		String.close();
	}
}
