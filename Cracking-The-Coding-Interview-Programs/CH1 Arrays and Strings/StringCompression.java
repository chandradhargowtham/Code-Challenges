import java.util.*;

class StringCompression
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String s=sc.next();
		String op="";
		int count=0;
		char c;
		
		for(int i=0;i<s.length();i++)
		{	
			
			count=0;
			c=s.charAt(i);
			for(int j=0;j<s.length()-1;j++)	
				if(c==s.charAt(j+1))
					count++;
		
		if(c==s.charAt(0))
		{
			count++;
		}
		if(!(op.contains((c+""+count))))
		op+=c+""+count;
		
		
		}


		System.out.println(op);
	}
}