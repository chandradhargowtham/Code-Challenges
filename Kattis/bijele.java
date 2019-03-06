import java.util.*;

class bijele
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int set[]=new int[6];

		for(int i=0;i<6;i++)		
			set[i]=sc.nextInt();
		

		int[] mainset=new int[]{1,1,2,2,2,8};

		for(int i=0;i<6;i++)
			System.out.println(mainset[i]-set[i]);

		

	}
}