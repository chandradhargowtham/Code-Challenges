import java.util.*;

class grassseed
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double c=sc.nextDouble();
		int l=sc.nextInt();
		double totalcost=0;
		double lawns[]=new double[l*2];
		for(int i=0;i<(l*2);i++)
		{
			lawns[i]=sc.nextDouble();
		}
		for(int i=0;i<l*2;i=i+2)
		{
			totalcost+=lawns[i]*lawns[i+1];
			//System.out.println(lawns[i]);
		}

		System.out.println(c*totalcost);


	}
}