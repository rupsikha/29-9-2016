import java.util.*;
import java.io.*;
public class Word
{
	public static void main(String args[])
	{
Scanner in=new Scanner(System.in);
String s=in.next();
String st=in.next();
Embedd e=new Embedd();
String str=e.embedWord(s,st);
System.out.println(str);
}
}
