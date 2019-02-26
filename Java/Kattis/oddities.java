import java.util.*;

class oddities
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
				System.out.println(arr[i] +" is even");
			else
				System.out.println(arr[i] +" is odd");
		}
	}
}