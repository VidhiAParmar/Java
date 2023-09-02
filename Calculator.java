import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an expression with or without space between operators and operands:");
        String s = sc.nextLine();
        String a=s.replaceAll(" ", "");
		System.out.println(a);
	  int i=0,result=0;
	  while(a.charAt(i)!='+'&&a.charAt(i)!='-'&&a.charAt(i)!='/'&&a.charAt(i)!='*')
	{
		i++;
	}
	int a1=Integer.parseInt(a.substring(0,i));
	int a2=Integer.parseInt(a.substring(i+1,a.length()));
	switch(a.charAt(i))
	{
		case '+':
			result = a1+a2;
			break;
		case '-':
			result = a1-a2;
			break;
		case '*':
			result = a1*a2;
			break;
		case '/':
			result = a1/a2;
			break;

	}
	System.out.print("Answer of the expression "+s+" is:"+result);
	sc.close();
    }
}
