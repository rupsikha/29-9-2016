public class Es
{
public void containE(String str)
{
int l=str.length();
int i=0,count=0;
while(i<l)
{
if(str.charAt(i)=='e')
{
count++;
i++;
}
else
i++;
}
if(count<1 || count>3)
System.out.println("False");
else
System.out.println("True");
}
}
