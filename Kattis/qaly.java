import java.util.*;

class qaly
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int n=sc.nextInt();
		double arr[]=new double[n*2];
		double qaly=0;
		for(int i=0;i<n*2;i=i+2)
		{
			arr[i]=sc.nextDouble();
			arr[i+1]=sc.nextDouble();
			qaly+=arr[i]*arr[i+1];
		}
		System.out.println(qaly);
	}
}