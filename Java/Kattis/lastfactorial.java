import java.util.*;

class lastfactorial
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int f=1;
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			for(int j=1;j<=a;j++)	
			{
				f=f*j;
			}
			if(f<10)
				System.out.println(f);
			else
				System.out.println(f%10);
			f=1;
		}
		//for(int i=1;i<n;i++)
		


	}
}