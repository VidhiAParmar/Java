import java.util.*;
public class Password{
static boolean checkPassword(String s)
{
	int i=0;
	boolean a=false;
	boolean A=false;
	boolean ch=false;
	boolean digit=false;
	for(i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			int k = (int)c;
			if(k<91&&k>=65)
				a=true;
			if(k>=97&&k<123)
				A=true;
			if(k>47&&k<58)
				digit=true;
			if(c=='_'||c=='%'||c=='*'||c=='$')
				ch=true;
			
		}
	if(s.length()<9)
		return false;
	else if(a && A && digit && ch)
	{
		return true;
	}

	return false;
				
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter password");
	String s = sc.nextLine();
	boolean a=checkPassword(s);
	if(a)
		System.out.println("Password accepted");
	else
		System.out.println("Invalid password");
	sc.close();
}
}