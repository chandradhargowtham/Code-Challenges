import java.util.*;

class cryptoconundrum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		String op="PER";
		while(op.length()<s.length())
		{
			op+="PER";
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=op.charAt(i))
				c++;
			
			
		}

		
		System.out.println(c);
	}
}