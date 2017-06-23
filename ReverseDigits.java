import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		{
	        int reverse=0;
	        int rem;
	        Scanner scan = new Scanner(System.in);
	       int num = scan.nextInt();
	        while(num != 0)
	        {
	            rem = num%10;
	            reverse = reverse*10 + rem;
	            num = num/10;
	        }
			
	        System.out.print(+reverse);
	        scan.close();
	    }
	}
}
