import java.util.*;

class ZeroMatrix
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter RowSize: ");
		int m=sc.nextInt();
		System.out.println("Enter ColSize: ");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter Matrix values: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}	
		}

		boolean row[]=new boolean[m];
		boolean col[]=new boolean[n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==0)
					{
						row[i]=true;
						col[j]=true;
					}
			}	
		}

		for(int i=0;i<m;i++)
		{
			if(row[i])
			{
				for(int j=0;j<m;j++)
					arr[i][j]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(col[i])
			{
				for(int j=0;j<n;j++)
					arr[j][i]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}


	}
}