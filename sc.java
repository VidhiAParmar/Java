import java.util.*;
public class sc{
	public static void main(String[] ags)
{
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter string");
	String s =sc.nextLine();
	stringChecker(s);
	sc.close();
}
static void stringChecker(String s)
{
	int a=s.length();
	int sum1=0,sum2=0;
	int[] c=new int[a];
	for(int i=0;i<a;i++)
	{
		c[i]=(int)Character.toLowerCase(s.charAt(i));
	}
	for(int i=0;i<a/2;i++)
	{
		sum1=sum1+c[i];
	}
	if(a%2==0)
	{
		for(int j=(a/2);j<a;j++)
		{
			sum2=sum2+c[j];
		}
	}
	else
	{
		for(int j=((a/2)+1);j<a;j++)
		{
			sum2=sum2+c[j];
		}
	}
	if(sum1==sum2)
		System.out.println("YES");
	else
		System.out.println("NO");
	
}
public static String nextLine() {
    return null;
}
}