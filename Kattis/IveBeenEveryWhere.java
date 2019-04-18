import java.util.*;

class IveBeenEveryWhere
{
	static int n=0;
	static int cities=0;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<String> visited=new ArrayList<String>();

		while(n>0)	
		{

			visited.clear();
			cities=sc.nextInt();
			while(cities>=0)
			{
				String s=sc.nextLine();
				if (!visited.contains(s)) 
				visited.add(s);		
				cities--;
			}
			
			
					
			n--;		
			visited.remove(0);
			System.out.println(visited.size());
		}
		
	}
}