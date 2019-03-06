import java.util.*;

class harshadnumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		int s=digitsum(n);
		

		while(true)
		{
		if(n%digitsum(n)==0)
		{
			System.out.println(n);
			System.exit(0);
		}
		else
			n++;
		}

		
	}
	static int digitsum(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
	
		return sum;
	}
}