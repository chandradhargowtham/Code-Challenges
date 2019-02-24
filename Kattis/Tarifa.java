import java.util.*;

class tarifa
{
	public static void main(String...a)
	{
		int x; // capacity/month
		int n; // no. of months
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		n=input.nextInt();

		int usage[]= new int[n]; // usage per month
		for(int i=0;i<n;i++)
			usage[i]=input.nextInt();

		int maxcapacity= (x*n);
		int totalused=0;
		for(int i=0;i<n;i++)
			totalused+=usage[i];
		System.out.println((maxcapacity+x)-totalused);

	}


}

//Execution Time .015 sec