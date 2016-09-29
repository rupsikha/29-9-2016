public class Embedd
{
public String embedWord(String a,String b)
{
int i=a.length();
i=i/2;
return (a.substring(0,i)+b+a.substring(i));
}
}
