import java.util.*;
public class EqualString{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first string: ");
	String s1=sc.nextLine();
	System.out.print("Enter second string: ");
	String s2 =sc.nextLine();
	char[] a1=new char[s1.length()];
	char[] a2=new char[s2.length()];
	boolean f =false;
	int i=0;
	while(i<s1.length())
	{	
		a1[i]=Character.toLowerCase(s1.charAt(i));
		a2[i]=Character.toLowerCase(s2.charAt(i));
		i++;
	}
	for(int k=0;k<a1.length;k++)
	{
		if(a1[k]==a2[k])
			f=true;
		else
			f=false;
	}
	if(f==true)
	{
		System.out.println("Both string are equal.");
	}
	else
	{
		System.out.println("Both string are not equal.");
	}
	sc.close();
}
}
		