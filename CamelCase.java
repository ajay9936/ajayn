import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String start = s.nextLine().toLowerCase();
		String str[]=start.split("\\s");
		for(String st:str)
			System.out.print(Character.toUpperCase(st.charAt(0))+st.substring(1, st.length()));
		s.close();
	}
}
