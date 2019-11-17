import java.util.*;

class OneAway
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String s1=sc.next();
		String s2=sc.next();
		int match=0,nomatch=0;

		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
						match++;

				}
			}
			nomatch=s2.length()-match;
		
			if(match==s2.length())
				System.out.println("reorder false");
			if(match==s2.length()-1)
				System.out.println("replace true");
			if(nomatch>1)
				System.out.println("false");
		}
		if(s1.length()-1==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
						match++;

				}
			}
			if(match==s1.length()-1)
				System.out.println("insert true");
			else
				System.out.println("false");
		}
		if(s2.length()-1==s1.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s2.charAt(j)==s1.charAt(i))
						match++;

				}
			}
			if(match==s2.length()-1)
				System.out.println("insert true");
			else
				System.out.println("false");
		}
		}
}

/* Known Bugs : 
 * -> if input is pale,pla ideally it is not one move away but will return true here.
 * -> If input is bace,case although it shouldn't calculate c in case and c in bace, it 
 *    does - hence o/p will be true which is not one move.
 * -> Not working on bug fixes currently
*/