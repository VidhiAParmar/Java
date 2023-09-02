
public class RandomNo{
	public static void main(String[] args)
{
	int i=0;
	int max=91;
	int min=65;
	int range = max-min+1;
	for(i=0;i<10;i++)
	{
	int l1=min + (int)(Math.random()*range);
	int l2=min + (int)(Math.random()*range);
	int l3=min + (int)(Math.random()*range);
	int n= 1000+(int)(Math.random());
	
	System.out.println((""+(char)(l1)+(char)(l2)+(char)(l3))+"-"+n);
	}
	
}
}

	