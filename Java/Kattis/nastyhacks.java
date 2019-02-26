import java.util.*;

class nastyhacks
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();

			if((b-c)>a)
				System.out.println("advertise");
			else if((b-c)==a)
				System.out.println("does not matter");
			else
				System.out.println("do not advertise");
		}
	}
}