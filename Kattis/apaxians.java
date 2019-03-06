import java.util.*;

class apaxians
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String s=sc.next();
		StringBuilder sb=new StringBuilder();
		sb.append(s.charAt(0));
		
		

		
		for(int i=1;i<s.length();i++)
		{
			
			if(s.charAt(i-1)!=s.charAt(i))
			{
				sb.append(s.charAt(i));
				

			}
			
		}
		
		

		System.out.println(sb.toString());
	}
}