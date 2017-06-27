import java.util.Scanner;

public class Coversion {

	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);//Enter numbers only.
		String num=number.next();
		int num1=Integer.valueOf(num);
		System.out.println(num1);
		number.close();
	}
}
