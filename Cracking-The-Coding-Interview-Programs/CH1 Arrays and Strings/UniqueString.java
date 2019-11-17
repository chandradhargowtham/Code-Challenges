import java.util.*;

class UniqueString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		List<Character> al=new ArrayList<Character>();

		for(int i=0;i<s.length();i++)
		{	char x=s.charAt(i);
			
			if(!al.contains(x))
				al.add(x);
			else
			{
				System.out.println("Not A Unique String");
				System.exit(0);
			}
		}
		System.out.println("Unique String");
		
	}
}