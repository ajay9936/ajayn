import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) 
	{
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		    String str1[]=str.split(" ");
		    String str2="";
		    for(int i=str1.length-1;i>=0;i--)
		    {
		        str2+=str1[i]+" ";
		    }
		    str2.trim();
		    System.out.println(str2);
			read.close();
	}
}

