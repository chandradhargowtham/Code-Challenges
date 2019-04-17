import java.util.*;

class IveBeenEveryWhere
{
	int n=0;
	int cities=0;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		cities=sc.nextInt();
		String visited[]=new String[cities];


		while(n>0)	
		{

			while(cities>0)
			{
				String s=sc.nextLine();
				for(int i=0;i<cities;i++)
				if(!(visited[i].equals(s)))

			}
			n--;
		}
	}
}