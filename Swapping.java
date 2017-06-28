import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer str1 = new StringBuffer();
		 
		char[] ch = str.toCharArray();
		 
		for (int i = 0; i < ch.length; i++)
		{
		  if (i % 2 == 0)
		  {
		    if((i+1) < ch.length )
		    {
		      str1.append(ch[i + 1]);
		    }
		               str1.append(ch[i]);
		  }
		}
		System.out.println(str1);
		s.close();
	}

}
