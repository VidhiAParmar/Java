import java.util.*;
public class ReverseNo{
static void reverse(int[] a)
{
	int[] b=new int[a.length];
	int i=0;
	int j=(a.length-1);
	while((i<a.length)&&(j>=0))
	{
		b[i]=a[j];
		System.out.print(b[i]+" ");
		i++;
		j--;
	}
}	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 10 numbers:");
	String s = sc.nextLine();
	String[] c = s.split(" ");
	int[] a = new int[c.length];
	for(int i=0;i<c.length;i++)
	{
		a[i]=Integer.parseInt(c[i]);
	}
	reverse(a);
	sc.close();
}
}