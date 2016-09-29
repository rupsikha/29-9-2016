public class Missing
{
public String missingChar(String s,int n)
{
int l=s.length();
StringBuffer sb=new StringBuffer(s);
return (sb.substring(0,n)+sb.substring(n+1,l));
}
}
