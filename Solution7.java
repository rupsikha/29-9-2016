import java.util.*;
import java.io.*;
public class Solution7
{
	public static void main(String args[])
	{
Scanner in=new Scanner(System.in);
String s=in.next();
String st=in.next();
Make m=new Make();
String str=m.makeTags(s,st);
System.out.println(str);
}
}
