import java.util.*;
class toilet
{
	
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
	String input=sc.nextLine().toUpperCase();
	int l=input.length();
	

	// First Condition - ALL UP
	int u=0;
	if(input.charAt(0)=='D')
		{
			u++;
		}
	for(int i=1;i<l;i++)
	{
		if(input.charAt(i)=='D')
		{
			u+=2;
		}
	}
	System.out.println(u);
	

	// Second Condition - ALL DOWN
	int d=0;
		if(input.charAt(0)=='U')
		{
			d++;
		}
	for(int i=1;i<l;i++)
	{
		if(input.charAt(i)=='U')
		{
			d+=2;
		}
	}
	System.out.println(d);

	// Third Condition - AS IT IS
	int x=0;
	for(int i=0;i<l-1;i++)
	{
		if(input.charAt(i)!=input.charAt(i+1))
		{
			x++;
		}
	}
	System.out.println(x);
	}
}