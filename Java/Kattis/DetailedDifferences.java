import java.util.*;

class DetailedDifferences
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String result="";
		int n=sc.nextInt();
		while(n-- >0)
		{
			String s1=sc.next();
			String s2=sc.next();

			System.out.println(s1);
			System.out.println(s2);

			for(int i=0,j=0;i<s1.length();i++,j++)
			{
				
					if(s1.charAt(i)==s2.charAt(j))
						System.out.print(".");
						//result+=".";
					else
						System.out.print("*");
						//result+="*";
				
			}
			//System.out.println(result);
			System.out.println("");
			
		}	
		
		
	}
}