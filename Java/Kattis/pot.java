import java.util.*;
class pot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		int pow=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			arr[i]=power(arr[i]);
			count+=arr[i];
		}	

		System.out.println(count);
	}

	static int power(int a)
	{
		int r=a%10;
		a/=10;
		return (int)Math.pow(a,r);
	}
}