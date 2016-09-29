import java.util.*;
import java.io.*;
public class Chars
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String st=in.next();
		Missing m=new Missing();
		String s=m.missingChar(st,n);
		System.out.println(s);
	}
}
