import java.util.*;
public class GCD{
	static int gcd(int a,int b)
	{
		int i=0;
		for(i=a;i>=1;i--)
		{
			if(a%i==0&&b%i==0)
				break;
		}
		return i;
	}

	public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no1:");
	int a = sc.nextInt();
	System.out.println("Enter no2:");
	int b = sc.nextInt();
	int c = gcd(a,b);
	System.out.println("GCD is " + c);
	sc.close();
}

}	