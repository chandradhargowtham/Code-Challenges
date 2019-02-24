import java.util.*;

class zamka
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);	
		int l=s.nextInt();
		int d=s.nextInt();
		int x=s.nextInt();
		sum(l);
		int minsum=sum(l),maxsum=0,temp=0;

		
		for (int i = l; i <= d; i++)
    	{
        if (sum(i) == x)
            {
            minsum = i;
            break;
            }
    	}

for (int i = d; i >= l; i--)
    	{
        if (sum(i) == x)
            {
            maxsum = i;
            break;
            }
		}
		
		System.out.println(minsum);
		System.out.println(maxsum);
	}

	static int sum(int a)
	{
		int sum=0;
		while(a!=0)
		{
			sum=sum+(a%10);
			a/=10;
		}
		return sum;
	}
}