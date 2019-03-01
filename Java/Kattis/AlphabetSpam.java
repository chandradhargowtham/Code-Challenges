import java.util.*;

class AlphabetSpam
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String s=sc.next();
		int w=0;
		int l=0;
		int u=0;
		int sym=0;
		double total=s.length();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				u++;
			else if(Character.isLowerCase(s.charAt(i)))
				l++;
			else if(s.charAt(i)=='_')
				w++;
			else
				sym++;
		}
		System.out.println(w/total);
		System.out.println(l/total);
		System.out.println(u/total);
		System.out.println(sym/total);


	}
}